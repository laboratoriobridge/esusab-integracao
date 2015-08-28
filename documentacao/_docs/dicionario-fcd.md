---
layout: doc
title: Ficha de Cadastro Domiciliar
id: dicionario-fcd
order: 1
---

# Ficha de Cadastro Domiciliar

## CadastroDomiciliar

### \#1	animaisNoDomicilio

Lista de animais no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Condicional|	0|	5|

**Regra**:

- Não devem ser preenchidos se o campo "statusTermoRecusaCadastroDomiciliarAtencaoBasica" estiver marcado como true

**Referência**: Ver AnimalNoDomicilio

### \#2	condicaoMoradia

Condições de moradia do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|CondicaoMoradia	|Condicional	|-|	-	|

**Regra**:

- Não devem ser preenchidos se o campo "statusTermoRecusaCadastroDomiciliarAtencaoBasica" estiver marcado como true

**Referência**: Ver CondicaoMoradia

### \#3	dadosGerais

Informações sobre o profissionale a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|HeaderCdsCadastro|	Requerido|	-|	-|

**Referência**:	Ver HeaderCdsCadastro


### \#4	enderecoLocalPermanencia

Informações sobre o endereço do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|EnderecoLocalPermanencia|	Condicional |  - | -|

**Regra**: Campo é de preencimento opcional se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica estiver marcado como true.

**Referência**: Ver EnderecoLocalPermanencia


### \#5	familias

Lista das famílias que residem no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<FamiliaRow>| Condicional| 	0|	4|

**Regra**:

- Não deve ser preenchidos se o campo "statusTermoRecusaCadastroDomiciliarAtencaoBasica" estiver marcado como true.

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

**Regras**:

- Não deve ser preenchido se o campo "stAnimaisNoDomicilio" = false.
- Não devem ser preenchidos se o campo "statusTermoRecusaCadastroDomiciliarAtencaoBasica" estiver marcado como true.


### \#8	stAnimaisNoDomicilio

Marcador que indica se existem animais no domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Condicional| 	-	| - |

**Regras**:

- Não devem ser preenchidos se o campo "statusTermoRecusaCadastroDomiciliarAtencaoBasica" estiver marcado como true.

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

**Observação**: Utilizar valor 3 (sistemas terceiros).


### \#11	uuid

Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

**Regra**: É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier

### \#12	uuidFichaOriginadora

Código UUID para identificar a ficha que deu origem ao cadastro do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

Se for uma ficha de atualização, deve ser preenchido com o UUID da ficha que deu origem ao registro. Se for uma ficha de cadastro, este campo deve ser igual ao campo "uuid".	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier

## FamiliaRow

### \#1	dataNascimentoResponsavel

Data de nascimento, no formato epoch time, do cidadão responsável pela família.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: 	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)


### \#2	numeroCnsResponsavel

CNS do responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	15|	15|

**Referência**: Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.


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

**Referência**: Apenas letras e números.


### \#5	rendaFamiliar

Renda familiar em salários mínimos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver RendaFamiliar

### \#6	resideDesde

Mês e ano que a família começou a residir no domicílio, no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)

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
|String|	Opcional|	8|	8|

**Regras**:	Apenas numérico.

### \#3	codigoIbgeMunicipio

Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referência**:		Ver Municipios


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

- Apenas letras e números.
- Não pode ser preenchido caso stSemNumero seja verdadeiro.

### \#7	numeroDneUf

Indexador referente a Unidade Federativa.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referência**: Ver Estados

### \#8	telReferencial

Telefone de referência.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

**Regra**: mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)


### \#9	telResidencial

Telefone residencial.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

**Regra**: Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)


### \#10	tipoLogradouroNumeroDne

Tipo do logradouro onde está o domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Observação**: Deve ser informado o código DNE.

**Referência**: Ver TipoLogradouro

### \#11	stSemNumero

Marcador que indica que o domicílio não possui número.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

##CondicaoMoradia

### \#1	abastecimentoAgua

Tipo de abastecimento de água.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**:	Ver AbastecimentoDeAgua

### \#2	areaProducaoRural

Condição de posse e uso da terra.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional | 	-|	-|

**Regra**: Deve ser preenchido se o campo localização for marcado como Rural (84 L).

**Referência**:	Ver CondicaoDePosseEUsoDaTerra


### \#3	destinoLixo

Destino do lixo.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver DestinoDoLixo


### \#4	formaEscoamentoBanheiro

Forma de escoamento do banheiro ou sanitário.


| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver FormaDeEscoamentoDoBanheiroOuSanitario


### \#5	localizacao

Localização do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver LocalizacaoDaMoradia


### \#6	materialPredominanteParedesExtDomicilio

Tipo de material predominante nas paredes externas do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver MaterialPredominanteNaConstrucao


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


### \#9	situacaoMoradiaPosseTerra

Situação de moradia ou de posse da terra.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver SituacaoDeMoradia


### \#10	stDiponibilidadeEnergiaeletrica

Marcador que indica se existe disponibilidade de energia elétrica.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


### \#11	tipoAcessoDomicilio

Tipo de acesso ao domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver TipoDeAcessoAoDomicilio


### \#12	tipoDomicilio

Tipo de domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver TipoDeDomicilio


### \#13	tratamentoAguaDomicilio

Tipo do tratamento de água do domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver TratamentoDeAguaNoDomicilio
