unit ThriftSerializer;

interface

uses
  System.SysUtils,
  System.Classes,
  br.gov.saude.esus.transport.common.generated.thrift,
  thrift.Serializer,
  Thrift,
  Thrift.Protocol,
  Thrift.Stream,
  Thrift.Utils,
  Thrift.transport;

function serializarThrift(thrift: IBase): TArray<System.Byte>;

implementation

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

end.
