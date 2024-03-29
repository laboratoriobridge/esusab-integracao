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

namespace br.gov.saude.esusab.ras.consumoalimentar
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class FichaConsumoAlimentarThrift : TBase
  {
    private br.gov.saude.esusab.ras.common.UnicaLotacaoHeaderThrift _headerTransport;
    private string _cnsCidadao;
    private long _dataNascimento;
    private long _sexo;
    private long _localAtendimento;
    private List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> _perguntasQuestionarioCriancasMenoresSeisMeses;
    private List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift> _perguntasQuestionarioCriancasDeSeisVinteTresMeses;
    private List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> _perguntasQuestionarioCriancasComMaisDoisAnos;
    private int _tpCdsOrigem;
    private string _cpfCidadao;

    public br.gov.saude.esusab.ras.common.UnicaLotacaoHeaderThrift HeaderTransport
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

    public string CnsCidadao
    {
      get
      {
        return _cnsCidadao;
      }
      set
      {
        __isset.cnsCidadao = true;
        this._cnsCidadao = value;
      }
    }

    public long DataNascimento
    {
      get
      {
        return _dataNascimento;
      }
      set
      {
        __isset.dataNascimento = true;
        this._dataNascimento = value;
      }
    }

    public long Sexo
    {
      get
      {
        return _sexo;
      }
      set
      {
        __isset.sexo = true;
        this._sexo = value;
      }
    }

    public long LocalAtendimento
    {
      get
      {
        return _localAtendimento;
      }
      set
      {
        __isset.localAtendimento = true;
        this._localAtendimento = value;
      }
    }

    public List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> PerguntasQuestionarioCriancasMenoresSeisMeses
    {
      get
      {
        return _perguntasQuestionarioCriancasMenoresSeisMeses;
      }
      set
      {
        __isset.perguntasQuestionarioCriancasMenoresSeisMeses = true;
        this._perguntasQuestionarioCriancasMenoresSeisMeses = value;
      }
    }

    public List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift> PerguntasQuestionarioCriancasDeSeisVinteTresMeses
    {
      get
      {
        return _perguntasQuestionarioCriancasDeSeisVinteTresMeses;
      }
      set
      {
        __isset.perguntasQuestionarioCriancasDeSeisVinteTresMeses = true;
        this._perguntasQuestionarioCriancasDeSeisVinteTresMeses = value;
      }
    }

    public List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> PerguntasQuestionarioCriancasComMaisDoisAnos
    {
      get
      {
        return _perguntasQuestionarioCriancasComMaisDoisAnos;
      }
      set
      {
        __isset.perguntasQuestionarioCriancasComMaisDoisAnos = true;
        this._perguntasQuestionarioCriancasComMaisDoisAnos = value;
      }
    }

    public string UuidFicha { get; set; }

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

    public string CpfCidadao
    {
      get
      {
        return _cpfCidadao;
      }
      set
      {
        __isset.cpfCidadao = true;
        this._cpfCidadao = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool headerTransport;
      public bool cnsCidadao;
      public bool dataNascimento;
      public bool sexo;
      public bool localAtendimento;
      public bool perguntasQuestionarioCriancasMenoresSeisMeses;
      public bool perguntasQuestionarioCriancasDeSeisVinteTresMeses;
      public bool perguntasQuestionarioCriancasComMaisDoisAnos;
      public bool tpCdsOrigem;
      public bool cpfCidadao;
    }

    public FichaConsumoAlimentarThrift() {
    }

    public FichaConsumoAlimentarThrift(string uuidFicha) : this() {
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
              if (field.Type == TType.Struct) {
                HeaderTransport = new br.gov.saude.esusab.ras.common.UnicaLotacaoHeaderThrift();
                HeaderTransport.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                CnsCidadao = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I64) {
                DataNascimento = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.I64) {
                Sexo = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.I64) {
                LocalAtendimento = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  PerguntasQuestionarioCriancasMenoresSeisMeses = new List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift>();
                  TList _list4 = iprot.ReadListBegin();
                  for( int _i5 = 0; _i5 < _list4.Count; ++_i5)
                  {
                    PerguntaQuestionarioCriancasMenoresSeisMesesThrift _elem6;
                    _elem6 = new PerguntaQuestionarioCriancasMenoresSeisMesesThrift();
                    _elem6.Read(iprot);
                    PerguntasQuestionarioCriancasMenoresSeisMeses.Add(_elem6);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  PerguntasQuestionarioCriancasDeSeisVinteTresMeses = new List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift>();
                  TList _list7 = iprot.ReadListBegin();
                  for( int _i8 = 0; _i8 < _list7.Count; ++_i8)
                  {
                    PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift _elem9;
                    _elem9 = new PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift();
                    _elem9.Read(iprot);
                    PerguntasQuestionarioCriancasDeSeisVinteTresMeses.Add(_elem9);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  PerguntasQuestionarioCriancasComMaisDoisAnos = new List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift>();
                  TList _list10 = iprot.ReadListBegin();
                  for( int _i11 = 0; _i11 < _list10.Count; ++_i11)
                  {
                    PerguntaQuestionarioCriancasComMaisDoisAnosThrift _elem12;
                    _elem12 = new PerguntaQuestionarioCriancasComMaisDoisAnosThrift();
                    _elem12.Read(iprot);
                    PerguntasQuestionarioCriancasComMaisDoisAnos.Add(_elem12);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 10:
              if (field.Type == TType.String) {
                UuidFicha = iprot.ReadString();
                isset_uuidFicha = true;
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 11:
              if (field.Type == TType.I32) {
                TpCdsOrigem = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 12:
              if (field.Type == TType.String) {
                CpfCidadao = iprot.ReadString();
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
        TStruct struc = new TStruct("FichaConsumoAlimentarThrift");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (HeaderTransport != null && __isset.headerTransport) {
          field.Name = "headerTransport";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          HeaderTransport.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (CnsCidadao != null && __isset.cnsCidadao) {
          field.Name = "cnsCidadao";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CnsCidadao);
          oprot.WriteFieldEnd();
        }
        if (__isset.dataNascimento) {
          field.Name = "dataNascimento";
          field.Type = TType.I64;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(DataNascimento);
          oprot.WriteFieldEnd();
        }
        if (__isset.sexo) {
          field.Name = "sexo";
          field.Type = TType.I64;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Sexo);
          oprot.WriteFieldEnd();
        }
        if (__isset.localAtendimento) {
          field.Name = "localAtendimento";
          field.Type = TType.I64;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(LocalAtendimento);
          oprot.WriteFieldEnd();
        }
        if (PerguntasQuestionarioCriancasMenoresSeisMeses != null && __isset.perguntasQuestionarioCriancasMenoresSeisMeses) {
          field.Name = "perguntasQuestionarioCriancasMenoresSeisMeses";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, PerguntasQuestionarioCriancasMenoresSeisMeses.Count));
            foreach (PerguntaQuestionarioCriancasMenoresSeisMesesThrift _iter13 in PerguntasQuestionarioCriancasMenoresSeisMeses)
            {
              _iter13.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (PerguntasQuestionarioCriancasDeSeisVinteTresMeses != null && __isset.perguntasQuestionarioCriancasDeSeisVinteTresMeses) {
          field.Name = "perguntasQuestionarioCriancasDeSeisVinteTresMeses";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, PerguntasQuestionarioCriancasDeSeisVinteTresMeses.Count));
            foreach (PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift _iter14 in PerguntasQuestionarioCriancasDeSeisVinteTresMeses)
            {
              _iter14.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (PerguntasQuestionarioCriancasComMaisDoisAnos != null && __isset.perguntasQuestionarioCriancasComMaisDoisAnos) {
          field.Name = "perguntasQuestionarioCriancasComMaisDoisAnos";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, PerguntasQuestionarioCriancasComMaisDoisAnos.Count));
            foreach (PerguntaQuestionarioCriancasComMaisDoisAnosThrift _iter15 in PerguntasQuestionarioCriancasComMaisDoisAnos)
            {
              _iter15.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        field.Name = "uuidFicha";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(UuidFicha);
        oprot.WriteFieldEnd();
        if (__isset.tpCdsOrigem) {
          field.Name = "tpCdsOrigem";
          field.Type = TType.I32;
          field.ID = 11;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(TpCdsOrigem);
          oprot.WriteFieldEnd();
        }
        if (CpfCidadao != null && __isset.cpfCidadao) {
          field.Name = "cpfCidadao";
          field.Type = TType.String;
          field.ID = 12;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CpfCidadao);
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
      StringBuilder __sb = new StringBuilder("FichaConsumoAlimentarThrift(");
      bool __first = true;
      if (HeaderTransport != null && __isset.headerTransport) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("HeaderTransport: ");
        __sb.Append(HeaderTransport== null ? "<null>" : HeaderTransport.ToString());
      }
      if (CnsCidadao != null && __isset.cnsCidadao) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CnsCidadao: ");
        __sb.Append(CnsCidadao);
      }
      if (__isset.dataNascimento) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DataNascimento: ");
        __sb.Append(DataNascimento);
      }
      if (__isset.sexo) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Sexo: ");
        __sb.Append(Sexo);
      }
      if (__isset.localAtendimento) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("LocalAtendimento: ");
        __sb.Append(LocalAtendimento);
      }
      if (PerguntasQuestionarioCriancasMenoresSeisMeses != null && __isset.perguntasQuestionarioCriancasMenoresSeisMeses) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("PerguntasQuestionarioCriancasMenoresSeisMeses: ");
        __sb.Append(PerguntasQuestionarioCriancasMenoresSeisMeses);
      }
      if (PerguntasQuestionarioCriancasDeSeisVinteTresMeses != null && __isset.perguntasQuestionarioCriancasDeSeisVinteTresMeses) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("PerguntasQuestionarioCriancasDeSeisVinteTresMeses: ");
        __sb.Append(PerguntasQuestionarioCriancasDeSeisVinteTresMeses);
      }
      if (PerguntasQuestionarioCriancasComMaisDoisAnos != null && __isset.perguntasQuestionarioCriancasComMaisDoisAnos) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("PerguntasQuestionarioCriancasComMaisDoisAnos: ");
        __sb.Append(PerguntasQuestionarioCriancasComMaisDoisAnos);
      }
      if(!__first) { __sb.Append(", "); }
      __sb.Append("UuidFicha: ");
      __sb.Append(UuidFicha);
      if (__isset.tpCdsOrigem) {
        __sb.Append(", TpCdsOrigem: ");
        __sb.Append(TpCdsOrigem);
      }
      if (CpfCidadao != null && __isset.cpfCidadao) {
        __sb.Append(", CpfCidadao: ");
        __sb.Append(CpfCidadao);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
