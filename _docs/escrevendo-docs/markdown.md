---
layout: doc
title: Markdown
id: markdown
parent: escrevendo-docs
order: 1
---

Markdown é uma linguagem de marcação cujo código é fácil de ler e escrever que pode ser convertida para HTML.

Esta página (e todas as páginas de documentação deste site) são escritas em Markdown, você pode visualizar o código que a gerou entrando no código fonte desta página.

# Construções básicas

## Parágrafos

Parágrafos em Markdown são apenas uma ou mais linhas consecutivas seguidas de uma ou mais linhas em branco.

```
Este bloco de texto é o primeiro parágrafo.

Este bloco de texto é o segundo parágrafo.
```

## Títulos

Títulos são definidos adicionando um mais símbolos `#` antes do texto de título. O número de caracteres `#` determina o nível de título.

```
# Nível mais alto de título (corresponde à tag <h1>)
## Nível dois de título (corresponde à tag <h2>)
...
###### Nível seis de título (corresponde à tag <h6>)
```

## Citações

> Este é um exemplo de citação
>
> Múltiplas linhas são permitidas

Citações são geradas adicionando o caractere `>` antes do texto.

```
> Este é um exemplo de citação
>
> Múltiplas linhas são permitidas
```

## Estilizando texto

É possível adicionar **negrito** e *itálico*.

```
É possível adicionar **negrito** e *itálico*.
```

# Listas

## Listas não ordenadas

Faça listas não ordenadas precedendo os itens da lista com caracteres `*` ou `-`.

```
* Item 1
* Item 2
* Item 3

- Item 1
- Item 2
- Item 3
```

Ambos produzem o mesmo resultado:

* Item 1
* Item 2
* Item 3

## Listas ordenadas

Faça listas ordenadas precedendo os itens da lista com números.

```
1. Item 1
2. Item 2
3. Item 3
```

1. Item 1
2. Item 2
3. Item 3

## Listas aninhadas

É possível criar listas aninhadas identando os níveis de lista:

```
* Primeiro item
  1. Sub-item 1
  2. Sub-item 2
* Segundo item
  * Sub-lista não ordenada 1
  * Sub-lista não ordenada 2
```

* Primeiro item
  1. Sub-item 1
  2. Sub-item 2
* Segundo item
  * Sub-lista não ordenada 1
  * Sub-lista não ordenada 2

# Formatando código

## Formatação em linha

Use crase (<code>\`</code>) para delimitar textos em linha para seguir o formato `monospace`, útil para escrever trechos de código.

```
Este é um texto exemplo com formatação `monospace`.
```

Este é um texto exemplo com formatação `monospace`.

## Formatação em bloco (múltiplas linhas)

Use crase tripla (<code>\`\`\`</code>) para formatar trechos de código com múltiplas linhas:

<pre>
```
x = 0
x = 2 + 2
print(x)
```
</pre>


## Sintaxe de linguagens específicas

Se o trecho de código escrito é de uma linguagem específica, adicione o nome da linguagem após abrir crases tripla (<code>\`\`\`</code>). Exemplo:

```sql
INSERT INTO whatever VALUES (1, "title");
```

O bloco acima foi gerado com:

<pre>
```sql
INSERT INTO whatever VALUES (1, "title");
```
</pre>

# Links

Crie links delimitando o texto do link dentro de colchetes (`[]`) e delimitando a URL do link dentro de parênteses (`()`) desta forma:

```
[Visite Github](http://github.com)
```

Produz: [Visite Github](http://github.com).

# Imagens

Para criar imagens, use o seguinte padrão:

```
![Texto alternativo (alt)](/caminho/absoluto/para/a/imagem.png)
```

Por exemplo, o seguinte trecho produzirá

```
![e-sus AB](/docs/escrevendo-docs/e-sus.jpg)
```

![e-sus AB](/docs/escrevendo-docs/e-sus.jpg)

# Tabelas

Crie tabelas através da seguinte construção:

```
Cabeçalho 1   | Cabeçalho 2
------------- | -------------
Conteúdo      | Conteúdo
Conteúdo      | Conteúdo
```

Produz:

Cabeçalho 1   | Cabeçalho 2
------------- | -------------
Conteúdo      | Conteúdo
Conteúdo      | Conteúdo

# HTML

Qualquer tag HTML escrita em markdown será mantida na versão HTML compilada da página.

Porém, só é recomendável escrever HTML explícito caso não haja equivalente em Markdown, para manter o padrão de escrita e evitar poluição de código.

# Para saber mais

* [Guia de escrita do Github](https://help.github.com/categories/writing-on-github/)
* [Guia de sintaxe do Markdown](http://daringfireball.net/projects/markdown/syntax)
