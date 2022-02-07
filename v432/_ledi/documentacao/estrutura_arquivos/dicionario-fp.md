---
layout: doc
title: Ficha de Procedimentos
id: dicionario-fp
parent: estrutura_arquivos
order: 8
---

## FichaProcedimentoMaster

### \#1 uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 36 | 44 |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** Para ver a referência sobre o UUID, acesse [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 1 |

**Regra:** Utilizar valor `3 (sistemas terceiros)`.

### \#3 headerTransport
Profissional que realizou os procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| UnicaLotacaoHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 6 - CBOs que podem registrar ficha de procedimento]({% url grupo_cbo %}#ficha-de-procedimentos) podem ser adicionadas no campo CBO do profissional.

**Referência:** [UnicaLotacaoHeader]({% url headerTransport %}#unicalotacaoheader).

### \#4 atendProcedimentos
Registro dos procedimentos realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<FichaProcedimentoChild\> | Condicional | 0 | 99 |

**Referência:** [FichaProcedimentoChild](#fichaprocedimentochild).

**Observação:** É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#5 numTotalAfericaoPa
Quantidade de aferições de pressão realizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#6 numTotalGlicemiaCapilar
Quantidade de aferições de glicemia capilar.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#7 numTotalAfericaoTemperatura
Quantidade de aferições de temperatura realizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#8 numTotalMedicaoAltura
Quantidade de aferições de altura.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#9 numTotalCurativoSimples
Quantidade de curativos simples realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#10 numTotalMedicaoPeso
Quantidade de aferições de peso.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`..

### \#11 numTotalColetaMaterialParaExameLaboratorial
Quantidade de coletas para exame laboratorial.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 3 |

**Regras:**

- Não pode ser preenchido com o valor "0" (zero);
- É requerido pelo menos um dentre os itens `#4` a `#11`.

## FichaProcedimentoChild

### \#1 numProntuario
Número do prontuário do cidadão na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 0 | 30 |

### \#2 cnsCidadao
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 15 | 15 |

**Regras**:

- Validado por algoritmo;
- Não pode ser preenchido se o campo [cpfCidadao](#12-cpfcidadao) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#3 dtNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:** Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos . Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#4 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#5 localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas valores de `1` a `10`.

**Referência:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento).

### \#6 turno
Código do turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#7 statusEscutaInicialOrientacao
Indica a realização da escuta inicial.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

### \#8 procedimentos
Lista dos códigos dos procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<String\> | Condicional | 0 | 20 |

**Regras:**

- Não pode conter procedimentos repetidos;
- Podem ser informados os procedimentos pertencentes aos grupos `01 - Ações de promoção e prevenção em saúde`, `02 - Procedimentos com finalidade diagnóstica`, `03 - Procedimentos clínicos`, `04 - Procedimentos cirúrgicos` ou presentes na tabela [Procedimentos da Ficha](#procedimentos-da-ficha), neste caso, se não tiver uma referência no SIGTAP, deve ser informado o código **AB** do procedimento;
- Não pode ser preenchido com o procedimento "03.01.04.007-9 - Escuta inicial / orientação (acolhimento a demanda espontânea)". Esta informação deve ser registrada através do campo [statusEscutaInicialOrientacao](#7-statusescutainicialorientacao);
- Se o campo [statusEscutaInicialOrientacao](#7-statusescutainicialorientacao) = `false`, este campo é obrigatório.

**Referências:**

- Tabela do SIGTAP, competência 09/2020 disponível em: [Tabela Unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar);
- [Procedimentos da Ficha](#procedimentos-da-ficha).

**Observações:**

- Inserir o código do procedimento SIGTAP sem ponto ou hífen, ex: `0214010015`;
- Inserir o código do procedimento AB em caracteres maiúsculos, sem espaços, ex: `ABEX022`.

### \#10 dataHoraInicialAtendimento
Data e hora do início do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento);
- Não pode ser posterior à [dataHoraFinalAtendimento](#11-datahorafinalatendimento) e à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#11 dataHoraFinalAtendimento
Data e hora do fim do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataHoraInicialAtendimento](#10-datahorainicialatendimento);
- Não pode ser posterior à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#12 cpfCidadao

CPF do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cnsCidadao](#2-cnscidadao) for preenchido.

### \#13 pesoAcompanhamentoNutricional

Peso do cidadão em quilogramas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 1 | 7 |

**Regras:**

- Apenas números e ponto (`.`);
- Máximo de 3 casas decimais;
- Valor mínimo 0.5 e máximo 500.

### \#14 alturaAcompanhamentoNutricional

Altura do cidadão em centímetros.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 2 | 5 |

**Regras:**

- Apenas números e ponto (`.`);
- Máximo de 1 casa decimal;
- Valor mínimo 20 e máximo 250.

## Procedimentos da Ficha

| Código SIGTAP \* | Descrição AB | Código AB correspondente |
| ---------------- | ------------ | ------------------------ |
| 03.09.05.002-2 | Acupuntura com inserção de agulhas | ABPG001 |
| 01.01.04.005-9 | Administração de vitamina A | ABPG002 |
| 03.01.10.004-7 | Cateterismo vesical de alívio | ABPG003 |
| 03.03.08.001-9 | Cauterização química de pequenas lesões | ABPG004 |
| 04.01.02.017-7 | Cirurgia de unha (cantoplastia) | ABPG005 |
| 03.01.10.006-3 | Cuidado de estomas | ABPG006 |
| 03.01.10.027-6 | Curativo especial | ABPG007 |
| 04.01.01.003-1 | Drenagem de abscesso | ABPG008 |
| 02.11.02.003-6 | Eletrocardiograma | ABEX004 |
| 02.01.02.003-3 | Coleta de citopatológico de colo uterino | ABPG010 |
| 02.11.06.010-0 | Exame de fundo de olho (Fundoscopia) | ABPG013 |
| 03.01.04.009-5 | Exame do pé diabético | ABPG011 |
| 04.01.01.007-4 | Exérese / Biópsia / Punção de tumores superficiais de pele | ABPG012 |
| 03.03.09.003-0 | Infiltração em cavidade sinovial | ABPG014 |
| 04.04.01.030-0 | Remoção de corpo estranho da cavidade auditiva e nasal | ABPG015 |
| 04.01.01.011-2 | Remoção de corpo estranho subcutâneo | ABPG016 |
| 04.04.01.027-0 | Retirada de cerume | ABPG017 |
| 03.01.10.015-2 | Retirada de pontos de cirurgias | ABPG018 |
| 04.01.01.006-6 | Sutura simples | ABPG019 |
| 04.04.01.034-2 | Tamponamento de epistaxe | ABPG021 |
| Não possui | Teste do olhinho (TRV) | ABEX022 |
| 02.11.06.027-5 | Triagem oftalmológica | ABPG020 |
| 02.14.01.006-6 | Teste rápido de gravidez | ABPG022 |
| 02.14.01.015-5 | Teste rápido para dosagem de proteinúria | ABPG040 |
| 02.14.01.005-8 | Teste rápido para HIV | ABPG024 |
| 02.14.01.009-0 | Teste rápido para hepatite C | ABPG025 |
| 02.14.01.007-4 | Teste rápido para sífilis | ABPG026 |
| 03.01.10.021-7 | Administração de medicamentos via Oral | ABPG027 |
| 03.01.10.020-9 | Administração de medicamentos via Intramuscular | ABPG028 |
| 03.01.10.019-5 | Administração de medicamentos via Endovenosa | ABPG029 |
| 03.01.10.010-1 | Administração de medicamentos via Inalação / Nebulização | ABPG030 |
| 03.01.10.023-3 | Administração de medicamentos via Tópica | ABPG031 |
| 03.01.10.024-1 | Administração de Penicilina para tratamento de sífilis | ABPG032 |
| 03.01.10.022-5 | Administração de medicamentos via Subcutânea (SC) | ABPG041 |
| 03.01.10.028-4 | Curativo simples | ABPG035 |
| 03.01.10.025-0 | Aferição de temperatura | ABPG034 |
| 01.01.04.007-5 | Medição de altura | ABPG038 |
| 01.01.04.008-3 | Medição de peso | ABPG039 |
_* Procedimentos pertencentes a competência **09/2020** do SIGTAP._