---
layout: doc
title: Compilando este site no Windows
id: compilando-windows
parent: compilando
order: 2
---

# Instalando as dependências

A documentação é criada usando Jekyll, um gerador de sites estáticos escrito em Ruby. Desta forma, é necessária a instalação do Ruby e Jekyll no sistema.

Uma alternativa à instalação manual das dependências, é o uso da [versão portátil do Jekyll] (https://drive.google.com/open?id=0BzYPSmjYagJdem8tMTlQeW1VclE) que inclui todas as dependências necessárias.

Extraia os arquivo para `C:\PortableJekyll`. A partir deste path, rode o `setpath.cmd` para setar as variáveis de ambiente.

Execute um cmd e teste as instalações com `ruby -v` e `jekyll -v`.

## Baixando o projeto

É recomendada a instalação do [Github for Windows] (https://windows.github.com/). Siga os passos da instalação, inserindo as informações do seu login do GitHub.

Em seguida baixe este projeto através do comando:

```
git clone https://github.com/sismob/jekyll
```

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

* [Portable Jekyll para Windows](https://github.com/madhur/PortableJekyll)
* [Ruby installer for Windows](rubyinstaller.org)
* [Site oficial do Jekyll](http://jekyllrb.com/)
