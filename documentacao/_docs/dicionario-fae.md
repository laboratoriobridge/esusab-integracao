---
layout: doc
title: Ficha de Avaliação de Elegibilidade
id: dicionario-fae
order: 1
---

# Ficha de Avaliação de Elegibilidade

## FichaAvaliacaoElegibilidade

### \#1	uuidFicha

Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Sim| 36|	44|

**Regra**: É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**:  [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier)


### \#2	tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Observação**: Utilizar valor 3 (sistemas terceiros).


### \#3	headerTransport

Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|UnicaLotacaoHeader|	Requerido|	-|	-|

**Referência**:	Ver Profissional


### \#4	numeroCartaoSus	CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
String	Requerido	15	15

CNS valido de acordo com o algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse [Cartão SUS](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação
Java.


### \#5	nomeCidadao

Nome do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String |	Requerido*	|5|	100|

**Regras**:

- Ter ao menos duas palavras.
- Somente texto e apóstrofo ( ' ).
-	Não é Requerido caso conclusaoDestinoElegivel for diferente de 1L.


### \#6	nomeSocialCidadao

Nome social do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	100|

**Regra**:

- Somente texto e apóstrofo ( ' ).


### \#7	dataNascimentoCidadao

Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regra**: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.

**Referência**: [EPOCH](https://en.wikipedia.org/wiki/Epoch_\(reference_date\))


### \#8	sexoCidadao

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver Sexo


### \#9	racaCorCidadao

Raça / Cor do cidadão

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional	|-|	-|

**Regra**:

- Não é Requerido caso conclusaoDestinoElegivel for diferente de 1L.

**Referência**: Ver RacaCor


### \#10	nomeMaeCidadao

Nome da mãe do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Condicional |	5|	100|

**Regras**:

- Ter ao menos duas palavras.
- Somente texto e apóstrofo ( ' ).
- Não pode ser preenchido se o campo desconheceNomeMae for marcado como true.


### \#11	desconheceNomeMae

Marcador que indica que o cidadão desconhece o nome da mãe.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


### \#12	codigoIbgeMunicipioNascimento

Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

**Regra**: Não pode ser preenchido se codigoNacionalidade for diferente de "1L - Brasileiro".

**Referência**:	Ver Municípios.


### \#13	codigoNacionalidade

Marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional| 	-|	-|

**Regra**:

- Não é Requerido caso conclusaoDestinoElegivel for diferente de 1L.

**Referência**: Ver Nacionalidade


### \#14	emailCidadao

Email do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	6|	255	|

**Regra**: Requerido seguir o padrão "nome@domínio.extensão".


### \#15	numeroNisPisPasep

Número do PIS/PASEP do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	11|	11|

**Regras**: Apenas numérico.


### \#16	endereco

Informações sobre o endereço do domicílio

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|EnderecoLocalPermanencia|	Condicional |	-|	-|

**Regras**:

- Não é Requerido caso conclusaoDestinoElegivel for diferente de 1L.

**Referência**:	Ver EnderecoLocalPermanencia


### \#17	atencaoDomiciliarOrigem

Local de atendimento de origem do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver AtencaoDomiciliarOrigem


### \#18	atencaoDomiciliarModalidade

Opções de modalidade, indica se o cidadão é elegível ou inelegível.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim |	-|	-|

**Referência**: Ver ModalidadeAD


### \#19	situacoesPresentes

Marcadores de situações presentes

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Opcional|	1|	24|

**Referência**: Ver [QuestionárioDeSituaçõesPresentes](#questionáriodesituaçõespresentes)


### \#20	cid10Principal

CID10 principal registrado na avaliação.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Regra**: Não pode ser igual ao CID10Segundo nem CID10Terceiro.


### \#21	cid10Segundo

CID10 registrado na avaliação.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

**Regra**: Não pode ser igual ao CID10Principal nem CID10Terceiro.


### \#22	cid10Terceiro

CID10 registrado na avaliação

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

**Regra**: Não pode ser igual ao CID10Principal nem CID10Segundo.


### \#23	conclusaoDestinoElegivel

Conduta adotada caso cidadão seja "Elegível".

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional| -|-|

**Regra**:

- Só pode ser preenchido se atencaoDomiciliarModalidade for diferente de "4L -  Inelegível".

- Os campos são mutuamente exclusivos.

**Referência**: Ver ConclusaoDestinoElegivel


### \#24	conclusaoDestinoInelegivel

Conduta adotada caso cidadão seja "Inelegível".

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Condicional| 	0|	5|

**Regras**: Só pode ser preenchido se atencaoDomiciliarModalidade for igual a de "4L -  Inelegível".

**Referência**: Ver ConclusaoDestinoInelegivel


### \#25	cuidadorCidadao

Relação de parentesco do cuidador com o cidadão em atenção domiciliar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver CuidadorCidadao


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
|String|	Sim|	-|	-|

**Referência**: Ver Municipios


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

**Regras**:

- Apenas letras e números.
- Não pode ser preenchido caso stSemNumero seja verdadeiro.


### \#7	numeroDneUf

Indexador referente a Unidade Federativa

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referência**:	Ver Estados


### \#8	telReferencial

Telefone de referência, minimo 10 digitos, máximo 11 (DDD + 8 ou 9)

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

Telefone de referência, minimo 10 digitos, máximo 11 (DDD + 8 ou 9)	-	-


### \#9	telResidencial

Telefone residencial, minimo 10 digitos, máximo 11 (DDD + 8 ou 9)

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String| Opcional|	10|	11|

Telefone residencial, minimo 10 digitos, máximo 11 (DDD + 8 ou 9)	-	-


### \#10	tipoLogradouroNumeroDne

Tipo do logradouro onde está o domicílio.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Referência**: Deve ser informado o código DNE, 	Ver TipoLogradouro


### \#11	stSemNumero

Marcador que indica que o domicílio não possui número.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


## QuestionárioDeSituaçõesPresentes
|Descrição | Código|
|--- | ---|
|Acamado	|1 L|
|Domiciliado	|2 L|
|Úlceras / Feridas (grau III ou IV)	|3 L|
|Acompanhamento nutricional	|4 L|
|Uso de sonda naso-gástrica - SNG	|5 L|
|Uso de sonda naso-enteral - SNE	|6 L|
|Uso de gastrostomia	|7 L|
|Uso de colostomia	|8 L|
|Uso de cistostomia	|9 L|
|Uso de sonda vesical de demora - SVD	|10 L|
|Acompanhamento pré-operatório	|11 L|
|Acompanhamento pós-operatório	|12 L|
|Adaptação ao uso de órtese / prótese	|13 L|
|Reabilitação domiciliar	|14 L|
|Cuidados paliativos oncológico	|15 L|
|Cuidados paliativos não-oncológico	|16 L|
|Oxigenoterapia domiciliar	|17 L|
|Uso de traqueostomia	|18 L|
|Uso de aspirador de vias aéreas para higiene brônquica	|19 L|
|Suporte ventilatório não invasivo - CPAP	|20 L|
|Suporte ventilatório não invasivo - BiPAP	|21 L|
|Diálise peritonial	|22 L|
|Paracentese	|23 L|
|Medicação parenteral	|24 L|
