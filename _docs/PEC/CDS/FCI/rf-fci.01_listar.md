---
layout: doc
title: RF-FCI.01 Listar Ficha de Cadastro Individual
id: rf-fci.01_listar
order: 0
parent: fci
---

###1. Breadcrumb

PEC > CDS > **Cadastros individuais**.

###2. Filtros

Os filtros aplicáveis são:

- CNS cidadão: Número do cartão SUS do cidadão que foi cadastrado na ficha; 
- Nome do cidadão: Nome do cidadão que foi cadastrado na ficha;
- Data nascimento: Data de nascimento do cidadão que foi cadastrado na ficha;
- Nome da mãe: Nome da mãe do cidadão que foi cadastrado na ficha;
- Mostrar registros enviados / recebidos: Deve mostrar as fichas digitadas pelo usuário e que já foram enviadas e as fichas recebidas de outras instalações.

Após o preenchimento dos filtros, é necessário acionar a opção **Pesquisar** para proceder com a busca.

###3. Listagem

A listagem deve exibir os registros das fichas de cadastro individual apresentando as seguintes colunas:

- Nome do cidadão;
- Data nascimento;
- Nome da mãe;
- CNS cidadão;
- Município nascimento.

As fichas são ordenadas primeiramente pela data de preenchimento da ficha (ordem decrescente) e em seguida pelo nome do cidadão (ordem alfabética).

Na listagem deve ser apresentada somente a ficha mais atual de cada cidadão.

Cada registro apresentado na listagem possui as opções:

- Atualizar: esta funcionalidade está especificada em {% link rf-fci.03_atualizar %};
- Visualizar;
- Editar: Aplicar a regra especificada no {% link rf-cds.06_edicao_exclusao %};
- Excluir: Aplicar a regra especificada no {% link rf-cds.06_edicao_exclusao %}.

O cadastro de novas fichas é realizado através da opção **Adicionar** especificada em {% link rf-fci.02_cadastrar %}.

As fichas com o "Termo de recusa do cadastro individual da Atenção Básica" selecionado são identificadas com um ícone no início da linha (Protótipo 1) informando a recusa do cadastro.

Ao posicionar o mouse sobre o ícone de recusa, apresentar o hint: "Cidadão optou pelo termo de recusa".

###4. Protótipos de Tela

![](/docs/PEC/CDS/FCI/imagens/Ficha de Cadastro Individual Listagem.png  "Protótipo 1 - Listagem da Ficha de Cadastro Individual")  
*Protótipo 1 - Listagem da Ficha de Cadastro Individual*