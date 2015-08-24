---
layout: doc
title: Padrão Nomes de Arquivos
id: padrao_nome_arquivo
parent: padrao_documentacao
order: 7
---

Definimos dois padrão. Um para o nome do arquivo e outro para o identificador único do arquivo (id).


###1. Nome do Arquivo

O nome do arquivo é formado por duas partes:

**1ª:** Nome;

**2ª:** Extensão.


####1.1. Nome

Campo de texto onde as palavras são separadas pelo caractere "_".

Caracteres aceitos: [a..z_]*.

Não são aceitos caracteres acentuados e nem o "ç".

####1.2. Extensão

Os arquivos obrigatoriamente devem ser salvos com a extensão ".md".

Arquivos com esta extensão representam dialetos da linguagem *Markdown*.

####1.3. Exemplos

- cadastrar_cidadao.md;
- listar\_fichas\_cadastro\_individual.md;
- cancelar_edicao.md.


###2. Identificador Único do Arquivo

O Identificador Único do Aquivo é composto por três partes:

**1ª:** Sigla de identificação do tipo de arquivo;

**2ª:** Sigla de identificação do módulo;

**3ª:** Nome.

A Sigla de identificação do tipo de arquivo e a Sigla de identificação do módulo são separados utilizando o caractere "-".

A Sigla de identificação do módulo e o Nome são separados utilizando o caractere ".".


####2.1. Sigla de Identificação do Tipo de Arquivo

- RF: Requisito Funcional;
- RN: Regra de Negócio;
- RNF: Requisito Não-Funcional;
- UC: Caso de Uso;
- MSG: Mensagem.

####2.2. Sigla de Identificação do Módulo

Definida com três caracteres maiúsculos.

Representa a identificação única, não podendo existir mais de um módulo com o a mesma sigla.

####2.3. Nome

Deve ser utilizado o mesmo padrão de nome de arquivo definido na seção [1.1. Nome](#1.1.-nome).

####2.4. Exemplos

- RF-FCI.listar\_fichas\_cadastro\_individual;
- RN-ADA.procedimentos_automaticos;
- RNF-ATE.estrutura\_envio\_dados;
- UC-CID.cadastrar_cidadao;
- MSG-GER.cancelar_edicao.