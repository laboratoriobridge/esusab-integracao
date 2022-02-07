---
layout: doc
title: Ficha de Atendimento Individual
id: dicionario-fai
parent: estrutura_arquivos
order: 5
---

## FichaAtendimentoIndividualMaster

### \#1	headerTransport
Profissionais que realizaram o atendimento

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| VariasLotacoesHeader | Sim | - | - |

**Regra:** Somente as CBOs apresentadas na [Tabela 3 - CBOs que podem registrar ficha de atendimento individual]({% url grupo_cbo %}#ficha-de-atendimento-individual) podem ser adicionadas no campo CBO do profissional principal.

**Referência:** [VariasLotacoesHeader]({% url headerTransport %}#variaslotacoesheader).

### \#2	atendimentosIndividuais
Registro individualizado dos atendimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<FichaAtendimentoIndividualChild\> | Sim | 1 | 99 |

**Referência:** [FichaAtendimentoIndividualChild](#fichaatendimentoindividualchild).

### \#3	uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | 36 | 44 |

**Regra:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 dígitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#4	tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Sim | 1 | 1 |

**Regra:** Utilizar valor 3 (sistemas terceiros).

## FichaAtendimentoIndividualChild

### \#1	numeroProntuario
Número do prontuário.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 0 | 30 |

**Regra:** Apenas letras e números são aceitos.

### \#2	cns
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 15 | 15 |

**Regras:**

- CNS validado de acordo com o {% link algoritmo_CNS, title:"algoritmo de validação" %};
- Não pode ser preenchido se o campo [cpfCidadao](#29-cpfcidadao) for preenchido.

### \#3	dataNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Não pode ser posterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento) e anterior à 130 anos a partir da [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#4	localDeAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas valores de `1` a `10`.

**Referência:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento).

### \#5	sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#6	turno
Código do turno em que o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Referência:** [Turno]({% url dicionario %}#turno).

### \#7	tipoAtendimento
Código do tipo de atendimento realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regra:** Apenas as opções `1`, `2`, `4`, `5` ou `6` são aceitas.

**Referência:** [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento).

### \#8	pesoAcompanhamentoNutricional
Peso do cidadão em quilogramas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 1 | 7 |

**Regras:**

* Apenas números e ponto (`.`);
* Máximo de 3 casas decimais;
* Valor mínimo 0.5 e máximo 500.

### \#9	alturaAcompanhamentoNutricional
Altura do cidadão em centímetros.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 2 | 5 |

**Regras:**

* Apenas números e ponto (`.`);
* Máximo de 1 casa decimal;
* Valor mínimo 20 e máximo 250.

### \#10 aleitamentoMaterno
Código do marcador referente ao aleitamento materno.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Referência:** [AleitamentoMaterno]({% url dicionario %}#aleitamentomaterno).

### \#11 dumDaGestante
Data da última menstruação da gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Regras:**

- Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`;
- Não pode ser superior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento).

**Referência:** [Epoch Wikipedia](https://pt.wikipedia.org/wiki/Era_Unix) em milissegundos.

### \#12 idadeGestacional
Idade gestacional em semanas.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Não | 0 | 2 |

**Regras**

- Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`;
- Valor mínimo 1 e máximo 42.

### \#13 atencaoDomiciliarModalidade
Código do modalidade AD do cidadão atendido.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Regra:** Apenas valores de `1` a `3`.

**Referência:** [ModalidadeAD]({% url dicionario %}#modalidadead).

### \#14 problemaCondicaoAvaliada
Situações de saúde avaliadas no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| ProblemaCondicaoAvaliacaoAI | Sim | 1 | 1 |

**Referência:** [ProblemaCondicaoAvaliacaoAI](#problemacondicaoavaliacaoai).

### \#17 exame
Lista de exames solicitados e/ou avaliados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<exame\> | Não | 0 | 100 |

**Referência:** [Exames](#exame).

### \#18 vacinaEmDia
Marcador referente a vacinação em dia do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

### \#19 ficouEmObservacao
Marcador referente se o cidadão ficou em observação no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

### \#20 nasfs
Código das ações realizadas pelo Núcleo de Atenção a Saúde da Família.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Não | 0 | 3 |

**Referência:** [Nasf]({% url dicionario %}#nasf).

### \#21 condutas
Código das condutas adotadas no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<Long\> | Sim | 1 | 12 |

**Regra:** Não deve conter duas condutas iguais.

**Referência:** [CondutaEncaminhamento]({% url dicionario %}#condutaencaminhamento).

### \#22 stGravidezPlanejada
Marcador que indica se a gravidez é planejada.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Boolean | Não | - | - |

**Regra:** Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`.

### \#23 nuGestasPrevias
Número de gestações prévias.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Não | 0 | 2 |

**Regra:** Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`.

### \#24 nuPartos
Número de partos que a mulher já teve.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Integer | Não | 0 | 2 |

**Regra:** Não pode ser preenchido quando [Sexo](#5-sexo) = `0 (masculino)`.

### \#25 racionalidadeSaude
Código da racionalidade em saúde utilizada.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | 0 | 1 |

**Referência:** [racionalidadeSaude]({% url dicionario %}#racionalidadesaude).

### \#26 perimetroCefalico
Perímetro cefálico do cidadão em centímetros.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Double | Não | 0 | 6 |

**Regras:**

* Apenas números e ponto (`.`);
* Máximo de 2 casas decimais;
* Valor mínimo 10 e máximo 200.

### \#27 dataHoraInicialAtendimento
Data e hora do início do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataAtendimento]({% url headerTransport %}#5-dataatendimento);
- Não pode ser posterior à [dataHoraFinalAtendimento](#28-datahorafinalatendimento) e à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#28 dataHoraFinalAtendimento
Data e hora do fim do atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser anterior à [dataHoraInicialAtendimento](#27-datahorainicialatendimento);
- Não pode ser posterior à data atual.

**Referência:** Deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#29 cpfCidadao

CPF do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Não | 11 | 11 |

**Regras:** 

- Somente CPF válido será aceito;
- Não pode ser preenchido se o campo [cns](#2-cns) for preenchido.

### \#30 Medicamentos

Lista de medicamentos prescritos durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<medicamentos\> | Não | 0 | 15 |

**Referência:** [medicamentos](#medicamentos).

### \#31 Encaminhamentos

Lista com os encaminhamentos realizados durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<encaminhamentos\> | Não | 0 | 10 |

**Regras:** 

- Não pode ter itens duplicados na lista. Serão considerados duplicados os itens que tiverem a mesma [especialidade](#1-especialidade) e [hipoteseDiagnosticoCID10](#2-hipotesediagnosticocid10) ou a mesma [especialidade](#1-especialidade) e [hipoteseDiagnosticoCIAP2](#3-hipotesediagnosticociap2);
- Todos os encaminhamentos devem ser preenchidos somente com CID10 ou com CIAP2, de acordo com a [Tabela 3 - CBOs que podem registrar ficha de atendimento individual]({% url grupo_cbo %}#ficha-de-atendimento-individual);
- Ao preencher este grupo, é obrigatório o preenchimento do campo [condutas](#21-condutas) com o valor `4 - Encaminhamento para serviço especializado`.

**Referência:** [encaminhamentos](#encaminhamentos).

### \#32 resultadosExames

Lista de exames e seus resultados.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<resultadosExames\> | Não | 0 | 10 |

**Referência:** [resultadosExames](#resultadosexames).

## Exame

### \#1	codigoExame
Código do exame solicitado ou avaliado.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Sim | - | - |

**Regras:**

- Só é possível inserir exames cujo grupo é igual a `02 - Procedimentos com finalidade diagnóstica` ou exames que estejam presentes na tabela [ListaExames](#listaexames), neste caso, se o exame não tiver uma referência no SIGTAP, deve ser informado o código **AB** do exame;
- Não pode conter exames repetidos.

**Referências:**

- Tabela do SIGTAP, competência 09/2020 disponível em: [Tabela Unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar);
- [ListaExames](#listaexames).

Observações:

- Inserir o código do exame SIGTAP sem ponto ou hífen, ex: `0214010015`;
- Inserir o código do exame AB em caracteres maiúsculos, sem espaços, ex: `ABEX022`.

### \#2	solicitadoAvaliado
Código do indicador se o exame foi `Solicitado` e / ou `Avaliado`.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<String\> | Sim | 1 | 2 |

**Referência:** [SituacaoExame]({% url dicionario %}#situacaoexame).

## ProblemaCondicaoAvaliacaoAI

### \#1	ciaps
Código dos CIAPs apresentados na lista.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| List\<String\> | Condicional | 0 | 22 |

**Regras:**

- Não deve conter "Problemas / Condições" repetidos;
- Devem ser apresentados somente as CIAP's listadas na referência [ListaCiapCondicaoAvaliada](#listaciapcondicaoavaliada);
- Preencher apenas com o código **AB** relacionado a CIAP2 desejada;
- Devem ser apresentadas somente CIAP's permitidas para o [Sexo](#5-sexo) do cidadão conforme [ListaCiapCondicaoAvaliada](#listaciapcondicaoavaliada);
- É requerido o preenchimento de pelo menos um dos itens de `#1` a `#5`.

**Observação:** Inserir o código em caracteres maiúsculos, sem espaços.

### \#2	outroCiap1
Código da CIAP2 registrada no antedimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | - | - |

**Regras:**

- Não pode ser igual a [outroCiap2](#3-outrociap2);
- Não pode conter nenhum dos itens listados em [ListaCiapCondicaoAvaliada](#listaciapcondicaoavaliada);
- Deve ser apresentada somente CIAP permitida para o [Sexo](#5-sexo) do cidadão;
- É requerido o preenchimento de pelo menos um dos itens de `#1` a `#5`;
- Não pode conter nenhum dos itens listados no grupo Procedimentos da Tabela CIAP2.

### \#3	outroCiap2
Código da CIAP2 registrada no antedimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | - | - |

**Regras:**

- Não pode ser igual a [outroCiap1](#2-outrociap1);
- Não pode conter nenhum dos itens listados em [ListaCiapCondicaoAvaliada](#listaciapcondicaoavaliada);
- Deve ser apresentada somente CIAP permitida para o [Sexo](#5-sexo) do cidadão;
- É requerido o preenchimento de pelo menos um dos itens de `#1` a `#5`;
- Não pode conter nenhum dos itens listados no grupo Procedimentos da Tabela CIAP2.

### \#4	cid10
Código da CID10 registrada no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | - | - |

**Regras:**

- Não pode ser igual a [cid10_2](#5-cid10_2);
- Deve ser apresentada somente CID10 permitida para o [Sexo](#5-sexo) do cidadão;
- É requerido o preenchimento de pelo menos um dos itens de `#1` a `#5`.

### \#5	cid10_2
Código da CID10 registrada no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | - | - |

**Regras:**

- Não pode ser igual a [cid10](#4-cid10);
- Deve ser apresentada somente CID10 permitida para o [Sexo](#5-sexo) do cidadão;
- É requerido o preenchimento de pelo menos um dos itens de `#1` a `#5`.

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

**Referência:** [especialidadeEncaminhamentoAtendimentoIndividual](#especialidadeencaminhamentoatendimentoindividual).

### \#2 hipoteseDiagnosticoCID10
Hipótese/diagnóstico do encaminhamento com relação à tabela CID10.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | -- | -- |

**Regras:**

- Este campo só poderá ser preenchido caso o profissional for habilitado a informar CID10 conforme apresentado na tabela [Tabela 3 - CBOs que podem registrar ficha de atendimento individual]({% url grupo_cbo %}#ficha-de-atendimento-individual);
- Deve ser preenchida somente CID10 permitida para o [Sexo](#5-sexo) do cidadão;
- Não pode ser preenchido se o campo [hipoteseDiagnosticoCIAP2](#3-hipotesediagnosticociap2) for preenchido;
- Este campo é de preenchimento obrigatório apenas se o campo [hipoteseDiagnosticoCIAP2](#3-hipotesediagnosticociap2) não estiver preenchido.

### \#3 hipoteseDiagnosticoCIAP2
Hipótese/diagnóstico do encaminhamento com relação à tabela CIAP2.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| String | Condicional | -- | -- |

**Regras:**

- Este campo só deverá ser preenchido caso o profissional **não** for habilitado a informar CID10 conforme apresentado na tabela [Tabela 3 - CBOs que podem registrar ficha de atendimento individual]({% url grupo_cbo %}#ficha-de-atendimento-individual);
- Deve ser preenchida somente CIAP2 permitida para o [Sexo](#5-sexo) do cidadão;
- Deve conter somente CIAP2 que possuem relação com uma CID10, conforme listado na planilha [CIAP2 x CID10 mais frequentes]({% url relacao_ciap_cid %});
- Não pode ser preenchido se o campo [hipoteseDiagnosticoCID10](#2-hipotesediagnosticocid10) for preenchido;
- Este campo é de preenchimento obrigatório apenas se o campo [hipoteseDiagnosticoCID10](#2-hipotesediagnosticocid10) não estiver preenchido.

### \#4 classificacaoRisco

Refere-se à classificação de risco.

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

- Não pode ser posterior à [dataHoraInicialAtendimento](#27-datahorainicialatendimento);
- Não pode ser anterior à [dataNascimento](#3-datanascimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#3 dataRealizacao

Refere-se à data da realização do exame específico.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Sim | - | - |

**Regras:**

- Não pode ser posterior à [dataHoraInicialAtendimento](#27-datahorainicialatendimento);
- Não pode ser anterior à [dataSolicitacao](#2-datasolicitacao);
- Não pode ser anterior à [dataNascimento](#3-datanascimento).

**Referência:** A data deve ser apresentada seguindo o padrão [Epoch](https://pt.wikipedia.org/wiki/Era_Unix), convertido em milissegundos. Para realizar a conversão, pode ser utilizado o conversor [Current millis](https://currentmillis.com/).

### \#4 dataResultado

Refere-se à data do resultado do exame específico.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---- | ----------- | ------ | ------ |
| Long | Não | - | - |

**Regras:**

- Não pode ser posterior à [dataHoraInicialAtendimento](#27-datahorainicialatendimento);
- Não pode ser anterior à [dataRealizacao](#3-datarealizacao);
- Não pode ser anterior à [dataNascimento](#3-datanascimento).

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

## ListaCiapCondicaoAvaliada

| CIAP2 relacionada | Descrição AB | Código AB | Sexo |
| ----------------- | ------------ | --------- | ---- |
| R96 | Asma | ABP009 | Ambos |
| A77 | Dengue | ABP019 | Ambos |
| T91 | Desnutrição |ABP008 | Ambos |
| T90 | Diabetes | ABP006 | Ambos |
| R95 | DPOC | ABP010 | Ambos |
| A78 | DST | ABP020 | Ambos |
| A78 | Hanseníase | ABP018 | Ambos |
| K86 | Hipertensão Arterial | ABP005 | Ambos |
| T82 | Obesidade | ABP007 | Ambos |
| W78 | Pré-natal | ABP001 | Feminino |
| A98 | Puericultura | ABP004 | Ambos |
| W18 | Puerpério (até 42 dias) | ABP002 | Feminino |
| Não possui | Rastreamento de Câncer de mama | ABP023 | Ambos |
| Não possui | Rastreamento de Câncer do colo do útero | ABP022 | Feminino |
| K22 | Rastreamento de Risco cardiovascular | ABP024 | Ambos |
| 57 | Reabilitação | ABP015 | Ambos |
| Não possui | Saúde Mental | ABP014 | Ambos |
| Não possui | Saúde Sexual e Reprodutiva | ABP003 | Ambos |
| P17 | Tabagismo | ABP011 | Ambos |
| A70 | Tuberculose | ABP017 | Ambos |
| P16 | Usuário de álcool | ABP012 | Ambos |
| P19 | Usuário de outras drogas | ABP013 | Ambos |

## ListaExames
| Código SIGTAP\* | Descrição AB | Código AB correspondente |
| ---------------- | ----------- | ------------------------ |
| 02.02.01.029-5 | Colesterol total | ABEX002 |
| 02.02.01.031-7 | Creatinina | ABEX003 |
| 02.02.05.001-7 | EAS / EQU | ABEX027 |
| 02.11.02.003-6 | Eletrocardiograma | ABEX004 |
| 02.02.02.035-5 | Eletroforese de Hemoglobina | ABEX030 |
| 02.11.08.005-5 | Espirometria | ABEX005 |
| 02.02.08.011-0 | Exame de escarro | ABEX006 |
| 02.02.01.047-3 | Glicemia | ABEX026 |
| 02.02.01.027-9 | HDL | ABEX007 |
| 02.02.01.050-3 | Hemoglobina glicada | ABEX008 |
| 02.02.02.038-0 | Hemograma | ABEX028 |
| 02.02.01.028-7 | LDL | ABEX009 |
| Não possui | Retinografia/Fundo de olho com oftalmologista | ABEX013 |
| 02.02.03.111-0 | Sorologia de Sífilis (VDRL) | ABEX019 |
| 02.02.03.090-3 | Sorologia para Dengue | ABEX016 |
| 02.02.03.030-0 | Sorologia para HIV | ABEX018 |
| 02.02.12.009-0 | Teste indireto de antiglobulina humana (TIA) | ABEX031 |
| 02.11.07.014-9 | Teste da orelhinha | ABEX020 |
| 02.02.06.021-7 | Teste de gravidez | ABEX023 |
| Não possui | Teste do olhinho | ABEX022 |
| 02.02.11.005-2 | Teste do pezinho | ABEX021 |
| 02.05.02.014-3 | Ultrassonografia obstétrica | ABEX024 |
| 02.02.08.008-0 | Urocultura | ABEX029 |
_* Procedimentos pertencentes a competência **09/2020** do SIGTAP._

## especialidadeEncaminhamentoAtendimentoIndividual

| Código | Especialidade |
| ------ | ------------- |
| 1 | CONSULTA EM ACUPUNTURA |
| 2 | CONSULTA EM ALERGIA E IMUNOLOGIA |
| 3 | CONSULTA EM ANESTESIOLOGIA |
| 4 | CONSULTA EM ANGIOLOGIA |
| 5 | CONSULTA EM CIRURGIA ONCOLÓGICA |
| 6 | CONSULTA EM CARDIOLOGIA |
| 7 | CONSULTA EM CIRURGIA CARDÍACA |
| 8 | CONSULTA EM CIRURGIA GERAL |
| 9 | CONSULTA EM CIRURGIA REPARADORA |
| 10 | CONSULTA EM CIRURGIA PEDIÁTRICA |
| 11 | CONSULTA EM CIRURGIA PLÁSTICA |
| 12 | CONSULTA EM CIRURGIA TORÁCICA |
| 13 | CONSULTA EM DERMATOLOGIA |
| 14 | CONSULTA MÉDICA EM SAÚDE DO TRABALHADOR |
| 15 | CONSULTA EM CIRURGIA VASCULAR |
| 16 | CONSULTA EM ENDOCRINOLOGIA |
| 17 | CONSULTA EM FISIATRIA |
| 18 | CONSULTA EM GASTROENTEROLOGIA |
| 19 | CONSULTA EM CLÍNICA GERAL |
| 20 | CONSULTA EM GENÉTICA MÉDICA |
| 21 | CONSULTA EM GERIATRIA |
| 22 | CONSULTA EM GINECOLOGIA E OBSTETRÍCIA |
| 23 | CONSULTA EM CIRURGIA GINECOLÓGICA |
| 24 | CONSULTA EM UROGINECOLOGIA |
| 25 | CONSULTA EM HEMATOLOGIA |
| 26 | CONSULTA EM HOMEOPATIA |
| 27 | CONSULTA EM INFECTOLOGIA |
| 28 | CONSULTA EM MASTOLOGIA |
| 29 | CONSULTA EM NEFROLOGIA |
| 30 | CONSULTA EM CIRURGIA NEUROLÓGICA |
| 31 | CONSULTA EM NEUROLOGIA |
| 32 | CONSULTA EM NEUROPEDIATRIA |
| 33 | CONSULTA EM NUTROLOGIA |
| 34 | CONSULTA EM OFTALMOLOGIA |
| 35 | CONSULTA EM CIRURGIA OFTALMOLÓGICA |
| 36 | CONSULTA EM ONCOLOGIA |
| 37 | CONSULTA EM ORTOPEDIA |
| 38 | CONSULTA EM TRAUMATOLOGIA |
| 39 | CONSULTA EM CIRURGIA ORTOPÉDICA |
| 40 | CONSULTA EM OTORRINOLARINGOLOGIA |
| 41 | CONSULTA EM CIRURGIA OTORRINOLARINGOLOGIA |
| 42 | CONSULTA EM PROCTOLOGIA |
| 43 | CONSULTA EM PEDIATRIA |
| 44 | CONSULTA EM NEONATOLOGIA |
| 45 | CONSULTA EM PNEUMOLOGIA |
| 46 | CONSULTA EM TISIOLOGIA |
| 47 | CONSULTA EM PSIQUIATRIA |
| 48 | CONSULTA EM REUMATOLOGIA |
| 49 | CONSULTA EM UROLOGIA |
| 50 | CONSULTA EM ANDROLOGIA |
| 51 | CONSULTA EM CIRURGIA UROLÓGICA |
| 52 | CONSULTA EM CIRURGIA POSTECTOMIA |
| 53 | CONSULTA EM HEPATOLOGIA |
| 54 | CONSULTA EM REABILITAÇÃO FÍSICA |
| 55 | CONSULTA EM FISIOTERAPIA |
| 56 | CONSULTA EM NUTRIÇÃO |
| 57 | CONSULTA EM FONOAUDIOLOGIA |
| 58 | CONSULTA EM TERAPIA OCUPACIONAL |
| 59 | CONSULTA EM PSICOLOGIA |
| 60 | CONSULTA EM SEXOLOGIA |
| 61 | CONSULTA EM ASSISTENCIA SOCIAL |
| 62 | CONSULTA EM ODONTOLOGIA |