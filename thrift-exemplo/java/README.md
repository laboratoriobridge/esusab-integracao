#Exemplo Java

Este exemplo é um projeto maven que demonstra como criar um arquivo .zip com fichas serializadas para importação no e-SUS AB.

##Passo 1

Criar o objeto da ficha e populá-lo com as informações.
Para mais informações sobre as validações dos dados no sistema e-SUS AB consulte o [dicionário de dados](http://esusab.github.io/integracao/).

```java
FichaProcedimentoMasterThrift thriftProcedimentos = new FichaProcedimentoMasterThrift();
String uuidFicha = UUID.randomUUID().toString();
thriftProcedimentos.setUuidFicha(uuidFicha);
thriftProcedimentos.setNumTotalAfericaoPa(1);
thriftProcedimentos.setNumTotalAfericaoTemperatura(1);
//... 
```

##Passo 2

Depois de montar o objeto da ficha, você deve criar e popular o objeto de transporte.

```java
DadoTransporteThrift dadoTransporteThrift = new DadoTransporteThrift();
```

Este objeto funciona como um pacote, onde parte das informações são a respeito da origem da ficha (CNES, IBGE e INE).

```java
dadoTransporteThrift.setUuidDadoSerializado(thriftProcedimentos.getUuidFicha());
dadoTransporteThrift.setIneDadoSerializado(thriftProcedimentos.getHeaderTransport().getIne());
dadoTransporteThrift.setCodIbge(thriftProcedimentos.getHeaderTransport().getCodigoIbgeMunicipio());
dadoTransporteThrift.setCnesDadoSerializado(thriftProcedimentos.getHeaderTransport().getCnes());
```

E parte sobre o software que a está enviando.

```java
DadoInstalacaoThrift originadoraRemetente = new DadoInstalacaoThrift();
originadoraRemetente.setContraChave("123456");
originadoraRemetente.setCpfOuCnpj("11111111111");
originadoraRemetente.setEmail("a@b.com");
originadoraRemetente.setFone("999999999");
originadoraRemetente.setNomeOuRazaoSocial("Nome ou Razao Social Originadora e Remetente");
originadoraRemetente.setUuidInstalacao("UUIDUNICO111");

dadoTransporteThrift.setOriginadora(originadoraRemetente);
dadoTransporteThrift.setRemetente(originadoraRemetente);
```

##Passo 3

Serializar o objeto da ficha utilizando o TBinaryProtocol da biblioteca thrift.

```java
ByteArrayOutputStream baos = new ByteArrayOutputStream();
TIOStreamTransport transport = new TIOStreamTransport(baos);
TBinaryProtocol protocol = new TBinaryProtocol(transport);
thriftProcedimentos.write(protocol);

byte[] thriftProcedimentosSerializado = baos.toByteArray();
```

##Passo 4

Informar o tipo da ficha, a ficha serializada e a versão no DadoTransporte.

```java
dadoTransporteThrift.setTipoDadoSerializado(7L); // 7 é o tipo da Ficha de Procedimentos, usada nesse exemplo.
dadoTransporteThrift.setDadoSerializado(thriftProcedimentosSerializado);
VersaoThrift versaoThrift = new VersaoThrift(2, 0, 0); // versão da ficha a ser exportada (não é a versão do e-SUS AB)
dadoTransporteThrift.setVersao(versaoThrift);
```

##Passo 5

Criar um zip em disco para inserir as fichas.

```java
File zipFile = new File(System.getProperty("user.home") + "/exemploConversaoThrift.zip");
ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
```

##Passo 6

Dar um nome para o arquivo a ser inserido no zip (nesse caso usamos o UUID da ficha) sempre acrescentando a extensão ".esus" ao final

```java
String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
```

##Passo 7

Adicionar uma nova entrada (novo arquivo) dentro do zip com o nome definido

```java
outputStream.putNextEntry(new ZipEntry(entryName));
```

##Passo 8

Serializar o objeto DadoTransporte utilizando o TBinaryProtocol da biblioteca thrift

```java
ByteArrayOutputStream baos = new ByteArrayOutputStream();
TIOStreamTransport transport = new TIOStreamTransport(baos);
TBinaryProtocol protocol = new TBinaryProtocol(transport);
dadoTransporteThrift.write(protocol);

byte[] dadoTransporteSerializado = baos.toByteArray();
```

##Passo 9

Escrever o dadoTransporteSerializado no arquivo zip.

```java
outputStream.write(dadoTransporteSerializado);
```

Para adicionar mais fichas no mesmo zip, repetir os passos 6, 7, 8 e 9 com as demais fichas.

##Passo 10

Finalizar o arquivo zip.

```java
outputStream.close();
```
