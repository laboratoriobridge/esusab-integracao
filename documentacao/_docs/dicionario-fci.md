---
layout: doc
title: Ficha de Cadastro Individual
id: dicionario-fci
order: 1
---

# Ficha de Cadastro Individual

## CadastroIndividual

### \#1 condicoesDeSaude
Formulário referente as condições de saúde do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|CondicoesDeSaude |Condicional |- |- |

**Regras:** Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica](\#7-statustermorecusacadastroindividualatencaobasica) = `true`.

**Referência:** [CondicoesDeSaude](#condicoesdesaude)

### \#2 dadosGerais
Dados referentes ao profissional e a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|HeaderCdsCadastro |Sim |- |- |

**Referência:** [HeaderCdsCadastro]({% url profissional %}#headercdscadastro).

### \#3 emSituacaoDeRua
Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|EmSituacaoDeRua |Condicional |- |- |

**Regras:** Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica](#7-statustermorecusacadastroindividualatencaobasica) = `true`.

**Referência:** [EmSituacaoDeRua](#emsituacaoderua).

### \#4 fichaAtualizada
Marcador que indica se a ficha é uma atualização.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |

### \#5 identificacaoUsuarioCidadao
Dados que identificam o cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|IdentificacaoUsuarioCidadao |Condicional |- |- |

**Regras:** Opcional se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica](#7-statustermorecusacadastroindividualatencaobasica) = `true`.

**Referência:** [IdentificacaoUsuarioCidadao](#identificacaousuariocidadao)

### \#6 informacoesSocioDemograficas
Informações sócio-demográficas fornecidas pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|InformacoesSocioDemograficas |Condicional |- |- |

**Regras:** Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica](#7-statustermorecusacadastroindividualatencaobasica) = `true`.

### \#7 statusTermoRecusaCadastroIndividualAtencaoBasica
Marcador que indica se o termo de recusa foi assinalado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#8 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#9 uuid
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)

### \#10 uuidFichaOriginadora
Código UUID para identificar a ficha que deu origem ao cadastro do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** Se for uma ficha de atualização, deve ser preenchido com o UUID da ficha que deu origem ao registro. Se for a ficha de cadastro, este campo deve ser igual ao campo uuid.

**Referência:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)

## CondicoesDeSaude

### \#1 descricaoCausaInternacaoEm12Meses
Descrição da causa de internação do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |0 |100 |

Observação: Não deve ser preenchido se o campo [statusTeveInternadoem12Meses](#27-statusteveinternadoem12meses) = `false`.

### \#2 descricaoOutraCondicao1
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#3 descricaoOutraCondicao2
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#4 descricaoOutraCondicao3
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#5 descricaoPlantasMedicinaisUsadas
Descrição das plantas medicinais utilizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

**Regras:** Não deve ser preenchido se o campo [statusUsaPlantasMedicinais](#30-statususaplantasmedicinais) = `false`.

### \#6 doencaCardiaca
Código das doenças cardíacas que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |0 |3 |

**Regras:**

* Requerido preenchimento de pelo menos um item se o campo [statusTeveDoencaCardiaca](#25-statustevedoencacardiaca) = `true`.
* Não deve ser preenchido se o campo [statusTeveDoencaCardiaca](#25-statustevedoencacardiaca) = `false`.

**Referência:** [DoencaCardiaca]({% url dicionario %}#doencacardiaca).

### \#7 doencaRespiratoria
Código d as doenças respiratórias que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |0 |4 |

**Regras:**

* Requerido preenchimento de pelo menos um item se o campo [statusTemDoencaRespiratorio](#18-statustemdoencarespiratorio) = `true`.
*  Não deve ser preenchido o campo [statusTemDoencaRespiratorio](#18-statustemdoencarespiratorio) = `false`.

**Referência:** [DoencaRespiratoria]({% url dicionario %}#doencarespiratoria).

### \#8 doencaRins
Código das doenças renais que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |0 |3 |

**Regras:**

* Requerido preenchimento de pelo menos um item se o campo [statusTemTeveDoencasRins](#22-statustemtevedoencasrins) = `true`.
* Não deve ser preenchido se o campo [statusTemTeveDoencasRins](#22-statustemtevedoencasrins) = `false`.

**Referência:** [ConsideracaoPeso]({% url dicionario %}#consideracaopeso).

### \#9 maternidadeDeReferencia
Nome da maternidade de referência.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

**Regras:** Não pode ser preenchido se o campo [statusEhGestante](#14-statusehgestante) = `false`.

### \#10 situacaoPeso
Código da situação referente ao peso corporal.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [ConsideracaoPeso]({% url dicionario %}#consideracaopeso).

### \#11 statusEhDependenteAlcool
Marcador se o cidadão é dependente de álcool.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#12 statusEhDependenteOutrasDrogas
Marcador se o cidadão é dependente de outras drogas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#13 statusEhFumante
Marcador se o cidadão é fumante.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#14 statusEhGestante
Marcador se o cidadão está gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Só pode ser preenchido se:

* O campo [sexoCidadao](#16-sexocidadao) = `feminino`
* O campo [dataNascimentoCidadao](#3-datanascimentocidadao) for mais anterior que 12 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

### \#15 statusEstaAcamado
Marcador se o cidadão está acamado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#16 statusEstaDomiciliado
Marcador se o cidadão está domiciliado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#17 statusTemDiabetes
Marcador se o cidadão tem diabetes.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#18 statusTemDoencaRespiratorio
Marcador se o cidadão tem doença respiratória.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#19 statusTemHanseniase
Marcador se o cidadão tem hanseníase.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#20 statusTemHipertensaoArterial
Marcador se o cidadão tem hipertensão arterial.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#21 statusTemTeveCancer
Marcador se o cidadão tem ou teve câncer.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#22 statusTemTeveDoencasRins
Marcador se o cidadão tem ou teve doenças nos rins.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#23 statusTemTuberculose
Marcador se o cidadão tem tuberculose.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#24 statusTeveAvcDerrame
Marcador se o cidadão teve AVC.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#25 statusTeveDoencaCardiaca
Marcador se o cidadão teve doença cardíaca.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#26 statusTeveInfarto
Marcador se o cidadão teve infarto.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#27 statusTeveInternadoem12Meses
Marcador se o cidadão esteve internado nos últimos 12 meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#28 statusTratamentoPsiquicoOuProblemaMental
Marcador se o cidadão está em tratamento psiquico ou tem problema mental.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#29 statusUsaOutrasPraticasIntegrativasOuComplementares
Marcador se o cidadão utiliza outras práticas integrativas complementares.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#30 statusUsaPlantasMedicinais
Marcador se o cidadão utiliza plantas medicinais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

## EmSituacaoDeRua

### \#1 grauParentescoFamiliarFrequentado
Grau de parentesco do familiar que frequenta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |0 |100 |

**Regras:**

* Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.
* Não pode ser preenchido se o campo [statusVisitaFamiliarFrequentemente](#11-statusvisitafamiliarfrequentemente) = `false`.

### \#2 higienePessoalSituacaoRua
Código das condições de higiene que o cidadão tem acesso.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |0 |4 |

**Regras:**

* Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.
* Requerido preenchimento de pelo menos um item se o campo [statusTemAcessoHigienePessoalSituacaoRua](#10-statustemacessohigienepessoalsituacaorua) = `true`.

**Referência:** [AcessoHigiene]({% url dicionario %}#acessohigiene).

### \#3 origemAlimentoSituacaoRua
Código da origem da alimentação do cidadão em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Opcional |0 |5 |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

**Referência:** [OrigemAlimentacao]({% url dicionario %}#origemalimentacao).

### \#4 outraInstituicaoQueAcompanha
Nome de outra instituição que acompanha o cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

**Regras:**

* Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.
* Não pode ser preenchido se o campo [statusAcompanhadoPorOutraInstituição](#6-statusacompanhadoporoutrainstituicao) = `false`.

### \#5 quantidadeAlimentacoesAoDiaSituacaoRua
Código da quantidade de vezes que o cidadão se alimenta por dia.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

**Referência:** [QuantasVezesAlimentacao]({% url dicionario %}#quantasvezesalimentacao).

### \#6 statusAcompanhadoPorOutraInstituicao
Marcador que indica se o cidadão é acompanhado por outra instituição.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

### \#7 statusPossuiReferenciaFamiliar
Marcador que indica se o cidadão possuiu alguma referência familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

### \#8 statusRecebeBeneficio
Marcador que indica se o cidadão recebe algum benefício.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

### \#9 statusSituacaoRua
Marcador que indica se o cidadão está em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |

### \#10 statusTemAcessoHigienePessoalSituacaoRua
Marcador que indica se o cidadão tem acesso a higiene pessoal.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

### \#11 statusVisitaFamiliarFrequentemente
Marcador que indica se o cidadão visita algum familiar frequentemente.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

### \#12 tempoSituacaoRua
Código do tempo que o cidadão está em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não pode ser preechido se o campo [statusSituacaoRua](#9-statussituacaorua) = `false`.

**Referência:** [TempoSituacaoDeRua]({% url dicionario %}#temposituacaoderua).

## IdentificacaoUsuarioCidadao

### \#1 nomeSocialCidadao
Nome social do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#2 codigoIbgeMunicipioNascimento
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |7 |7 |

**Regras:** Requerido se o campo [nacionalidadeCidadao](#7-nacionalidadecidadao) = `1L (Brasileiro)` e não pode ser preenchido se for outra nacionalidade.

**Referência:** [Municipios]({% url municipios %}).

### \#3 dataNascimentoCidadao
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) ou mais anterior que 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referência:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#4 dataNascimentoResponsavel
Data de nascimento do responsável pelo cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) ou mais anterior que 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referência:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#5 desconheceNomeMae
Marcador que indica que o cidadão desconhece o nome da mãe

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#6 emailCidadao
Email do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |6 |100 |

**Regras:** Requerido seguir o padrão `endereco@domínio.extensao`.

### \#7 nacionalidadeCidadao
Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Nacionalidade]({% url dicionario %}#nacionalidade).

### \#8 nomeCidadao
Nome completo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |5 |100 |

**Regras:** Requerido espaço em branco para indicar o sobrenome.

### \#9 nomeMaeCidadao
Nome da mãe do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |5 |100 |

**Regras:**

* Requerido espaço em branco para indicar o sobrenome.
* Não deve ser preenchido se o campo [desconheceNomeMae](#5-desconhecenomemae) = `true`.

### \#10 numeroCartaoSus
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:** Validado por algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#11 numeroCartaoSusResponsavel
CNS do responsável do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:**
* Validado por algoritmo.
* Só pode ser preenchido se o campo [statusEhResponsavel](#17-statusehresponsavel) = `true`.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#12 numeroCelularCidadao
Número de celular do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |10 |11 |

**Regras:** Apenas números.

### \#13 numeroNisPisPasep
Número do PIS/PASEP do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |11 |11 |

### \#14 paisNascimento
Código do país de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Só pode ser preenchido se o campo [nacionalidadeCidadao](#7-nacionalidadecidadao) = `1L (Brasileira)`.

**Referência:** [País]({% url referencias %}#país).

### \#15 racaCorCidadao
Código da raça / cor do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [RacaCor]({% url dicionario %}#racacor).

### \#16 sexoCidadao
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Sexo]({% url dicionario %}#sexo).

### \#17 statusEhResponsavel
Marcador que indica se o cidadão é responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

## InformacoesSocioDemograficas

### \#1 deficienciasCidadao
Código das deficiências que o cidadão possui.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List\<Long\> |Condicional |1 |5 |

**Regras:**
* Requerido preenchimento de pelo menos um item se o campo [statusTemAlgumaDeficiencia](#16-statustemalgumadeficiencia) = `true`.
* Não deve ser preenchido se o campo [statusTemAlgumaDeficiencia](#16-statustemalgumadeficiencia) = `false`.

**Referência:** [DeficienciaCidadao]({% url dicionario %}#deficienciacidadao).

### \#2 grauInstrucaoCidadao
Código do curso mais elevado que o cidadão frequenta ou frequentou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [CursoMaisElevado]({% url dicionario %}#cursomaiselevado).

### \#3 motivoSaidaCidadao
Código do motivo da saída do cidadão do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [MotivoSaida]({% url dicionario %}#motivosaida).

### \#4 ocupacaoCodigoCbo2002
Código do CBO que representa a ocupaçao do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |6 |6 |

**Regras:**
* Deve ser um código de CBO válido.
* Não pode ser preenchido se o campo [statusDesejaInformarOrientacaoSexual](#10-statusdesejainformarorientacaosexual) = `false`.

**Referência:** [CBO]({% url cbo %}).

### \#5 orientacaoSexualCidadao
Código da orientação sexual informada pelo cidadão.  

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [OrientacaoSexual]({% url dicionario %}#orientacaosexual).

### \#6 povoComunidadeTradicional
Nome da comunidade tradicional que o cidadão frequenta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

**Regras:** Não deve ser preenchido se o campo [statusMembroPovoComunidadeTradicional](#13-statusmembropovocomunidadetradicional) = `false`.

### \#7 relacaoParentescoCidadao
Código da relação de parentesco com o responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [RelacaoParentesco]({% url dicionario %}#relacaoparentesco).

### \#8 responsavelPorCrianca
Código do responsável por crianças de até 9 anos.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [ResponsavelCrianca]({% url dicionario %}#responsavelcrianca).

### \#9 situacaoMercadoTrabalhoCidadao
Código da situação do cidadão no mercado de trabalho.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [SituacaoMercadoTrabalho]({% url dicionario %}#situacaomercadotrabalho).

### \#10 statusDesejaInformarOrientacaoSexual
Marcador que indica se o cidadão deseja informar sua orientação sexual.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#11 statusFrequentaBenzedeira
Marcador que indica se o cidadão frequenta cuidador tradicional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#12 statusFrequentaEscola
Marcador que indica se o cidadão frequenta escola ou creche.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |

### \#13 statusMembroPovoComunidadeTradicional
Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#14 statusParticipaGrupoComunitario
Marcador que indica se o cidadão participa de algum grupo comunitário.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#15 statusPossuiPlanoSaudePrivado
Marcador que indica se o cidadão possui plano de saúde privado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#16 statusTemAlgumaDeficiencia
Marcador que indica se cidadão tem alguma dificiência.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |
