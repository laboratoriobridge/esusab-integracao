#Exemplo Delphi

Este exemplo é um projeto delphi que demonstra como criar um arquivo .zip com fichas serializadas para importação no e-SUS AB.

##Passo 1
**1.**

Criar o objeto da ficha e populá-lo com as informações.
Para mais informações sobre as validações dos dados no sistema e-SUS AB consulte o [dicionário de dados](http://esusab.github.io/integracao/).

```
var
  fichaProcedimentos: IFichaProcedimentoMasterThrift;
  dadoTransporte: IDadoTransporteThrift;

begin
  fichaProcedimentos := TFichaProcedimentoMasterThriftImpl.Create;
  fichaProcedimentos.UuidFicha := generateRandomUUID(); // Utilizar uma função para gerar um UUID;
  fichaProcedimentos.TpCdsOrigem := 3;
  fichaProcedimentos.NumTotalAfericaoPa := 1;
  fichaProcedimentos.NumTotalGlicemiaCapilar := 1;
  fichaProcedimentos.NumTotalAfericaoTemperatura := 0;
  fichaProcedimentos.NumTotalMedicaoAltura := 1;
  fichaProcedimentos.NumTotalCurativoSimples := 1;
  fichaProcedimentos.NumTotalMedicaoPeso := 0;
  fichaProcedimentos.NumTotalColetaMaterialParaExameLaboratorial := 2;
  ...
```

**2.**

Popular o thrift com os dados dos atendimentos realizados.

```
  ...
  fichaProcedimentos.AtendProcedimentos := converterAtendimentos();
  ...
```
```
  function converterAtendimentos: IThriftList<IFichaProcedimentoChildThrift>;
  var
    procedimentosList: IThriftList<IFichaProcedimentoChildThrift>;
    atendimento: IFichaProcedimentoChildThrift;
    dataAtendimento: string;

  begin
    procedimentosList := TThriftListImpl<IFichaProcedimentoChildThrift>.Create;
    atendimento := TFichaProcedimentoChildThriftImpl.Create;

    atendimento.NumProntuario := '123421';
    atendimento.NumCartaoSus := '898001150797241';
    dataAtendimento := FloatToStr(EncodeDate(2000, 5, 2) * 86400);
    atendimento.DtNascimento := System.Int64.Parse(dataAtendimento);
    atendimento.Sexo := 1;
    atendimento.LocalAtendimento := 1;
    atendimento.Turno := 1;
    atendimento.Procedimentos := converterProcedimentos();

    procedimentosList.Add(atendimento);

    Result := procedimentosList;
  end;
```
```
  function converterProcedimentos: IThriftList<String>;
  var
    listaProcedimentos: IThriftList<String>;

  begin
    listaProcedimentos := TThriftListImpl<String>.Create;

    listaProcedimentos.Add('ABPG019');
    listaProcedimentos.Add('ABEX004');

    Result := listaProcedimentos;
  end;
```

**3.**

Popular o thrift com as informações dos profissionais, unidades, local e data relativos ao atendimento.
```
  function converterInformacoesAtendimento: IUnicaLotacaoHeaderThrift;
  var
    informacoesAtendimentoThrift: IUnicaLotacaoHeaderThrift;
    dataAtendimento: string;

  begin
    informacoesAtendimentoThrift := TUnicaLotacaoHeaderThriftImpl.Create;

    informacoesAtendimentoThrift.ProfissionalCNS := '898001160660761';
    informacoesAtendimentoThrift.CboCodigo_2002 := '223212';
    informacoesAtendimentoThrift.Cnes := '7381123';
    informacoesAtendimentoThrift.Ine := '0000406465';
    dataAtendimento := FloatToStr(EncodeDate(2014, 12, 2) * 86400);
    informacoesAtendimentoThrift.dataAtendimento := System.Int64.Parse(dataAtendimento);
    informacoesAtendimentoThrift.CodigoIbgeMunicipio := '4205407';

    Result := informacoesAtendimentoThrift;
  end;
```

##Passo 2

Depois de montar o objeto da ficha, você deve criar e popular o objeto de transporte.
```
  function preencherThriftTransporte(thriftAtendimento: IFichaProcedimentoMasterThrift): IDadoTransporteThrift;
  var
    thriftTransporte: IDadoTransporteThrift;

  begin
    thriftTransporte := TDadoTransporteThriftImpl.Create;
  ...
```

Este objeto funciona como um pacote onde parte das informações são a respeito da origem da ficha (CNES, IBGE e INE).

```
  ...
    thriftTransporte.UuidDadoSerializado := 'UUIDUNICO111';
    thriftTransporte.TipoDadoSerializado := 7;
    thriftTransporte.CnesDadoSerializado := '7381123';
    thriftTransporte.CodIbge := '4205407';
    thriftTransporte.IneDadoSerializado := '0000406465';
    thriftTransporte.NumLote := 1;
  ...
```
E parte sobre o software que a está enviando.
```
  ...
    thriftTransporte.Remetente := preencherDadoInstalacaoThrift();
    thriftTransporte.Originadora := preencherDadoInstalacaoThrift();
    thriftTransporte.Versao := preencherVersaoThrift();
  ...
```
```
  function preencherDadoInstalacaoThrift: IDadoInstalacaoThrift;
  var
    dadoInstalacaoThrift: IDadoInstalacaoThrift;
  begin
    dadoInstalacaoThrift := TDadoInstalacaoThriftImpl.Create;

    dadoInstalacaoThrift.ContraChave := 'rtbebg45b456b23451';
    dadoInstalacaoThrift.UuidInstalacao := 'UUID123456';
    dadoInstalacaoThrift.CpfOuCnpj := '11111111111';
    dadoInstalacaoThrift.NomeOuRazaoSocial := 'Nome ou Razão Social';
    dadoInstalacaoThrift.Fone := '48999999999';
    dadoInstalacaoThrift.Email := 'email@b.com';

    Result := dadoInstalacaoThrift;
  end;
```
```
  function preencherVersaoThrift: IVersaoThrift;
  var
    versaoThrift: IVersaoThrift;
  begin
    versaoThrift := TVersaoThriftImpl.Create;
    versaoThrift.Major := 2;
    versaoThrift.Minor := 0;
    versaoThrift.Revision := 0;

    Result := versaoThrift;
  end;
```

##Passo 3

Serializar o objeto da ficha utilizando o TBinaryProtocol da biblioteca thrift.

```
  ...
  thriftTransporte.dadoSerializado := serializarThrift(thriftAtendimento);
  ...
```

```
  function serializarThrift(thrift: IBase): TArray<System.Byte>;
  var
    thriftProtocol: IProtocol;
    thriftTransport: ITransport;
    thriftInputStream, thriftOutputStream: IThriftStream;
    systemStream: TStream;
    thriftSerializado: TArray<System.Byte>;

  begin
    systemStream := TMemoryStream.Create;
    thriftInputStream := TThriftStreamAdapterDelphi.Create(systemStream, false);
    thriftOutputStream := TThriftStreamAdapterDelphi.Create(systemStream, true);
    thriftTransport := TStreamTransportImpl.Create(thriftInputStream, thriftOutputStream);
    thriftProtocol := TBinaryProtocolImpl.Create(thriftTransport);
    thrift.Write(thriftProtocol);
    thriftSerializado := thriftOutputStream.ToArray;

    Result := thriftSerializado;
  end;
```

Esta classe encontra-se em /thrift-exemplo/delphi/src/common (ThriftSerializer.pas).

##Passo 4

Criar um zip em disco para inserir as fichas.

```
  ...
  gerarArquivoZip(dadoTransporte);
  ...
```

Serializar o objeto DadoTransporte utilizando o TBinaryProtocol da biblioteca thrift.
Dar um nome para o arquivo a ser inserido no zip (nesse caso usamos o UUID da ficha) sempre acrescentando a extensão ".esus" ao final.

```
  procedure gerarArquivoZip(dadoTransporte: IDadoTransporteThrift);
  var
    zipFile: TZipFile;
    thriftSerializado: TArray<System.Byte>;

  begin
    thriftSerializado := serializarThrift(dadoTransporte);
    zipFile := TZipFile.Create;
    try
      zipFile.Open('<caminho>\exemploConversaoThriftDelphi.zip', zmWrite);
      zipFile.Add(thriftSerializado, dadoTransporte.UuidDadoSerializado + '.esus13', zcDeflate);
    finally
      zipFile.Free;
    end
  end;
```

Esta classe encontra-se em /thrift-exemplo/delphi/src/common (ZipWriterExemplo.pas).
