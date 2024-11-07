/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace br.gov.saude.esusab.ras.atendodonto
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class FichaAtendimentoOdontologicoMasterThrift : TBase
  {
    private br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift _headerTransport;
    private List<FichaAtendimentoOdontologicoChildThrift> _atendimentosOdontologicos;
    private int _tpCdsOrigem;

    public string UuidFicha { get; set; }

    public br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift HeaderTransport
    {
      get
      {
        return _headerTransport;
      }
      set
      {
        __isset.headerTransport = true;
        this._headerTransport = value;
      }
    }

    public List<FichaAtendimentoOdontologicoChildThrift> AtendimentosOdontologicos
    {
      get
      {
        return _atendimentosOdontologicos;
      }
      set
      {
        __isset.atendimentosOdontologicos = true;
        this._atendimentosOdontologicos = value;
      }
    }

    public int TpCdsOrigem
    {
      get
      {
        return _tpCdsOrigem;
      }
      set
      {
        __isset.tpCdsOrigem = true;
        this._tpCdsOrigem = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool headerTransport;
      public bool atendimentosOdontologicos;
      public bool tpCdsOrigem;
    }

    public FichaAtendimentoOdontologicoMasterThrift() {
    }

    public FichaAtendimentoOdontologicoMasterThrift(string uuidFicha) : this() {
      this.UuidFicha = uuidFicha;
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        bool isset_uuidFicha = false;
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                UuidFicha = iprot.ReadString();
                isset_uuidFicha = true;
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                HeaderTransport = new br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift();
                HeaderTransport.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.List) {
                {
                  AtendimentosOdontologicos = new List<FichaAtendimentoOdontologicoChildThrift>();
                  TList _list36 = iprot.ReadListBegin();
                  for( int _i37 = 0; _i37 < _list36.Count; ++_i37)
                  {
                    FichaAtendimentoOdontologicoChildThrift _elem38;
                    _elem38 = new FichaAtendimentoOdontologicoChildThrift();
                    _elem38.Read(iprot);
                    AtendimentosOdontologicos.Add(_elem38);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I32) {
                TpCdsOrigem = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
        if (!isset_uuidFicha)
          throw new TProtocolException(TProtocolException.INVALID_DATA);
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("FichaAtendimentoOdontologicoMasterThrift");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        field.Name = "uuidFicha";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(UuidFicha);
        oprot.WriteFieldEnd();
        if (HeaderTransport != null && __isset.headerTransport) {
          field.Name = "headerTransport";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          HeaderTransport.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (AtendimentosOdontologicos != null && __isset.atendimentosOdontologicos) {
          field.Name = "atendimentosOdontologicos";
          field.Type = TType.List;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AtendimentosOdontologicos.Count));
            foreach (FichaAtendimentoOdontologicoChildThrift _iter39 in AtendimentosOdontologicos)
            {
              _iter39.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (__isset.tpCdsOrigem) {
          field.Name = "tpCdsOrigem";
          field.Type = TType.I32;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(TpCdsOrigem);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("FichaAtendimentoOdontologicoMasterThrift(");
      __sb.Append(", UuidFicha: ");
      __sb.Append(UuidFicha);
      if (HeaderTransport != null && __isset.headerTransport) {
        __sb.Append(", HeaderTransport: ");
        __sb.Append(HeaderTransport== null ? "<null>" : HeaderTransport.ToString());
      }
      if (AtendimentosOdontologicos != null && __isset.atendimentosOdontologicos) {
        __sb.Append(", AtendimentosOdontologicos: ");
        __sb.Append(AtendimentosOdontologicos);
      }
      if (__isset.tpCdsOrigem) {
        __sb.Append(", TpCdsOrigem: ");
        __sb.Append(TpCdsOrigem);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
