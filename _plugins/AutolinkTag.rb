module Jekyll

  # Custom tag to get URL of pages by ID
  # Example of usage:
  #   `{% url RF-HOM.02 %}` will render the url of the page with id defined as 'RF-HOM.02'
  #
  class UrlTag < Liquid::Tag
    COLLECTION_NAME = 'docs'   # collection to be searched for to find URL id's
    ID_KEY = 'id'              # unique identifier key name (to be defined at each page)

    def initialize(tag_name, text, tokens)
      super
      text = text.strip
      link, params = text.split(',', 2)
      @link_id, @anchor = link.split('#', 2)

      params ||= ''
      @attributes = {}
      params.scan(::Liquid::TagAttributes) do |key, value|
        @attributes[key] = value.gsub(/"/, '')
      end
    end

    def render(context)
      srcpage = context.registers[:page]
      site = context.registers[:site]

      site.collections[COLLECTION_NAME].docs.each do |page|
        if page.data[ID_KEY] == @link_id
          @page = page
          url = site.baseurl + page.url
          url += '#' + @anchor if @anchor
          return url
        end
      end

      raise AutolinkTagError, 'link not found: ' + @link_id + ', defined at page ' + srcpage['path']
    end
  end


  # Custom tag to render a link of the page defined with the specified ID
  # Example of usage:
  #   `{% link RF-HOM.02 %}` will render the link of the page with id defined as 'RF-HOM.02'
  #   => <a href="{url of RF-HOM.02}">{title of RF-HOM.02 page}</a>
  class LinkTag < UrlTag

    # Get the title that should be rendered by the link
    def make_title()
      title = @attributes['title'] || @page.data['title']
      unless @attributes['title'] then
         title += '#' + @anchor if @anchor
      end
      return title
    end

    def render(context)
      url = super(context)
      return '<a href="' + url + '">' + make_title() + '</a>'
    end

  end

  class AutolinkTagError < RuntimeError
  end
end

Liquid::Template.register_tag('url', Jekyll::UrlTag)
Liquid::Template.register_tag('link', Jekyll::LinkTag)
