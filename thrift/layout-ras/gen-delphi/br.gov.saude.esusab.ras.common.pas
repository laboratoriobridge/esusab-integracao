(**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *)

unit br.gov.saude.esusab.ras.common;

interface

uses
  Classes,
  SysUtils,
  Generics.Collections,
  Thrift,
  Thrift.Utils,
  Thrift.Collections,
  Thrift.Protocol,
  Thrift.Transport,
  br.gov.saude.esusab.ras.common;

const
  cbr_gov_saude_esusab_ras_common_Option_AnsiStr_Binary = False;
  cbr_gov_saude_esusab_ras_common_Option_Register_Types = False;
  cbr_gov_saude_esusab_ras_common_Option_ConstPrefix    = False;
  cbr_gov_saude_esusab_ras_common_Option_Events         = False;
  cbr_gov_saude_esusab_ras_common_Option_XmlDoc         = False;

type
  ICuidadoCompartilhadoThrift = interface;

  ICuidadoCompartilhadoThrift = interface(IBase)
    function GetUuidEvolucao: string;
    procedure SetUuidEvolucao( const Value: string);
    function GetLotacaoEvolucao: ILotacaoThrift;
    procedure SetLotacaoEvolucao( const Value: ILotacaoThrift);
    function GetDataEvolucao: Int64;
    procedure SetDataEvolucao( const Value: Int64);
    function GetDataEvolucaoAnterior: Int64;
    procedure SetDataEvolucaoAnterior( const Value: Int64);
    function GetCoSequencialEvolucao: Integer;
    procedure SetCoSequencialEvolucao( const Value: Integer);
    function GetCondutaEvolucao: Int64;
    procedure SetCondutaEvolucao( const Value: Int64);
    function GetTpCdsOrigem: Integer;
    procedure SetTpCdsOrigem( const Value: Integer);
    function GetCnsCidadao: string;
    procedure SetCnsCidadao( const Value: string);
    function GetCpfCidadao: string;
    procedure SetCpfCidadao( const Value: string);
    function GetSexoCidadao: Int64;
    procedure SetSexoCidadao( const Value: Int64);
    function GetDataNascimentoCidadao: string;
    procedure SetDataNascimentoCidadao( const Value: string);
    function GetUuidCuidadoCompartilhado: string;
    procedure SetUuidCuidadoCompartilhado( const Value: string);
    function GetSolicitante: ILotacaoThrift;
    procedure SetSolicitante( const Value: ILotacaoThrift);
    function GetExecutante: ILotacaoThrift;
    procedure SetExecutante( const Value: ILotacaoThrift);
    function GetDataCriacaoCuidado: Int64;
    procedure SetDataCriacaoCuidado( const Value: Int64);
    function GetCid10: string;
    procedure SetCid10( const Value: string);
    function GetCiap: string;
    procedure SetCiap( const Value: string);
    function GetUuidFichaOrigem: string;
    procedure SetUuidFichaOrigem( const Value: string);
    function GetTpDadoTranspFichaOrigem: Integer;
    procedure SetTpDadoTranspFichaOrigem( const Value: Integer);
    function GetPrioridadeCuidado: Integer;
    procedure SetPrioridadeCuidado( const Value: Integer);
    function GetReclassificacaoPrioridadeCuidado: Integer;
    procedure SetReclassificacaoPrioridadeCuidado( const Value: Integer);

    property UuidEvolucao: string read GetUuidEvolucao write SetUuidEvolucao;
    property LotacaoEvolucao: ILotacaoThrift read GetLotacaoEvolucao write SetLotacaoEvolucao;
    property DataEvolucao: Int64 read GetDataEvolucao write SetDataEvolucao;
    property DataEvolucaoAnterior: Int64 read GetDataEvolucaoAnterior write SetDataEvolucaoAnterior;
    property CoSequencialEvolucao: Integer read GetCoSequencialEvolucao write SetCoSequencialEvolucao;
    property CondutaEvolucao: Int64 read GetCondutaEvolucao write SetCondutaEvolucao;
    property TpCdsOrigem: Integer read GetTpCdsOrigem write SetTpCdsOrigem;
    property CnsCidadao: string read GetCnsCidadao write SetCnsCidadao;
    property CpfCidadao: string read GetCpfCidadao write SetCpfCidadao;
    property SexoCidadao: Int64 read GetSexoCidadao write SetSexoCidadao;
    property DataNascimentoCidadao: string read GetDataNascimentoCidadao write SetDataNascimentoCidadao;
    property UuidCuidadoCompartilhado: string read GetUuidCuidadoCompartilhado write SetUuidCuidadoCompartilhado;
    property Solicitante: ILotacaoThrift read GetSolicitante write SetSolicitante;
    property Executante: ILotacaoThrift read GetExecutante write SetExecutante;
    property DataCriacaoCuidado: Int64 read GetDataCriacaoCuidado write SetDataCriacaoCuidado;
    property Cid10: string read GetCid10 write SetCid10;
    property Ciap: string read GetCiap write SetCiap;
    property UuidFichaOrigem: string read GetUuidFichaOrigem write SetUuidFichaOrigem;
    property TpDadoTranspFichaOrigem: Integer read GetTpDadoTranspFichaOrigem write SetTpDadoTranspFichaOrigem;
    property PrioridadeCuidado: Integer read GetPrioridadeCuidado write SetPrioridadeCuidado;
    property ReclassificacaoPrioridadeCuidado: Integer read GetReclassificacaoPrioridadeCuidado write SetReclassificacaoPrioridadeCuidado;

    function Get__isset_LotacaoEvolucao: Boolean;
    function Get__isset_DataEvolucao: Boolean;
    function Get__isset_DataEvolucaoAnterior: Boolean;
    function Get__isset_CoSequencialEvolucao: Boolean;
    function Get__isset_CondutaEvolucao: Boolean;
    function Get__isset_TpCdsOrigem: Boolean;
    function Get__isset_CnsCidadao: Boolean;
    function Get__isset_CpfCidadao: Boolean;
    function Get__isset_SexoCidadao: Boolean;
    function Get__isset_DataNascimentoCidadao: Boolean;
    function Get__isset_Solicitante: Boolean;
    function Get__isset_Executante: Boolean;
    function Get__isset_DataCriacaoCuidado: Boolean;
    function Get__isset_Cid10: Boolean;
    function Get__isset_Ciap: Boolean;
    function Get__isset_UuidFichaOrigem: Boolean;
    function Get__isset_TpDadoTranspFichaOrigem: Boolean;
    function Get__isset_PrioridadeCuidado: Boolean;
    function Get__isset_ReclassificacaoPrioridadeCuidado: Boolean;

    property __isset_LotacaoEvolucao: Boolean read Get__isset_LotacaoEvolucao;
    property __isset_DataEvolucao: Boolean read Get__isset_DataEvolucao;
    property __isset_DataEvolucaoAnterior: Boolean read Get__isset_DataEvolucaoAnterior;
    property __isset_CoSequencialEvolucao: Boolean read Get__isset_CoSequencialEvolucao;
    property __isset_CondutaEvolucao: Boolean read Get__isset_CondutaEvolucao;
    property __isset_TpCdsOrigem: Boolean read Get__isset_TpCdsOrigem;
    property __isset_CnsCidadao: Boolean read Get__isset_CnsCidadao;
    property __isset_CpfCidadao: Boolean read Get__isset_CpfCidadao;
    property __isset_SexoCidadao: Boolean read Get__isset_SexoCidadao;
    property __isset_DataNascimentoCidadao: Boolean read Get__isset_DataNascimentoCidadao;
    property __isset_Solicitante: Boolean read Get__isset_Solicitante;
    property __isset_Executante: Boolean read Get__isset_Executante;
    property __isset_DataCriacaoCuidado: Boolean read Get__isset_DataCriacaoCuidado;
    property __isset_Cid10: Boolean read Get__isset_Cid10;
    property __isset_Ciap: Boolean read Get__isset_Ciap;
    property __isset_UuidFichaOrigem: Boolean read Get__isset_UuidFichaOrigem;
    property __isset_TpDadoTranspFichaOrigem: Boolean read Get__isset_TpDadoTranspFichaOrigem;
    property __isset_PrioridadeCuidado: Boolean read Get__isset_PrioridadeCuidado;
    property __isset_ReclassificacaoPrioridadeCuidado: Boolean read Get__isset_ReclassificacaoPrioridadeCuidado;
  end;

  TCuidadoCompartilhadoThriftImpl = class(TInterfacedObject, IBase, ICuidadoCompartilhadoThrift)
  private
    FUuidEvolucao: string;
    FLotacaoEvolucao: ILotacaoThrift;
    FDataEvolucao: Int64;
    FDataEvolucaoAnterior: Int64;
    FCoSequencialEvolucao: Integer;
    FCondutaEvolucao: Int64;
    FTpCdsOrigem: Integer;
    FCnsCidadao: string;
    FCpfCidadao: string;
    FSexoCidadao: Int64;
    FDataNascimentoCidadao: string;
    FUuidCuidadoCompartilhado: string;
    FSolicitante: ILotacaoThrift;
    FExecutante: ILotacaoThrift;
    FDataCriacaoCuidado: Int64;
    FCid10: string;
    FCiap: string;
    FUuidFichaOrigem: string;
    FTpDadoTranspFichaOrigem: Integer;
    FPrioridadeCuidado: Integer;
    FReclassificacaoPrioridadeCuidado: Integer;
    
    F__isset_LotacaoEvolucao: Boolean;
    F__isset_DataEvolucao: Boolean;
    F__isset_DataEvolucaoAnterior: Boolean;
    F__isset_CoSequencialEvolucao: Boolean;
    F__isset_CondutaEvolucao: Boolean;
    F__isset_TpCdsOrigem: Boolean;
    F__isset_CnsCidadao: Boolean;
    F__isset_CpfCidadao: Boolean;
    F__isset_SexoCidadao: Boolean;
    F__isset_DataNascimentoCidadao: Boolean;
    F__isset_Solicitante: Boolean;
    F__isset_Executante: Boolean;
    F__isset_DataCriacaoCuidado: Boolean;
    F__isset_Cid10: Boolean;
    F__isset_Ciap: Boolean;
    F__isset_UuidFichaOrigem: Boolean;
    F__isset_TpDadoTranspFichaOrigem: Boolean;
    F__isset_PrioridadeCuidado: Boolean;
    F__isset_ReclassificacaoPrioridadeCuidado: Boolean;
    
    function GetUuidEvolucao: string;
    procedure SetUuidEvolucao( const Value: string);
    function GetLotacaoEvolucao: ILotacaoThrift;
    procedure SetLotacaoEvolucao( const Value: ILotacaoThrift);
    function GetDataEvolucao: Int64;
    procedure SetDataEvolucao( const Value: Int64);
    function GetDataEvolucaoAnterior: Int64;
    procedure SetDataEvolucaoAnterior( const Value: Int64);
    function GetCoSequencialEvolucao: Integer;
    procedure SetCoSequencialEvolucao( const Value: Integer);
    function GetCondutaEvolucao: Int64;
    procedure SetCondutaEvolucao( const Value: Int64);
    function GetTpCdsOrigem: Integer;
    procedure SetTpCdsOrigem( const Value: Integer);
    function GetCnsCidadao: string;
    procedure SetCnsCidadao( const Value: string);
    function GetCpfCidadao: string;
    procedure SetCpfCidadao( const Value: string);
    function GetSexoCidadao: Int64;
    procedure SetSexoCidadao( const Value: Int64);
    function GetDataNascimentoCidadao: string;
    procedure SetDataNascimentoCidadao( const Value: string);
    function GetUuidCuidadoCompartilhado: string;
    procedure SetUuidCuidadoCompartilhado( const Value: string);
    function GetSolicitante: ILotacaoThrift;
    procedure SetSolicitante( const Value: ILotacaoThrift);
    function GetExecutante: ILotacaoThrift;
    procedure SetExecutante( const Value: ILotacaoThrift);
    function GetDataCriacaoCuidado: Int64;
    procedure SetDataCriacaoCuidado( const Value: Int64);
    function GetCid10: string;
    procedure SetCid10( const Value: string);
    function GetCiap: string;
    procedure SetCiap( const Value: string);
    function GetUuidFichaOrigem: string;
    procedure SetUuidFichaOrigem( const Value: string);
    function GetTpDadoTranspFichaOrigem: Integer;
    procedure SetTpDadoTranspFichaOrigem( const Value: Integer);
    function GetPrioridadeCuidado: Integer;
    procedure SetPrioridadeCuidado( const Value: Integer);
    function GetReclassificacaoPrioridadeCuidado: Integer;
    procedure SetReclassificacaoPrioridadeCuidado( const Value: Integer);

    function Get__isset_LotacaoEvolucao: Boolean;
    function Get__isset_DataEvolucao: Boolean;
    function Get__isset_DataEvolucaoAnterior: Boolean;
    function Get__isset_CoSequencialEvolucao: Boolean;
    function Get__isset_CondutaEvolucao: Boolean;
    function Get__isset_TpCdsOrigem: Boolean;
    function Get__isset_CnsCidadao: Boolean;
    function Get__isset_CpfCidadao: Boolean;
    function Get__isset_SexoCidadao: Boolean;
    function Get__isset_DataNascimentoCidadao: Boolean;
    function Get__isset_Solicitante: Boolean;
    function Get__isset_Executante: Boolean;
    function Get__isset_DataCriacaoCuidado: Boolean;
    function Get__isset_Cid10: Boolean;
    function Get__isset_Ciap: Boolean;
    function Get__isset_UuidFichaOrigem: Boolean;
    function Get__isset_TpDadoTranspFichaOrigem: Boolean;
    function Get__isset_PrioridadeCuidado: Boolean;
    function Get__isset_ReclassificacaoPrioridadeCuidado: Boolean;
  public
    constructor Create;
    destructor Destroy; override;

    function ToString: string; override;

    // IBase
    procedure Read( const iprot: IProtocol);
    procedure Write( const oprot: IProtocol);

    // Properties
    property UuidEvolucao: string read GetUuidEvolucao write SetUuidEvolucao;
    property LotacaoEvolucao: ILotacaoThrift read GetLotacaoEvolucao write SetLotacaoEvolucao;
    property DataEvolucao: Int64 read GetDataEvolucao write SetDataEvolucao;
    property DataEvolucaoAnterior: Int64 read GetDataEvolucaoAnterior write SetDataEvolucaoAnterior;
    property CoSequencialEvolucao: Integer read GetCoSequencialEvolucao write SetCoSequencialEvolucao;
    property CondutaEvolucao: Int64 read GetCondutaEvolucao write SetCondutaEvolucao;
    property TpCdsOrigem: Integer read GetTpCdsOrigem write SetTpCdsOrigem;
    property CnsCidadao: string read GetCnsCidadao write SetCnsCidadao;
    property CpfCidadao: string read GetCpfCidadao write SetCpfCidadao;
    property SexoCidadao: Int64 read GetSexoCidadao write SetSexoCidadao;
    property DataNascimentoCidadao: string read GetDataNascimentoCidadao write SetDataNascimentoCidadao;
    property UuidCuidadoCompartilhado: string read GetUuidCuidadoCompartilhado write SetUuidCuidadoCompartilhado;
    property Solicitante: ILotacaoThrift read GetSolicitante write SetSolicitante;
    property Executante: ILotacaoThrift read GetExecutante write SetExecutante;
    property DataCriacaoCuidado: Int64 read GetDataCriacaoCuidado write SetDataCriacaoCuidado;
    property Cid10: string read GetCid10 write SetCid10;
    property Ciap: string read GetCiap write SetCiap;
    property UuidFichaOrigem: string read GetUuidFichaOrigem write SetUuidFichaOrigem;
    property TpDadoTranspFichaOrigem: Integer read GetTpDadoTranspFichaOrigem write SetTpDadoTranspFichaOrigem;
    property PrioridadeCuidado: Integer read GetPrioridadeCuidado write SetPrioridadeCuidado;
    property ReclassificacaoPrioridadeCuidado: Integer read GetReclassificacaoPrioridadeCuidado write SetReclassificacaoPrioridadeCuidado;

    // isset
    property __isset_LotacaoEvolucao: Boolean read Get__isset_LotacaoEvolucao;
    property __isset_DataEvolucao: Boolean read Get__isset_DataEvolucao;
    property __isset_DataEvolucaoAnterior: Boolean read Get__isset_DataEvolucaoAnterior;
    property __isset_CoSequencialEvolucao: Boolean read Get__isset_CoSequencialEvolucao;
    property __isset_CondutaEvolucao: Boolean read Get__isset_CondutaEvolucao;
    property __isset_TpCdsOrigem: Boolean read Get__isset_TpCdsOrigem;
    property __isset_CnsCidadao: Boolean read Get__isset_CnsCidadao;
    property __isset_CpfCidadao: Boolean read Get__isset_CpfCidadao;
    property __isset_SexoCidadao: Boolean read Get__isset_SexoCidadao;
    property __isset_DataNascimentoCidadao: Boolean read Get__isset_DataNascimentoCidadao;
    property __isset_Solicitante: Boolean read Get__isset_Solicitante;
    property __isset_Executante: Boolean read Get__isset_Executante;
    property __isset_DataCriacaoCuidado: Boolean read Get__isset_DataCriacaoCuidado;
    property __isset_Cid10: Boolean read Get__isset_Cid10;
    property __isset_Ciap: Boolean read Get__isset_Ciap;
    property __isset_UuidFichaOrigem: Boolean read Get__isset_UuidFichaOrigem;
    property __isset_TpDadoTranspFichaOrigem: Boolean read Get__isset_TpDadoTranspFichaOrigem;
    property __isset_PrioridadeCuidado: Boolean read Get__isset_PrioridadeCuidado;
    property __isset_ReclassificacaoPrioridadeCuidado: Boolean read Get__isset_ReclassificacaoPrioridadeCuidado;
  end;

