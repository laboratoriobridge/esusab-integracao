---
layout: doc
title: Ficha de Atividade Coletiva
id: dicionario-fac
order: 1
---

# Ficha de Atividade Coletiva

# FichaAtividadeColetiva

### \#1	uuidFicha

Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

**Regras**: É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier)


### \#2	dtAtividadeColetiva

Data de realização da atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|-|

**Regras** -Não pode ser posterior a data atual.

**Referência** - [Wikipedia Epoch](https://en.wikipedia.org/wiki/Epoch)


### \#3	numParticipantesProgramados

Previsão da quantidade de participantes para a atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Opcional|	0|	3|

**Regras**:	Valores entre 0 e 999.


### \#4	localAtividade

Descrição do local onde é realizada a atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	0|	250|


### \#5	horaInicio

Hora de incício de realização da atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Regras**:	-	Verificar validações

**Referência** - [Wikipedia Epoch](https://en.wikipedia.org/wiki/Epoch)


### \#6	horaFim

Hora de fim de realização da atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Regras**: Deve ser posterior a horaInicio.

**Referência** - [Wikipedia Epoch](https://en.wikipedia.org/wiki/Epoch)


### \#7	inep

Número INEP da instituição.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	0|	8|


### \#8	responsavelCns

CNS do responsável pela atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	15|	15|

**Regras**:

- CNS válido de acordo com o algoritmo.
- O profissional responsável deve ser um registro da lista de profissionais."

**Referência**: Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.  	-


### \#9	responsavelCnesUnidade

CNES do responsável pela atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido	|7|	7|


### \#10	responsavelNumIne

INE do responsável pela atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	10|


### \#11	numParticipantes

Número de participantes da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Opcional|	0|	3|

**Regras**: Valores entre 0 e 999.


### \#12	numAvaliacoesAlteradas

Número das avaliações alteradas.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Opcional|	0|	3|

**Regras**:	Valores entre 0 e 999.	-	-


### \#13	profissionais

Lista dos profissionais que participaram da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|	List<ProfissionalCboRowItem>|	Sim|	1	|99|

**Regras**: Entre 1 e 99 registros.

**Referência**:	Ver ProfissionalCboRowItem


### \#14	atividadeTipo

Tipo da atividade que será realizada.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim |	-|	-|

**Referências**:	Ver TipoAtividadeColetiva


### \#15	temasParaReuniao

Temas para reunião.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|	List<Long>|	Condicional |- |	-|

**Regras**:

- É Requerido se tipoAtividadeColetiva for ""1L"", ""2L"" ou ""3L"".
- Não pode ser preenchido se tipoAtividade for ""4L"", ""5L, ""6L"" ou ""7L""."

**Referência**: Ver TemasParaReuniao


### \#16	publicoAlvo

Público alvo da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<Long>|	Condicional |	-|	-|

**Regras**:

- É Requerido se tipoAtividadeColetiva for ""4L"", ""5L, ""6L"" ou ""7L"".
- Não pode ser preenchido se tipoAtividade for ""1L"", ""2L"" ou ""3L""."

**Referência**: Ver PublicoAlvo


### \#17	praticasTemasParaSaude

Práticas ou temas abordados na atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<Long>|	Condicional| 	-|	-|

**Regras**:

- É Requerido se tipoAtividadeColetiva for ""4L"", ""5L, ""6L"" ou ""7L"".
- Não pode ser preenchido se tipoAtividade for ""1L"", ""2L"" ou ""3L""."

**Referências**:	Ver PraticasTemasParaSaude


### \#18	participantes

Cidadãos que participaram da atividade coletiva.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<ParticipanteRowItem>|	Opcional|	0|33|

**Referência**:	Ver [ParticipanteRowItem](#participanterowitem)


### \#19	tbCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Observações**: Utilizar valor 3 (sistemas terceiros).


### \#20	codigoIbgeMunicipio

Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Sim|	-|	-|

**Referências**: Ver Municipios


## ParticipanteRowItem


### \#1	cns

CNS do cidadão que participou da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Sim|	15|	15|

**Regras**: 	CNS válido de acordo com o algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.  	-


### \#2	dataNascimento

Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|	Long|	Opcional|	-|	-|

**Regras**: 	Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.

**Referências**: 	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)	-


### \#3	avaliacaoAlterada

Marcador que indica que a avaliação do cidadão teve um valor diferente dos considerados normais.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


### \#4	peso

Peso do cidadão em Kg.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|	Double|	Opcional|	1|	6|

**Regras**:

- Apenas números e vírgula ("" , "").
- Máximo de 3 números após a vírgula.
- Se tiver vírgula, tamanho máximo = 7.
- Valor mínimo = 0,5 e máximo = 500.


### \#5	altura

Altura do cidadão em cm.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Double|	Opcional| 	2|	4|

**Regras**:

- Apenas números e vírgula ("" , "").
- Máximo de 3 números após a vírgula.
- Se tiver vírgula, tamanho máximo = 5.
- Valor mínimo 20 e máximo 250.


### \#6	cessouHabitoFumar

Marcação se o cidadão cessou o hábito de fumar.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

**Regras**: Não deve ser preenchido se o praticasTemasParaSaude não for 25, 26, 27 ou 28 (referentes ao PNCT).


### \#7	abadonouGrupo

Marcação se o cidadão abandonou o grupo de tabagismo.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

**Regras**: Não deve ser preenchido se o praticasTemasParaSaude não for 25, 26, 27 ou 28 (referentes ao PNCT).
