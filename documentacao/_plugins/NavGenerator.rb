require 'yaml'

module NavGenerator
  class NavGenerator < Jekyll::Generator
    COLLECTION_NAME = 'docs'      # collection name to be used to generate the nav
    ID_KEY = 'id'                 # unique identifier key name (to be defined at each page)
    PARENT_KEY = 'parent'         # parent key name (defines the parent for each page)
    PUBLISHED_KEY = 'published'   # name of the parameter to specify wheter the item is visible or not
    ORDER_KEY = 'order'

    safe true

    def generate(site)
      source = site.collections[COLLECTION_NAME].docs

      # Adiciona cada doc em um hash, verificando se existem IDs duplicados
      nav_hash = {}
      source.each do |doc|
        raise NavError, ID_KEY + " must be specified for file " + doc.path unless doc.data[ID_KEY]
        id = doc.data[ID_KEY]

        if nav_hash[id] then
          raise NavError, "duplicate " + ID_KEY + " at files " + doc.path + " and " + nav_hash[id].path
        else
          nav_hash[id] = doc
        end
      end

      # Gera os itens de menu dos docs
      nav = generate_items source

      # Associa os itens criado em `site.data.navigation`, acessível nas páginas
      site.data['navigation'] = nav
    end

    def generate_items(source)
      nav = []

      parents = source.select { |item| item.data[PARENT_KEY] == nil and visible_item?(item) }
      parents.each do |item|
        nav.push create_item(item, source)
      end

      sort!(nav)
      return nav
    end

    def create_item(doc, source)
      item = NavItem.new
      item.id = doc.data[ID_KEY] or raise NavError, ID_KEY + " must be specified for file " + doc.path
      item.title = doc.data['title'] or raise NavError, "title must be specified for file " + doc.path
      item.url = doc.url
      begin
        item.order = Integer(doc.data[ORDER_KEY]) || 1
      rescue ArgumentError
        raise NavError, ORDER_KEY + ' must be integer, defined at page ' + doc.path
      end
      item.subitems = []
      item.page = doc

      subdocs = source.select { |d| d.data[PARENT_KEY] == doc.data[ID_KEY] and visible_item?(d) }
      subdocs.each do |subdoc|
        subitem = create_item(subdoc, source)
        subitem.parent = item
        item.subitems.push subitem
      end

      doc.data['nav_item'] = item
      sort!(item.subitems)
      return item
    end

    def visible_item?(item)
      # If not specified, assume as true
      return true if item.data[PUBLISHED_KEY] == nil
      return item.data[PUBLISHED_KEY]
    end

    def sort!(items)
      items.sort! { |a, b|
        if a.order == b.order then
          a.title <=> b.title
        else
          a.order <=> b.order
        end
      }
    end

  end

  class NavItem
    attr_accessor :id, :title, :url, :order, :subitems, :parent, :page

    # O liquid só recebe os atributos de objeto retornados por este método
    def to_liquid()
      hash = Hash.new
      hash['id'] = id
      hash['title'] = title
      hash['url'] = url
      hash['order'] = order
      hash['subitems'] = subitems.collect { |sub| sub.to_liquid }
      hash['page'] = page
      hash['parent'] = parent
      hash['root'] = root?
      hash['leaf'] = leaf?
      hash['single'] = single?
      hash['breadcrumb'] = breadcrumb
      hash['top_parent'] = top_parent
      return hash
    end

    # Checa se o item é raiz (não possui pai)
    def root?
      return parent == nil
    end

    # Checa se o item é folha (não possui filhos)
    def leaf?
      return subitems == nil || subitems.empty?
    end

    # Checa se o item é folha e raiz ao mesmo tempo
    def single?
      return root? && leaf?
    end

    # Retorna o breadcrumb list para este item de menu
    def breadcrumb
      p = self
      breadcrumb = [self]
      while p.parent != nil
        p = p.parent
        breadcrumb.push(p)
      end

      return breadcrumb.reverse
    end

    # Retorna o pai de mais alto nível deste item
    def top_parent
      p = self
      while p.parent != nil
        p = p.parent
      end
      return p
    end
  end

  class NavError < RuntimeError
  end
end