implementation

constructor TCuidadoCompartilhadoThriftImpl.Create;
begin
  inherited;
end;

destructor TCuidadoCompartilhadoThriftImpl.Destroy;
begin
  inherited;
end;

function TCuidadoCompartilhadoThriftImpl.GetUuidEvolucao: string;
begin
  Result := FUuidEvolucao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetUuidEvolucao( const Value: string);
begin
  FUuidEvolucao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.GetLotacaoEvolucao: ILotacaoThrift;
begin
  Result := FLotacaoEvolucao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetLotacaoEvolucao( const Value: ILotacaoThrift);
begin
  F__isset_LotacaoEvolucao := True;
  FLotacaoEvolucao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_LotacaoEvolucao: Boolean;
begin
  Result := F__isset_LotacaoEvolucao;
end;

function TCuidadoCompartilhadoThriftImpl.GetDataEvolucao: Int64;
begin
  Result := FDataEvolucao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetDataEvolucao( const Value: Int64);
begin
  F__isset_DataEvolucao := True;
  FDataEvolucao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_DataEvolucao: Boolean;
begin
  Result := F__isset_DataEvolucao;
end;

function TCuidadoCompartilhadoThriftImpl.GetDataEvolucaoAnterior: Int64;
begin
  Result := FDataEvolucaoAnterior;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetDataEvolucaoAnterior( const Value: Int64);
