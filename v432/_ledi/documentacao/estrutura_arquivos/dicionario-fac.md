---
layout: doc
title: Ficha de Atividade Coletiva
id: dicionario-fac
parent: estrutura_arquivos
order: 7
---

## FichaAtividadeColetiva

### \#1	uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 36 | 44 |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2	outraLocalidade
Descrição do local onde é realizada a atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 0 | 250 |

**Regras:** 

- Preencher somente um dos campos: [outraLocalidade]({% url dicionario-fac %}#2-outralocalidade), [inep]({% url dicionario-fac %}#3-inep) ou [cnesLocalAtivade]({% url dicionario-fac %}#12-cneslocalatividade);
- Não deve ser preenchido se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` ou [pseSaude]({% url dicionario-fac %}#19-psesaude) = `true`.

### \#3	inep

Número INEP da instituição.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Condicional | 0 | 8 |

**Regras:**

- Preencher somente um dos campos: [outraLocalidade]({% url dicionario-fac %}#2-outralocalidade), [inep]({% url dicionario-fac %}#3-inep) ou [cnesLocalAtivade]({% url dicionario-fac %}#12-cneslocalatividade);
- É de preenchimento obrigatório se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` ou [pseSaude]({% url dicionario-fac %}#19-psesaude) = `true`;

**Referência:** Os números INEP das instituições de ensino podem ser obtidos a partir do [site do INEP](http://portal.inep.gov.br/microdados). Faça download do arquivo do **Censo escolar de 2020**. Na pasta "Dados" está contido o arquivo "ESCOLAS.CSV", que contém a tabela com os dados das instituições. O número INEP da instituição se encontra na coluna "CO\_ENTIDADE".

### \#4	numParticipantes
Número de participantes da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 0 | 3 |

**Regras:**

- Valores entre 1 e 999;
- Deve ser maior ou igual a quantidade de participantes inseridos em [participantes]({% url dicionario-fac %}#10-participantes).

### \#5	numAvaliacoesAlteradas
Número de avaliações alteradas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Não | 0 | 3 |

**Regras:**

- Valores entre 0 e 999.
- O valor do campo deve ser igual ao número de participantes que tiveram o campo [avaliacaoAlterada]({% url dicionario-fac %}#3-avaliacaoalterada) = `true`.

### \#6 profissionais
Lista dos profissionais que participaram da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<ProfissionalCboRowItem\> | Não | - | - |

**Regra:** Não pode ser preenchido se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`.

**Referência:** [ProfissionalCboRowItem]({% url dicionario-fac %}#profissionalcborowitem).

### \#7 atividadeTipo
Código do tipo da atividade que será realizada.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Obrigatório | - | - |

**Regras:**

- Os itens:

	- `01 - Reunião de equipe`;
	- `02 - Reunião com outras equipes de saúde`;
	- `03 - Reunião intersetorial / Conselho local de saúde / Controle social`;
	- `05 - Atendimento em grupo`.

- Não podem ser selecionados se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`.

**Referência**: [TipoAtividadeColetiva]({% url dicionario %}#tipoatividadecoletiva).

### \#8 temasParaReuniao
Temas para reunião.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Condicional | 0 | 7 |

**Regras:**

- É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `1`, `2` ou `3`;
- Não pode ser preenchido se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `4`, `5`, `6` ou `7`;
- Não pode ser preenchido se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`.

**Referência:** [TemasParaReuniao]({% url dicionario %}#temasparareuniao).

### \#9	publicoAlvo
Código do público alvo da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Condicional | 0 | 17 |

**Regras:**

* É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `4`, `5`, `6` ou `7`;
* Não pode ser preenchido se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `1`, `2` ou `3`.

**Referência:** [PublicoAlvo]({% url dicionario %}#publicoalvo).

### \#10	participantes
Cidadãos que participaram da atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<ParticipanteRowItem\> | Condicional | - | - |

**Regra:** É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `5` ou `6`.

**Referência:** [ParticipanteRowItem]({% url dicionario-fac %}#participanterowitem).

### \#11	tbCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 1 |

**Observação**: Utilizar valor 3 (sistemas terceiros).

### \#12	cnesLocalAtividade
CNES do local de atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | - | - |

**Regras:** 

- Preencher somente um dos campos: [outraLocalidade]({% url dicionario-fac %}#2-outralocalidade), [inep]({% url dicionario-fac %}#3-inep) ou [cnesLocalAtivade]({% url dicionario-fac %}#12-cneslocalatividade);
- Não deve ser preenchido se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` ou [pseSaude]({% url dicionario-fac %}#19-psesaude) = `true`.

### \#13	procedimento
Código do SIGTAP do procedimento coletivo realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | - | - |

**Regra:** Só pode ser preenchido se o campo [praticasEmSaude]({% url dicionario-fac %}#17-praticasemsaude) possuir o valor `30`.

**Referência:** [OutroProcedimentoColetivo]({% url dicionario-fac %}#outroprocedimentocoletivo).

### \#14	turno
Turno de realização da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#15 headerTransport
Dados referentes ao profissional responsável e a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| UnicaLotacaoHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 5 - CBOs que podem registrar ficha de atividade coletiva]({% url grupo_cbo %}#ficha-de-atividade-coletiva) podem ser adicionadas no campo CBO do profissional.

**Referência:** [UnicaLotacaoHeader]({% url headerTransport %}#unicalotacaoheader).

### \#16	temasParaSaude
Códigos dos temas para saúde abordados na atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Condicional | 0 | 16 |

**Regras:**

* Não pode ser preenchido se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) = `1`, `2` ou `3`;
* É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) = `4`, `5` ou `7`;
- Se [temasParaSaude]({% url dicionario-fac %}#16-temasparasaude) = `18 - Semana saúde na escola`, torna-se obrigatório o preenchimento de [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) ou [pseSaude]({% url dicionario-fac %}#19-psesaude).

**Referência:** [TemasParaSaude]({% url dicionario %}#temasparasaude).

### \#17	praticasEmSaude
Códigos das práticas em saúde abordadas na atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Condicional | 0 | 14 |

**Regras:**

* Não pode ser preenchido se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) = `1`, `2`, `3`, `4` ou `7`;
* É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) = `6`;
* Os itens `2 - Aplicação tópica de flúor` e `9 - Escovação dental supervisionada` só podem ser utilizados se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) = `6`;
* Os itens:

	- `2 - Aplicação tópica de flúor`;
	- `9 - Escovação dental supervisionada`;
	- `25 - PNCT* sessão 1`;
	- `26 - PNCT* sessão 2`;
	- `27 - PNCT* sessão 3`;
	- `28 - PNCT* sessão 4`;
	- `24 - Verificação da situação vacinal`;
	- `30 - Outro procedimento coletivo`.

Não podem ser selecionados se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`.

**Referência:** [PraticasEmSaude]({% url dicionario %}#praticasemsaude).

### \#18	pseEducacao
Marcador que indica que foram exercidas práticas educativas por um profissional de educação na escola

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regras:**

- Se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true`, [inep]({% url dicionario-fac %}#3-inep) torna-se obrigatório;
- Deve receber o valor `true` se [temasParaSaude]({% url dicionario-fac %}#16-temasparasaude) = `18 - Semana saúde na escola` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`.
- Se [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `true` e [pseSaude]({% url dicionario-fac %}#19-psesaude) = `false`:
	- O grupo [profissionais]({% url dicionario-fac %}#6-profissionais) não deve ser preenchido;
	- Os itens `01 - Reunião de equipe`, `02 - Reunião com outras equipes de saúde`, `03 - Reunião intersetorial / Conselho local de saúde / Controle social` e `05 - Atendimento em grupo` do campo [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) não devem ser selecionados;
	- O grupo [temasParaReuniao]({% url dicionario-fac %}#8-temasparareuniao) não deve ser preenchido;
	- Os itens `2 - Aplicação tópica de flúor`, `9 - Escovação dental supervisionada`, `25 - PNCT* sessão 1`, `26 - PNCT* sessão 2`,  `27 - PNCT* sessão 3`,  `28 - PNCT* sessão 4`, `24 - Verificação da situação vacinal` e `30 - Outro procedimento coletivo` do campo [praticasEmSaude]({% url dicionario-fac %}#17-praticasemsaude) não devem ser selecionados;

### \#19	pseSaude
Marcador que indica que foram exercidas práticas de saúde por um profissional da saúde na escola.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regras:**

- Se [pseSaude]({% url dicionario-fac %}#19-psesaude) = `true`, o campo [inep]({% url dicionario-fac %}#3-inep) torna-se obrigatório;
- Deve receber o valor `true` se [temasParaSaude]({% url dicionario-fac %}#16-temasparasaude) = `18 - Semana saúde na escola` e [pseEducacao]({% url dicionario-fac %}#18-pseeducacao) = `false`.

## ParticipanteRowItem

### \#1	cnsParticipante
CNS do cidadão que participou da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | 15 | 15 |

**Regras:**

- CNS validado de acordo com o algoritmo;
- É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `5` ou `6`;
- Não pode ser preenchido se o campo [cpfParticipante](#9-cpfparticipante) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#2	dataNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser posterior a [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos . Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#3	avaliacaoAlterada
Marcador que indica que a avaliação do cidadão teve um valor diferente dos considerados normais.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

### \#4	peso
Peso do cidadão em quilogramas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 1 | 7 |

**Regras:**

* Apenas números e ponto (`.`);
* Máximo de 3 casas decimais;
* Valor mínimo 0.5 e máximo 500.

### \#5	altura
Altura do cidadão em centímetros.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 2 | 5 |

**Regras:**

* Apenas números e ponto (`.`);
* Máximo de 1 casa decimal;
* Valor mínimo 20 e máximo 250.

### \#6	cessouHabitoFumar
Marcação se o cidadão cessou o hábito de fumar.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não| - | - |

**Regra:** Não deve ser preenchido se o campo [praticasEmSaude]({% url dicionario-fac %}#17-praticasemsaude) for diferente de `25`, `26`, `27` ou `28` (referentes ao PNCT).

### \#7	abandonouGrupo
Marcação se o cidadão abandonou o grupo de tabagismo.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

**Regra:** Não deve ser preenchido se o campo [praticasEmSaude]({% url dicionario-fac %}#17-praticasemsaude) for diferente de `25`, `26`, `27` ou `28` (referentes ao PNCT).

## \#8	sexo
Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#9 cpfParticipante

CPF do participante.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- É de preenchimento obrigatório se [atividadeTipo]({% url dicionario-fac %}#7-atividadetipo) for `5` ou `6`;
- Não pode ser preenchido se o campo [cnsParticipante](#1-cnsparticipante) for preenchido.

## ProfissionalCboRowItem

### \#1 cnsProfissional
CNS do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 15 | 15 |

**Regra:** CNS validado de acordo com o algoritmo.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

**Observação:** Esta entidade é utilizada para representar os profissionais que participaram da atividade coletiva

### \#2 codigoCbo2002
Código CBO do profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | - |

**Referência:** [Lista com todas as CBOs]({% url cbo %}).

**Observação:** Esta entidade é utilizada para representar os profissionais que participaram da atividade coletiva.

## OutroProcedimentoColetivo

| Código SIGTAP* | Descrição |
| -------------- | --------- |
| 01.01.01.001-0 | ATIVIDADE EDUCATIVA / ORIENTAÇÃO EM GRUPO NA ATENÇÃO BÁSICA |
| 01.01.01.002-8 | ATIVIDADE EDUCATIVA / ORIENTAÇÃO EM GRUPO NA ATENÇÃO ESPECIALIZADA |
| 01.01.02.011-2 | AÇÃO COLETIVA DE PREVENÇÃO DE CÂNCER BUCAL |
| 01.01.02.002-3 | AÇÃO COLETIVA DE BOCHECHO FLUORADO |
| 01.01.02.004-0 | AÇÃO COLETIVA DE EXAME BUCAL COM FINALIDADE EPIDEMIOLÓGICA |
| 01.01.02.008-2 | EVIDENCIAÇÃO DE PLACA BACTERIANA |
| 01.01.05.001-1 | PRÁTICAS CORPORAIS EM MEDICINA TRADICIONAL CHINESA |
| 01.01.05.002-0 | TERAPIA COMUNITÁRIA |
| 01.01.05.004-6 | YOGA |
| 01.01.05.005-4 | OFICINA DE MASSAGEM/ AUTO-MASSAGEM |
| 01.01.05.006-2 | SESSÃO DE ARTETERAPIA |
| 01.01.05.007-0 | SESSÃO DE MEDITAÇÃO |
| 01.01.05.008-9 | SESSÃO DE MUSICOTERAPIA |
| 01.01.05.010-0 | SESSÃO DE BIODANÇA |
| 01.01.05.011-9 | SESSÃO DE BIOENERGÉTICA | 
| 01.01.05.012-7 | SESSÃO DE CONSTELAÇÃO FAMILIAR |
| 01.01.05.013-5 | SESSÃO DE DANÇA CIRCULAR |
| 01.02.02.002-7 | ATIVIDADE EDUCATIVA EM SAÚDE DO TRABALHADOR |
| 01.01.01.009-5 | PREVENÇÃO AO COVID-19 NAS ESCOLAS |
_* Procedimentos pertencentes a competência **09/2020** do SIGTAP._