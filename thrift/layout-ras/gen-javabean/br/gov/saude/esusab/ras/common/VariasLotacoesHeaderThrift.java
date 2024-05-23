/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.common;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-05-23")
public class VariasLotacoesHeaderThrift implements org.apache.thrift.TBase<VariasLotacoesHeaderThrift, VariasLotacoesHeaderThrift._Fields>, java.io.Serializable, Cloneable, Comparable<VariasLotacoesHeaderThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VariasLotacoesHeaderThrift");

  private static final org.apache.thrift.protocol.TField LOTACAO_FORM_PRINCIPAL_FIELD_DESC = new org.apache.thrift.protocol.TField("lotacaoFormPrincipal", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO_FIELD_DESC = new org.apache.thrift.protocol.TField("lotacaoFormAtendimentoCompartilhado", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField DATA_ATENDIMENTO_FIELD_DESC = new org.apache.thrift.protocol.TField("dataAtendimento", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField CODIGO_IBGE_MUNICIPIO_FIELD_DESC = new org.apache.thrift.protocol.TField("codigoIbgeMunicipio", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VariasLotacoesHeaderThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VariasLotacoesHeaderThriftTupleSchemeFactory());
  }

  private LotacaoHeaderThrift lotacaoFormPrincipal; // optional
  private LotacaoHeaderThrift lotacaoFormAtendimentoCompartilhado; // optional
  private long dataAtendimento; // optional
  private String codigoIbgeMunicipio; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOTACAO_FORM_PRINCIPAL((short)6, "lotacaoFormPrincipal"),
    LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO((short)7, "lotacaoFormAtendimentoCompartilhado"),
    DATA_ATENDIMENTO((short)8, "dataAtendimento"),
    CODIGO_IBGE_MUNICIPIO((short)9, "codigoIbgeMunicipio");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 6: // LOTACAO_FORM_PRINCIPAL
          return LOTACAO_FORM_PRINCIPAL;
        case 7: // LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO
          return LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO;
        case 8: // DATA_ATENDIMENTO
          return DATA_ATENDIMENTO;
        case 9: // CODIGO_IBGE_MUNICIPIO
          return CODIGO_IBGE_MUNICIPIO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DATAATENDIMENTO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LOTACAO_FORM_PRINCIPAL,_Fields.LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO,_Fields.DATA_ATENDIMENTO,_Fields.CODIGO_IBGE_MUNICIPIO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOTACAO_FORM_PRINCIPAL, new org.apache.thrift.meta_data.FieldMetaData("lotacaoFormPrincipal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LotacaoHeaderThrift.class)));
    tmpMap.put(_Fields.LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO, new org.apache.thrift.meta_data.FieldMetaData("lotacaoFormAtendimentoCompartilhado", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LotacaoHeaderThrift.class)));
    tmpMap.put(_Fields.DATA_ATENDIMENTO, new org.apache.thrift.meta_data.FieldMetaData("dataAtendimento", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CODIGO_IBGE_MUNICIPIO, new org.apache.thrift.meta_data.FieldMetaData("codigoIbgeMunicipio", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VariasLotacoesHeaderThrift.class, metaDataMap);
  }

  public VariasLotacoesHeaderThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VariasLotacoesHeaderThrift(VariasLotacoesHeaderThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLotacaoFormPrincipal()) {
      this.lotacaoFormPrincipal = new LotacaoHeaderThrift(other.lotacaoFormPrincipal);
    }
    if (other.isSetLotacaoFormAtendimentoCompartilhado()) {
      this.lotacaoFormAtendimentoCompartilhado = new LotacaoHeaderThrift(other.lotacaoFormAtendimentoCompartilhado);
    }
    this.dataAtendimento = other.dataAtendimento;
    if (other.isSetCodigoIbgeMunicipio()) {
      this.codigoIbgeMunicipio = other.codigoIbgeMunicipio;
    }
  }

  public VariasLotacoesHeaderThrift deepCopy() {
    return new VariasLotacoesHeaderThrift(this);
  }

  @Override
  public void clear() {
    this.lotacaoFormPrincipal = null;
    this.lotacaoFormAtendimentoCompartilhado = null;
    setDataAtendimentoIsSet(false);
    this.dataAtendimento = 0;
    this.codigoIbgeMunicipio = null;
  }

  public LotacaoHeaderThrift getLotacaoFormPrincipal() {
    return this.lotacaoFormPrincipal;
  }

  public void setLotacaoFormPrincipal(LotacaoHeaderThrift lotacaoFormPrincipal) {
    this.lotacaoFormPrincipal = lotacaoFormPrincipal;
  }

  public void unsetLotacaoFormPrincipal() {
    this.lotacaoFormPrincipal = null;
  }

  /** Returns true if field lotacaoFormPrincipal is set (has been assigned a value) and false otherwise */
  public boolean isSetLotacaoFormPrincipal() {
    return this.lotacaoFormPrincipal != null;
  }

  public void setLotacaoFormPrincipalIsSet(boolean value) {
    if (!value) {
      this.lotacaoFormPrincipal = null;
    }
  }

  public LotacaoHeaderThrift getLotacaoFormAtendimentoCompartilhado() {
    return this.lotacaoFormAtendimentoCompartilhado;
  }

  public void setLotacaoFormAtendimentoCompartilhado(LotacaoHeaderThrift lotacaoFormAtendimentoCompartilhado) {
    this.lotacaoFormAtendimentoCompartilhado = lotacaoFormAtendimentoCompartilhado;
  }

  public void unsetLotacaoFormAtendimentoCompartilhado() {
    this.lotacaoFormAtendimentoCompartilhado = null;
  }

  /** Returns true if field lotacaoFormAtendimentoCompartilhado is set (has been assigned a value) and false otherwise */
  public boolean isSetLotacaoFormAtendimentoCompartilhado() {
    return this.lotacaoFormAtendimentoCompartilhado != null;
  }

  public void setLotacaoFormAtendimentoCompartilhadoIsSet(boolean value) {
    if (!value) {
      this.lotacaoFormAtendimentoCompartilhado = null;
    }
  }

  public long getDataAtendimento() {
    return this.dataAtendimento;
  }

  public void setDataAtendimento(long dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
    setDataAtendimentoIsSet(true);
  }

  public void unsetDataAtendimento() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATAATENDIMENTO_ISSET_ID);
  }

  /** Returns true if field dataAtendimento is set (has been assigned a value) and false otherwise */
  public boolean isSetDataAtendimento() {
    return EncodingUtils.testBit(__isset_bitfield, __DATAATENDIMENTO_ISSET_ID);
  }

  public void setDataAtendimentoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATAATENDIMENTO_ISSET_ID, value);
  }

  public String getCodigoIbgeMunicipio() {
    return this.codigoIbgeMunicipio;
  }

  public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
    this.codigoIbgeMunicipio = codigoIbgeMunicipio;
  }

  public void unsetCodigoIbgeMunicipio() {
    this.codigoIbgeMunicipio = null;
  }

  /** Returns true if field codigoIbgeMunicipio is set (has been assigned a value) and false otherwise */
  public boolean isSetCodigoIbgeMunicipio() {
    return this.codigoIbgeMunicipio != null;
  }

  public void setCodigoIbgeMunicipioIsSet(boolean value) {
    if (!value) {
      this.codigoIbgeMunicipio = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOTACAO_FORM_PRINCIPAL:
      if (value == null) {
        unsetLotacaoFormPrincipal();
      } else {
        setLotacaoFormPrincipal((LotacaoHeaderThrift)value);
      }
      break;

    case LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO:
      if (value == null) {
        unsetLotacaoFormAtendimentoCompartilhado();
      } else {
        setLotacaoFormAtendimentoCompartilhado((LotacaoHeaderThrift)value);
      }
      break;

    case DATA_ATENDIMENTO:
      if (value == null) {
        unsetDataAtendimento();
      } else {
        setDataAtendimento((Long)value);
      }
      break;

    case CODIGO_IBGE_MUNICIPIO:
      if (value == null) {
        unsetCodigoIbgeMunicipio();
      } else {
        setCodigoIbgeMunicipio((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOTACAO_FORM_PRINCIPAL:
      return getLotacaoFormPrincipal();

    case LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO:
      return getLotacaoFormAtendimentoCompartilhado();

    case DATA_ATENDIMENTO:
      return getDataAtendimento();

    case CODIGO_IBGE_MUNICIPIO:
      return getCodigoIbgeMunicipio();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOTACAO_FORM_PRINCIPAL:
      return isSetLotacaoFormPrincipal();
    case LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO:
      return isSetLotacaoFormAtendimentoCompartilhado();
    case DATA_ATENDIMENTO:
      return isSetDataAtendimento();
    case CODIGO_IBGE_MUNICIPIO:
      return isSetCodigoIbgeMunicipio();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VariasLotacoesHeaderThrift)
      return this.equals((VariasLotacoesHeaderThrift)that);
    return false;
  }

  public boolean equals(VariasLotacoesHeaderThrift that) {
    if (that == null)
      return false;

    boolean this_present_lotacaoFormPrincipal = true && this.isSetLotacaoFormPrincipal();
    boolean that_present_lotacaoFormPrincipal = true && that.isSetLotacaoFormPrincipal();
    if (this_present_lotacaoFormPrincipal || that_present_lotacaoFormPrincipal) {
      if (!(this_present_lotacaoFormPrincipal && that_present_lotacaoFormPrincipal))
        return false;
      if (!this.lotacaoFormPrincipal.equals(that.lotacaoFormPrincipal))
        return false;
    }

    boolean this_present_lotacaoFormAtendimentoCompartilhado = true && this.isSetLotacaoFormAtendimentoCompartilhado();
    boolean that_present_lotacaoFormAtendimentoCompartilhado = true && that.isSetLotacaoFormAtendimentoCompartilhado();
    if (this_present_lotacaoFormAtendimentoCompartilhado || that_present_lotacaoFormAtendimentoCompartilhado) {
      if (!(this_present_lotacaoFormAtendimentoCompartilhado && that_present_lotacaoFormAtendimentoCompartilhado))
        return false;
      if (!this.lotacaoFormAtendimentoCompartilhado.equals(that.lotacaoFormAtendimentoCompartilhado))
        return false;
    }

    boolean this_present_dataAtendimento = true && this.isSetDataAtendimento();
    boolean that_present_dataAtendimento = true && that.isSetDataAtendimento();
    if (this_present_dataAtendimento || that_present_dataAtendimento) {
      if (!(this_present_dataAtendimento && that_present_dataAtendimento))
        return false;
      if (this.dataAtendimento != that.dataAtendimento)
        return false;
    }

    boolean this_present_codigoIbgeMunicipio = true && this.isSetCodigoIbgeMunicipio();
    boolean that_present_codigoIbgeMunicipio = true && that.isSetCodigoIbgeMunicipio();
    if (this_present_codigoIbgeMunicipio || that_present_codigoIbgeMunicipio) {
      if (!(this_present_codigoIbgeMunicipio && that_present_codigoIbgeMunicipio))
        return false;
      if (!this.codigoIbgeMunicipio.equals(that.codigoIbgeMunicipio))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lotacaoFormPrincipal = true && (isSetLotacaoFormPrincipal());
    list.add(present_lotacaoFormPrincipal);
    if (present_lotacaoFormPrincipal)
      list.add(lotacaoFormPrincipal);

    boolean present_lotacaoFormAtendimentoCompartilhado = true && (isSetLotacaoFormAtendimentoCompartilhado());
    list.add(present_lotacaoFormAtendimentoCompartilhado);
    if (present_lotacaoFormAtendimentoCompartilhado)
      list.add(lotacaoFormAtendimentoCompartilhado);

    boolean present_dataAtendimento = true && (isSetDataAtendimento());
    list.add(present_dataAtendimento);
    if (present_dataAtendimento)
      list.add(dataAtendimento);

    boolean present_codigoIbgeMunicipio = true && (isSetCodigoIbgeMunicipio());
    list.add(present_codigoIbgeMunicipio);
    if (present_codigoIbgeMunicipio)
      list.add(codigoIbgeMunicipio);

    return list.hashCode();
  }

  @Override
  public int compareTo(VariasLotacoesHeaderThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLotacaoFormPrincipal()).compareTo(other.isSetLotacaoFormPrincipal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLotacaoFormPrincipal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lotacaoFormPrincipal, other.lotacaoFormPrincipal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLotacaoFormAtendimentoCompartilhado()).compareTo(other.isSetLotacaoFormAtendimentoCompartilhado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLotacaoFormAtendimentoCompartilhado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lotacaoFormAtendimentoCompartilhado, other.lotacaoFormAtendimentoCompartilhado);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataAtendimento()).compareTo(other.isSetDataAtendimento());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataAtendimento()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataAtendimento, other.dataAtendimento);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCodigoIbgeMunicipio()).compareTo(other.isSetCodigoIbgeMunicipio());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodigoIbgeMunicipio()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codigoIbgeMunicipio, other.codigoIbgeMunicipio);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VariasLotacoesHeaderThrift(");
    boolean first = true;

    if (isSetLotacaoFormPrincipal()) {
      sb.append("lotacaoFormPrincipal:");
      if (this.lotacaoFormPrincipal == null) {
        sb.append("null");
      } else {
        sb.append(this.lotacaoFormPrincipal);
      }
      first = false;
    }
    if (isSetLotacaoFormAtendimentoCompartilhado()) {
      if (!first) sb.append(", ");
      sb.append("lotacaoFormAtendimentoCompartilhado:");
      if (this.lotacaoFormAtendimentoCompartilhado == null) {
        sb.append("null");
      } else {
        sb.append(this.lotacaoFormAtendimentoCompartilhado);
      }
      first = false;
    }
    if (isSetDataAtendimento()) {
      if (!first) sb.append(", ");
      sb.append("dataAtendimento:");
      sb.append(this.dataAtendimento);
      first = false;
    }
    if (isSetCodigoIbgeMunicipio()) {
      if (!first) sb.append(", ");
      sb.append("codigoIbgeMunicipio:");
      if (this.codigoIbgeMunicipio == null) {
        sb.append("null");
      } else {
        sb.append(this.codigoIbgeMunicipio);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (lotacaoFormPrincipal != null) {
      lotacaoFormPrincipal.validate();
    }
    if (lotacaoFormAtendimentoCompartilhado != null) {
      lotacaoFormAtendimentoCompartilhado.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VariasLotacoesHeaderThriftStandardSchemeFactory implements SchemeFactory {
    public VariasLotacoesHeaderThriftStandardScheme getScheme() {
      return new VariasLotacoesHeaderThriftStandardScheme();
    }
  }

  private static class VariasLotacoesHeaderThriftStandardScheme extends StandardScheme<VariasLotacoesHeaderThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VariasLotacoesHeaderThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 6: // LOTACAO_FORM_PRINCIPAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.lotacaoFormPrincipal = new LotacaoHeaderThrift();
              struct.lotacaoFormPrincipal.read(iprot);
              struct.setLotacaoFormPrincipalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.lotacaoFormAtendimentoCompartilhado = new LotacaoHeaderThrift();
              struct.lotacaoFormAtendimentoCompartilhado.read(iprot);
              struct.setLotacaoFormAtendimentoCompartilhadoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // DATA_ATENDIMENTO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dataAtendimento = iprot.readI64();
              struct.setDataAtendimentoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // CODIGO_IBGE_MUNICIPIO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.codigoIbgeMunicipio = iprot.readString();
              struct.setCodigoIbgeMunicipioIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, VariasLotacoesHeaderThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.lotacaoFormPrincipal != null) {
        if (struct.isSetLotacaoFormPrincipal()) {
          oprot.writeFieldBegin(LOTACAO_FORM_PRINCIPAL_FIELD_DESC);
          struct.lotacaoFormPrincipal.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.lotacaoFormAtendimentoCompartilhado != null) {
        if (struct.isSetLotacaoFormAtendimentoCompartilhado()) {
          oprot.writeFieldBegin(LOTACAO_FORM_ATENDIMENTO_COMPARTILHADO_FIELD_DESC);
          struct.lotacaoFormAtendimentoCompartilhado.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDataAtendimento()) {
        oprot.writeFieldBegin(DATA_ATENDIMENTO_FIELD_DESC);
        oprot.writeI64(struct.dataAtendimento);
        oprot.writeFieldEnd();
      }
      if (struct.codigoIbgeMunicipio != null) {
        if (struct.isSetCodigoIbgeMunicipio()) {
          oprot.writeFieldBegin(CODIGO_IBGE_MUNICIPIO_FIELD_DESC);
          oprot.writeString(struct.codigoIbgeMunicipio);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VariasLotacoesHeaderThriftTupleSchemeFactory implements SchemeFactory {
    public VariasLotacoesHeaderThriftTupleScheme getScheme() {
      return new VariasLotacoesHeaderThriftTupleScheme();
    }
  }

  private static class VariasLotacoesHeaderThriftTupleScheme extends TupleScheme<VariasLotacoesHeaderThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VariasLotacoesHeaderThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLotacaoFormPrincipal()) {
        optionals.set(0);
      }
      if (struct.isSetLotacaoFormAtendimentoCompartilhado()) {
        optionals.set(1);
      }
      if (struct.isSetDataAtendimento()) {
        optionals.set(2);
      }
      if (struct.isSetCodigoIbgeMunicipio()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLotacaoFormPrincipal()) {
        struct.lotacaoFormPrincipal.write(oprot);
      }
      if (struct.isSetLotacaoFormAtendimentoCompartilhado()) {
        struct.lotacaoFormAtendimentoCompartilhado.write(oprot);
      }
      if (struct.isSetDataAtendimento()) {
        oprot.writeI64(struct.dataAtendimento);
      }
      if (struct.isSetCodigoIbgeMunicipio()) {
        oprot.writeString(struct.codigoIbgeMunicipio);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VariasLotacoesHeaderThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.lotacaoFormPrincipal = new LotacaoHeaderThrift();
        struct.lotacaoFormPrincipal.read(iprot);
        struct.setLotacaoFormPrincipalIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lotacaoFormAtendimentoCompartilhado = new LotacaoHeaderThrift();
        struct.lotacaoFormAtendimentoCompartilhado.read(iprot);
        struct.setLotacaoFormAtendimentoCompartilhadoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dataAtendimento = iprot.readI64();
        struct.setDataAtendimentoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.codigoIbgeMunicipio = iprot.readString();
        struct.setCodigoIbgeMunicipioIsSet(true);
      }
    }
  }

}

