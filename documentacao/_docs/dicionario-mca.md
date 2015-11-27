---
layout: doc
title: Marcadores de Consumo Alimentar
id: dicionario-mca
order: 1
---

# Marcadores de Consumo Alimentar

## FichaConsumoAlimentar

### \#1 headerTransport

Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|UnicaLotacaoHeader |Sim |- |- |

**Referência:** {% link profissional %}

### \#2 numeroCartaoSus
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/). Em "Downloads" baixe o arquivo de rotina de validação Java.  

### \#3 identificacaoUsuario
Nome do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |5 |100 |

**Regras:**

* Ter ao menos duas palavras.
* Somente texto e apóstrofo (`'`).

### \#4 dataNascimento
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referêcia**: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch\_(reference\_date)).

### \#5 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referêcia**: [Sexo]({% url dicionario#sexo %})

### \#6 localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referêcia**: [LocalDeAtendimento]({% url dicionario#localdeatendimento %})

### \#7 perguntasQuestionarioCriancasMenoresSeisMeses
Marcadores referentes aos cidadãos menores de seis meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasMenoresSeisMeses\> |Condicional |- |- |

**Regras:** Requerido se [dataNascimento](#4-datanascimento) < 6 meses a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referêcia**: [PerguntaQuestionarioCriancasMenoresSeisMeses](#perguntaquestionariocriancasmenoresseismeses).

Observações: Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#8 perguntasQuestionarioCriancasDeSeisVinteTresMeses
Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasDeSeisVinteTresMeses\> |Condicional |- |- |

**Regras:** Requerido se [dataNascimento](#4-datanascimento) >= 6 meses e <= 23 meses a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referêcia**: [PerguntaQuestionarioCriancasDeSeisVinteTresMeses](#perguntaquestionariocriancasdeseisvintetresmeses).

Observações: Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#9 perguntasQuestionarioCriancasComMaisDoisAnos
Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasComMaisDoisAnos\> |Condicional |- |- |

**Regras:** Requerido se [dataNascimento](#4-datanascimento) >= 24 meses a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referêcia**: [PerguntaQuestionarioCriancasComMaisDoisAnos](#perguntaquestionariocriancascommaisdoisanos).

Observações: Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#10 uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referêcia**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally\_unique\_identifier).

### \#11 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

## PerguntaQuestionarioCriancasMenoresSeisMeses

### \#1	pergunta
Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasMenoresSeisMesesEnum |Sim |- |- |

**Referência:** [PerguntaCriancasMenoresSeisMesesEnum](#perguntacriancasmenoresseismesesenum).

### \#2	respostaUnicaEscolha
Resposta referente à pergunta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referentes à pergunta.

**Referência:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

## PerguntaQuestionarioCriancasDeSeisVinteTresMeses

### \#1	pergunta
Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasDeSeisVinteTresMesesEnum |Sim |- |- |

**Referências:** [PerguntaCriancasDeSeisVinteTresMesesEnum](#perguntacriancasdeseisvintetresmesesenum).

### \#2	respostaUnicaEscolha
Resposta referente a pergunta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referências:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

## PerguntaQuestionarioCriancasComMaisDoisAnos

### \#1	pergunta
Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasComMaisDoisAnosEnum | Requerido |- |- |

**Referência:** [PerguntaCriancasComMaisDoisAnosEnum](#perguntacriancascommaisdoisanosenum).

### \#2	respostaUnicaEscolha
Resposta referente a pergunta do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Condicional |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referência:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

Observações: Os campos `#2` e `#3` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#3	respostaMultiplaEscolha
Resposta referente à pergunta do registro acima.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<RespostaMultiplaEscolhaEnum\> |Condicional |- |- |

**Regras:**

* Deve respeitar as regras das respostas referentes à pergunta .
* Pode ser preenchido somente se a pergunta for 12L.

**Referência:** [RespostaMultiplaEscolhaEnum](#respostamultiplaescolhaenum).

Observações: Os campos `#2` e `#3` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

## PerguntaCriancasMenoresSeisMesesEnum

|Descrição	|Código | Respostas aceitas |
|--- |--- |--- |
|A\_CRIANCA\_ONTEM\_TOMOU\_LEITE\_DO\_PEITO |1L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|MINGAU |3L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|AGUA\_CHA |4L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|LEITE\_VACA |5L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|FORMULA\_INFANTIL |6L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|SUCO\_FRUTA	|7L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|FRUTA |8L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|COMIDA\_DE\_SAL |9L | • 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|OUTROS\_ALIMENTOS\_BEBIDAS |10L | • 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |

## PerguntaCriancasDeSeisVinteTresMesesEnum

|Descrição |Código |Respostas aceitas |
|--- |--- |--- |
|A\_CRIANCA\_ONTEM\_TOMOU\_LEITE\_PEITO  |21L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE|
|ONTEM\_A\_CRIANCA\_COMEU\_FRUTA\_INTEIRA\_PEDACO\_AMASSADO |22L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE|
|SE\_COMEU\_FRUTA\_QUANTAS\_VEZES |23L |• 3L - NÃO\_SABE <br> • 4L - UMA\_VEZ <br> • 5L - DUAS\_VEZES <br> • 6L - TRES\_VEZES\_OU\_MAIS |
|ONTEM\_A\_CRIANCA\_COMEU\_COMIDA\_DE\_SAL |24L |• 1L - SIM <br> • 2L - NÃO <br> • 3L - NÃO\_SABE |
|SE\_COMEU\_COMIDA\_DE\_SAL\_QUANTAS\_VEZES |25L | • 3L - NÃO\_SABE <br> • 4L - UMA\_VEZ <br> • 5L - DUAS\_VEZES <br> • 6L - TRES\_VEZES\_OU\_MAIS |
|SE\_SIM\_ESSA\_COMIDA\_FOI\_OFERECIDA |26L | • 3L - NÃO\_SABE <br> • 7L - EM\_PEDACOS <br> • 8L - AMASSADA <br> • 9L - PASSADA\_NA\_PENEIRA <br> • 10L - LIQUIDIFICADA <br> • 11L - SO\_O\_CALDO |
|OUTRO\_LEITE\_QUE\_NAO\_LEITE\_DO\_PEITO |28L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|MINGAU\_COM\_LEITE |29L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|IOGURTE |30L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|LEGUMES |31L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|VEGETAL\_OU\_FRUTAS\_COR\_ALARANJADA\_OU\_FOLHAS\_ESCURAS |32L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|VERDURA\_DE\_FOLHA |33L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|CARNE |34L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|FIGADO |35L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|FEIJAO |36L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|ARROZ\_BATATA\_INHAME\_MANDIOCA\_FARINHA\_MACARRAO |37L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|HAMBURGUER\_E\_OU\_EMBUTIDOS |38L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|BEBIDAS\_ADOCADAS |39L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|MACARRAO\_INSTANTANEO\_SALGADINHOS\_BISCOITOS |40L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|BISCOITO\_RECHEADO\_DOCES\_OU\_GULOSEIMAS |41L |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |

## PerguntaCriancasComMaisDoisAnosEnum
|Descrição	|Código	|Respostas aceitas|
|--- |--- |--- |
|VOCE\_TEM\_COSTUME\_DE\_REALIZAR\_AS\_REFEICOES\_ASSISTINDO\_TV\_MEXENDO\_NO\_COMPUTADOR\_E\_OU\_CELULAR |11 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|QUAIS\_REFEICOES\_VOCE\_FAZ\_AO\_LONGO\_DO\_DIA |12 | [RespostaMultiplaEscolhaEnum](#respostamultiplaescolhaenum) |
|FEIJAO	|14	|• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|FRUTAS\_FRESCAS	|15	|• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|VERDURAS\_E\_OU\_LEGUMES |16 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|HAMBURGUER\_E\_OU\_EMBUTIDOS |17 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|BEBIDAS\_ADOCADAS |18 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|MACARRAO\_INSTANTANEO\_SALGADINHOS\_BISCOITOS |19 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |
|BISCOITO\_RECHEADO\_DOCES\_OU\_GULOSEIMAS |20 |• 1L - SIM <br>• 2L - NÃO <br> • 3L - NÃO\_SABE |

## RespostaUnicaEscolhaEnum
|Descrição |Código |
|--- |--- |
|SIM |1L |
|NÃO |2L |
|NAO\_SABE |3L |
|UMA\_VEZ |4L |
|DUAS\_VEZES |5L |
|TRES\_VEZES\_OU\_MAIS |6L |
|EM\_PEDACOS |7L |
|AMASSADA |8L |
|PASSADA\_NA\_PENEIRA |9L |
|LIQUIDIFICADA	 |10L |
|SO\_O\_CALDO	 |11L |

## RespostaMultiplaEscolhaEnum
|Descrição |Código |
|--- |--- |
|CAFE\_DA\_MANHA |12L |
|LANCHE\_DA\_MANHA |13L |
|ALMOCO |14L |
|LANCHE\_DA\_TARDE |15L |
|JANTAR |16L |
|CEIA |17L |