begin
  F__isset_DataEvolucaoAnterior := True;
  FDataEvolucaoAnterior := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_DataEvolucaoAnterior: Boolean;
begin
  Result := F__isset_DataEvolucaoAnterior;
end;

function TCuidadoCompartilhadoThriftImpl.GetCoSequencialEvolucao: Integer;
begin
  Result := FCoSequencialEvolucao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCoSequencialEvolucao( const Value: Integer);
begin
  F__isset_CoSequencialEvolucao := True;
  FCoSequencialEvolucao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_CoSequencialEvolucao: Boolean;
begin
  Result := F__isset_CoSequencialEvolucao;
end;

function TCuidadoCompartilhadoThriftImpl.GetCondutaEvolucao: Int64;
begin
  Result := FCondutaEvolucao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCondutaEvolucao( const Value: Int64);
begin
  F__isset_CondutaEvolucao := True;
  FCondutaEvolucao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_CondutaEvolucao: Boolean;
begin
  Result := F__isset_CondutaEvolucao;
end;

function TCuidadoCompartilhadoThriftImpl.GetTpCdsOrigem: Integer;
begin
  Result := FTpCdsOrigem;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetTpCdsOrigem( const Value: Integer);
begin
  F__isset_TpCdsOrigem := True;
  FTpCdsOrigem := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_TpCdsOrigem: Boolean;
