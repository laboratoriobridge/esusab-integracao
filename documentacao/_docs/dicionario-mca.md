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
|--- |--- |---  |--- |
|UnicaLotacaoHeader |Sim |- |- |

**Referência**: [Ver Profissional]()

### \#2 numeroCartaoSus

CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|String |Opcional |15 |15 |

**Regras**: CNS valido de acordo com o algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse: [Cartao Net Datasus](http://cartaonet.datasus.gov.br/). Em "Downloads" baixe o arquivo de rotina de validação Java.  

### \#3 identificacaoUsuario

Nome do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|String |Sim |5 |100 |

**Regras**: 
- Ter ao menos duas palavras.
- Somente texto e apóstrofo ( ' )."

### \#4 dataNascimento

Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|Long |Sim |- |- |

**Regras**: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.

**Referêcia**: Para ver a referência sobre o formato epoch, acesse: [Wikipedia Epoch](https://en.wikipedia.org/wiki/Epoch_(reference_date))

### \#5 sexo

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|Long |Sim |- |- |

**Referêcia**: [Ver Sexo]()

### \#6 localAtendimento

Local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|Long |Sim |- |- |

**Referêcia**: [Ver LocalDeAtendimento]()

### \#7 perguntasQuestionarioCriancasMenoresSeisMeses

Marcadores referente a cidadãos menores de seis meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|List\<PerguntaQuestionarioCriancasMenoresSeisMeses\> |Condicional |- |- |

**Regras:** Requerido se dataNascimento < 6 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasMenoresSeisMeses]()

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#8 perguntasQuestionarioCriancasDeSeisVinteTresMeses

Marcadores referente a cidadãos que tem entre seis e vinte e três meses de idade.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|List\<PerguntaQuestionarioCriancasDeSeisVinteTresMeses\> |Condicional |- |- |

**Regras:** Requerido se dataNascimento >= 6 meses e <= 23 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasDeSeisVinteTresMeses]()

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#9 perguntasQuestionarioCriancasComMaisDoisAnos

Marcadores referente a cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|List\<PerguntaQuestionarioCriancasComMaisDoisAnos\> |Condicional |- |- |

**Regras:** Requerido se dataNacimento >= 24 meses a partir da dataAtendimento.

**Referêcia**: [Ver PerguntaQuestionarioCriancasComMaisDoisAnos]()

Observações: Os campos `#7`, `#8` e `#9` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#10 uuidFicha

Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|String |Sim |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referêcia**: Para ver a referência sobre o UUID, acesse: [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#11 tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |---  |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

---
## PerguntaQuestionarioCriancasMenoresSeisMeses

### \#1	pergunta

Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.	

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasMenoresSeisMesesEnum |Sim |- |- |

**Referência:** [Ver PerguntaCriancasMenoresSeisMesesEnum]()

### \#2	respostaUnicaEscolha

Resposta referente a pergunta.	

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referência:** [Ver RespostaUnicaEscolhaEnum]()

---
## PerguntaQuestionarioCriancasDeSeisVinteTresMeses

### \#1	pergunta

Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasDeSeisVinteTresMesesEnum |Sim |- |- |

**Referências:** [Ver PerguntaCriancasDeSeisVinteTresMesesEnum]()

### \#2	respostaUnicaEscolha

Resposta referente a pergunta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Sim |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referências:** [Ver RespostaUnicaEscolhaEnum]()

---
## PerguntaQuestionarioCriancasComMaisDoisAnos

### \#1	pergunta	

Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|PerguntaCriancasComMaisDoisAnosEnum | Requerido |- |- |

**Referência:** [Ver PerguntaCriancasComMaisDoisAnosEnum]()

### \#2	respostaUnicaEscolha	

Resposta referente a pergunta do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|RespostaUnicaEscolhaEnum |Condicional |- |- |

**Regras:** Deve respeitar as regras das respostas referente a pergunta.

**Referência:**[Ver RespostaUnicaEscolhaEnum]()

Observações: Os campos `#2` e `#3` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.

### \#3	respostaMultiplaEscolha	

Resposta referente a pergunta do registro acima.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<RespostaMultiplaEscolhaEnum\> |Condicional |- |- |

**Regras:**
- Deve respeitar as regras das respostas referente a pergunta .
- Pode ser preenchido somente se a pergunta for 12L."	Ver RespostaMultiplaEscolhaEnum	

Observações: Os campos `#2` e `#3` são mutualmente exclusivos, isto é, um e apenas um deles deve não ser nulo.
---