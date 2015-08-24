---
layout: doc
title: Navegação
id: navegacao
parent: escrevendo-docs
order: 4
---

O menu de navegação ao lado é gerado automaticamente através de especificações no cabeçalho das páginas de documentação. Os parâmetros considerados são os seguintes:

* `parent`: deve especificar o id da página pai da página atual. Se não especificado, a página é considerada de nível mais alto (raiz).
* `order` (opcional): especifica a ordem em que a página aparecerá em seu nível de navegação. Deve ser um número inteiro. Se não especificado, as páginas são ordenadas por seu título.

## Exemplo

```
---
...
id: raiz
title: Página raiz
---
```

```
---
...
id: filho-1
title: Filho 1
parent: raiz
order: 2
---
```

```
---
...
id: filho-2
title: Filho 2
parent: raiz
order: 1
---
```

```
---
...
id: subfilho-1
title: Sub-Filho 1
parent: filho-1
---
```

Irá gerar a seguinte estrutura de links:

<ul>
  <li>
    Raiz
    <ul>
      <li>Filho 2</li>
      <li>
        Filho 1
        <ul>
          <li>Sub-Filho 1</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>