begin
  Result := F__isset_TpCdsOrigem;
end;

function TCuidadoCompartilhadoThriftImpl.GetCnsCidadao: string;
begin
  Result := FCnsCidadao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCnsCidadao( const Value: string);
begin
  F__isset_CnsCidadao := True;
  FCnsCidadao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_CnsCidadao: Boolean;
begin
  Result := F__isset_CnsCidadao;
end;

function TCuidadoCompartilhadoThriftImpl.GetCpfCidadao: string;
begin
  Result := FCpfCidadao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCpfCidadao( const Value: string);
begin
  F__isset_CpfCidadao := True;
  FCpfCidadao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_CpfCidadao: Boolean;
begin
  Result := F__isset_CpfCidadao;
end;

function TCuidadoCompartilhadoThriftImpl.GetSexoCidadao: Int64;
begin
  Result := FSexoCidadao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetSexoCidadao( const Value: Int64);
begin
  F__isset_SexoCidadao := True;
  FSexoCidadao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_SexoCidadao: Boolean;
begin
  Result := F__isset_SexoCidadao;
end;

function TCuidadoCompartilhadoThriftImpl.GetDataNascimentoCidadao: string;
begin
  Result := FDataNascimentoCidadao;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetDataNascimentoCidadao( const Value: string);
