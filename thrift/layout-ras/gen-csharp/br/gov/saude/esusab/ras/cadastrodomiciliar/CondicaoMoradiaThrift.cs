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

namespace br.gov.saude.esusab.ras.cadastrodomiciliar
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CondicaoMoradiaThrift : TBase
  {
    private long _abastecimentoAgua;
    private long _areaProducaoRural;
    private long _destinoLixo;
    private long _formaEscoamentoBanheiro;
    private long _localizacao;
    private long _materialPredominanteParedesExtDomicilio;
    private string _nuComodos;
    private string _nuMoradores;
    private long _situacaoMoradiaPosseTerra;
    private bool _stDisponibilidadeEnergiaEletrica;
    private long _tipoAcessoDomicilio;
    private long _tipoDomicilio;
    private long _aguaConsumoDomicilio;
    private long _tipoOrigemEnergiaEletrica;

    public long AbastecimentoAgua
    {
      get
      {
        return _abastecimentoAgua;
      }
      set
      {
        __isset.abastecimentoAgua = true;
        this._abastecimentoAgua = value;
      }
    }

    public long AreaProducaoRural
    {
      get
      {
        return _areaProducaoRural;
      }
      set
      {
        __isset.areaProducaoRural = true;
        this._areaProducaoRural = value;
      }
    }

    public long DestinoLixo
    {
      get
      {
        return _destinoLixo;
      }
      set
      {
        __isset.destinoLixo = true;
        this._destinoLixo = value;
      }
    }

    public long FormaEscoamentoBanheiro
    {
      get
      {
        return _formaEscoamentoBanheiro;
      }
      set
      {
        __isset.formaEscoamentoBanheiro = true;
        this._formaEscoamentoBanheiro = value;
      }
    }

    public long Localizacao
    {
      get
      {
        return _localizacao;
      }
      set
      {
        __isset.localizacao = true;
        this._localizacao = value;
      }
    }

    public long MaterialPredominanteParedesExtDomicilio
    {
      get
      {
        return _materialPredominanteParedesExtDomicilio;
      }
      set
      {
        __isset.materialPredominanteParedesExtDomicilio = true;
        this._materialPredominanteParedesExtDomicilio = value;
      }
    }

    public string NuComodos
    {
      get
      {
        return _nuComodos;
      }
      set
      {
        __isset.nuComodos = true;
        this._nuComodos = value;
      }
    }

    public string NuMoradores
    {
      get
      {
        return _nuMoradores;
      }
      set
      {
        __isset.nuMoradores = true;
        this._nuMoradores = value;
      }
    }

    public long SituacaoMoradiaPosseTerra
    {
      get
      {
        return _situacaoMoradiaPosseTerra;
      }
      set
      {
        __isset.situacaoMoradiaPosseTerra = true;
        this._situacaoMoradiaPosseTerra = value;
      }
    }

    public bool StDisponibilidadeEnergiaEletrica
    {
      get
      {
        return _stDisponibilidadeEnergiaEletrica;
      }
      set
      {
        __isset.stDisponibilidadeEnergiaEletrica = true;
        this._stDisponibilidadeEnergiaEletrica = value;
      }
    }

    public long TipoAcessoDomicilio
    {
      get
      {
        return _tipoAcessoDomicilio;
      }
      set
      {
        __isset.tipoAcessoDomicilio = true;
        this._tipoAcessoDomicilio = value;
      }
    }

    public long TipoDomicilio
    {
      get
      {
        return _tipoDomicilio;
      }
      set
      {
        __isset.tipoDomicilio = true;
        this._tipoDomicilio = value;
      }
    }

    public long AguaConsumoDomicilio
    {
      get
      {
        return _aguaConsumoDomicilio;
      }
      set
      {
        __isset.aguaConsumoDomicilio = true;
        this._aguaConsumoDomicilio = value;
      }
    }

    public long TipoOrigemEnergiaEletrica
    {
      get
      {
        return _tipoOrigemEnergiaEletrica;
      }
      set
      {
        __isset.tipoOrigemEnergiaEletrica = true;
        this._tipoOrigemEnergiaEletrica = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool abastecimentoAgua;
      public bool areaProducaoRural;
      public bool destinoLixo;
      public bool formaEscoamentoBanheiro;
      public bool localizacao;
      public bool materialPredominanteParedesExtDomicilio;
      public bool nuComodos;
      public bool nuMoradores;
      public bool situacaoMoradiaPosseTerra;
      public bool stDisponibilidadeEnergiaEletrica;
      public bool tipoAcessoDomicilio;
      public bool tipoDomicilio;
      public bool aguaConsumoDomicilio;
      public bool tipoOrigemEnergiaEletrica;
    }

    public CondicaoMoradiaThrift() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
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
              if (field.Type == TType.I64) {
                AbastecimentoAgua = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I64) {
                AreaProducaoRural = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I64) {
                DestinoLixo = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I64) {
                FormaEscoamentoBanheiro = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.I64) {
                Localizacao = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.I64) {
                MaterialPredominanteParedesExtDomicilio = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.String) {
                NuComodos = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.String) {
                NuMoradores = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.I64) {
                SituacaoMoradiaPosseTerra = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Bool) {
                StDisponibilidadeEnergiaEletrica = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.I64) {
                TipoAcessoDomicilio = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.I64) {
                TipoDomicilio = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.I64) {
                AguaConsumoDomicilio = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.I64) {
                TipoOrigemEnergiaEletrica = iprot.ReadI64();
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
        TStruct struc = new TStruct("CondicaoMoradiaThrift");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.abastecimentoAgua) {
          field.Name = "abastecimentoAgua";
          field.Type = TType.I64;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(AbastecimentoAgua);
          oprot.WriteFieldEnd();
        }
        if (__isset.areaProducaoRural) {
          field.Name = "areaProducaoRural";
          field.Type = TType.I64;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(AreaProducaoRural);
          oprot.WriteFieldEnd();
        }
        if (__isset.destinoLixo) {
          field.Name = "destinoLixo";
          field.Type = TType.I64;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(DestinoLixo);
          oprot.WriteFieldEnd();
        }
        if (__isset.formaEscoamentoBanheiro) {
          field.Name = "formaEscoamentoBanheiro";
          field.Type = TType.I64;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(FormaEscoamentoBanheiro);
          oprot.WriteFieldEnd();
        }
        if (__isset.localizacao) {
          field.Name = "localizacao";
          field.Type = TType.I64;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Localizacao);
          oprot.WriteFieldEnd();
        }
        if (__isset.materialPredominanteParedesExtDomicilio) {
          field.Name = "materialPredominanteParedesExtDomicilio";
          field.Type = TType.I64;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(MaterialPredominanteParedesExtDomicilio);
          oprot.WriteFieldEnd();
        }
        if (NuComodos != null && __isset.nuComodos) {
          field.Name = "nuComodos";
          field.Type = TType.String;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(NuComodos);
          oprot.WriteFieldEnd();
        }
        if (NuMoradores != null && __isset.nuMoradores) {
          field.Name = "nuMoradores";
          field.Type = TType.String;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(NuMoradores);
          oprot.WriteFieldEnd();
        }
        if (__isset.situacaoMoradiaPosseTerra) {
          field.Name = "situacaoMoradiaPosseTerra";
          field.Type = TType.I64;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(SituacaoMoradiaPosseTerra);
          oprot.WriteFieldEnd();
        }
        if (__isset.stDisponibilidadeEnergiaEletrica) {
          field.Name = "stDisponibilidadeEnergiaEletrica";
          field.Type = TType.Bool;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(StDisponibilidadeEnergiaEletrica);
          oprot.WriteFieldEnd();
        }
        if (__isset.tipoAcessoDomicilio) {
          field.Name = "tipoAcessoDomicilio";
          field.Type = TType.I64;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(TipoAcessoDomicilio);
          oprot.WriteFieldEnd();
        }
        if (__isset.tipoDomicilio) {
          field.Name = "tipoDomicilio";
          field.Type = TType.I64;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(TipoDomicilio);
          oprot.WriteFieldEnd();
        }
        if (__isset.aguaConsumoDomicilio) {
          field.Name = "aguaConsumoDomicilio";
          field.Type = TType.I64;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(AguaConsumoDomicilio);
          oprot.WriteFieldEnd();
        }
        if (__isset.tipoOrigemEnergiaEletrica) {
          field.Name = "tipoOrigemEnergiaEletrica";
          field.Type = TType.I64;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(TipoOrigemEnergiaEletrica);
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
      StringBuilder __sb = new StringBuilder("CondicaoMoradiaThrift(");
      bool __first = true;
      if (__isset.abastecimentoAgua) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AbastecimentoAgua: ");
        __sb.Append(AbastecimentoAgua);
      }
      if (__isset.areaProducaoRural) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AreaProducaoRural: ");
        __sb.Append(AreaProducaoRural);
      }
      if (__isset.destinoLixo) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DestinoLixo: ");
        __sb.Append(DestinoLixo);
      }
      if (__isset.formaEscoamentoBanheiro) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FormaEscoamentoBanheiro: ");
        __sb.Append(FormaEscoamentoBanheiro);
      }
      if (__isset.localizacao) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Localizacao: ");
        __sb.Append(Localizacao);
      }
      if (__isset.materialPredominanteParedesExtDomicilio) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MaterialPredominanteParedesExtDomicilio: ");
        __sb.Append(MaterialPredominanteParedesExtDomicilio);
      }
      if (NuComodos != null && __isset.nuComodos) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("NuComodos: ");
        __sb.Append(NuComodos);
      }
      if (NuMoradores != null && __isset.nuMoradores) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("NuMoradores: ");
        __sb.Append(NuMoradores);
      }
      if (__isset.situacaoMoradiaPosseTerra) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SituacaoMoradiaPosseTerra: ");
        __sb.Append(SituacaoMoradiaPosseTerra);
      }
      if (__isset.stDisponibilidadeEnergiaEletrica) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("StDisponibilidadeEnergiaEletrica: ");
        __sb.Append(StDisponibilidadeEnergiaEletrica);
      }
      if (__isset.tipoAcessoDomicilio) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TipoAcessoDomicilio: ");
        __sb.Append(TipoAcessoDomicilio);
      }
      if (__isset.tipoDomicilio) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TipoDomicilio: ");
        __sb.Append(TipoDomicilio);
      }
      if (__isset.aguaConsumoDomicilio) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AguaConsumoDomicilio: ");
        __sb.Append(AguaConsumoDomicilio);
      }
      if (__isset.tipoOrigemEnergiaEletrica) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("TipoOrigemEnergiaEletrica: ");
        __sb.Append(TipoOrigemEnergiaEletrica);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
