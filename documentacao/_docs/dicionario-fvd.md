---
layout: doc
title: Ficha de Visita Domiciliar
id: dicionario-fvd
order: 1
---

# Ficha de Visita Domiciliar

## FichaVisitaDomiciliarMaster

### \#1 uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** Para ver a referência sobre o UUID, acesse [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#3 headerTransport
Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|UnicaLotacaoHeader |Sim |- |- |

**Referência:** [Profissional]({% link profissional %}).

### \#4 visitasDomiciliares
Pelo menos 1 item na lista, no máximo 23.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<FichaVisitaDomiciliarChild\> |Sim |- |- |

**Referência:** [FichaVisitaDomiciliarChild](#fichavisitadomiciliarchild).

## FichaVisitaDomiciliarChild

### \#1 turno
Código do turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Não |- |- |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#2 numProntuario
Número do prontuário do cidadão na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Não |0 |30 |

**Regras:** Somente letras e números.

### \#3 numCartaoSus
Número do cartão SUS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Não |15 |15 |

**Regras:** Validado pelo algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.  

### \#4 dtNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referência:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#5 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#6 statusVisitaCompartilhadaOutroProfissional
Marcador que indica se a visita foi compartilhada com outro profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Não |- |- |

### \#7 motivosVisita
Código dos motivos da visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |- |- |

**Regras:** Não pode ser preenchido caso [Desfecho]({% url dicionario %}#desfecho) é `AUSENTE` ou `VISITA_RECUSADA`.

**Referência:** [MotivoVisita]({% url dicionario %}#motivovisita).

### \#8 desfecho
Código dos resultados da ação de visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Requerido |- |- |

**Referência:** [Desfecho]({% url dicionario#desfecho %}).