begin
  F__isset_DataNascimentoCidadao := True;
  FDataNascimentoCidadao := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_DataNascimentoCidadao: Boolean;
begin
  Result := F__isset_DataNascimentoCidadao;
end;

function TCuidadoCompartilhadoThriftImpl.GetUuidCuidadoCompartilhado: string;
begin
  Result := FUuidCuidadoCompartilhado;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetUuidCuidadoCompartilhado( const Value: string);
begin
  FUuidCuidadoCompartilhado := Value;
end;

function TCuidadoCompartilhadoThriftImpl.GetSolicitante: ILotacaoThrift;
begin
  Result := FSolicitante;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetSolicitante( const Value: ILotacaoThrift);
begin
  F__isset_Solicitante := True;
  FSolicitante := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_Solicitante: Boolean;
begin
  Result := F__isset_Solicitante;
end;

function TCuidadoCompartilhadoThriftImpl.GetExecutante: ILotacaoThrift;
begin
  Result := FExecutante;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetExecutante( const Value: ILotacaoThrift);
begin
  F__isset_Executante := True;
  FExecutante := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_Executante: Boolean;
begin
  Result := F__isset_Executante;
end;

function TCuidadoCompartilhadoThriftImpl.GetDataCriacaoCuidado: Int64;
begin
  Result := FDataCriacaoCuidado;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetDataCriacaoCuidado( const Value: Int64);
begin
  F__isset_DataCriacaoCuidado := True;
  FDataCriacaoCuidado := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_DataCriacaoCuidado: Boolean;
begin
  Result := F__isset_DataCriacaoCuidado;
end;

function TCuidadoCompartilhadoThriftImpl.GetCid10: string;
begin
  Result := FCid10;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCid10( const Value: string);
begin
  F__isset_Cid10 := True;
  FCid10 := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_Cid10: Boolean;
begin
  Result := F__isset_Cid10;
end;

function TCuidadoCompartilhadoThriftImpl.GetCiap: string;
begin
  Result := FCiap;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetCiap( const Value: string);
begin
  F__isset_Ciap := True;
  FCiap := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_Ciap: Boolean;
begin
  Result := F__isset_Ciap;
end;

function TCuidadoCompartilhadoThriftImpl.GetUuidFichaOrigem: string;
begin
  Result := FUuidFichaOrigem;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetUuidFichaOrigem( const Value: string);
begin
  F__isset_UuidFichaOrigem := True;
  FUuidFichaOrigem := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_UuidFichaOrigem: Boolean;
begin
  Result := F__isset_UuidFichaOrigem;
end;

function TCuidadoCompartilhadoThriftImpl.GetTpDadoTranspFichaOrigem: Integer;
begin
  Result := FTpDadoTranspFichaOrigem;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetTpDadoTranspFichaOrigem( const Value: Integer);
begin
  F__isset_TpDadoTranspFichaOrigem := True;
  FTpDadoTranspFichaOrigem := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_TpDadoTranspFichaOrigem: Boolean;
begin
  Result := F__isset_TpDadoTranspFichaOrigem;
end;

function TCuidadoCompartilhadoThriftImpl.GetPrioridadeCuidado: Integer;
begin
  Result := FPrioridadeCuidado;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetPrioridadeCuidado( const Value: Integer);
