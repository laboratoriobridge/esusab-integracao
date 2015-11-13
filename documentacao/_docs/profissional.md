---
layout: doc
title: Profissional
id: profissional
order: 1
---

# Profissional

## UnicaLotacaoHeader

### \#1	profissionalCNS
CNS do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |15 |15 |

**Regras:**	CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

### \#2	cboCodigo_2002
CBO do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |- |- |

**Referência:** {% link cbo %}

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

### \#3 cnes
CNES da unidade de saúde que o profissional está lotado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |7 |7 |

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

### \#4 ine
INE da equipe do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |10 |10 |

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

### \#5 dataAtendimento
Data em que está sendo realizada a ação.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** Para ver a referência sobre o formato epoch, acesse: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date))

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

### \#6 codigoIbgeMunicipio
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |- |- |

**Referência:** {% link municipios %}

Observação: Esta entidade é utilizada para representar o profissional responsável pelas fichas.

## VariasLotacoesHeader

### \#1 lotacaoForm
Profissional responsável pela ação.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|UnicaLotacaoHeader |Sim |- |- |

Observação: Esta entidade é utilizada para representar o profissional responsável pela ficha e os outros que o auxiliaram na atividade.

### \#2 profissionalCNS1
CNS do profissional1.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

Observação: Esta entidade é utilizada para representar o profissional responsável pela ficha e os outros que o auxiliaram na atividade.

### \#3 cboCodigo\_2002\_1
CBO do profissional1.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |- |- |

**Regras:** Deve ser preenchido somente se profissionalCNS1 estiver preenchido.

**Referência:** {% link cbo %}

Observação: Esta entidade é utilizada para representar o profissional responsável pela ficha e os outros que o auxiliaram na atividade.

### \#4 profissionalCNS2
CNS do profissional2.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |15 |15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

Observação: Esta entidade é utilizada para representar o profissional responsável pela ficha e os outros que o auxiliaram na atividade.

### \#5 cboCodigo\_2002\_2
CBO do profissional2.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |- |- |

**Regras:** Deve ser preenchido somente se profissionalCNS2 estiver preenchido.

**Referência:** {% link cbo %}

Observação: Esta entidade é utilizada para representar o profissional responsável pela ficha e os outros que o auxiliaram na atividade.

## ProfissionalCboRowItem

### \#1 cns
CNS do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |15 |15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.  

Observação: Esta entidade é utilizada para representar os profissionais que participaram da atividade coletiva

### \#2 codigoCbo2002
CBO do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |- |- |

**Referência:** {% link cbo %}

Observação: Esta entidade é utilizada para representar os profissionais que participaram da atividade coletiva.

## HeaderCdsCadastro

### \#1 cnesUnidadeSaude
CNES da unidade de saúde que o profissional está lotado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |7 |7 |

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.

### \#2 cnsProfissional
CNS do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |15 |15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.  

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.

### \#3 codigoIbgeMunicipio
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |- |- |

**Referência:** {% link municipios %}

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.

### \#4 dataAtendimento
Data em que está sendo realizada a ação.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** Para ver a referência sobre o formato epoch, acesse: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date))

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.

### \#5 ineEquipe
INE da equipe do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |10 |10 |

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.

### \#6 microarea
Microárea onde está sendo realizada a ação.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |0 |2 |

Observação: Esta entidade é utilizada para representar o profissional que realizou uma ação (Cadastro Individual e Cadastro Domiciliar) e a respectiva data.
