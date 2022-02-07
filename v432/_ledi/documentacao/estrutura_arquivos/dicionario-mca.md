---
layout: doc
title: Marcadores de Consumo Alimentar
id: dicionario-mca
parent: estrutura_arquivos
order: 10
---

## FichaConsumoAlimentar

### \#1 headerTransport

Profissional que realizou a visita.

| Tipo               | Obrigatório | Mínimo | Máximo |
| ------------------ | ----------- | ------ | ------ |
| UnicaLotacaoHeader | Sim         | -      | -      |

**Regra:** Somente as CBOs apresentadas na [Tabela 8 - CBOs que podem registrar marcadores de consumo alimentar]({% url grupo_cbo %}#marcadores-de-consumo-alimentar) podem ser adicionadas no campo CBO do profissional.

**Referência:** [UnicaLotacaoHeader]({% url headerTransport %}#unicalotacaoheader).

### \#2 cnsCidadao

CNS do cidadão.

| Tipo   | Obrigatório | Mínimo | Máximo |
| ------ | ----------- | ------ | ------ |
| String | Não         | 15     | 15     |

**Regra:**

- CNS validado de acordo com o algoritmo;
- Não pode ser preenchido se o campo [cpfCidadao](#12-cpfcidadao) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#3 identificacaoUsuario

Nome do cidadão.

| Tipo   | Obrigatório | Mínimo | Máximo |
| ------ | ----------- | ------ | ------ |
| String | Sim         | 3      | 70     |

**Regra:** As regras de validação de um nome estão descritas em {% link validar_nome %}.

### \#4 dataNascimento

Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim         | -      | -      |

**Regra:** Não pode ser posterior a [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos . Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#5 sexo

Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim         | -      | -      |

**Referência**: [Sexo]({% url dicionario#sexo %}).

### \#6 localAtendimento

Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim         | -      | -      |

**Regra:** Apenas valores de `1` a `10`.

**Referência**: [LocalDeAtendimento]({% url dicionario#localdeatendimento %}).

### \#7 perguntasQuestionarioCriancasMenoresSeisMeses

Marcadores referentes aos cidadãos menores de seis meses de idade.

| Tipo                                                 | Obrigatório | Mínimo | Máximo |
| ---------------------------------------------------- | ----------- | ------ | ------ |
| List\<PerguntaQuestionarioCriancasMenoresSeisMeses\> | Condicional | -      | -      |

**Regra:** Requerido se [dataNascimento](#4-datanascimento) < 6 meses a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência**: [PerguntaQuestionarioCriancasMenoresSeisMeses](#perguntaquestionariocriancasmenoresseismeses).

**Observação:** Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#8 perguntasQuestionarioCriancasDeSeisVinteTresMeses

Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.

| Tipo                                                     | Obrigatório | Mínimo | Máximo |
| -------------------------------------------------------- | ----------- | ------ | ------ |
| List\<PerguntaQuestionarioCriancasDeSeisVinteTresMeses\> | Condicional | -      | -      |

**Regra:** Requerido se [dataNascimento](#4-datanascimento) >= 6 meses e <= 23 meses a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência**: [PerguntaQuestionarioCriancasDeSeisVinteTresMeses](#perguntaquestionariocriancasdeseisvintetresmeses).

**Observação:** Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#9 perguntasQuestionarioCriancasComMaisDoisAnos

Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.

| Tipo                                                | Obrigatório | Mínimo | Máximo |
| --------------------------------------------------- | ----------- | ------ | ------ |
| List\<PerguntaQuestionarioCriancasComMaisDoisAnos\> | Condicional | -      | -      |

**Regra:** Requerido se [dataNascimento](#4-datanascimento) >= 24 meses a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência**: [PerguntaQuestionarioCriancasComMaisDoisAnos](#perguntaquestionariocriancascommaisdoisanos).

**Observação:** Os campos `#7`, `#8` e `#9` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#10 uuidFicha

Código UUID para identificar a ficha na base de dados nacional.

| Tipo   | Obrigatório | Mínimo | Máximo |
| ------ | ----------- | ------ | ------ |
| String | Sim         | 36     | 44     |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally\_unique\_identifier).

### \#11 tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo    | Obrigatório | Mínimo | Máximo |
| ------- | ----------- | ------ | ------ |
| Integer | Sim         | 1      | 1      |

**Regra:** Utilizar valor 3 (sistemas terceiros).

### \#12 cpfCidadao

CPF do cidadão.

| Tipo   | Obrigatório | Mínimo | Máximo |
| ------ | ----------- | ------ | ------ |
| String | Não         | 11     | 11     |

**Regras:**

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cnsCidadao](#2-cnscidadao) for preenchido.

## PerguntaQuestionarioCriancasMenoresSeisMeses

### \#1 pergunta

Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo                                 | Obrigatório | Mínimo | Máximo |
| ------------------------------------ | ----------- | ------ | ------ |
| PerguntaCriancasMenoresSeisMesesEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja menos que 6 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [PerguntaCriancasMenoresSeisMesesEnum](#perguntacriancasmenoresseismesesenum).

### \#2 respostaUnicaEscolha

Resposta referente à pergunta.

| Tipo                     | Obrigatório | Mínimo | Máximo |
| ------------------------ | ----------- | ------ | ------ |
| RespostaUnicaEscolhaEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja menos que 6 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

## PerguntaQuestionarioCriancasDeSeisVinteTresMeses

<a name = "#1-perguntaquestionariocriancasdeseisvintetresmeses"></a>

<h3>#1	pergunta</h3>

Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo                                     | Obrigatório | Mínimo | Máximo |
| ---------------------------------------- | ----------- | ------ | ------ |
| PerguntaCriancasDeSeisVinteTresMesesEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja menos que 23 meses e mais que 6 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [PerguntaCriancasDeSeisVinteTresMesesEnum](#perguntacriancasdeseisvintetresmesesenum).

<a name = "#2-respostaunicaescolhacriancasdeseisvintetresmeses"></a>

<h3>#2	respostaUnicaEscolha</h3>

Resposta referente a pergunta.

| Tipo                     | Obrigatório | Mínimo | Máximo |
| ------------------------ | ----------- | ------ | ------ |
| RespostaUnicaEscolhaEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja menos que 24 meses e mais que 6 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

## PerguntaQuestionarioCriancasComMaisDoisAnos

<a name = "#1-perguntaquestionariocriancascommaisdoisanos"></a>

<h3>#1	pergunta</h3>

Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.

| Tipo                                | Obrigatório | Mínimo | Máximo |
| ----------------------------------- | ----------- | ------ | ------ |
| PerguntaCriancasComMaisDoisAnosEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja mais que 24 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [PerguntaCriancasComMaisDoisAnosEnum](#perguntacriancascommaisdoisanosenum).

<a name = "#2-respostaunicaescolhacriancascommaisdoisanos"></a>

<h3>#2	respostaUnicaEscolha</h3>

Resposta referente a pergunta do registro.

| Tipo                     | Obrigatório | Mínimo | Máximo |
| ------------------------ | ----------- | ------ | ------ |
| RespostaUnicaEscolhaEnum | Condicional | -      | -      |

**Regra:** Obrigatório caso a [dataNascimento](#4-datanascimento) seja mais que 24 meses anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [RespostaUnicaEscolhaEnum](#respostaunicaescolhaenum).

**Observação:** Os campos `#2` e `#3` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#3 respostaMultiplaEscolha

Resposta referente à pergunta do registro acima.

| Tipo                                | Obrigatório | Mínimo | Máximo |
| ----------------------------------- | ----------- | ------ | ------ |
| List\<RespostaMultiplaEscolhaEnum\> | Condicional | -      | -      |

**Regras:**

- Deve respeitar as regras das respostas referentes à pergunta;
- Pode ser preenchido somente se a pergunta for 12L.

**Referência:** [RespostaMultiplaEscolhaEnum](#respostamultiplaescolhaenum).

**Observação:** Os campos `#2` e `#3` são mutuamente exclusivos, isto é, um e apenas um deles deve não ser nulo.

## PerguntaCriancasMenoresSeisMesesEnum

|Descrição	|Código | Respostas aceitas |
|--- |--- |--- |
|A\_CRIANCA\_ONTEM\_TOMOU\_LEITE\_DO\_PEITO |1 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|MINGAU |3 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|AGUA\_CHA |4 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|LEITE\_VACA |5 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|FORMULA\_INFANTIL |6 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|SUCO\_FRUTA	|7 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|FRUTA |8 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|COMIDA\_DE\_SAL |9 | • 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|OUTROS\_ALIMENTOS\_BEBIDAS |10 | • 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |

## PerguntaCriancasDeSeisVinteTresMesesEnum

|Descrição |Código |Respostas aceitas |
|--- |--- |--- |
|A\_CRIANCA\_ONTEM\_TOMOU\_LEITE\_PEITO  |21 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE|
|ONTEM\_A\_CRIANCA\_COMEU\_FRUTA\_INTEIRA\_PEDACO\_AMASSADO |22 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE|
|SE\_SIM\_QUANTAS\_VEZES <br> **OBS:** Preencher este campo somente se o campo 22 for preenchido com o valor "1 - SIM" |23 |• 3 - NÃO\_SABE <br> • 4 - UMA\_VEZ <br> • 5 - DUAS\_VEZES <br> • 6 - TRES\_VEZES\_OU\_MAIS|
|ONTEM\_A\_CRIANCA\_COMEU\_COMIDA\_DE\_SAL |24 |• 1 - SIM <br> • 2 - NÃO <br> • 3 - NÃO\_SABE |
|SE\_COMEU\_COMIDA\_DE\_SAL\_QUANTAS\_VEZES <br> **OBS:** Preencher este campo somente se o campo 24 for preenchido com o valor "1 - SIM" |25 | • 3 - NÃO\_SABE <br> • 4 - UMA\_VEZ <br> • 5 - DUAS\_VEZES <br> • 6 - TRES\_VEZES\_OU\_MAIS |
|SE\_SIM\_ESSA\_COMIDA\_FOI\_OFERECIDA <br> **OBS:** Preencher este campo somente se o campo 24 for preenchido com o valor "1 - SIM" |26 | • 3 - NÃO\_SABE <br> • 7 - EM\_PEDACOS <br> • 8 - AMASSADA <br> • 9 - PASSADA\_NA\_PENEIRA <br> • 10 - LIQUIDIFICADA <br> • 11 - SO\_O\_CALDO |
|OUTRO\_LEITE\_QUE\_NAO\_LEITE\_DO\_PEITO |28 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|MINGAU\_COM\_LEITE |29 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|IOGURTE |30 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|LEGUMES |31 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|VEGETAL\_OU\_FRUTAS\_COR\_ALARANJADA\_OU\_FOLHAS\_ESCURAS |32 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|VERDURA\_DE\_FOLHA |33 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|CARNE |34 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|FIGADO |35 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|FEIJAO |36 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|ARROZ\_BATATA\_INHAME\_MANDIOCA\_FARINHA\_MACARRAO |37 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|HAMBURGUER\_E\_OU\_EMBUTIDOS |38 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|BEBIDAS\_ADOCADAS |39 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|MACARRAO\_INSTANTANEO\_SALGADINHOS\_BISCOITOS |40 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|BISCOITO\_RECHEADO\_DOCES\_OU\_GULOSEIMAS |41 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |

## PerguntaCriancasComMaisDoisAnosEnum

|Descrição	|Código	|Respostas aceitas|
|--- |--- |--- |
|VOCE\_TEM\_COSTUME\_DE\_REALIZAR\_AS\_REFEICOES\_ASSISTINDO\_TV\_MEXENDO\_NO\_COMPUTADOR\_E\_OU\_CELULAR |11 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|QUAIS\_REFEICOES\_VOCE\_FAZ\_AO\_LONGO\_DO\_DIA |12 | [RespostaMultiplaEscolhaEnum](#respostamultiplaescolhaenum) |
|FEIJAO	|14	|• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|FRUTAS\_FRESCAS	|15	|• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|VERDURAS\_E\_OU\_LEGUMES |16 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|HAMBURGUER\_E\_OU\_EMBUTIDOS |17 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|BEBIDAS\_ADOCADAS |18 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|MACARRAO\_INSTANTANEO\_SALGADINHOS\_BISCOITOS |19 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |
|BISCOITO\_RECHEADO\_DOCES\_OU\_GULOSEIMAS |20 |• 1 - SIM <br>• 2 - NÃO <br> • 3 - NÃO\_SABE |

## RespostaUnicaEscolhaEnum

|Descrição |Código |
|--- |--- |
|SIM |1 |
|NÃO |2 |
|NAO\_SABE |3 |
|UMA\_VEZ |4 |
|DUAS\_VEZES |5 |
|TRES\_VEZES\_OU\_MAIS |6 |
|EM\_PEDACOS |7 |
|AMASSADA |8 |
|PASSADA\_NA\_PENEIRA |9 |
|LIQUIDIFICADA	 |10 |
|SO\_O\_CALDO	 |11 |

## RespostaMultiplaEscolhaEnum

|Descrição |Código |
|--- |--- |
|CAFE\_DA\_MANHA |12 |
|LANCHE\_DA\_MANHA |13 |
|ALMOCO |14 |
|LANCHE\_DA\_TARDE |15 |
|JANTAR |16 |
|CEIA |17 |