---
layout: doc
title: Ficha de Procedimentos
id: dicionario-fp
order: 1
---

# Ficha de Procedimentos

## FichaProcedimentoMaster

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

**Regras:** Utilizar valor `3 (sistemas terceiros)`.

### \#3 headerTransport
Profissional que realizou os procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|UnicaLotacaoHeader |Sim |- |- |

**Referência:** [Profissional]({% url profissional %})

### \#4 atendProcedimentos
Registro dos procedimentos realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<FichaProcedimentoChild\> |Condicional |1 |23 |

**Referência:** [FichaProcedimentoChild](#fichaprocedimentochild).

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#5 numTotalAfericaoPa
Quantidade de aferições de pressão realizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#6 numTotalGlicemiaCapilar
Quantidade de aferições de glicemia capilar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#7 numTotalAfericaoTemperatura
Quantidade de aferições de temperatura realizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#8 numTotalMedicaoAltura
Quantidade de aferições de altura.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#9 numTotalCurativoSimples
Quantidade de curativos simples realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#10 numTotalMedicaoPeso
Quantidade de aferições de peso.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

### \#11 numTotalColetaMaterialParaExameLaboratorial
Quantidade de coletas para exame laboratorial.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Condicional |0 |3 |

Observação: É requerido pelo menos um dentre os itens `#4` a `#11`.

## FichaProcedimentoChild

### \#1 numProntuario
Número do prontuário do cidadão na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |30 |

### \#2 numCartaoSus
Numero do cartão SUS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

### \#3 dtNascimento
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referência:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date))

### \#4 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#5 localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento).

### \#6 turno
Código do turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#7 statusEscutaInicialOrientacao
Indica a realização da escuta inicial.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

### \#8 procedimentos
Lista dos códigos dos procedimentos que são registrados na ficha de procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<String\> |Condicional |0 |32 |

**Regras:** Caracteres maiúsculos e sem espaço em branco.

**Referência:** [ListaDeProcedimento](#listadeprocedimento).

Observação: É requerido pelo menos um dentre os itens `#8` e `#9`.

### \#9 outrosSiaProcedimentos
Código dos outros procedimentos do SIGTAP ou SISAB.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<String\> |Condicional | 0 | 6 |

**Regras:**

* Caracteres maiúsculos e sem espaço em branco.
* Não repetir procedimentos.

**Referência:** Para ver a referência da tabela do SIGTAP acesse: [Tabela unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar)

Observação: É requerido pelo menos um dentre os itens `#8` e `#9`.

## Procedimentos da Ficha

|Código |	Descrição|
|--- |--- |
|ABPG001 |Acupuntura com inserção de agulhas |
|ABPG002 |Administração de vitamina A |
|ABPG003 |Cateterismo vesical de alívio |
|ABPG004 |Cauterização química de pequenas lesões |
|ABPG005 |Cirurgia de unha (cantoplastia) |
|ABPG006 |Cuidado de estomas |
|ABPG007 |Curativo especial |
|ABPG008 |Drenagem de abscesso |
|ABEX004 |Eletrocardiograma |
|ABPG010 |Coleta de citopatológico de colo uterino |
|ABPG011 |Exame do pé diabético |
|ABPG012 |Exérese / Biópsia / Punção de tumores superficiais de pele |
|ABPG013 |Fundoscopia (exame de fundo de olho) |
|ABPG014 |Infiltração em cavidade sinovial |
|ABPG015 |Remoção de corpo estranho da cavidade auditiva e nasal |
|ABPG016 |Remoção de corpo estranho subcutâneo |
|ABPG017 |Retirada de cerume |
|ABPG018 |Retirada de pontos de cirurgias |
|ABPG019 |Sutura simples |
|ABPG020 |Triagem oftalmológica |
|ABPG021 |Tamponamento de epistaxe |
|ABPG022 |Teste rápido de gravidez |
|ABPG040 |Teste rápido para dosagem de proteinúria |
|ABPG024 |Teste rápido para HIV |
|ABPG025 |Teste rápido para hepatite C |
|ABPG026 |Teste rápido para sífilis |
|ABPG027 |Administração de medicamentos via oral |
|ABPG028 |Administração de medicamentos via intramuscular |
|ABPG029 |Administração de medicamentos via endovenosa |
|ABPG030 |Administração de medicamentos via inalação / nebulização |
|ABPG031 |Administração de medicamentos via tópica |
|ABPG032 |Administração de penincilina para tratamento de sífilis |
