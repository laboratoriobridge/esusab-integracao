---
layout: doc
title: Linkagem automática
id: linkagem
parent: escrevendo-docs
order: 3
---

Para facilitar a linkagem entre páginas de documentação, foi escrito um plugin para linkagem automática de páginas usando identificadores únicos.

Para construir um link: `{% raw %}{% link id-da-página %}{% endraw %}`

# Definindo IDs

O `id` é definido no cabeçalho de cada página de documentação:

```
---
layout: doc
...
id: TST.001
---
```

Neste caso, ao usar `{% raw %}{% link TST.001 %}{% endraw %}`, em qualquer lugar do sistema, essa tag será convertida para o link da página em questão, onde quer que ela esteja dentro da hierarquia de pastas.

O resultado, ao ser convertido para HTML é: `<a href="/docs/.../subfolder-qualquer/.../tst.001.html">Título da página (definido no cabeçalho)</a>`.

# Títulos customizados de link

Por padrão, o título do link gerado é o `title` definido no cabeçalho da página linkada. Para modificar este texto, use a seguinte construção:

```
{% raw %}
{% link TST.001, title: "Qualquer outro título" %}
{% endraw %}
```

Que produzirá: `<a href="{URL da página TST.001}">Qualquer outro título</a>`.

# Obtendo somente a URL das páginas

Para obter somente a URL de uma página, dado seu `id`, utilize a tag `url`, desta forma:

```
{% raw %}
{% url TST.001 %}
{% endraw %}
```

Por exemplo:

```
{% raw %}
{% url markdown %}
{% endraw %}
```

Produz: `{% url markdown %}`

# Para saber mais

* {% link cabecalho, title: "Cabeçalho de páginas de documentação" %}
* [Jekyll template documentation](http://jekyllrb.com/docs/templates/)
