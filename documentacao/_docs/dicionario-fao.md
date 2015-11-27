---
layout: doc
title: Ficha de Atendimento Odontológico
id: dicionario-fao
order: 1
---

# Ficha de Atendimento Odontológico

## FichaAtendimentoOdontologicoMaster

### \#1	uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referências:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2	headerTransport
Profissionais que realizaram o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|VariasLotacoesHeader|	Requerido|	-|	-|

**Referências:** [Profissional]({% url profissional %})

### \#3	atendimentosOdontologicos
Registro individualizado dos atendimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<FichaAtendimentoOdontologicoChild>|	Requerido|	1|	13|

**Regras:** No máximo 13 atendimentos podem ser registrados.

**Referências:** [FichaAtendimentoOdontologicoChild](#fichaatendimentoodontologicochild)

### \#4	tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Regras:** Utilizar valor 3 (sistemas terceiros).

## FichaAtendimentoOdontologicoChild

### \#1	dtNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Referências:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date))

### \#2	numCartaoSus
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	15|	15|

**Regras:** CNS válido de acordo com o algoritmo.

**Referências:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#3	numProntuario
Número do prontuário do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String	|Opcional|	0|	30|

**Regras:** Apenas letras e números são aceitos.

### \#4	gestante
Marcador que indica se o cidadão está gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

**Regras:** [Sexo](#14-sexo) = `1L (feminino)`.

### \#5	necessidadesEspeciais
Marcador que indica se o cidadão é portador de necessidades especiais.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

### \#6	localAtendimento
Código do local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras:** Apenas valores de `1L` a `10L`.

**Referências:** [LocalDeAtendimento]({% url dicionario %}#localdeatendimento)

### \#7	tipoAtendimento
Código do tipo de atendimento realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras:** Apenas valores de `2L` a `6L`.

**Referências:**	[TipoDeAtendimento]({% url dicionario %}#tipodeatendimento)

### \#8	tiposEncamOdonto
Código das condutas adotadas e possíveis encaminhamentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Requerido|	1|	16|

**Referências:** [CondutaEncaminhamentoOdonto]({% url dicionario %}#condutaencaminhamentoodonto)

### \#9	tiposFornecimOdonto
Código dos materiais fornecidos durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Opcional	|0|	3|

**Referências:** [FornecimentoOdonto]({% url dicionario %}#fornecimentoodonto)

### \#10	tiposVigilanciaSaudeBucal
Código dos marcadores referentes a situação de vigilância em saúde bucal.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Requerido|	1|	7|

**Referências:** [VigilanciaEmSaudeBucal]({% url dicionario %}#vigilanciaemsaudebucal)

### \#11	tiposConsultaOdonto
Código do tipo de consulta odontológica realizada.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Condicional |	-	|-|

**Regras:**

* É Requerido se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `2L (consulta agendada)`.
* Não pode ser preenchido se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `4L (escuta inicial ou orientação)`.
* Se o [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `6L (atendimento de urgência)`, a opção de `2L (consulta de retorno)` não pode ser marcada.
* Se [TipoDeAtendimento]({% url dicionario %}#tipodeatendimento) = `5L (consulta no dia)`, o campo é opcional.
* Aceita apenas um registro.

**Referências:** [TipoDeConsultaOdonto]({% url dicionario %}#tipodeconsultaodonto)

### \#12	procedimentosRealizados
Código dos procedimentos que são apresentados na ficha.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<ProcedimentoQuantidade>|	Opcional|	0|	27|

**Regras:**

* Não pode haver procedimentos com o mesmo código.

**Referências:**	[ListaProcedimentosRealizados](#listaprocedimentosrealizados)

### \#13	outrosSiaProcedimentos
Lista de outros códigos de procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<ProcedimentoQuantidade>|	Opcional|	0|	24|

**Regras:**

* Não pode conter procedimentos da [ListaProcedimentosRealizados](#listaprocedimentosrealizados).
* Não pode haver procedimentos com o mesmo código.

**Referências:** [ProcedimentoQuantidade](#procedimentoquantidade)

### \#14	sexo
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referências:** [Sexo]({% url dicionario %}#sexo)

### \#15 turno
Código do turno em que o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [Turno]({% url dicionario %}#turno)

## ProcedimentoQuantidade

### \#1	coMsProcedimento
Código do procedimento no MS.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Regras:** Deve ser um procedimento com um código válido.

**Referências:** Para ver a referência da tabela do SIGTAP acesse: [Tabela Unificada SIGTAP](http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar).

### \#2	quantidade
Quantidade de procedimentos realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	0|	2|

**Regras:**

* Valor máximo que pode ser registrado é 99.

## ListaProcedimentosRealizados
|Código | Descrição |
|---|---|
|ABPO001|	Acesso a polpa dentária e medicação (por dente)|
|ABPO002|	Adaptação de Prótese Dentária|
|ABPO003|	Aplicação de cariostático (por dente)|
|ABPO004|	Aplicação de selante (por dente)|
|ABPO005|	Aplicação tópica de flúor (individual por sessão)|
|ABPO006|	Capeamento pulpar|
|ABPO007|	Cimentação de prótese|
|ABPO008|	Curativo de demora c/ ou s/ preparo biomecânico|
|ABPG008|	Drenagem de abscesso|
|ABPO010|	Evidenciação de placa bacteriana|
|ABPO011|	Exodontia de dente decíduo|
|ABPO012|	Exodontia de dente permanente|
|ABPO013|	Instalação de prótese dentária|
|ABPO014|	Moldagem dento-gengival p/ construção de prótese dentária|
|ABPO015|	Orientação de Higiene Bucal|
|ABPO016|	Profilaxia / Remoção de placa bacteriana|
|ABPO017|	Pulpotomia dentária|
|ABPO018|	Radiografia Periapical / Interproximal|
|ABPO019|	Raspagem alisamento e polimento supragengivais (por sextante)|
|ABPO020|	Raspagem alisamento subgengivais (por sextante)|
|ABPO021|	Restauração de dente decíduo|
|ABPO022|	Restauração de dente permanente anterior|
|ABPO023|	Restauração de dente permanente posterior|
|ABPG018|	Retirada de pontos de cirurgias básicas (por paciente)|
|ABPO025|	Selamento provisório de cavidade dentária|
|ABPO026|	Tratamento de alveolite|
|ABPO027|	Ulotomia / Ulectomia|