begin
  F__isset_PrioridadeCuidado := True;
  FPrioridadeCuidado := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_PrioridadeCuidado: Boolean;
begin
  Result := F__isset_PrioridadeCuidado;
end;

function TCuidadoCompartilhadoThriftImpl.GetReclassificacaoPrioridadeCuidado: Integer;
begin
  Result := FReclassificacaoPrioridadeCuidado;
end;

procedure TCuidadoCompartilhadoThriftImpl.SetReclassificacaoPrioridadeCuidado( const Value: Integer);
begin
  F__isset_ReclassificacaoPrioridadeCuidado := True;
  FReclassificacaoPrioridadeCuidado := Value;
end;

function TCuidadoCompartilhadoThriftImpl.Get__isset_ReclassificacaoPrioridadeCuidado: Boolean;
begin
  Result := F__isset_ReclassificacaoPrioridadeCuidado;
end;

procedure TCuidadoCompartilhadoThriftImpl.Read( const iprot: IProtocol);
var
  field_ : IField;
  struc : IStruct;
  tracker : IProtocolRecursionTracker;
  _req_isset_UuidEvolucao : Boolean;
  _req_isset_UuidCuidadoCompartilhado : Boolean;

begin
  tracker := iprot.NextRecursionLevel;
  _req_isset_UuidEvolucao := FALSE;
  _req_isset_UuidCuidadoCompartilhado := FALSE;
  struc := iprot.ReadStructBegin;
  try
    while (true) do
    begin
      field_ := iprot.ReadFieldBegin();
      if (field_.Type_ = TType.Stop) then
      begin
        Break;
      end;
      case field_.ID of
        1: begin
          if (field_.Type_ = TType.String_) then
          begin
            UuidEvolucao := iprot.ReadString();
            _req_isset_UuidEvolucao := TRUE;
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        2: begin
          if (field_.Type_ = TType.Struct) then
          begin
            LotacaoEvolucao := TLotacaoThriftImpl.Create;
            LotacaoEvolucao.Read(iprot);
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        3: begin
          if (field_.Type_ = TType.I64) then
          begin
            DataEvolucao := iprot.ReadI64();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        4: begin
          if (field_.Type_ = TType.I64) then
          begin
            DataEvolucaoAnterior := iprot.ReadI64();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        5: begin
          if (field_.Type_ = TType.I32) then
          begin
            CoSequencialEvolucao := iprot.ReadI32();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        6: begin
          if (field_.Type_ = TType.I64) then
          begin
            CondutaEvolucao := iprot.ReadI64();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        7: begin
          if (field_.Type_ = TType.I32) then
          begin
            TpCdsOrigem := iprot.ReadI32();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        8: begin
          if (field_.Type_ = TType.String_) then
          begin
            CnsCidadao := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        9: begin
          if (field_.Type_ = TType.String_) then
          begin
            CpfCidadao := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        10: begin
          if (field_.Type_ = TType.I64) then
          begin
            SexoCidadao := iprot.ReadI64();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        11: begin
          if (field_.Type_ = TType.String_) then
          begin
            DataNascimentoCidadao := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        12: begin
          if (field_.Type_ = TType.String_) then
          begin
            UuidCuidadoCompartilhado := iprot.ReadString();
            _req_isset_UuidCuidadoCompartilhado := TRUE;
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        13: begin
          if (field_.Type_ = TType.Struct) then
          begin
            Solicitante := TLotacaoThriftImpl.Create;
            Solicitante.Read(iprot);
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        14: begin
          if (field_.Type_ = TType.Struct) then
          begin
            Executante := TLotacaoThriftImpl.Create;
            Executante.Read(iprot);
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        15: begin
          if (field_.Type_ = TType.I64) then
          begin
            DataCriacaoCuidado := iprot.ReadI64();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        16: begin
          if (field_.Type_ = TType.String_) then
          begin
            Cid10 := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        17: begin
          if (field_.Type_ = TType.String_) then
          begin
            Ciap := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        18: begin
          if (field_.Type_ = TType.String_) then
          begin
            UuidFichaOrigem := iprot.ReadString();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        19: begin
          if (field_.Type_ = TType.I32) then
          begin
            TpDadoTranspFichaOrigem := iprot.ReadI32();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        20: begin
          if (field_.Type_ = TType.I32) then
          begin
            PrioridadeCuidado := iprot.ReadI32();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end;
        21: begin
          if (field_.Type_ = TType.I32) then
          begin
            ReclassificacaoPrioridadeCuidado := iprot.ReadI32();
          end else
          begin
            TProtocolUtil.Skip(iprot, field_.Type_);
          end;
        end
        else begin
          TProtocolUtil.Skip(iprot, field_.Type_);
        end;
      end;
      iprot.ReadFieldEnd;
    end;
  finally
    iprot.ReadStructEnd;
  end;
  if not _req_isset_UuidEvolucao
  then raise TProtocolException.Create( TProtocolException.INVALID_DATA, 'UuidEvolucao');
  if not _req_isset_UuidCuidadoCompartilhado
  then raise TProtocolException.Create( TProtocolException.INVALID_DATA, 'UuidCuidadoCompartilhado');
