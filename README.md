# jekyll

Repositório base para documentação de projetos.

## Como instalar

Adicione este sistema de documentação a um projeto com o comando:

```sh
$ git subtree add --squash --prefix docs/ https://github.com/sismob/jekyll master
```

Uma pasta `docs/` será criada com os fontes deste repositório. Modifique os arquivos de acordo com as necessidades do projeto.

## Como atualizar

A partir da raiz de um projeto usando este sistema de documentação, execute:

```sh
$ git subtree pull --squash --prefix docs/ https://github.com/sismob/jekyll master
```

Sendo `docs/` o nome da pasta que contém os fontes do sistema de documentação.

Este comando irá atualizar a versão local da documentação com as últimas atualizações do repositório base. Os arquivos específicos da versão local serão mantidos. Resolva os conflitos, caso existam, e commite o resultado.
