---
layout: doc
title: Ficha de Vacinação
id: dicionario-fv
parent: estrutura_arquivos
order: 14
---

## FichaVacinacaoMaster

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

**Regra:** Utilizar valor 3 (sistemas terceiros).

### \#3 headerTransport
Profissional que realizou a vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| UnicaLotacaoHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 12 - CBOs que podem registrar ficha de vacinação]({% url grupo_cbo %}#ficha-de-vacina-o) podem ser adicionadas no campo CBO do profissional.

**Referência:** [UnicaLotacaoHeader]({% url headerTransport %}#unicalotacaoheader).

### \#4 vacinacoes
Lista de registros de Vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<FichaVacinacaoChild\> | Sim | 1 | 99 |

**Referência:** [FichaVacinacaoChild](#fichavacinacaochild).

## FichaVacinacaoChild

### \#1 turno
Código do turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#2 numProntuario
Número do prontuário do cidadão na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 0 | 30 |

### \#3 cnsCidadao
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 15 | 15 |

**Regras**:

- Validado por algoritmo;
- Não pode ser preenchido se o campo [cpfCidadao](#14-cpfcidadao) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#4 dtNascimento
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior à 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos . Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#5 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#6 localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas valores de `1` a `10`.

**Referência:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento).

### \#7 viajante
Marcador que indica se o cidadão é viajante.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

### \#8 comunicanteHanseniase
Marcador que indica se o cidadão é comunicante de hanseníase.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

**Regras:** 

- O campo somente pode ser preenchido se for registrada uma vacinação com o imunobiológico `15 - BCG`; 
- O campo é de preenchimento obrigatório quando for registrada uma vacinação com o imunobiológico `15 - BCG`.

### \#9 gestante
Marcador que indica se a cidadã está gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regras:**

- Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`;
- Não pode ser preenchido ser for marcado o campo [puerpera](#10-puerpera).

### \#10 puerpera
Marcador que indica se a cidadã está puérpera.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regras:**

- Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`;
- Não pode ser preenchido ser for marcado o campo [gestante](#9-gestante).

### \#11 vacinas
Registro das vacinas aplicadas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<VacinaRowThrift\> | Sim | 1 | 10 |

**Regras:**

- Não pode ter [imunobiológicos](#1-imunobiologico) repetidos se o campo [stRegistroAnterior](#7-stregistroanterior) = `false`;
- Quando o campo [stRegistroAnterior](#7-stregistroanterior) = `false`, o registro da vacina deve estar de acordo com os relacionamentos de Imunobiológico x Estratégia x Dose definidos na tabela {% link regras_vacinacao %};
- Quando o campo [stRegistroAnterior](#7-stregistroanterior) = `true`, o registro da vacina não irá considerar os relacionamentos de Imunobiológico x Estratégia x Dose definidos na tabela {% link regras_vacinacao %}.

**Referência:** [VacinaRowThrift](#vacinarowthrift).

### \#12 dataHoraInicialAtendimento
Data e hora do início do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento);
- Não pode ser posterior à [dataHoraFinalAtendimento](#13-datahorafinalatendimento) e à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#13 dataHoraFinalAtendimento
Data e hora do fim do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataHoraInicialAtendimento](#12-datahorainicialatendimento);
- Não pode ser posterior à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#14 cpfCidadao

CPF do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cnsCidadao](#3-cnscidadao) for preenchido.

## VacinaRowThrift

### \#1 imunobiologico
Código do imunobiológico aplicado na vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Se o [imunobiologico]({% url dicionario %}#imunobiologico) for igual a `85`, `86`, `87` ou `88` é obrigatório o preenchimento do [cnsCidadao](#3-cnscidadao) ou do [cpfCidadao](#14-cpfcidadao).

**Referência:** [Imunobiologico]({% url dicionario %}#imunobiologico).

### \#2 estrategiaVacinacao
Código da estratégia da vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | - | - |

**Regras:**

- É de preenchimento obrigatório se o campo [stRegistroAnterior](#7-stregistroanterior) = `false`;
- Não pode ser preenchido se o campo [stRegistroAnterior](#7-stregistroanterior) = `true`.

**Referência:** [EstrategiaVacinacao]({% url dicionario %}#estrategiavacinacao).

### \#3 dose
Código da dose do imunobiológico aplicado na vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Dose]({% url dicionario %}#dose).

### \#4 lote
Valor do lote do imunobiológico aplicado na vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | 1 | 30 |

**Regras:**

- Apenas `letras`, `números`, `/`, `.` e `-`;
- É de preenchimento obrigatório se o campo [stRegistroAnterior](#7-stregistroanterior) = `false`.

### \#5 fabricante
Nome do fabricante do imunobiológico aplicado na vacinação.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | 1 | 60 |

**Regras:**

- Apenas `letras`, `números`, `/`, `.`, `espaço simples` e `-`;
- É de preenchimento obrigatório se o campo [stRegistroAnterior](#7-stregistroanterior) = `false`;
- Se o campo [Imunobiológico](#1-imunobiologico) = `85`, o campo deve ser preenchido com o valor = `OXFORD-ASTRAZENECA`;
- Se o campo [Imunobiológico](#1-imunobiologico) = `86`, o campo deve ser preenchido com o valor = `SINOVAC/BUTANTAN`;
- Se o campo [Imunobiológico](#1-imunobiologico) = `87`, o campo deve ser preenchido com o valor = `PFIZER/BIONTECH`;
- Se o campo [Imunobiológico](#1-imunobiologico) = `88`, o campo deve ser preenchido com o valor = `JANSSEN-CILAG`.

### \#6 grupoAtendimento

Grupo alvo ao qual o cidadão pertence em vacinações de campanha.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | - | - |

**Regras:**

- Só pode ser preenchido se o campo [estrategiaVacinacao](#2-estrategiavacinacao) = `5` (Campanha). Neste caso o preenchimento é obrigatório;
- Não pode ser preenchido se o campo [stRegistroAnterior](#7-stregistroanterior) = `true`;
- Deve ser preenchido com a informação da coluna **Código SIPNI** presente na tabela de referência.

**Referência:** [Grupo de Atendimento]({% url dicionario %}#grupodeatendimento).

### \#7 stRegistroAnterior

Indica se o imunobiológico foi aplicado em um atendimento anterior.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

### \#8 dataRegistroAnterior

Data em que foi aplicada a vacina.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | - | - |

**Regras:**

- É de preenchimento obrigatório se o campo [stRegistroAnterior](#7-stregistroanterior) = `true`;
- Não pode ser preenchido se o campo [stRegistroAnterior](#7-stregistroanterior) = `false`;
- Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior à [dtNascimento](#4-dtnascimento).

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).