---
layout: doc
title: Ficha de Atendimento Odontológico Individual
id: dicionario-fao
parent: estrutura_arquivos
order: 6
---

## FichaAtendimentoOdontologicoMaster

### \#1	uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 36 | 44 |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2	headerTransport
Profissionais que realizaram o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| VariasLotacoesHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 4 - CBOs que podem registrar ficha de atendimento odontológico individual]({% url grupo_cbo %}#ficha-de-atendimento-odontol-gico-individual) podem ser adicionadas no campo CBO do profissional principal.

**Referência:** [VariasLotacoesHeader]({% url headerTransport %}#variaslotacoesheader).

### \#3	atendimentosOdontologicos
Registro individualizado dos atendimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<FichaAtendimentoOdontologicoChild\> | Sim | 1 | 99 |

**Referência:** [FichaAtendimentoOdontologicoChild](#fichaatendimentoodontologicochild).

### \#4	tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 1 |

**Regra:** Utilizar valor 3 (sistemas terceiros).

## FichaAtendimentoOdontologicoChild

### \#1	dtNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior à 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#2	cnsCidadao
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 15 | 15 |

**Regras:**

- CNS validado de acordo com o algoritmo;
- Não pode ser preenchido se o campo [cpfCidadao](#18-cpfcidadao) for preenchido.

**Referência:** O algoritmo de validação está presente em {% link algoritmo_CNS %}.

### \#3	numProntuario
Número do prontuário do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 0 | 30 |

**Regra:** Apenas letras e números são aceitos.

### \#4	gestante
Marcador que indica se o cidadão está gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regra:** Não pode ser preenchido quando [Sexo](#14-sexo) = `0 (masculino)`.

### \#5	necessidadesEspeciais
Marcador que indica se o cidadão é portador de necessidades especiais.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

### \#6	localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas valores de `1` a `10`.

**Referência:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento).

### \#7	tipoAtendimento
Código do tipo de atendimento realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas as opções `2`, `4`, `5` ou `6` são aceitas.

**Referência:** [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento).

### \#8	tiposEncamOdonto
Código das condutas adotadas e possíveis encaminhamentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Sim | 1 | 17 |

**Regras:**

* A opção `15 - Tratamento concluído` só pode ser selecionada se no campo [tiposConsultaOdonto](#11-tiposconsultaodonto) for selecionada uma das opções `1 - Primeira consulta odontológica programática` ou `2 - Consulta de retorno em odontologia`;
* A opção `17 - Alta do episódio` não pode ser selecionada se no campo [tiposConsultaOdonto](#11-tiposconsultaodonto) for selecionada uma das opções `1 - Primeira consulta odontológica programática` ou `2 - Consulta de retorno em odontologia`.

**Referência:** [CondutaEncaminhamentoOdonto]({% url dicionario %}#condutaencaminhamentoodonto).

### \#9	tiposFornecimOdonto
Código dos materiais fornecidos durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Não | 0 | 3 |

**Referência:** [FornecimentoOdonto]({% url dicionario %}#fornecimentoodonto).

### \#10 tiposVigilanciaSaudeBucal
Código dos marcadores referentes a situação de vigilância em saúde bucal.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Sim | 1 | 7 |

**Referência:** [VigilanciaEmSaudeBucal]({% url dicionario %}#vigilanciaemsaudebucal).

### \#11 tiposConsultaOdonto
Código do tipo de consulta odontológica realizada.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Condicional | 0 | 1 |

**Regras:**

* É de preenchimento obrigatório se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `2 (consulta agendada)`;
* Não pode ser preenchido se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `4 (escuta inicial ou orientação)`;
* Se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `6 (atendimento de urgência)`, a opção de `2 (consulta de retorno)` não pode ser marcada;
* Se [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `5 (consulta no dia)`, o campo é opcional;
* Aceita apenas um registro.

**Referências:** [TipoDeConsultaOdonto]({% url dicionario %}#tipodeconsultaodonto)

### \#12 procedimentosRealizados
Código dos procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<ProcedimentoQuantidade\> | Não | 0 | 20 |

**Referência:** [ProcedimentoQuantidade](#procedimentoquantidade).

### \#14 sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#15 turno
Código do turno em que o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#16 dataHoraInicialAtendimento
Data e hora do início do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento);
- Não pode ser posterior à [dataHoraFinalAtendimento](#17-datahorafinalatendimento) e à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#17 dataHoraFinalAtendimento
Data e hora do fim do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataHoraInicialAtendimento](#16-datahorainicialatendimento);
- Não pode ser posterior à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#18 cpfCidadao

CPF do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cnsCidadao](#2-cnscidadao) for preenchido.

### \#19 Medicamentos

Lista de medicamentos prescritos durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<medicamentos\> | Não | 0 | 15 |

**Referência:** [Medicamentos](#medicamentos).

### \#20 Encaminhamentos

Lista com os encaminhamentos realizados durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<encaminhamentos\> | Não | 0 | 10 |

**Regras:** 

- Não pode ter itens duplicados na lista. Serão considerados duplicados os itens que tiverem a mesma [especialidade](#1-especialidade) e [hipoteseDiagnosticoCID10](#2-hipotesediagnosticocid10);
- Os profissionais listados na tabela [Tabela 4 - CBOs que podem registrar ficha de atendimento odontológico individual]({% url grupo_cbo %}#ficha-de-atendimento-odontol-gico-individual) podem registrar encaminhamentos, com exceção das CBOs 322415, 322430, 322405 e 322425.

**Referência:** [Encaminhamentos](#encaminhamentos).

### \#21 resultadosExames

Lista de exames e seus resultados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<resultadosExames\> | Não | 0 | 10 |

**Referência:** [resultadosExames](#resultadosexames).

### \#22 pesoAcompanhamentoNutricional

Peso do cidadão em quilogramas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 1 | 7 |

**Regras:**

- Apenas números e ponto (`.`);
- Máximo de 3 casas decimais;
- Valor mínimo 0.5 e máximo 500.

### \#23 alturaAcompanhamentoNutricional

Altura do cidadão em centímetros.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 2 | 5 |

**Regras:**

- Apenas números e ponto (`.`);
- Máximo de 1 casa decimal;
- Valor mínimo 20 e máximo 250.

## ProcedimentoQuantidade

### \#1	coMsProcedimento
Código do procedimento no MS.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | - |

**Regras:**

- Não pode conter procedimentos repetidos;
- Podem ser informados os procedimentos pertencentes aos grupos `01 - Ações de promoção e prevenção em saúde`, `02 - Procedimentos com finalidade diagnóstica`, `03 - Procedimentos clínicos`, `04 - Procedimentos cirúrgicos` ou presentes na [ListaProcedimentosRealizados](#listaprocedimentosrealizados). Neste caso, deve ser informado o respectivo código **SIGTAP** do procedimento;
- Além destes procedimentos, são permitidos os procedimentos pertencentes ao grupo `07 - Órteses, próteses e materiais especiais`:

	- 07.01.07.006-4 - MANTENEDOR DE ESPAÇO;
	- 07.01.07.007-2 - PLACA OCLUSAL;
	- 07.01.07.008-0 - PLANO INCLINADO;
	- 07.01.07.009-9 - PROTESE PARCIAL MANDIBULAR REMOVIVEL;
	- 07.01.07.010-2 - PROTESE PARCIAL MAXILAR REMOVIVEL;
	- 07.01.07.011-0 - PROTESE TEMPORARIA;
	- 07.01.07.012-9 - PROTESE TOTAL MANDIBULAR;
	- 07.01.07.013-7 - PROTESE TOTAL MAXILAR;
	- 07.01.07.005-6 - COROA PROVISORIA;
	- 07.01.07.014-5 - PROTESES CORONARIAS / INTRA-RADICULARES FIXAS / ADESIVAS (POR ELEMENTO).

- Não pode ser preenchido com o procedimento "03.01.04.007-9 - Escuta inicial / orientação (acolhimento a demanda espontânea)". Esta informação deve ser registrada através do campo [#7 tipoAtendimento](#7-tipoatendimento), opção `4 (escuta inicial ou orientação)`.

**Referências:**

- Tabela do SIGTAP, competência 09/2020 disponível em: [Tabela Unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar);
- [ListaProcedimentosRealizados](#listaprocedimentosrealizados).

**Observação:** Inserir o código do procedimento SIGTAP sem ponto ou hífen, ex: `0214010015`.

### \#2	quantidade
Quantidade de procedimentos realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | Condicional |

**Regras:**

- A quantidade limite deve ser verificada de acordo com a [Lista de procedimentos por local e quantidade máxima permitida](#lista-de-procedimentos-por-local-e-quantidade-m-xima-permitida);
- Os procedimentos que não estão presentes na [Lista de procedimentos por local e quantidade máxima permitida](#lista-de-procedimentos-por-local-e-quantidade-m-xima-permitida) podem ser registrados apenas com a quantidade 1.

## Medicamentos

### \#1 codigoCatmat
Código identificador do medicamento/princípio ativo.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | 20 |

**Regra:** Deve ser preenchido com o valor presente na coluna **Código CATMAT** da {% link catmat %}.

### \#2 viaAdministracao
A via em que o medicamento/princípio ativo entrará em contato com o organismo.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | - | - |

**Referência:** [viaAdministracao]({% url dicionario %}#viaadministracao).

### \#3 dose
Dose em que o medicamento/princípio ativo deve ser administrado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | 100 |

### \#4 doseUnica
Indica que será uma única dose.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regra:** Este campo só pode ser marcado como "Verdadeiro" caso o campo [usoContinuo](#5-usocontinuo) estiver marcado com a opção "Falso".

### \#5 usoContinuo
Indica que é de uso contínuo.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Sim | - | - |

**Regra:** Este campo só pode ser marcado como "Verdadeiro" caso o campo [doseUnica](#4-doseunica) estiver marcado com a opção "Falso".

### \#6 doseFrequenciaTipo
Tipo da frequência da dose.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | - |

**Regra:** 

- Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro";
- Caso o campo [doseUnica](#4-doseunica) estiver marcado como "Falso", este campo é de preenchimento obrigatório.

**Referência:** [doseFrequenciaTipo]({% url dicionario %}#dosefrequenciatipo).

### \#7 doseFrequencia
Refere-se ao valor do tipo de frequência da dose.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | 99 |

**Regras:**

- Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro";
- Se o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) = `1 - Turno`, então deve ser preenchido com um valor conforme [turno]({% url dicionario %}#turno), complementando a informação com o preenchimento dos campos [doseFrequenciaQuantidade](#8-dosefrequenciaquantidade) e [doseFrequenciaUnidadeMedida](#9-dosefrequenciaunidademedida);
- Se o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) = `2 - Frequência`, então deve ser preenchido com o **número de vezes** que a dose deverá ser administrada, complementando a informação com o preenchimento dos campos [doseFrequenciaQuantidade](#8-dosefrequenciaquantidade) e [doseFrequenciaUnidadeMedida](#9-dosefrequenciaunidademedida);
- Se o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) = `3 - Intervalo`, então deve ser preenchido com o **intervalo de horas** que a dose deverá ser administrada.

### \#8 doseFrequenciaQuantidade
Refere-se à periodicidade em que a dose será administrada.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | 999 |

**Regras:**

- Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro";
- Não pode ser preenchido caso o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) = `3 - Intervalo`;
- É de preenchimento obrigatório caso o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) for `1 - Turno` ou `2 - Frequência`.

### \#9 doseFrequenciaUnidadeMedida
Unidade de tempo associada à quantidade da frequência da dose.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | - |

**Regras:**

- Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro";
- Não pode ser preenchido caso o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) = `3 - Intervalo`;
- É de preenchimento obrigatório caso o campo [doseFrequenciaTipo](#6-dosefrequenciatipo) for `1 - Turno` ou `2 - Frequência`.

**Referência:** [doseFrequenciaUnidadeMedida]({% url dicionario %}#dosefrequenciaunidademedida).

### \#10 dtInicioTratamento
Data de início do tratamento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#11 duracaoTratamento
Tempo de duração do tratamento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | 999 |

**Regras:**

- Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro";
- Não pode ser preenchido caso o campo [duracaoTratamentoMedida](#12-duracaotratamentomedida) = `4 - Indeterminado`;
- O valor deste campo deve ser maior que o valor do campo [doseFrequenciaQuantidade](#8-dosefrequenciaquantidade), respeitando as devidas unidades de medidas.

### \#12 duracaoTratamentoMedida
Unidade de medida para o tempo de duração do tratamento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Condicional | - | - |

**Regra:** Não pode ser preenchido caso o campo [doseUnica](#4-doseunica) estiver marcado como "Verdadeiro".

**Referência:** [duracaoTratamentoMedida]({% url dicionario %}#duracaotratamentomedida).

### \#13 quantidadeReceitada
Quantidade receitada do medicamento/princípio ativo.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 999 |

## Encaminhamentos

### \#1 especialidade
Especialidade em que o cidadão será encaminhado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | -- | -- |

**Regra:** Ao preencher este grupo, é obrigatório o preenchimento do campo [tiposEncamOdonto](#8-tiposencamodonto) com o valor da coluna **Código do encaminhamento** correspondente à especialidade do encaminhamento, conforme apresentado na tabela [especialidadeEncaminhamentoAtendimentoOdontológico](#especialidadeencaminhamentoatendimentoodontol-gico).

**Referência:** [especialidadeEncaminhamentoAtendimentoOdontológico](#especialidadeencaminhamentoatendimentoodontol-gico).

### \#2 hipoteseDiagnosticoCID10
Hipótese/diagnóstico do encaminhamento com relação à tabela CID10.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | -- | -- |

**Regra:** Deve ser preenchida somente CID10 permitida para o [Sexo](#14-sexo) do cidadão.

### \#3 classificacaoRisco

Reere-se à classificação de risco.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | -- | -- |

**Referência:** [classificacaoRisco]({% url dicionario %}#classificacaorisco).

##ResultadosExames

### \#1 exame

Código do exame.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | - |

**Regras:**

- Somente é permitido exames presentes na {% link exames_estruturados %};
- Se o exame não tiver uma referência no SIGTAP, deve ser informado o código **AB** do exame.

**Referência:** {% link exames_estruturados %}.

Observações:

- Inserir o código do exame SIGTAP sem ponto ou hífen, ex: `0211070270`;
- Inserir o código do exame AB em caracteres maiúsculos, sem espaços, ex: `ABEX022`.

### \#2 dataSolicitacao

Refere-se à data da solicitação do exame específico.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Regras:**

- Não pode ser posterior à [dataHoraInicialAtendimento](#16-datahorainicialatendimento);
- Não pode ser anterior à [dtNascimento](#1-dtnascimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#3 dataRealizacao

Refere-se à data da realização do exame específico.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser posterior à [dataHoraInicialAtendimento](#16-datahorainicialatendimento);
- Não pode ser anterior à [dataSolicitacao](#2-datasolicitacao);
- Não pode ser anterior à [dtNascimento](#1-dtnascimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#4 dataResultado

Refere-se à data do resultado do exame específico.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Regras:**

- Não pode ser posterior à [dataHoraInicialAtendimento](#16-datahorainicialatendimento);
- Não pode ser anterior à [dataRealizacao](#3-datarealizacao);
- Não pode ser anterior à [dtNascimento](#1-dtnascimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#5 resultadoExame

Refere-se ao resultado do exame.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<resultadoExame\> | Sim | 1 | 3 |

**Regras:**

- Para os exames `02.05.02.014-3 - Ultrassonografia obstétrica (ABEX024)`, `02.05.02.015-1 - Ultrassonografia obstétrica c/ doppler colorido e pulsado` e `02.05.01.005-9 - Ultrassonografia doppler de fluxo obstétrico` o campo `tipoResultado` deve ser preenchido pelo menos com o valor `3 - Semanas` ou `4 - Data` e não pode ser informado o `tipoResultado` = `1 - Valor`;
- Para os demais exames da {% link exames_estruturados %} somente poderá ser informado o `tipoResultado` = `1 - Valor`.

**Referência:** [resultadoExame](#resultadoexame).

##resultadoExame

### \#1 tipoResultado

Refere-se ao nome do campo que apresentará o resultado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | -- | -- |

**Regra:** Deve ser preenchido com o respectivo valor da coluna **Estrutura do resultado do exame** da {% link exames_estruturados %} correspondente ao [exame](#1-exame).

**Referência:** [tipoResultadoExame]({% url dicionario %}#tiporesultadoexame).

### \#2 valorResultado

Refere-se ao resultado do exame propriamente dito e está relacionado com a informação do campo [tipoResultado](#1-tiporesultado).

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | -- | -- |

**Regras:**

- Se o campo [tipoResultado](#1-tiporesultado) for igual a `1 - Valor` e o valor do campo [exame](#1-exame) for:
	- `0202010503 ou ABEX008`, então preencher com os valores de `0,00 a 100`;
	- `0211070270, 0211070149 ou ABEX020`, então preencher com os valores da tabela [testeOrelhinha]({% url dicionario %}#testeorelhinha);
	- `0205020178`, então preencher com os valores da tabela [usTransfontanela]({% url dicionario %}#ustransfontanela);
	- `0206010079`, então preencher com os valores da tabela [tomografiaComputadorizada]({% url dicionario %}#tomografiacomputadorizada);
	- `0207010064`, então preencher com os valores da tabela [ressonanciaMagnetica]({% url dicionario %}#ressonanciamagnetica);
	- `0211060100 ou ABPG013`, então preencher com os valores da tabela [exameFundoOlho]({% url dicionario %}#examefundoolho);
	- `ABEX022`, então preencher com os valores da tabela [testeOlhinho]({% url dicionario %}#testeolhinho);
	- `0202010295 ou ABEX002`, então preencher com os valores de `1 a 10000`;
	- `0202010279 ou ABEX007`, então preencher com os valores de `1 a 10000`;
	- `0202010287 ou ABEX009`, então preencher com os valores de `1 a 10000`;
	- `0202010678`, então preencher com os valores de `1 a 10000`;
	- `0202010317 ou ABEX003`, então preencher com os valores de `0,1 a 500,0`;
	- `0202050025`, então preencher com os valores de `0,001 a 1000`.
- Se o campo [tipoResultado](#1-tiporesultado) for igual a `2 - Dias` e o valor do campo [exame](#1-exame) for `02.05.02.014-3 (ABEX024)`, `02.05.02.015-1` ou `02.05.01.005-9`, este campo deve ser preenchido com valores de `0 a 6`;
- Se o campo [tipoResultado](#1-tiporesultado) for igual a `3 - Semanas` e o valor do campo [exame](#1-exame) for `02.05.02.014-3 (ABEX024)`, `02.05.02.015-1` ou `02.05.01.005-9`, este campo deve ser preenchido com valores de `0 a 42`; 
- Se o campo [tipoResultado](#1-tiporesultado) for igual a `4 - Data` e o valor do campo [exame](#1-exame) for `02.05.02.014-3 (ABEX024)`, `02.05.02.015-1` ou `02.05.01.005-9`, este campo deve ser preenchido com uma data seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/) e a data não pode ser anterior à [dataRealizacao](#3-datarealizacao).

## ListaProcedimentosRealizados

| Código SIGTAP \* | Descrição AB | Código AB correspondente |
| ---------------- | ------------ | ------------------------ |
| 03.07.02.001-0 | Acesso a polpa dentária e medicação (por dente) | ABPO001 |
| 03.07.04.014-3 | Adaptação de Prótese Dentária | ABPO002 |
| 01.01.02.005-8 | Aplicação de cariostático (por dente)| ABPO003 |
| 01.01.02.006-6 | Aplicação de selante (por dente) | ABPO004 |
| 01.01.02.007-4 | Aplicação tópica de flúor (individual por sessão) | ABPO005 |
| 03.07.01.001-5 | Capeamento pulpar | ABPO006 |
| 03.07.04.013-5 | Cimentação de prótese dentária | ABPO007 |
| 03.07.02.002-9 | Curativo de demora c/ ou s/ preparo biomecânico | ABPO008 |
| 04.01.01.003-1 | Drenagem de abscesso |ABPG008 |
| 01.01.02.008-2 | Evidenciação de placa bacteriana | ABPO010 |
| 04.14.02.012-0 | Exodontia de dente decíduo | ABPO011 |
| 04.14.02.013-8 | Exodontia de dente permanente | ABPO012 |
| 03.07.04.016-0 | Instalação de prótese dentária | ABPO013 |
| 03.07.04.007-0 | Moldagem dento-gengival p/ construção de prótese dentária | ABPO014 |
| 01.01.02.010-4 | Orientação de Higiene Bucal | ABPO015 |
| 03.07.03.004-0 | Profilaxia / Remoção de placa bacteriana | ABPO016 |
| 03.07.02.007-0 | Pulpotomia dentária | ABPO017 |
| 03.07.03.005-9 | Raspagem alisamento e polimento supragengivais (por sextante)| ABPO019 |
| 03.07.03.002-4 | Raspagem alisamento subgengivais (por sextante)| ABPO020 |
| 03.07.01.003-1 | Restauração de dente permanente anterior | ABPO022 |
| 01.01.02.009-0 | Selamento provisório de cavidade dentária | ABPO025 |
| 04.14.02.038-3 | Tratamento de alveolite | ABPO026 |
| 04.14.02.040-5 | Ulotomia / Ulectomia | ABPO027 |
_* Procedimentos pertencentes a competência **09/2020** do SIGTAP._

## Lista de procedimentos por local e quantidade máxima permitida

| Código SIGTAP\* | Descrição SIGTAP | Local | Quantidade máxima |
| --------------- | ---------------- | ----- | ----------------- |
| 02.04.01.016-0 | RADIOGRAFIA OCLUSAL | Arcada | 2 |
| 03.07.04.001-1 | COLOCACAO DE PLACA DE MORDIDA | Arcada | 2 |
| 03.07.04.012-7 | MANUTENÇÃO/CONSERTO DE APARELHO ORTODÔNTICO/ORTOPÉDICO | Arcada | 2 |
| 04.04.02.044-5 | CONTENÇÃO DE DENTES POR SPLINTAGEM | Arcada | 2 |
| 04.04.02.061-5 | REDUÇÃO DE LUXAÇÃO TÊMPORO-MANDIBULAR | Arcada | 2 |
| 04.04.02.062-3 | RETIRADA DE MATERIAL DE SÍNTESE ÓSSEA / DENTÁRIA | Arcada | 2 |
| 04.14.01.036-1 | EXERESE DE CISTO ODONTOGÊNICO E NÃO-ODONTOGÊNICO | Arcada | 2 |
| 04.14.01.038-8 | TRATAMENTO CIRÚRGICO DE FÍSTULA INTRA / EXTRAORAL | Arcada | 2 |
| 04.14.02.004-9 | CORREÇÃO DE BRIDAS MUSCULARES | Arcada | 2 |
| 04.14.02.005-7 | CORREÇÃO DE IRREGULARIDADES DE REBORDO ALVEOLAR | Arcada | 2 |
| 04.14.02.029-4 | REMOÇÃO DE TORUS E EXOSTOSES | Arcada | 2 |
| 07.01.07.006-4 | MANTENEDOR DE ESPAÇO | Arcada | 2 |
| 07.01.07.007-2 | PLACA OCLUSAL | Arcada | 2 |
| 07.01.07.008-0 | PLANO INCLINADO | Arcada | 2 |
| 07.01.07.009-9 | PROTESE PARCIAL MANDIBULAR REMOVIVEL | Arcada | 2 |
| 07.01.07.010-2 | PROTESE PARCIAL MAXILAR REMOVIVEL | Arcada | 2 |
| 07.01.07.011-0 | PROTESE TEMPORARIA | Arcada | 2 |
| 07.01.07.012-9 | PROTESE TOTAL MANDIBULAR | Arcada | 2 |
| 07.01.07.013-7 | PROTESE TOTAL MAXILAR | Arcada | 2 |
| 01.01.02.005-8 | APLICAÇÃO DE CARIOSTÁTICO (POR DENTE) | Dente | 32 |
| 01.01.02.006-6 | APLICAÇÃO DE SELANTE (POR DENTE) | Dente | 32 |
| 01.01.02.009-0 | SELAMENTO PROVISÓRIO DE CAVIDADE DENTÁRIA | Dente | 32 |
| 02.04.01.021-7 | RADIOGRAFIA INTERPROXIMAL (BITE WING) | Dente | 32 |
| 02.04.01.022-5 | RADIOGRAFIA PERIAPICAL | Dente | 32 |
| 03.07.01.001-5 | CAPEAMENTO PULPAR | Dente | 32 |
| 03.07.01.003-1 | RESTAURAÇÃO DE DENTE PERMANENTE ANTERIOR | Dente | 32 |
| 03.07.01.006-6 | TRATAMENTO INICIAL DO DENTE TRAUMATIZADO | Dente | 32 |
| 03.07.01.007-4 | TRATAMENTO RESTAURADOR ATRAUMÁTICO (TRA/ART) | Dente | 32 |
| 03.07.01.008-2 | RESTAURAÇÃO DE DENTE DECÍDUO POSTERIOR COM RESINA COMPOSTA | Dente | 32 |
| 03.07.01.009-0 | RESTAURAÇÃO DE DENTE DECÍDUO POSTERIOR COM AMÁLGAMA | Dente | 32 |
| 03.07.01.010-4 | RESTAURAÇÃO DE DENTE DECÍDUO POSTERIOR COM IONÔMERO DE VIDRO | Dente | 32 |
| 03.07.01.011-2 | RESTAURAÇÃO DE DENTE DECÍDUO ANTERIOR COM RESINA COMPOSTA | Dente | 32 |
| 03.07.01.012-0 | RESTAURAÇÃO DE DENTE PERMANENTE POSTERIOR COM RESINA COMPOSTA | Dente | 32 |
| 03.07.01.013-9 | RESTAURAÇÃO DE DENTE PERMANENTE POSTERIOR COM AMÁLGAMA | Dente | 32 |
| 03.07.02.001-0 | ACESSO A POLPA DENTARIA E MEDICACAO (POR DENTE) | Dente | 32 |
| 03.07.02.002-9 | CURATIVO DE DEMORA C/ OU S/ PREPARO BIOMECANICO | Dente | 32 |
| 03.07.02.003-7 | OBTURAÇÃO DE DENTE DECÍDUO | Dente | 32 |
| 03.07.02.004-5 | OBTURAÇÃO EM DENTE PERMANENTE BIRRADICULAR | Dente | 32 |
| 03.07.02.005-3 | OBTURAÇÃO EM DENTE PERMANENTE COM TRÊS OU MAIS RAÍZES | Dente | 32 |
| 03.07.02.006-1 | OBTURAÇÃO EM DENTE PERMANENTE UNIRRADICULAR | Dente | 32 |
| 03.07.02.007-0 | PULPOTOMIA DENTÁRIA | Dente | 32 |
| 03.07.02.008-8 | RETRATAMENTO ENDODÔNTICO EM DENTE PERMANENTE BI-RADICULAR | Dente | 32 |
| 03.07.02.009-6 | RETRATAMENTO ENDODÔNTICO EM DENTE PERMANENTE COM 3 OU MAIS RAÍZES | Dente | 32 |
| 03.07.02.010-0 | RETRATAMENTO ENDODÔNTICO EM DENTE PERMANENTE UNI-RADICULAR | Dente | 32 |
| 03.07.02.011-8 | SELAMENTO DE PERFURAÇÃO RADICULAR | Dente | 32 |
| 03.07.04.007-0 | MOLDAGEM DENTO-GENGIVAL P/ CONSTRUCAO DE PROTESE DENTARIA | Dente | 32 |
| 03.07.04.008-9 | REEMBASAMENTO E CONSERTO DE PROTESE DENTARIA | Dente | 32 |
| 03.07.04.013-5 | CIMENTAÇÃO DE PRÓTESE DENTÁRIA | Dente | 32 |
| 03.07.04.014-3 | ADAPTAÇÃO DE PRÓTESE DENTÁRIA | Dente | 32 |
| 03.07.04.015-1 | AJUSTE OCLUSAL | Dente | 32 |
| 03.07.04.016-0 | INSTALAÇÃO DE PRÓTESE DENTÁRIA | Dente | 32 |
| 04.14.02.002-2 | APICECTOMIA COM OU SEM OBTURAÇÃO RETRÓGRADA | Dente | 32 |
| 04.14.02.007-3 | CURETAGEM PERIAPICAL | Dente | 32 |
| 04.14.02.012-0 | EXODONTIA DE DENTE DECÍDUO | Dente | 32 |
| 04.14.02.013-8 | EXODONTIA DE DENTE PERMANENTE | Dente | 32 |
| 04.14.02.014-6 | EXODONTIA MÚLTIPLA COM ALVEOLOPLASTIA POR SEXTANTE | Dente | 32 |
| 04.14.02.021-9 | ODONTOSECÇÃO / RADILECTOMIA / TUNELIZAÇÃO | Dente | 32 |
| 04.14.02.024-3 | REIMPLANTE E TRANSPLANTE DENTAL (POR ELEMENTO) | Dente | 32 |
| 04.14.02.027-8 | REMOÇÃO DE DENTE RETIDO (INCLUSO / IMPACTADO) | Dente | 32 |
| 04.14.02.036-7 | TRATAMENTO CIRÚRGICO PARA TRACIONAMENTO DENTAL | Dente | 32 |
| 04.14.02.038-3 | TRATAMENTO DE ALVEOLITE | Dente | 32 |
| 04.14.02.040-5 | ULOTOMIA/ULECTOMIA | Dente | 32 |
| 07.01.07.005-6 | COROA PROVISORIA | Dente | 32 |
| 07.01.07.014-5 | PROTESES CORONARIAS / INTRA-RADICULARES FIXAS / ADESIVAS (POR ELEMENTO) | Dente | 32 |
| 03.07.03.002-4 | RASPAGEM ALISAMENTO SUBGENGIVAIS (POR SEXTANTE) | Sextante | 6 |
| 03.07.03.005-9 | RASPAGEM ALISAMENTO E POLIMENTO SUPRAGENGIVAIS (POR SEXTANTE) | Sextante | 6 |
| 03.07.04.017-8 | MOLDAGEM DENTO-GENGIVAL COM FINALIDADE ORTODÔNTICA | Arcada | 2 |
| 04.14.02.003-0 | APROFUNDAMENTO DE VESTÍBULO ORAL (POR SEXTANTE) | Sextante | 6 |
| 04.14.02.015-4 | GENGIVECTOMIA (POR SEXTANTE) | Sextante | 6 |
| 04.14.02.016-2 | GENGIVOPLASTIA (POR SEXTANTE) | Sextante | 6 |
| 04.14.02.037-5 | TRATAMENTO CIRÚRGICO PERIODONTAL (POR SEXTANTE) | Sextante | 6 |
| 03.07.03.003-2 | RASPAGEM CORONO-RADICULAR (POR SEXTANTE) | Sextante | 6 |
_* Procedimentos pertencentes a competência **09/2020** do SIGTAP._

## especialidadeEncaminhamentoAtendimentoOdontológico

**Referência para código do encaminhamento:** [CondutaEncaminhamentoOdonto]({% url dicionario %}#condutaencaminhamentoodonto)

| Código | Especialidade | Código do encaminhamento |
| ------ | ------------- | ------------------------ |
| 63 | CONSULTA EM ODONTOLOGIA - ENDODONTIA | `3 - Endodontia` |
| 64 | CONSULTA EM ODONTOLOGIA - PACIENTE COM NECESSIDADE ESPECIAL | `1 - Atendimento à pacientes com necessidades especiais` |
| 65 | CONSULTA EM CIRURGIA BUCO-MAXILO FACIAL | `2 - Cirurgia BMF` |
| 66 | CONSULTA EM ODONTOLOGIA - BUCO-MAXILO FACIAL | `2 - Cirurgia BMF` |
| 67 | CONSULTA EM ODONTOLOGIA - ESTOMATOLOGIA | `4 - Estomatologia` |
| 68 | CONSULTA EM ODONTOLOGIA - IMPLANTODONTIA | `5 - Implantodontia` |
| 69 | CONSULTA EM ODONTOPEDIATRIA | `6 - Odontopediatria` |
| 70 | CONSULTA EM ODONTOLOGIA - ORTODONTIA | `7 - Ortodontia / Ortopedia` |
| 71 | CONSULTA EM ODONTOLOGIA - PERIODONTIA | `8 - Periodontia` |
| 72 | CONSULTA EM ODONTOLOGIA - PRÓTESE DENTÁRIA | `9 - Prótese dentária` |
| 73 | CONSULTA EM ODONTOLOGIA - RADIOLOGIA | `10 - Radiologia` |
| 74 | CONSULTA EM ODONTOLOGIA - DENTÍSTICA | `11 - Outros` |
| 75 | CONSULTA EM ODONTOLOGIA - DISFUNÇÃO TÊMPORO MANDIBULAR | `11 - Outros` |
| 76 | CONSULTA EM ODONTOLOGIA - DOR ORO-FACIAL | `11 - Outros` |
