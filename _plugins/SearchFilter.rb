module Jekyll

  # From https://github.com/christian-fei/Simple-Jekyll-Search

  module CharFilter
    def remove_chars(input)
      input.gsub! '\\','&#92;'
      input.gsub! /\t/, ' '
      return input
    end
  end
end

Liquid::Template.register_filter(Jekyll::CharFilter)
