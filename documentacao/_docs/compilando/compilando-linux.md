---
layout: doc
title: Compilando este site no Linux
id: compilando-linux
parent: compilando
order: 2
---

# Instalando as dependências

Você precisa de [ruby](https://www.ruby-lang.org) instalado no sistema e do gerenciador de dependências [Bundler](http://bundler.io/).

Alternativamente, você pode usar o [Ruby Version Manager (rvm)](https://rvm.io/), uma ferramenta de linha de comando que permite o gerenciamento de múltiplas versões de ruby e ruby gems no sistema (mas isso é opcional).

Após instalados os pré-requisitos, a partir da raiz desta documentação, execute:

```sh
$ bundle install
```

Isso instalará todas as dependências necessárias para compilar esta documentação.

# Construindo a documentação

Para gerar o HTML correspondente à documentação, execute:

```sh
$ jekyll build
```

Para rodar um servidor local para teste, com o HTML compilado:

```sh
$ jekyll serve
```

# Para saber mais

* [Site oficial do Jekyll](http://jekyllrb.com/)
* [Ruby gems](http://en.wikipedia.org/wiki/RubyGems)
* [Site oficial do Bundler](http://bundler.io/)
* [Why You Should Use RVM](http://code.tutsplus.com/articles/why-you-should-use-rvm--net-19529)
