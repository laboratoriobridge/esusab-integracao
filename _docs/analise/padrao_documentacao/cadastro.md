---
layout: doc
title: Cadastro
id: cadastro
order: 1
parent: padrao_documentacao
---

###1. Breadcrumb
	
- Definir o *breadcrumb* da tela.

###2. Campos

- Definir os campos que serão apresentados na tela e também as opções de cada campo;

- A definição dos campos obrigatórios será apresentada no protótipo da tela e também no dicionário de dados.

###3. Regras

- Especificar as condições / comportamentos dos campos de acordo com diferentes cenários;

- Apresentar as regras de validação e de preenchimento dos campos, quando existir;

- Descrever as mensagens (especificar no capítulo de mensagens) a serem apresentadas ao usuário juntamente com o hint.

###4. Dicionário de Dados

- Criar seção nomeada **Dicionário de Dados**;

- O dicionário de dados deve ser especificado conforme modelo apresentado a seguir:

Nome Campo | Obrigatório | Tam Mínimo | Tam Máximo | Tipo    | Unidade Medida | Observações / Exemplo       |
---------- | ----------- | ---------- | ---------- | ------- | -------------- | --------------------------- |
Nome       | Sim         | 3          | 70         | Varchar | -              | João da Silva |

###5. Protótipo

- Criar seção entitulada **Protótipos de Tela** e adicionar as imagens nesta seção;

- A legenda dos protótipos deve ser **Protótipo 1 – Nome do protótipo**;

- Durante a especificação, quando referenciar o protótipo, identificar através do nome do protótipo (Protótipo 1, Protótipo 2, ...).

###6. Análise de Impacto

- Caso o desenvolvimento do respectivo módulo / funcionalidade tenha impacto em outros módulos do sistema (por exemplo: relatórios, exportação de dados, transmissão, versão anteriores, etc), estes devem ser relatados.

###7. Recursos

- Quando necessário, definir os recursos para acesso ao módulo / funcionalidade.