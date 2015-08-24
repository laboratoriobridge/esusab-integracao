---
layout: doc
title: Camada de Transporte de Dados
id: camada-transporte
order: 0
---

Cada ficha dentro do arquivo compactado representa um DadoTransport serializado, sendo necessário que a extensão da ficha esteja definida como ".esus".

O pacote que encapsula os dados transmissíveis, cada ficha deve conter as informações de indentificação deste cabeçalho, incluindo o dadoSerializado(conteúdo da ficha).

No caso do software de terceiro o campo remetente será igual ao originadora, que indica qual instalação gerou/enviou o dado.

## DadoTran

### \#1 uuidDadoSerializado

UUID do dado (identificador "universal" gerado na criação do registro)

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String |Sim |36 | 44 |

**Regras**: É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: [Wikipedia UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier)

### \#2 tipoDadoSerializado

Tipo/classe do objeto serializado


| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| Long |Sim |1 | 2 |

**Referência**: TipoDadoSerializado -> link

### \#3 cnesDadoSerializado

CNES da unidade de saúde

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| String | Sim | 7 | 7 |


### \#4 codIbge

Código IBGE do dado serializado


| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| String | Sim | 7 | 7 |

**Referência**: IBGE -> link

### \#5	ineDadoSerializado


INE da equipe que gerou a ficha	String

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| String | Opcional |	10|	10|

### \#6	numLote

Numero do lote para controle interno dos arquivos enviados

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional	|0	|	-	|

### \#7	dadoSerializado

Dado serializado a partir de um  de uma ficha

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Binary|	Sim | 	-|	-|

Observações: TBinary THRIFT

### \#8	remetente

Identifica a instalação que enviou o dado

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|DadoInstalacao| Sim|	-|	-|


**Referência**: Ver DadoInstalacao

### \#9	originadora

Identifica a instalação que cadastrou/digitou

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|DadoInstalacao|	Sim |	-|	-|

**Referência**: Ver DadoInstalacao

### \#10	versao

Identifica a versão do E-SUS AB	Versao

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
| Versão| Requerido	|-|	-|


**Referência**: Ver Versão

## DadoInstalacao


### \#1	contraChave

Identifica o software que gerou o dado(pec/cds, cdsOff ou software de terceiros)

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-	|

Exemplo:  <Nome do software do município> - Versão 2015 - 	-	Dados para identificar a instalação que cadastrou / gerou os dados e / ou enviou.

### \#2	uuidInstalacao

É um identificador da instalação do software que gerou o dado. Seja ele o e-SUS ou software de terceiro. Cada e-SUS possui um UUID

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

### \#3	cpfOuCnpj

Cpf do responsável ou CNPJ da empresa responsável

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	11|	15|

Observações: Apenas CPFs e CNPJs válidos.	Rever validação.

### \#4	nomeOuRazaoSocial

Nome do responsável ou Razão Social da empresa responsável

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Requerido|	-|	-|

### \#5	fone

Telefone da pessoa ou empresa responsável

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	10|	11|

### \#6	email

Email da pessoa ou empresa responsável

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	6|	255|

Requerido seguir o padrão "nome@domínio.extensão"	-