end;

procedure TCuidadoCompartilhadoThriftImpl.Write( const oprot: IProtocol);
var
  struc : IStruct;
  field_ : IField;
  tracker : IProtocolRecursionTracker;
begin
  tracker := oprot.NextRecursionLevel;
  struc := TStructImpl.Create('CuidadoCompartilhadoThrift');
  oprot.WriteStructBegin(struc);
  field_ := TFieldImpl.Create;
  // required field
  field_.Name := 'uuidEvolucao';
  field_.Type_  := TType.String_;
  field_.ID := 1;
  oprot.WriteFieldBegin(field_);
  oprot.WriteString(UuidEvolucao);
  oprot.WriteFieldEnd();
  if (LotacaoEvolucao <> nil) and __isset_LotacaoEvolucao then
  begin
    field_.Name := 'lotacaoEvolucao';
    field_.Type_  := TType.Struct;
    field_.ID := 2;
    oprot.WriteFieldBegin(field_);
    LotacaoEvolucao.Write(oprot);
    oprot.WriteFieldEnd();
  end;
  if (__isset_DataEvolucao) then
  begin
    field_.Name := 'dataEvolucao';
    field_.Type_  := TType.I64;
    field_.ID := 3;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI64(DataEvolucao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_DataEvolucaoAnterior) then
  begin
    field_.Name := 'dataEvolucaoAnterior';
    field_.Type_  := TType.I64;
    field_.ID := 4;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI64(DataEvolucaoAnterior);
    oprot.WriteFieldEnd();
  end;
  if (__isset_CoSequencialEvolucao) then
  begin
    field_.Name := 'coSequencialEvolucao';
    field_.Type_  := TType.I32;
    field_.ID := 5;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI32(CoSequencialEvolucao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_CondutaEvolucao) then
  begin
    field_.Name := 'condutaEvolucao';
    field_.Type_  := TType.I64;
    field_.ID := 6;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI64(CondutaEvolucao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_TpCdsOrigem) then
  begin
    field_.Name := 'tpCdsOrigem';
    field_.Type_  := TType.I32;
    field_.ID := 7;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI32(TpCdsOrigem);
    oprot.WriteFieldEnd();
  end;
  if (__isset_CnsCidadao) then
  begin
    field_.Name := 'cnsCidadao';
    field_.Type_  := TType.String_;
    field_.ID := 8;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(CnsCidadao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_CpfCidadao) then
  begin
    field_.Name := 'cpfCidadao';
    field_.Type_  := TType.String_;
    field_.ID := 9;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(CpfCidadao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_SexoCidadao) then
  begin
    field_.Name := 'sexoCidadao';
    field_.Type_  := TType.I64;
    field_.ID := 10;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI64(SexoCidadao);
    oprot.WriteFieldEnd();
  end;
  if (__isset_DataNascimentoCidadao) then
  begin
    field_.Name := 'dataNascimentoCidadao';
    field_.Type_  := TType.String_;
    field_.ID := 11;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(DataNascimentoCidadao);
    oprot.WriteFieldEnd();
  end;
  // required field
  field_.Name := 'uuidCuidadoCompartilhado';
  field_.Type_  := TType.String_;
  field_.ID := 12;
  oprot.WriteFieldBegin(field_);
  oprot.WriteString(UuidCuidadoCompartilhado);
  oprot.WriteFieldEnd();
  if (Solicitante <> nil) and __isset_Solicitante then
  begin
    field_.Name := 'solicitante';
    field_.Type_  := TType.Struct;
    field_.ID := 13;
    oprot.WriteFieldBegin(field_);
    Solicitante.Write(oprot);
    oprot.WriteFieldEnd();
  end;
  if (Executante <> nil) and __isset_Executante then
  begin
    field_.Name := 'executante';
    field_.Type_  := TType.Struct;
    field_.ID := 14;
    oprot.WriteFieldBegin(field_);
    Executante.Write(oprot);
    oprot.WriteFieldEnd();
  end;
  if (__isset_DataCriacaoCuidado) then
  begin
    field_.Name := 'dataCriacaoCuidado';
    field_.Type_  := TType.I64;
    field_.ID := 15;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI64(DataCriacaoCuidado);
    oprot.WriteFieldEnd();
  end;
  if (__isset_Cid10) then
  begin
    field_.Name := 'cid10';
    field_.Type_  := TType.String_;
    field_.ID := 16;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(Cid10);
    oprot.WriteFieldEnd();
  end;
  if (__isset_Ciap) then
  begin
    field_.Name := 'ciap';
    field_.Type_  := TType.String_;
    field_.ID := 17;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(Ciap);
    oprot.WriteFieldEnd();
  end;
  if (__isset_UuidFichaOrigem) then
  begin
    field_.Name := 'uuidFichaOrigem';
    field_.Type_  := TType.String_;
    field_.ID := 18;
    oprot.WriteFieldBegin(field_);
    oprot.WriteString(UuidFichaOrigem);
    oprot.WriteFieldEnd();
  end;
  if (__isset_TpDadoTranspFichaOrigem) then
  begin
    field_.Name := 'tpDadoTranspFichaOrigem';
    field_.Type_  := TType.I32;
    field_.ID := 19;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI32(TpDadoTranspFichaOrigem);
    oprot.WriteFieldEnd();
  end;
  if (__isset_PrioridadeCuidado) then
  begin
    field_.Name := 'prioridadeCuidado';
    field_.Type_  := TType.I32;
    field_.ID := 20;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI32(PrioridadeCuidado);
    oprot.WriteFieldEnd();
  end;
  if (__isset_ReclassificacaoPrioridadeCuidado) then
  begin
    field_.Name := 'reclassificacaoPrioridadeCuidado';
    field_.Type_  := TType.I32;
    field_.ID := 21;
    oprot.WriteFieldBegin(field_);
    oprot.WriteI32(ReclassificacaoPrioridadeCuidado);
    oprot.WriteFieldEnd();
  end;
  oprot.WriteFieldStop();
  oprot.WriteStructEnd();
