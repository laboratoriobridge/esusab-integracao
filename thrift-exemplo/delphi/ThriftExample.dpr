program ThriftExample;

{$APPTYPE CONSOLE}
{$R *.res}

uses
  System.SysUtils,
  System.Classes,
  br.gov.saude.esus.cds.transport.generated.thrift.common
    in 'src\thriftesus\br.gov.saude.esus.cds.transport.generated.thrift.common.pas',
  br.gov.saude.esus.cds.transport.generated.thrift.procedimento
    in 'src\thriftesus\br.gov.saude.esus.cds.transport.generated.thrift.procedimento.pas',
  br.gov.saude.esus.transport.common.api.configuracaodestino
    in 'src\thriftesus\br.gov.saude.esus.transport.common.api.configuracaodestino.pas',
  br.gov.saude.esus.transport.common.generated.thrift
    in 'src\thriftesus\br.gov.saude.esus.transport.common.generated.thrift.pas',

  thrift.Collections in 'src\thriftutils\Thrift.Collections.pas',

  ZipWriterExemplo in 'src\common\ZipWriterExemplo.pas',
  ThriftSerializer in 'src\common\ThriftSerializer.pas';

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
  versaoThrift.Major := 2;
  versaoThrift.Minor := 0;
  versaoThrift.Revision := 0;

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
