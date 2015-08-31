module Jekyll
  module RelativeSrcFilter
    def relative_src_filter(input, url)
      path = Pathname.new(url)
      base = path.dirname.to_s()
      input.gsub(/src=".|href="./) { |s|
        if s.end_with? '/' then
          s
        else
          s.gsub('"', '"' + base + '/')
        end
      }
    end
  end
end

Liquid::Template.register_filter(Jekyll::RelativeSrcFilter)
