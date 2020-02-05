program ThriftExample;

{$APPTYPE CONSOLE}
{$R *.res}

uses
  System.SysUtils,
  System.Classes,
  ZipWriterExemplo in 'src\common\ZipWriterExemplo.pas',
  ThriftSerializer in 'src\common\ThriftSerializer.pas',
  br.gov.saude.esusab.ras.atenddomiciliar in 'src\thriftesus\br.gov.saude.esusab.ras.atenddomiciliar.pas',
  br.gov.saude.esusab.ras.atendindividual in 'src\thriftesus\br.gov.saude.esusab.ras.atendindividual.pas',
  br.gov.saude.esusab.ras.atendodonto in 'src\thriftesus\br.gov.saude.esusab.ras.atendodonto.pas',
  br.gov.saude.esusab.ras.atendprocedimentos in 'src\thriftesus\br.gov.saude.esusab.ras.atendprocedimentos.pas',
  br.gov.saude.esusab.ras.atividadecoletiva in 'src\thriftesus\br.gov.saude.esusab.ras.atividadecoletiva.pas',
  br.gov.saude.esusab.ras.avaliacaoelegibilidade in 'src\thriftesus\br.gov.saude.esusab.ras.avaliacaoelegibilidade.pas',
  br.gov.saude.esusab.ras.cadastrodomiciliar in 'src\thriftesus\br.gov.saude.esusab.ras.cadastrodomiciliar.pas',
  br.gov.saude.esusab.ras.cadastroindividual in 'src\thriftesus\br.gov.saude.esusab.ras.cadastroindividual.pas',
  br.gov.saude.esusab.ras.common in 'src\thriftesus\br.gov.saude.esusab.ras.common.pas',
  br.gov.saude.esusab.ras.complementarzika in 'src\thriftesus\br.gov.saude.esusab.ras.complementarzika.pas',
  br.gov.saude.esusab.ras.consumoalimentar in 'src\thriftesus\br.gov.saude.esusab.ras.consumoalimentar.pas',
  br.gov.saude.esusab.ras.vacinacao in 'src\thriftesus\br.gov.saude.esusab.ras.vacinacao.pas',
  br.gov.saude.esusab.ras.visitadomiciliar in 'src\thriftesus\br.gov.saude.esusab.ras.visitadomiciliar.pas',
  br.gov.saude.esusab.dadotransp in 'src\thriftesus\br.gov.saude.esusab.dadotransp.pas',
  Thrift.Collections in 'src\thriftutils\Thrift.Collections.pas',
  Thrift.Configuration in 'src\thriftutils\Thrift.Configuration.pas',
  Thrift.Console in 'src\thriftutils\Thrift.Console.pas',
  Thrift.Exception in 'src\thriftutils\Thrift.Exception.pas',
  Thrift in 'src\thriftutils\Thrift.pas',
  Thrift.Processor.Multiplex in 'src\thriftutils\Thrift.Processor.Multiplex.pas',
  Thrift.Protocol.Compact in 'src\thriftutils\Thrift.Protocol.Compact.pas',
  Thrift.Protocol.JSON in 'src\thriftutils\Thrift.Protocol.JSON.pas',
  Thrift.Protocol.Multiplex in 'src\thriftutils\Thrift.Protocol.Multiplex.pas',
  Thrift.Protocol in 'src\thriftutils\Thrift.Protocol.pas',
  Thrift.Serializer in 'src\thriftutils\Thrift.Serializer.pas',
  Thrift.Server in 'src\thriftutils\Thrift.Server.pas',
  Thrift.Socket in 'src\thriftutils\Thrift.Socket.pas',
  Thrift.Stream in 'src\thriftutils\Thrift.Stream.pas',
  Thrift.TypeRegistry in 'src\thriftutils\Thrift.TypeRegistry.pas',
  Thrift.Utils in 'src\thriftutils\Thrift.Utils.pas',
  Thrift.WinHTTP in 'src\thriftutils\Thrift.WinHTTP.pas',
  Thrift.Transport in 'src\thriftutils\Thrift.Transport.pas';

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

