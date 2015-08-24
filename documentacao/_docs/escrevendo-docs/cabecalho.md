---
layout: doc
title: Cabeçalho
id: cabecalho
parent: escrevendo-docs
order: 2
---

Cada página de documentação inicia com uma sintaxe especial que é lida pelo Jekyll para tomar algumas decisões ao compilar o projeto para HTML.

Esta página, por exemplo, tem o seguinte cabeçalho:

```
---
layout: doc
title: Cabeçalho
id: cabecalho
parent: escrevendo-docs
order: 2
---
```

# Parâmetros obrigatórios

Os seguintes valores são obrigatórios para cada página de documentação:

* `layout`: O layout usado como base para a página, geralmente é `docs`
* `title`: Título da página
* `id`: Um id único identificador desta página. Esse id é usado para gerar o {% link navegacao, title: "menu de navegação" %} e pela {% link linkagem, title: "linkagem automática" %}

# Para saber mais

* [Jekyll Front Matter](http://jekyllrb.com/docs/frontmatter/)
