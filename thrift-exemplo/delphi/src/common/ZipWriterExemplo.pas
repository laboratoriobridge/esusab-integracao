unit ZipWriterExemplo;

interface

uses
  System.Zip,
  br.gov.saude.esus.transport.common.generated.thrift,
  ThriftSerializer;

procedure gerarArquivoZip(dadoTransporte: IDadoTransporteThrift);

implementation

procedure gerarArquivoZip(dadoTransporte: IDadoTransporteThrift);
var
  zipFile: TZipFile;
  thriftSerializado: TArray<System.Byte>;

begin
  thriftSerializado := serializarThrift(dadoTransporte);
  zipFile := TZipFile.Create;
  try
    zipFile.Open('C:\temp\exemploConversaoThriftDelphi.zip', zmWrite);
    zipFile.Add(thriftSerializado, dadoTransporte.UuidDadoSerializado + '.esus13', zcDeflate);
  finally
    zipFile.Free;
  end
end;

end.
