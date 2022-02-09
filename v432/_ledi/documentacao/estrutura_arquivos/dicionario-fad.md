---
layout: doc
title: Ficha de Atendimento Domiciliar
id: dicionario-fad
parent: estrutura_arquivos
order: 12
---

## FichaAtendimentoDomiciliarMaster

### \#1	uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 36 | 44 |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo.

**Referência:** Formato canônico.	Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2	tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 1 |

Observação: Utilizar valor 3 (sistemas terceiros).

### \#3	atendimentosDomiciliares
Lista dos atendimentos realizados pelo profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<FichaAtendimentoDomiciliarChild\> | Sim | 0 | 99 |

**Referência:** [FichaAtendimentoDomiciliarChild](#fichaatendimentodomiciliarchild).

### \#4	headerTransport
Profissionais que realizaram o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| VariasLotacoesHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 10 - CBOs que podem registrar ficha de atendimento domiciliar]({% url grupo_cbo %}#ficha-de-atendimento-domiciliar) podem ser adicionadas no campo CBO do profissional principal.

**Referência:** [VariasLotacoesHeader]({% url headerTransport %}#variaslotacoesheader).

## FichaAtendimentoDomiciliarChild

### \#1	turno
Código do turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#2	cnsCidadao
CNS do cidadão que recebeu atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 15 | 15 |

**Regras:**

- Validado pelo algoritmo;
- Não pode ser preenchido se o campo [cpfCidadao](#15-cpfcidadao) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#3	dataNascimento

Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior à 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos . Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#4	sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:**	[Sexo]({% url dicionario%}#sexo).

### \#5	localDeAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [LocalDeAtendimento]({% url dicionario%}#localdeatendimento).

### \#6	atencaoDomiciliarModalidade
Código da modalidade AD do cidadão atendido.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Apenas as opções `1`, `2` e `3` são aceitas;
- Não pode ser preenchido se o campo [tipoAtendimento](#7-tipoatendimento) = `9 - Visita domiciliar pós-óbito`.

**Referência:** [ModalidadeAD]({% url dicionario %}#modalidadead).

### \#7	tipoAtendimento
Código do tipo de atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas as opções `7`, `8` ou `9` são aceitas.

**Referência:** [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento).

### \#8	condicoesAvaliadas
Condições avaliadas do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Não | 0 | 24 |

**Regra:** Não pode ser preenchido se o campo [tipoAtendimento](#7-tipoatendimento) = `9 - Visita domiciliar pós-óbito`.

**Referência:** [Condições Avaliadas](#condi-es-avaliadas).

### \#9	cid
Código do CID10 registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | - | - |

**Regra:** Devem ser apresentadas somente CID-10 permitidas para o [Sexo](#4-sexo).

### \#10 ciap
Código do CIAP2 registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | - | - |

**Regras:** 

- Devem ser apresentadas somente CIAP's permitidas para o [Sexo](#4-sexo);
- Não pode conter nenhum dos itens listados no grupo Procedimentos da Tabela CIAP2.

### \#11 procedimentos
Código dos procedimentos registrados no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<String\> | Não | 0 | 30 |

**Regras:**

- Não pode ser preenchido se o campo [tipoAtendimento](#7-tipoatendimento) = `9 - Visita domiciliar pós-óbito`;
- Não pode conter procedimentos repetidos;
- Podem ser informados os procedimentos pertencentes aos grupos `01` - Ações de promoção e prevenção em saúde, `02` - Procedimentos com finalidade diagnóstica, `03` - Procedimentos clínicos e `04` - Procedimentos cirúrgicos;
- Não pode ser preenchido com o procedimento `03.01.05.010-4 - Visita domiciliar pós-óbito`. Esta informação deve ser registrada através do campo [tipoAtendimento](#7-tipoatendimento), opção `9 - Visita domiciliar pós-óbito`.

**Referência:** Tabela do SIGTAP, competência 09/2020 disponível em: [Tabela Unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar).

Observação: Inserir o código do procedimento SIGTAP sem ponto ou hífen, ex: `0214010015`.

### \#13 condutaDesfecho
Código do desfecho do atendimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [CondutaDesfecho]({% url dicionario %}#condutadesfecho).

### \#15 cpfCidadao

CPF do cidadão que recebeu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cnsCidadao](#2-cnscidadao) for preenchido.

## Condições avaliadas

| Nome | Código |
| ---- | ------ |
| Acamado | 1 |
| Domiciliado | 2 |
| Úlceras / Feridas (grau III ou IV) | 3 |
| Acompanhamento nutricional | 4 |
| Uso de sonda naso-gástrica - SNG | 5 |
| Uso de sonda naso-enteral - SNE | 6 |
| Uso de gastrostomia | 7 |
| Uso de colostomia | 8 |
| Uso de cistostomia | 9 |
| Uso de sonda vesical de demora - SVD | 10 |
| Acompanhamento pré-operatório | 11 |
| Acompanhamento pós-operatório | 12 |
| Adaptação ao uso de órtese / prótese | 13 |
| Reabilitação domiciliar | 14 |
| Cuidados paliativos oncológico | 15 |
| Cuidados paliativos não-oncológico | 16 |
| Oxigenoterapia domiciliar | 17 |
| Uso de traqueostomia | 18 |
| Uso de aspirador de vias aéreas para higiene brônquica | 19 |
| Suporte ventilatório não invasivo - CPAP | 20 |
| Suporte ventilatório não invasivo - BiPAP | 21 |
| Diálise peritonial | 22 |
| Paracentese | 23 |
| Medicação parenteral | 24 |