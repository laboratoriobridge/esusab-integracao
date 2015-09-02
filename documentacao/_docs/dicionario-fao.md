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

**Regra**: É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier


### \#2	headerTransport

Profissionais que realizaram o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|VariasLotacoesHeader|	Requerido|	-|	-|

**Referência**: Ver Profissional

### \#3	atendimentosOdontologicos

Registro individualizado dos atendimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<FichaAtendimentoOdontologicoChild>|	Requerido|	1|	13|

**Regra**: No máximo 13 atendimentos podem ser registrados.

**Referência**: Ver FichaAtendimentoOdontologicoChild

### \#4	tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	1|	1|

**Observação**: Utilizar valor 3 (sistemas terceiros).


## FichaAtendimentoOdontologicoChild

### \#1	dtNascimento

Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regras**: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.

**Referência**: Para ver a referência sobre o formato epoch, acesse: [EPOCH](https://en.wikipedia.org/wiki/Epoch_(reference_date))


### \#2	numCartaoSus

CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	15|	15|

**Regra**: CNS válido de acordo com o algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.


### \#3	numProntuario

Número do prontuário do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String	|Opcional|	0|	30|

**Regras**: Apenas letras e números são aceitos.


### \#4	gestante

Marcador que indica se o cidadão esta gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|

**Regra**: Verificar regra para o sexo.

### \#5	necessidadesEspeciais

Marcador que indica se o cidadão é portador de necessidades especiais,


| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


### \#6	localAtendimento

Local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regra**: Apenas valores de "1L" a "10L".

**Referência**: Ver LocalDeAtendimento


### \#7	tipoAtendimento

Tipo de atendimento realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Regra**: Apenas valores de "2L" a "6L".

**Referência**:	Ver TipoDeAtendimento


### \#8	tiposEncamOdonto

Condutas adotadas e possíveis encaminhamentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Requerido|	1|	16|

**Referência**: Ver CondutaEncaminhamentoOdonto


### \#9	tiposFornecimOdonto

Materias fornecidos durante o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Opcional	|0|	3|

**Referência**: Ver FornecimentoOdonto


### \#10	tiposVigilanciaSaudeBucal

Marcadores referentes a situação de vigilância em saúde bucal.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Requerido|	1|	7|

**Referência**: Ver VigilanciaEmSaudeBucal


### \#11	tiposConsultaOdonto

Tipo de consulta odontológica realizada.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<Long>|	Condicional |	-	|-|

**Regras**:

- É Requerido se o tipo de atendimento for consulta agendada.
- Não deve ser preenchido se o tipo de atendimento for ""Escuta Inicial / Orientação"".
- Se o tipo de atendimento for ""Atendimento de urgência"", a opção de ""Consulta de retorno"" não pode ser marcada.
- Se for ""Consulta no dia"", o campo não é Requerido.
- Aceita apenas um registro.

**Referência**: Ver TipoDeConsultaOdonto


### \#12	procedimentosRealizados

Procedimentos que são apresentados na ficha.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<ProcedimentoQuantidade>|	Opcional|	0|	27|

**Regra**:

- Não pode haver procedimentos com o mesmo código.

**Referência**:	Ver ListaProcedimentosRealizados


### \#13	outrosSiaProcedimentos

Lista de outros procedimentos.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List\<ProcedimentoQuantidade>|	Opcional|	0|	24|

**Regra**:

- Não pode conter procedimentos da lista procedimentosRealizados.
- Não pode haver procedimentos com o mesmo código.

**Referência**: Ver ProcedimentoQuantidade


### \#14	sexo

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Requerido|	-|	-|

**Referência**: Ver Sexo


### \#15	turno

Turno em que o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Referência**: Ver Turno


### ProcedimentoQuantidade


### \#1	coMsProcedimento

Código do procedimento no MS.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

**Regra**: Deve ser um procedimento com um código válido.

**Referência**: Para ver a referência da tabela do SIGTAP acesse: http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar

### \#2	quantidade

Quantidade de procedimentos realizados.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Requerido|	0|	2|

**Regra**:

- Valor máximo que pode ser registrado é 99.

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