function converterProcedimentos: IThriftList<String>;
var
  listaProcedimentos: IThriftList<String>;

begin
  listaProcedimentos := TThriftListImpl<String>.Create;

  listaProcedimentos.Add('ABPG019');
  listaProcedimentos.Add('ABEX004');

  Result := listaProcedimentos;
end;

function converterAtendimentos: IThriftList<IFichaProcedimentoChildThrift>;
var
  procedimentosList: IThriftList<IFichaProcedimentoChildThrift>;
  atendimento: IFichaProcedimentoChildThrift;
  dataAtendimento: string;

begin
  procedimentosList := TThriftListImpl<IFichaProcedimentoChildThrift>.Create;
  atendimento := TFichaProcedimentoChildThriftImpl.Create;

  atendimento.NumProntuario := '123421';
  atendimento.CpfCidadao := '25573455982';
  dataAtendimento := FloatToStr(EncodeDate(2019, 5, 2) * 86400);
  atendimento.DtNascimento := System.Int64.Parse(dataAtendimento);
  atendimento.Sexo := 1;
  atendimento.LocalAtendimento := 1;
  atendimento.Turno := 1;
  atendimento.Procedimentos := converterProcedimentos();

  procedimentosList.Add(atendimento);

  Result := procedimentosList;
end;

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
  dadoInstalacaoThrift.Email := 'a@b.com';

  Result := dadoInstalacaoThrift;
end;

function preencherVersaoThrift: IVersaoThrift;
var
  versaoThrift: IVersaoThrift;
begin
  versaoThrift := TVersaoThriftImpl.Create;
  versaoThrift.Major := 3;
  versaoThrift.Minor := 2;
  versaoThrift.Revision := 4;

  Result := versaoThrift;
end;

function preencherThriftTransporte(thriftAtendimento: IFichaProcedimentoMasterThrift): IDadoTransporteThrift;
var
  thriftTransporte: IDadoTransporteThrift;

begin
  thriftTransporte := TDadoTransporteThriftImpl.Create;

  thriftTransporte.UuidDadoSerializado := 'UUIDUNICO111';
  thriftTransporte.TipoDadoSerializado := 7;
  thriftTransporte.CnesDadoSerializado := '7381123';
  thriftTransporte.CodIbge := '4205407';
  thriftTransporte.IneDadoSerializado := '0000406465';
  thriftTransporte.NumLote := 1;
  thriftTransporte.Remetente := preencherDadoInstalacaoThrift();
  thriftTransporte.Originadora := preencherDadoInstalacaoThrift();
  thriftTransporte.Versao := preencherVersaoThrift();

  thriftTransporte.dadoSerializado := serializarThrift(thriftAtendimento);

  Result := thriftTransporte;
end;

// Conversão de um atendimento para o Thrift;
var
  fichaProcedimentos: IFichaProcedimentoMasterThrift;
  dadoTransporte: IDadoTransporteThrift;

begin
  fichaProcedimentos := TFichaProcedimentoMasterThriftImpl.Create;
  fichaProcedimentos.UuidFicha := '1';
  fichaProcedimentos.TpCdsOrigem := 3;
  fichaProcedimentos.HeaderTransport := converterInformacoesAtendimento();
  fichaProcedimentos.AtendProcedimentos := converterAtendimentos();
  fichaProcedimentos.NumTotalAfericaoPa := 1;
  fichaProcedimentos.NumTotalGlicemiaCapilar := 1;
  fichaProcedimentos.NumTotalAfericaoTemperatura := 0;
  fichaProcedimentos.NumTotalMedicaoAltura := 1;
  fichaProcedimentos.NumTotalCurativoSimples := 1;
  fichaProcedimentos.NumTotalMedicaoPeso := 0;
  fichaProcedimentos.NumTotalColetaMaterialParaExameLaboratorial := 2;

  dadoTransporte := preencherThriftTransporte(fichaProcedimentos);

  gerarArquivoZip(dadoTransporte);

end.
