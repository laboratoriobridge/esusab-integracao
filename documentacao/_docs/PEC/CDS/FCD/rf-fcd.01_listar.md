---
layout: doc
title: RF-FCD.01 Listar Ficha de Cadastro Domiciliar
id: rf-fcd.01_listar
order: 0
parent: fcd
---

###1. Breadcrumb

PEC > CDS > **Cadastros domiciliares**.

###2. Filtros

Os filtros aplicáveis são:

- Microárea;
- Logradouro;
- CNS responsável: responsável familiar;
- Município;
- Cód. unidade (CNES);
- Mostrar registros enviados / recebidos: Deve apresentar as fichas digitadas pelo usuário e que já foram enviadas e as fichas recebidas de outras instalações.

Após o preenchimento dos filtros, é necessário acionar a opção **Pesquisar** para proceder com a busca.

###3. Listagem

A listagem deve mostrar os registros das fichas de cadastro domiciliar apresentando as seguintes colunas:

- Data: data na qual a ficha foi preenchida pelo profissional (diferente da data em que ela foi digitalizada);
- Endereço: Nome do endereço do domicílio;
- Número: Número do domicílio;
- Complemento: Complemento do domicílio;
- CEP: CEP do domicílio;
- Bairro: Bairro no qual o domicílio se encontra;
- Microárea: Número da microárea que o domicílio pertence.

As fichas são ordenadas primeiramente pela data na qual a ficha foi preenchida (ordem decrescente), em seguida pelo Bairro e por último pelo Logradouro (ambos em ordem alfabética).

Na listagem deve ser apresentada somente a ficha mais atual do domicílio.

Cada registro apresentado na listagem apresenta as opções:

- Cadastros individuais: apresenta a lista de fichas de cadastros individuais mais atuais relacionadas ao domicílio juntamente com a opção **Visualizar** (Protótipo 2);
- Atualizar: esta funcionalidade está especificada em {% link rf-fcd.03_atualizar %};
- Visualizar;
- Editar: Aplicar a regra especificada no {% link rf-cds.06_edicao_exclusao %};
- Excluir: Aplicar a regra especificada no {% link rf-cds.06_edicao_exclusao %}.

O cadastro de novas fichas é realizado através da opção **Adicionar** especificada em {% link rf-fcd.02_cadastrar %}.

As fichas com o "Termo de recusa do cadastro domiciliar da Atenção Básica" selecionado são identificadas com um ícone no início da linha (Protótipo 1) informando a recusa do cadastro.

Ao posicionar o mouse sobre o ícone de recusa, apresentar o hint: "Cidadão optou pelo termo de recusa".

###4. Protótipos de Tela

![](/docs/PEC/CDS/FCD/imagens/Ficha Cadastro Domiciliar Listagem.png  "Protótipo 1 - Listagem da Ficha de Cadastro Domiciliar")  
*Protótipo 1 - Listagem da Ficha de Cadastro Domiciliar*

![](/docs/PEC/CDS/FCD/imagens/Listagem Fichas Cadastros Individuais.png  "Protótipo 2 - Listagem das Fichas de Cadastros Individuais")  
*Protótipo 2 - Listagem das Fichas de Cadastros Individuais*