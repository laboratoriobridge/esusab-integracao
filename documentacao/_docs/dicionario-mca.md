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

**Referência**: [Ver Profissional]().

### \#2 numeroCartaoSus

CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras**: CNS valido de acordo com o algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse: [Cartao Net Datasus](http://cartaonet.datasus.gov.br/). Em "Downloads" baixe o arquivo de rotina de validação Java.  

### \#3 identificacaoUsuario

Nome do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |5 |100 |

**Regras**:
• Ter ao menos duas palavras.
• Somente texto e apóstrofo ( ' ).

### \#4 dataNascimento

Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras**: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.

**Referêcia**: Para ver a referência sobre o formato epoch, acesse: [Wikipedia Epoch](https://en.wikipedia.org/wiki/Epoch\_(reference\_date)).

### \#5 sexo

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referêcia**: [Ver Sexo]().

### \#6 localAtendimento

Local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referêcia**: [Ver LocalDeAtendimento]().

### \#7 perguntasQuestionarioCriancasMenoresSeisMeses

Marcadores referente a cidadãos menores de seis meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasMenoresSeisMeses\> |Condicional |- |- |

**Regras:** Requerido se dataNascimento < 6 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasMenoresSeisMeses]().

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#8 perguntasQuestionarioCriancasDeSeisVinteTresMeses

Marcadores referente a cidadãos que tem entre seis e vinte e três meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasDeSeisVinteTresMeses\> |Condicional |- |- |

**Regras:** Requerido se dataNascimento >= 6 meses e <= 23 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasDeSeisVinteTresMeses]().

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#9 perguntasQuestionarioCriancasComMaisDoisAnos

Marcadores referente a cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<PerguntaQuestionarioCriancasComMaisDoisAnos\> |Condicional |- |- |

**Regras:** Requerido se dataNacimento >= 24 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasComMaisDoisAnos]().

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#10 uuidFicha

Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referêcia**: Para ver a referência sobre o UUID, acesse: [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally\_unique\_identifier).

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

**Referência:** [Ver PerguntaCriancasMenoresSeisMesesEnum]().

### \#2	respostaUnicaEscolha

Resposta referente a pergunta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referência:** [Ver RespostaUnicaEscolhaEnum]().


## PerguntaQuestionarioCriancasDeSeisVinteTresMeses

### \#1	pergunta

Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasDeSeisVinteTresMesesEnum |Sim |- |- |

**Referências:** [Ver PerguntaCriancasDeSeisVinteTresMesesEnum]().

### \#2	respostaUnicaEscolha

Resposta referente a pergunta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referências:** [Ver RespostaUnicaEscolhaEnum]().


## PerguntaQuestionarioCriancasComMaisDoisAnos

### \#1	pergunta

Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|p | Requerido |- |- |

**Referência:** [Ver PerguntaCriancasComMaisDoisAnosEnum]().

### \#2	respostaUnicaEscolha

Resposta referente a pergunta do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Condicional |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referência:**[Ver RespostaUnicaEscolhaEnum]().

Observações: Os campos `#2` e `#3` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#3	respostaMultiplaEscolha

Resposta referente a pergunta do registro acima.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<RespostaMultiplaEscolhaEnum\> |Condicional |- |- |

**Regras:**
• Deve respeitar as regras das respostas referente a pergunta .
• Pode ser preenchido somente se a pergunta for 12L.

**Referência:**[Ver RespostaMultiplaEscolhaEnum]().

Observações: Os campos `#2` e `#3` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

---

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
|QUAIS\_REFEICOES\_VOCE\_FAZ\_AO\_LONGO\_DO\_DIA |12 | [RespostaMultiplaEscolhaEnum]() |
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
|NAO_SABE |3L |
|UMA_VEZ |4L |
|DUAS_VEZES |5L |
|TRES_VEZES_OU_MAIS |6L |
|EM_PEDACOS |7L |
|AMASSADA |8L |
|PASSADA_NA_PENEIRA |9L |
|LIQUIDIFICADA	 |10L |
|SO_O_CALDO	 |11L |

## RespostaMultiplaEscolhaEnum
|Descrição |Código |
|--- |--- |
|CAFE_DA_MANHA |12L |
|LANCHE_DA_MANHA |13L |
|ALMOCO |14L |
|LANCHE_DA_TARDE |15L |
|JANTAR |16L |
|CEIA |17L |