end;

function TCuidadoCompartilhadoThriftImpl.ToString: string;
var
  _sb0 : TThriftStringBuilder;
begin
  _sb0 := TThriftStringBuilder.Create('(');
  try
    _sb0.Append(', UuidEvolucao: ');
    _sb0.Append(UuidEvolucao);
    if (LotacaoEvolucao <> nil) and __isset_LotacaoEvolucao then begin
      _sb0.Append(', LotacaoEvolucao: ');
      if (LotacaoEvolucao = nil) then _sb0.Append('<null>') else _sb0.Append(LotacaoEvolucao.ToString());
    end;
    if (__isset_DataEvolucao) then begin
      _sb0.Append(', DataEvolucao: ');
      _sb0.Append(DataEvolucao);
    end;
    if (__isset_DataEvolucaoAnterior) then begin
      _sb0.Append(', DataEvolucaoAnterior: ');
      _sb0.Append(DataEvolucaoAnterior);
    end;
    if (__isset_CoSequencialEvolucao) then begin
      _sb0.Append(', CoSequencialEvolucao: ');
      _sb0.Append(CoSequencialEvolucao);
    end;
    if (__isset_CondutaEvolucao) then begin
      _sb0.Append(', CondutaEvolucao: ');
      _sb0.Append(CondutaEvolucao);
    end;
    if (__isset_TpCdsOrigem) then begin
      _sb0.Append(', TpCdsOrigem: ');
      _sb0.Append(TpCdsOrigem);
    end;
    if (__isset_CnsCidadao) then begin
      _sb0.Append(', CnsCidadao: ');
      _sb0.Append(CnsCidadao);
    end;
    if (__isset_CpfCidadao) then begin
      _sb0.Append(', CpfCidadao: ');
      _sb0.Append(CpfCidadao);
    end;
    if (__isset_SexoCidadao) then begin
      _sb0.Append(', SexoCidadao: ');
      _sb0.Append(SexoCidadao);
    end;
    if (__isset_DataNascimentoCidadao) then begin
      _sb0.Append(', DataNascimentoCidadao: ');
      _sb0.Append(DataNascimentoCidadao);
    end;
    _sb0.Append(', UuidCuidadoCompartilhado: ');
    _sb0.Append(UuidCuidadoCompartilhado);
    if (Solicitante <> nil) and __isset_Solicitante then begin
      _sb0.Append(', Solicitante: ');
      if (Solicitante = nil) then _sb0.Append('<null>') else _sb0.Append(Solicitante.ToString());
    end;
    if (Executante <> nil) and __isset_Executante then begin
      _sb0.Append(', Executante: ');
      if (Executante = nil) then _sb0.Append('<null>') else _sb0.Append(Executante.ToString());
    end;
    if (__isset_DataCriacaoCuidado) then begin
      _sb0.Append(', DataCriacaoCuidado: ');
      _sb0.Append(DataCriacaoCuidado);
    end;
    if (__isset_Cid10) then begin
      _sb0.Append(', Cid10: ');
      _sb0.Append(Cid10);
    end;
    if (__isset_Ciap) then begin
      _sb0.Append(', Ciap: ');
      _sb0.Append(Ciap);
    end;
    if (__isset_UuidFichaOrigem) then begin
      _sb0.Append(', UuidFichaOrigem: ');
      _sb0.Append(UuidFichaOrigem);
    end;
    if (__isset_TpDadoTranspFichaOrigem) then begin
      _sb0.Append(', TpDadoTranspFichaOrigem: ');
      _sb0.Append(TpDadoTranspFichaOrigem);
    end;
    if (__isset_PrioridadeCuidado) then begin
      _sb0.Append(', PrioridadeCuidado: ');
      _sb0.Append(PrioridadeCuidado);
    end;
    if (__isset_ReclassificacaoPrioridadeCuidado) then begin
      _sb0.Append(', ReclassificacaoPrioridadeCuidado: ');
      _sb0.Append(ReclassificacaoPrioridadeCuidado);
    end;
    _sb0.Append(')');
    Result := _sb0.ToString;
  finally
    _sb0.Free;
  end;
end;


initialization

finalization


end.
