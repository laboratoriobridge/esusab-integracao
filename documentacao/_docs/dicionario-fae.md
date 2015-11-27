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

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referências:**  [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier)

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

**Referências:**	[Profissional]({% url profissional %})

### \#4	numeroCartaoSus
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String	|Requerido	|15	|15 |

**Regras:** CNS válido de acordo com o algoritmo.

**Referências**: Para ver o algoritmo utilizado, acesse [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#5	nomeCidadao
Nome do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String |	Condicional	|5|	100|

**Regras:**

* Ter ao menos duas palavras.
* Somente texto e apóstrofo (`'`).
*	Opcional caso [conclusaoDestinoElegivel](#23-conclusaodestinoelegivel) for diferente de `1L (admissão própria emad)`.

### \#6	nomeSocialCidadao
Nome social do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	100|

**Regras:**

* Somente texto e apóstrofo (`'`).

### \#7	dataNascimentoCidadao
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras:** Não pode ser posterior a [dataAtendimento]({% url profissional %}#5-dataatendimento) e anterior a 130 anos a partir da [dataAtendimento]({% url profissional %}#5-dataatendimento).

**Refererência**: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#8	sexoCidadao
Código do sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referências:** [Sexo]({% url dicionario %}#sexo)

### \#9	racaCorCidadao
Código da raça / cor do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional	|-|	-|

**Regras:**

*	Opcional caso [conclusaoDestinoElegivel](#23-conclusaodestinoelegivel) for diferente de `1L (admissão própria emad)`.

**Referências:** [RacaCor]({% url dicionario %}#racacor)

### \#10	nomeMaeCidadao
Nome da mãe do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Condicional |	5|	100|

**Regras:**

* Ter ao menos duas palavras.
* Somente texto e apóstrofo (`'`).
* Não pode ser preenchido se o campo [desconheceNomeMae](#11-desconhecenomemae) = `true`.

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

**Regras:** Não pode ser preenchido se [codigoNacionalidade](#13-codigonacionalidade) for diferente de `1L (brasileiro)`.

**Referências:** [Municípios]({% url municipios %})

### \#13	codigoNacionalidade
Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional| 	-|	-|

**Regras:**

*	Opcional caso [conclusaoDestinoElegivel](#23-conclusaodestinoelegivel) for diferente de `1L (admissão própria emad)`.

**Referências:** [Nacionalidade]({% url dicionario %}#nacionalidade)

### \#14	emailCidadao
Email do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	6|	255	|

**Regras:** Requerido seguir o padrão `endereco@domínio.extensão`.

### \#15	numeroNisPisPasep
Número do PIS/PASEP do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	11|	11|

**Regras:** Apenas números.

### \#16	endereco
Informações sobre o endereço do domicílio

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|EnderecoLocalPermanencia|	Condicional |	-|	-|

**Regras:**

*	Opcional caso [conclusaoDestinoElegivel](#23-conclusaodestinoelegivel) for diferente de `1L (admissão própria emad)`.

**Referências:**	[EnderecoLocalPermanencia](#enderecolocalpermanencia)

### \#17	atencaoDomiciliarOrigem
Código do local de atendimento de origem do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referências:** [AtencaoDomiciliarOrigem]({% url dicionario %}#atencaodomiciliarorigem)

### \#18	atencaoDomiciliarModalidade
Código das opções de modalidade, indica se o cidadão é elegível ou inelegível.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim |	-|	-|

**Referências:** [ModalidadeAD]({% url dicionario %}#modalidadead)

### \#19	situacoesPresentes
Marcadores de situações presentes.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Opcional|	1|	24|

**Referências:** [QuestionárioDeSituaçõesPresentes](#questionáriodesituaçõespresentes)

### \#20	cid10Principal
Código do CID10 principal registrado na avaliação.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Regras:** Não pode ser igual ao [CID10Segundo](#21-cid10segundo) nem [CID10Terceiro](#22-cid10terceiro).

### \#21	cid10Segundo
Código do CID10 registrado na avaliação.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

**Regras:** Não pode ser igual ao [CID10Principal](#20-cid10principal) nem [CID10Terceiro](#22-cid10terceiro).

### \#22	cid10Terceiro
Código do CID10 registrado na avaliação.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

**Regras:** Não pode ser igual ao [CID10Principal](#20-cid10principal) nem [CID10Segundo](#21-cid10segundo).

### \#23	conclusaoDestinoElegivel
Código da conduta adotada caso cidadão seja `Elegível`.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Condicional| -|-|

**Regras:**

* Só pode ser preenchido se [atencaoDomiciliarModalidade](#18-atencaodomiciliarmodalidade) for diferente de `4L (inelegível)`.

**Referências:** [ConclusaoDestinoElegivel]({% url dicionario %}#conclusaodestinoelegivel)

Observações: Os campos `#23` e `#24` são mutuamente exclusivos.

### \#24	conclusaoDestinoInelegivel
Código da conduta adotada caso cidadão seja `Inelegível`.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Condicional| 	0|	5|

**Regras:**

* Só pode ser preenchido se [atencaoDomiciliarModalidade](#18-atencaoDomiciliarModalidade) for igual a de `4L (inelegível)`.

**Referências:** [ConclusaoDestinoInelegivel]({% url dicionario %}#conclusaodestinoinelegivel)

Observações: Os campos `#23` e `#24` são mutuamente exclusivos.

### \#25	cuidadorCidadao
Código da relação de parentesco do cuidador com o cidadão em atenção domiciliar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referências:** [CuidadorCidadao]({% url dicionario %}#cuidadorcidadao)

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

**Regras:**	Apenas números.

### \#3	codigoIbgeMunicipio
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Sim|	-|	-|

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

**Referências:**	[Estados]({% url referencias %}#uf)

### \#8	telReferencial
Telefone de referência.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

Observações: Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)

### \#9	telResidencial
Telefone residencial.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String| Opcional|	10|	11|

Observações: Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)

### \#10	tipoLogradouroNumeroDne
Código do tipo do logradouro onde está o domicílio.

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
