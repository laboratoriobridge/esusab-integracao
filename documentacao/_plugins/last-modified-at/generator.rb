# From: https://github.com/CarlosBonetti/jekyll-last-modified-at
# Original in: https://github.com/gjtorikian/jekyll-last-modified-at

module Jekyll
  module LastModifiedAt
    class Generator < Jekyll::Generator

      def generate(site)
        %w(posts pages docs_to_write).each do |type|
          site.send(type).each do |item|
            item.data['last_modified_at'] = Determinator.new(site.source, item.path) if item.respond_to?(:data)
          end
        end
      end

    end
  end
end
