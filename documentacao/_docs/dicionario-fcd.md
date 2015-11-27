---
layout: doc
title: Ficha de Cadastro Domiciliar
id: dicionario-fcd
order: 1
---

# Ficha de Cadastro Domiciliar

## CadastroDomiciliar

### \#1	animaisNoDomicilio
Lista de código dos animais no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long\>|	Condicional|	0|	5|

**Regras:**

* Não pode ser preenchido se o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `true`.

**Referências:** [AnimalNoDomicilio]({% url dicionario %}#animalnodomicilio)

### \#2	condicaoMoradia
Condições de moradia do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---| --- |---  | --- |
| CondicaoMoradia	| Condicional	| - |	-	|

**Regras:**

* Não devem ser preenchidos se o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `true`.

**Referências:** [CondicaoMoradia](#condicaomoradia)

### \#3	dadosGerais
Informações sobre o profissional e a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---| --- |---  | --- |
| HeaderCdsCadastro|	Requerido|	-|	-|

**Referências:**	[HeaderCdsCadastro]({% url profissional %}#headercdscadastro)

### \#4	enderecoLocalPermanencia
Informações sobre o endereço do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
| ---| --- |---  | --- |
| EnderecoLocalPermanencia|	Condicional |  - | -|

**Regras:** Preenchimento obrigatório caso o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `false`.

**Referências:** [EnderecoLocalPermanencia](#enderecolocalpermanencia)

### \#5	familias
Lista das famílias que residem no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<FamiliaRow>| Condicional| 	0|	4|

**Regras:**

* Não pode ser preenchido caso o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `true`.

### \#6	fichaAtualizada
Marcador que indica se a ficha é uma atualização.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Requerido|	1|	1|

### \#7	quantosAnimaisNoDomicilio
Número de animais no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String	|Condicional| 	0|	2|

**Regras:**

* Não pode ser preenchido se o campo [stAnimaisNoDomicilio](#8-stanimaisnodomicilio) = `false`.
* Não pode ser preenchido se o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `true`.

### \#8	stAnimaisNoDomicilio
Marcador que indica se existem animais no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Condicional| 	-	| - |

**Regras:**

* Não pode ser preenchido se o campo [statusTermoRecusaCadastroDomiciliarAtencaoBasica](#9-statustermorecusacadatrodomiciliaratencaobasica) = `true`.

### \#9	statusTermoRecusaCadatroDomiciliarAtencaoBasica
Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

### \#10	tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#11	uuid
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referências:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#12	uuidFichaOriginadora
Código UUID para identificar a ficha que deu origem ao cadastro do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

**Regras:** Se for uma ficha de atualização, deve ser preenchido com o UUID da ficha que deu origem ao registro. Se for uma ficha de cadastro, este campo deve ser igual ao campo [UUID](#11-uuid).

**Referências:** Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

## FamiliaRow

### \#1	dataNascimentoResponsavel
Data de nascimento, no formato epoch time, do cidadão responsável pela família.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#2	numeroCnsResponsavel
CNS do responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	15|	15|

**Referências:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#3	numeroMembrosFamilia
Quantidade de membros do núcleo familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Interger|	Opcional|	0|	2|

### \#4	numeroProntuario
Código do prontuário familiar na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	30|

**Regras:** Apenas letras e números.

### \#5	rendaFamiliar
Código da renda familiar em salários mínimos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [RendaFamiliar]({% url dicionario %}#rendafamiliar)

### \#6	resideDesde
Mês e ano que a família começou a residir no domicílio, no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#7	stMudanca
Marcador que indica se a familia mudou-se.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

## EnderecoLocalPermanencia

### \#1	bairro
Bairro onde está localizado o domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	1|	256|

### \#2	cep
CEP do logradouro do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| String|	Opcional|	8|	8|

**Regras:**	Apenas números.

### \#3	codigoIbgeMunicipio
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referências:** [Municipios]({% url municipios %})

### \#4	complemento
Complemento do endereço do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	1|	256|

### \#5	nomeLogradouro
Nome do logradouro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	1|	256|

### \#6	numero
Número do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	1|	10|

**Regras:**

* Apenas letras e números.
* Não pode ser preenchido caso [stSemNumero](#11-stsemnumero) = `true`.

### \#7	numeroDneUf
Código indexador referente a Unidade Federativa.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referências:** [Estados]({% url referencias %}#uf)

### \#8	telReferencial
Telefone de referência.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

**Regras:** Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9).

### \#9	telResidencial
Telefone residencial.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

**Regras:** Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9).

### \#10	tipoLogradouroNumeroDne
Tipo do logradouro onde está o domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Regras:** Deve ser informado o código DNE.

**Referências:** [TipoLogradouro]({% url referencias %}#tipo-de-logradouro)

### \#11	stSemNumero
Marcador que indica que o domicílio não possui número.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

##CondicaoMoradia

### \#1	abastecimentoAgua
Código do tipo de abastecimento de água.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:**	[AbastecimentoDeAgua]({% url dicionario %}#abastecimentodeagua)

### \#2	areaProducaoRural
Código da condição de posse e uso da terra.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional | 	-|	-|

**Regras:** Preenchimento obrigatório caso o campo [Localização](#5-localizacao) = `84L (rural)`.

**Referências:** [CondicaoDePosseEUsoDaTerra]({% url dicionario %}#condicaodeposseeusodaterra)

### \#3	destinoLixo
Código do destino do lixo.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [DestinoDoLixo]({% url dicionario %}#destinodolixo)

### \#4	formaEscoamentoBanheiro
Código da forma de escoamento do banheiro ou sanitário.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [FormaDeEscoamentoDoBanheiroOuSanitario]({% url dicionario %}#formadeescoamentodobanheiroousanitario)

### \#5	localizacao
Código do localização do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referências:** [LocalizacaoDaMoradia]({% url dicionario %}#localizacaodamoradia)

### \#6	materialPredominanteParedesExtDomicilio
Código do tipo de material predominante nas paredes externas do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [MaterialPredominanteNaConstrucao]({% url dicionario %}#materialpredominantenaconstrucao)

### \#7	nuComodos
Número de cômodos do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	2|

### \#8	nuMoradores
Número de moradores do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	2|

### \#9 situacaoMoradiaPosseTerra
Código da situação de moradia ou de posse da terra.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referências:** [SituacaoDeMoradia]({% url dicionario %}#situacaodemoradia)

### \#10 stDiponibilidadeEnergiaeletrica
Marcador que indica se existe disponibilidade de energia elétrica.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

### \#11 tipoAcessoDomicilio
Código do tipo de acesso ao domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [TipoDeAcessoAoDomicilio]({% url dicionario %}#tipodeacessoaodomicilio)

### \#12	tipoDomicilio
Código do tipo de domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [TipoDeDomicilio]({% url dicionario %}#tipodedomicilio)

### \#13	tratamentoAguaDomicilio
Código do tipo do tratamento de água do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [TratamentoDeAguaNoDomicilio]({% url dicionario %}#tratamentodeaguanodomicilio)
