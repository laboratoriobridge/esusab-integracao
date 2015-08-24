---
layout: doc
title: Ficha de Atendimento Domiciliar
id: dicionario-fad
order: 1
---

# Ficha de Atendimento Domiciliar



## FichaAtendimentoDomiciliarMaster


### \#1	uuidFicha	Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	36|	44|

É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier	-

### \#2	tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Observações**: Utilizar valor 3 (sistemas terceiros).

### \#3	headerTransport

Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|UnicaLotacaoHeader|	Requerido|	-|	-|

**Referências**	Ver Profissional

### \#4	atendimentosDomiciliares

Lista dos atendimentos realizados pelo profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<FichaAtendimentoDomiciliarChild>|	Requerido|	1|	13|

## FichaAtendimentoDomiciliarChild

### \#1	turno

Turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver Turno

### \#2	cns

CNS do cidadão que participou da atividade.
| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	15|	15|

CNS valido de acordo com o algoritmo.	Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.  	-
3	dataNascimento	Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)	-

4	sexo

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**:	-	Ver Sexo	-

### \#5	localDeAtendimento

Local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência** Ver LocalDeAtendimento

### \#6	atencaoDomiciliarModalidade

Modalidade AD do cidadão atendido.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras**: Apenas as opções "1L", "2L" e "3L" são aceitas.

**Referência**: Ver ModalidadeAD

7	tipoAtendimento

Tipo de atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Regras**: Apenas as opções "7L" e "8L" são aceitas.

**Referências**: Ver TipoDeAtendimento

### \#8	situacoesPresentes

Marcadores das situações presentes.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<Long>|	Opcional|	0|	24|

**Referências**: Ver SituacoesPresentes

### \#9	cid

CID registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

### \#10	ciap

CIAP registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-	|-|

### \#11	procedimentos

Procedimentos registrados no atendimento disponíveis na ficha.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<String>|	Opcional|	0|	21|

**Referência**: Ver ProcedimentosAtençãoDomiciliar

### \#12	outrosProcedimentos

Procedimentos SIGTAP registrados no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<String>|	Opcional	|0|	4|

**Regras**:

- Não podem ser iguais aos procedimentos a cima.
- Não podem conter procedimentos repetidos.

### \#13	condutaDesfecho

Desfecho do atendimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Regras**:	Não podem conter as opções "7L" ou "8L".

**Referência**:	Ver CondutaDesfecho

### \#14	statusInicioAcompanhamentoPosObito

Marcador que indica se a família irá receber acompanhamento pós-óbito.
| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|
