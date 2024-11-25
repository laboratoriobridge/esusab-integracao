# Exemplo Java

Este exemplo é um projeto maven que demonstra como serializar fichas thrift(1) e enviar via API(2) ou gerar um arquivo zip(3).


## (1) Serializar fichas thrift

A classe [ExemploFichaProcedimentoThrift.java](../java/src/main/java/exemplo/ExemploFichaProcedimentoThrift.java) é um exemplo de como criar um objeto de ficha e serializá-lo.
Para mais informações sobre as validações dos dados no sistema e-SUS AB consulte o [dicionário de dados](https://integracao.esusab.ufsc.br/).


## (2) Enviar via API

A classe [ExemploEnvioApi.java](../java/src/main/java/exemplo/api/ExemploEnvioApi.java) é um exemplo de como enviar uma ficha via API.


## (3) Gerar um arquivo zip

A classe [ExemploGeracaoZip.java](../java/src/main/java/exemplo/zip/ExemploGeracaoZip.java) é um exemplo de como gerar um arquivo zip com fichas serializadas para importação no e-SUS AB.
