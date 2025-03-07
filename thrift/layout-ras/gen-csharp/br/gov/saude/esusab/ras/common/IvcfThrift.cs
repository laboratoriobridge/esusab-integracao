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

namespace br.gov.saude.esusab.ras.common
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class IvcfThrift : TBase
  {
    private int _resultado;
    private bool _hasSgIdade;
    private bool _hasSgPercepcaoSaude;
    private bool _hasSgAvdInstrumental;
    private bool _hasSgAvdBasica;
    private bool _hasSgCognicao;
    private bool _hasSgHumor;
    private bool _hasSgAlcancePreensaoPinca;
    private bool _hasSgCapAerobicaMuscular;
    private bool _hasSgMarcha;
    private bool _hasSgContinencia;
    private bool _hasSgVisao;
    private bool _hasSgAudicao;
    private bool _hasSgComorbidade;
    private long _dataResultado;

    public int Resultado
    {
      get
      {
        return _resultado;
      }
      set
      {
        __isset.resultado = true;
        this._resultado = value;
      }
    }

    public bool HasSgIdade
    {
      get
      {
        return _hasSgIdade;
      }
      set
      {
        __isset.hasSgIdade = true;
        this._hasSgIdade = value;
      }
    }

    public bool HasSgPercepcaoSaude
    {
      get
      {
        return _hasSgPercepcaoSaude;
      }
      set
      {
        __isset.hasSgPercepcaoSaude = true;
        this._hasSgPercepcaoSaude = value;
      }
    }

    public bool HasSgAvdInstrumental
    {
      get
      {
        return _hasSgAvdInstrumental;
      }
      set
      {
        __isset.hasSgAvdInstrumental = true;
        this._hasSgAvdInstrumental = value;
      }
    }

    public bool HasSgAvdBasica
    {
      get
      {
        return _hasSgAvdBasica;
      }
      set
      {
        __isset.hasSgAvdBasica = true;
        this._hasSgAvdBasica = value;
      }
    }

    public bool HasSgCognicao
    {
      get
      {
        return _hasSgCognicao;
      }
      set
      {
        __isset.hasSgCognicao = true;
        this._hasSgCognicao = value;
      }
    }

    public bool HasSgHumor
    {
      get
      {
        return _hasSgHumor;
      }
      set
      {
        __isset.hasSgHumor = true;
        this._hasSgHumor = value;
      }
    }

    public bool HasSgAlcancePreensaoPinca
    {
      get
      {
        return _hasSgAlcancePreensaoPinca;
      }
      set
      {
        __isset.hasSgAlcancePreensaoPinca = true;
        this._hasSgAlcancePreensaoPinca = value;
      }
    }

    public bool HasSgCapAerobicaMuscular
    {
      get
      {
        return _hasSgCapAerobicaMuscular;
      }
      set
      {
        __isset.hasSgCapAerobicaMuscular = true;
        this._hasSgCapAerobicaMuscular = value;
      }
    }

    public bool HasSgMarcha
    {
      get
      {
        return _hasSgMarcha;
      }
      set
      {
        __isset.hasSgMarcha = true;
        this._hasSgMarcha = value;
      }
    }

    public bool HasSgContinencia
    {
      get
      {
        return _hasSgContinencia;
      }
      set
      {
        __isset.hasSgContinencia = true;
        this._hasSgContinencia = value;
      }
    }

    public bool HasSgVisao
    {
      get
      {
        return _hasSgVisao;
      }
      set
      {
        __isset.hasSgVisao = true;
        this._hasSgVisao = value;
      }
    }

    public bool HasSgAudicao
    {
      get
      {
        return _hasSgAudicao;
      }
      set
      {
        __isset.hasSgAudicao = true;
        this._hasSgAudicao = value;
      }
    }

    public bool HasSgComorbidade
    {
      get
      {
        return _hasSgComorbidade;
      }
      set
      {
        __isset.hasSgComorbidade = true;
        this._hasSgComorbidade = value;
      }
    }

    public long DataResultado
    {
      get
      {
        return _dataResultado;
      }
      set
      {
        __isset.dataResultado = true;
        this._dataResultado = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool resultado;
      public bool hasSgIdade;
      public bool hasSgPercepcaoSaude;
      public bool hasSgAvdInstrumental;
      public bool hasSgAvdBasica;
      public bool hasSgCognicao;
      public bool hasSgHumor;
      public bool hasSgAlcancePreensaoPinca;
      public bool hasSgCapAerobicaMuscular;
      public bool hasSgMarcha;
      public bool hasSgContinencia;
      public bool hasSgVisao;
      public bool hasSgAudicao;
      public bool hasSgComorbidade;
      public bool dataResultado;
    }

    public IvcfThrift() {
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
              if (field.Type == TType.I32) {
                Resultado = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Bool) {
                HasSgIdade = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Bool) {
                HasSgPercepcaoSaude = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Bool) {
                HasSgAvdInstrumental = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Bool) {
                HasSgAvdBasica = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Bool) {
                HasSgCognicao = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Bool) {
                HasSgHumor = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.Bool) {
                HasSgAlcancePreensaoPinca = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.Bool) {
                HasSgCapAerobicaMuscular = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.Bool) {
                HasSgMarcha = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.Bool) {
                HasSgContinencia = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.Bool) {
                HasSgVisao = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 13:
              if (field.Type == TType.Bool) {
                HasSgAudicao = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 14:
              if (field.Type == TType.Bool) {
                HasSgComorbidade = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 15:
              if (field.Type == TType.I64) {
                DataResultado = iprot.ReadI64();
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
        TStruct struc = new TStruct("IvcfThrift");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.resultado) {
          field.Name = "resultado";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Resultado);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgIdade) {
          field.Name = "hasSgIdade";
          field.Type = TType.Bool;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgIdade);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgPercepcaoSaude) {
          field.Name = "hasSgPercepcaoSaude";
          field.Type = TType.Bool;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgPercepcaoSaude);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgAvdInstrumental) {
          field.Name = "hasSgAvdInstrumental";
          field.Type = TType.Bool;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgAvdInstrumental);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgAvdBasica) {
          field.Name = "hasSgAvdBasica";
          field.Type = TType.Bool;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgAvdBasica);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgCognicao) {
          field.Name = "hasSgCognicao";
          field.Type = TType.Bool;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgCognicao);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgHumor) {
          field.Name = "hasSgHumor";
          field.Type = TType.Bool;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgHumor);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgAlcancePreensaoPinca) {
          field.Name = "hasSgAlcancePreensaoPinca";
          field.Type = TType.Bool;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgAlcancePreensaoPinca);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgCapAerobicaMuscular) {
          field.Name = "hasSgCapAerobicaMuscular";
          field.Type = TType.Bool;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgCapAerobicaMuscular);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgMarcha) {
          field.Name = "hasSgMarcha";
          field.Type = TType.Bool;
          field.ID = 10;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgMarcha);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgContinencia) {
          field.Name = "hasSgContinencia";
          field.Type = TType.Bool;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgContinencia);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgVisao) {
          field.Name = "hasSgVisao";
          field.Type = TType.Bool;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgVisao);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgAudicao) {
          field.Name = "hasSgAudicao";
          field.Type = TType.Bool;
          field.ID = 13;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgAudicao);
          oprot.WriteFieldEnd();
        }
        if (__isset.hasSgComorbidade) {
          field.Name = "hasSgComorbidade";
          field.Type = TType.Bool;
          field.ID = 14;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(HasSgComorbidade);
          oprot.WriteFieldEnd();
        }
        if (__isset.dataResultado) {
          field.Name = "dataResultado";
          field.Type = TType.I64;
          field.ID = 15;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(DataResultado);
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
      StringBuilder __sb = new StringBuilder("IvcfThrift(");
      bool __first = true;
      if (__isset.resultado) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Resultado: ");
        __sb.Append(Resultado);
      }
      if (__isset.hasSgIdade) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgIdade: ");
        __sb.Append(HasSgIdade);
      }
      if (__isset.hasSgPercepcaoSaude) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgPercepcaoSaude: ");
        __sb.Append(HasSgPercepcaoSaude);
      }
      if (__isset.hasSgAvdInstrumental) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgAvdInstrumental: ");
        __sb.Append(HasSgAvdInstrumental);
      }
      if (__isset.hasSgAvdBasica) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgAvdBasica: ");
        __sb.Append(HasSgAvdBasica);
      }
      if (__isset.hasSgCognicao) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgCognicao: ");
        __sb.Append(HasSgCognicao);
      }
      if (__isset.hasSgHumor) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgHumor: ");
        __sb.Append(HasSgHumor);
      }
      if (__isset.hasSgAlcancePreensaoPinca) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgAlcancePreensaoPinca: ");
        __sb.Append(HasSgAlcancePreensaoPinca);
      }
      if (__isset.hasSgCapAerobicaMuscular) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgCapAerobicaMuscular: ");
        __sb.Append(HasSgCapAerobicaMuscular);
      }
      if (__isset.hasSgMarcha) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgMarcha: ");
        __sb.Append(HasSgMarcha);
      }
      if (__isset.hasSgContinencia) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgContinencia: ");
        __sb.Append(HasSgContinencia);
      }
      if (__isset.hasSgVisao) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgVisao: ");
        __sb.Append(HasSgVisao);
      }
      if (__isset.hasSgAudicao) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgAudicao: ");
        __sb.Append(HasSgAudicao);
      }
      if (__isset.hasSgComorbidade) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HasSgComorbidade: ");
        __sb.Append(HasSgComorbidade);
      }
      if (__isset.dataResultado) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DataResultado: ");
        __sb.Append(DataResultado);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
