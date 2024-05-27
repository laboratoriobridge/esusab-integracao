/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.atendodonto;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-05-27")
public class FichaAtendimentoOdontologicoMasterThrift implements org.apache.thrift.TBase<FichaAtendimentoOdontologicoMasterThrift, FichaAtendimentoOdontologicoMasterThrift._Fields>, java.io.Serializable, Cloneable, Comparable<FichaAtendimentoOdontologicoMasterThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FichaAtendimentoOdontologicoMasterThrift");

  private static final org.apache.thrift.protocol.TField UUID_FICHA_FIELD_DESC = new org.apache.thrift.protocol.TField("uuidFicha", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEADER_TRANSPORT_FIELD_DESC = new org.apache.thrift.protocol.TField("headerTransport", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ATENDIMENTOS_ODONTOLOGICOS_FIELD_DESC = new org.apache.thrift.protocol.TField("atendimentosOdontologicos", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField TP_CDS_ORIGEM_FIELD_DESC = new org.apache.thrift.protocol.TField("tpCdsOrigem", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FichaAtendimentoOdontologicoMasterThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FichaAtendimentoOdontologicoMasterThriftTupleSchemeFactory());
  }

  private String uuidFicha; // required
  private br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift headerTransport; // optional
  private List<FichaAtendimentoOdontologicoChildThrift> atendimentosOdontologicos; // optional
  private int tpCdsOrigem; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UUID_FICHA((short)1, "uuidFicha"),
    HEADER_TRANSPORT((short)2, "headerTransport"),
    ATENDIMENTOS_ODONTOLOGICOS((short)3, "atendimentosOdontologicos"),
    TP_CDS_ORIGEM((short)4, "tpCdsOrigem");

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
        case 1: // UUID_FICHA
          return UUID_FICHA;
        case 2: // HEADER_TRANSPORT
          return HEADER_TRANSPORT;
        case 3: // ATENDIMENTOS_ODONTOLOGICOS
          return ATENDIMENTOS_ODONTOLOGICOS;
        case 4: // TP_CDS_ORIGEM
          return TP_CDS_ORIGEM;
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
  private static final int __TPCDSORIGEM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HEADER_TRANSPORT,_Fields.ATENDIMENTOS_ODONTOLOGICOS,_Fields.TP_CDS_ORIGEM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID_FICHA, new org.apache.thrift.meta_data.FieldMetaData("uuidFicha", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEADER_TRANSPORT, new org.apache.thrift.meta_data.FieldMetaData("headerTransport", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift.class)));
    tmpMap.put(_Fields.ATENDIMENTOS_ODONTOLOGICOS, new org.apache.thrift.meta_data.FieldMetaData("atendimentosOdontologicos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FichaAtendimentoOdontologicoChildThrift.class))));
    tmpMap.put(_Fields.TP_CDS_ORIGEM, new org.apache.thrift.meta_data.FieldMetaData("tpCdsOrigem", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FichaAtendimentoOdontologicoMasterThrift.class, metaDataMap);
  }

  public FichaAtendimentoOdontologicoMasterThrift() {
  }

  public FichaAtendimentoOdontologicoMasterThrift(
    String uuidFicha)
  {
    this();
    this.uuidFicha = uuidFicha;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FichaAtendimentoOdontologicoMasterThrift(FichaAtendimentoOdontologicoMasterThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUuidFicha()) {
      this.uuidFicha = other.uuidFicha;
    }
    if (other.isSetHeaderTransport()) {
      this.headerTransport = new br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift(other.headerTransport);
    }
    if (other.isSetAtendimentosOdontologicos()) {
      List<FichaAtendimentoOdontologicoChildThrift> __this__atendimentosOdontologicos = new ArrayList<FichaAtendimentoOdontologicoChildThrift>(other.atendimentosOdontologicos.size());
      for (FichaAtendimentoOdontologicoChildThrift other_element : other.atendimentosOdontologicos) {
        __this__atendimentosOdontologicos.add(new FichaAtendimentoOdontologicoChildThrift(other_element));
      }
      this.atendimentosOdontologicos = __this__atendimentosOdontologicos;
    }
    this.tpCdsOrigem = other.tpCdsOrigem;
  }

  public FichaAtendimentoOdontologicoMasterThrift deepCopy() {
    return new FichaAtendimentoOdontologicoMasterThrift(this);
  }

  @Override
  public void clear() {
    this.uuidFicha = null;
    this.headerTransport = null;
    this.atendimentosOdontologicos = null;
    setTpCdsOrigemIsSet(false);
    this.tpCdsOrigem = 0;
  }

  public String getUuidFicha() {
    return this.uuidFicha;
  }

  public void setUuidFicha(String uuidFicha) {
    this.uuidFicha = uuidFicha;
  }

  public void unsetUuidFicha() {
    this.uuidFicha = null;
  }

  /** Returns true if field uuidFicha is set (has been assigned a value) and false otherwise */
  public boolean isSetUuidFicha() {
    return this.uuidFicha != null;
  }

  public void setUuidFichaIsSet(boolean value) {
    if (!value) {
      this.uuidFicha = null;
    }
  }

  public br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift getHeaderTransport() {
    return this.headerTransport;
  }

  public void setHeaderTransport(br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift headerTransport) {
    this.headerTransport = headerTransport;
  }

  public void unsetHeaderTransport() {
    this.headerTransport = null;
  }

  /** Returns true if field headerTransport is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaderTransport() {
    return this.headerTransport != null;
  }

  public void setHeaderTransportIsSet(boolean value) {
    if (!value) {
      this.headerTransport = null;
    }
  }

  public int getAtendimentosOdontologicosSize() {
    return (this.atendimentosOdontologicos == null) ? 0 : this.atendimentosOdontologicos.size();
  }

  public java.util.Iterator<FichaAtendimentoOdontologicoChildThrift> getAtendimentosOdontologicosIterator() {
    return (this.atendimentosOdontologicos == null) ? null : this.atendimentosOdontologicos.iterator();
  }

  public void addToAtendimentosOdontologicos(FichaAtendimentoOdontologicoChildThrift elem) {
    if (this.atendimentosOdontologicos == null) {
      this.atendimentosOdontologicos = new ArrayList<FichaAtendimentoOdontologicoChildThrift>();
    }
    this.atendimentosOdontologicos.add(elem);
  }

  public List<FichaAtendimentoOdontologicoChildThrift> getAtendimentosOdontologicos() {
    return this.atendimentosOdontologicos;
  }

  public void setAtendimentosOdontologicos(List<FichaAtendimentoOdontologicoChildThrift> atendimentosOdontologicos) {
    this.atendimentosOdontologicos = atendimentosOdontologicos;
  }

  public void unsetAtendimentosOdontologicos() {
    this.atendimentosOdontologicos = null;
  }

  /** Returns true if field atendimentosOdontologicos is set (has been assigned a value) and false otherwise */
  public boolean isSetAtendimentosOdontologicos() {
    return this.atendimentosOdontologicos != null;
  }

  public void setAtendimentosOdontologicosIsSet(boolean value) {
    if (!value) {
      this.atendimentosOdontologicos = null;
    }
  }

  public int getTpCdsOrigem() {
    return this.tpCdsOrigem;
  }

  public void setTpCdsOrigem(int tpCdsOrigem) {
    this.tpCdsOrigem = tpCdsOrigem;
    setTpCdsOrigemIsSet(true);
  }

  public void unsetTpCdsOrigem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID);
  }

  /** Returns true if field tpCdsOrigem is set (has been assigned a value) and false otherwise */
  public boolean isSetTpCdsOrigem() {
    return EncodingUtils.testBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID);
  }

  public void setTpCdsOrigemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TPCDSORIGEM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UUID_FICHA:
      if (value == null) {
        unsetUuidFicha();
      } else {
        setUuidFicha((String)value);
      }
      break;

    case HEADER_TRANSPORT:
      if (value == null) {
        unsetHeaderTransport();
      } else {
        setHeaderTransport((br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift)value);
      }
      break;

    case ATENDIMENTOS_ODONTOLOGICOS:
      if (value == null) {
        unsetAtendimentosOdontologicos();
      } else {
        setAtendimentosOdontologicos((List<FichaAtendimentoOdontologicoChildThrift>)value);
      }
      break;

    case TP_CDS_ORIGEM:
      if (value == null) {
        unsetTpCdsOrigem();
      } else {
        setTpCdsOrigem((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID_FICHA:
      return getUuidFicha();

    case HEADER_TRANSPORT:
      return getHeaderTransport();

    case ATENDIMENTOS_ODONTOLOGICOS:
      return getAtendimentosOdontologicos();

    case TP_CDS_ORIGEM:
      return getTpCdsOrigem();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UUID_FICHA:
      return isSetUuidFicha();
    case HEADER_TRANSPORT:
      return isSetHeaderTransport();
    case ATENDIMENTOS_ODONTOLOGICOS:
      return isSetAtendimentosOdontologicos();
    case TP_CDS_ORIGEM:
      return isSetTpCdsOrigem();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FichaAtendimentoOdontologicoMasterThrift)
      return this.equals((FichaAtendimentoOdontologicoMasterThrift)that);
    return false;
  }

  public boolean equals(FichaAtendimentoOdontologicoMasterThrift that) {
    if (that == null)
      return false;

    boolean this_present_uuidFicha = true && this.isSetUuidFicha();
    boolean that_present_uuidFicha = true && that.isSetUuidFicha();
    if (this_present_uuidFicha || that_present_uuidFicha) {
      if (!(this_present_uuidFicha && that_present_uuidFicha))
        return false;
      if (!this.uuidFicha.equals(that.uuidFicha))
        return false;
    }

    boolean this_present_headerTransport = true && this.isSetHeaderTransport();
    boolean that_present_headerTransport = true && that.isSetHeaderTransport();
    if (this_present_headerTransport || that_present_headerTransport) {
      if (!(this_present_headerTransport && that_present_headerTransport))
        return false;
      if (!this.headerTransport.equals(that.headerTransport))
        return false;
    }

    boolean this_present_atendimentosOdontologicos = true && this.isSetAtendimentosOdontologicos();
    boolean that_present_atendimentosOdontologicos = true && that.isSetAtendimentosOdontologicos();
    if (this_present_atendimentosOdontologicos || that_present_atendimentosOdontologicos) {
      if (!(this_present_atendimentosOdontologicos && that_present_atendimentosOdontologicos))
        return false;
      if (!this.atendimentosOdontologicos.equals(that.atendimentosOdontologicos))
        return false;
    }

    boolean this_present_tpCdsOrigem = true && this.isSetTpCdsOrigem();
    boolean that_present_tpCdsOrigem = true && that.isSetTpCdsOrigem();
    if (this_present_tpCdsOrigem || that_present_tpCdsOrigem) {
      if (!(this_present_tpCdsOrigem && that_present_tpCdsOrigem))
        return false;
      if (this.tpCdsOrigem != that.tpCdsOrigem)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuidFicha = true && (isSetUuidFicha());
    list.add(present_uuidFicha);
    if (present_uuidFicha)
      list.add(uuidFicha);

    boolean present_headerTransport = true && (isSetHeaderTransport());
    list.add(present_headerTransport);
    if (present_headerTransport)
      list.add(headerTransport);

    boolean present_atendimentosOdontologicos = true && (isSetAtendimentosOdontologicos());
    list.add(present_atendimentosOdontologicos);
    if (present_atendimentosOdontologicos)
      list.add(atendimentosOdontologicos);

    boolean present_tpCdsOrigem = true && (isSetTpCdsOrigem());
    list.add(present_tpCdsOrigem);
    if (present_tpCdsOrigem)
      list.add(tpCdsOrigem);

    return list.hashCode();
  }

  @Override
  public int compareTo(FichaAtendimentoOdontologicoMasterThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuidFicha()).compareTo(other.isSetUuidFicha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuidFicha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuidFicha, other.uuidFicha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeaderTransport()).compareTo(other.isSetHeaderTransport());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaderTransport()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headerTransport, other.headerTransport);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAtendimentosOdontologicos()).compareTo(other.isSetAtendimentosOdontologicos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAtendimentosOdontologicos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.atendimentosOdontologicos, other.atendimentosOdontologicos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTpCdsOrigem()).compareTo(other.isSetTpCdsOrigem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTpCdsOrigem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tpCdsOrigem, other.tpCdsOrigem);
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
    StringBuilder sb = new StringBuilder("FichaAtendimentoOdontologicoMasterThrift(");
    boolean first = true;

    sb.append("uuidFicha:");
    if (this.uuidFicha == null) {
      sb.append("null");
    } else {
      sb.append(this.uuidFicha);
    }
    first = false;
    if (isSetHeaderTransport()) {
      if (!first) sb.append(", ");
      sb.append("headerTransport:");
      if (this.headerTransport == null) {
        sb.append("null");
      } else {
        sb.append(this.headerTransport);
      }
      first = false;
    }
    if (isSetAtendimentosOdontologicos()) {
      if (!first) sb.append(", ");
      sb.append("atendimentosOdontologicos:");
      if (this.atendimentosOdontologicos == null) {
        sb.append("null");
      } else {
        sb.append(this.atendimentosOdontologicos);
      }
      first = false;
    }
    if (isSetTpCdsOrigem()) {
      if (!first) sb.append(", ");
      sb.append("tpCdsOrigem:");
      sb.append(this.tpCdsOrigem);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUuidFicha()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuidFicha' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (headerTransport != null) {
      headerTransport.validate();
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

  private static class FichaAtendimentoOdontologicoMasterThriftStandardSchemeFactory implements SchemeFactory {
    public FichaAtendimentoOdontologicoMasterThriftStandardScheme getScheme() {
      return new FichaAtendimentoOdontologicoMasterThriftStandardScheme();
    }
  }

  private static class FichaAtendimentoOdontologicoMasterThriftStandardScheme extends StandardScheme<FichaAtendimentoOdontologicoMasterThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FichaAtendimentoOdontologicoMasterThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID_FICHA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uuidFicha = iprot.readString();
              struct.setUuidFichaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEADER_TRANSPORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.headerTransport = new br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift();
              struct.headerTransport.read(iprot);
              struct.setHeaderTransportIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATENDIMENTOS_ODONTOLOGICOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.atendimentosOdontologicos = new ArrayList<FichaAtendimentoOdontologicoChildThrift>(_list64.size);
                FichaAtendimentoOdontologicoChildThrift _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new FichaAtendimentoOdontologicoChildThrift();
                  _elem65.read(iprot);
                  struct.atendimentosOdontologicos.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setAtendimentosOdontologicosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TP_CDS_ORIGEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tpCdsOrigem = iprot.readI32();
              struct.setTpCdsOrigemIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FichaAtendimentoOdontologicoMasterThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuidFicha != null) {
        oprot.writeFieldBegin(UUID_FICHA_FIELD_DESC);
        oprot.writeString(struct.uuidFicha);
        oprot.writeFieldEnd();
      }
      if (struct.headerTransport != null) {
        if (struct.isSetHeaderTransport()) {
          oprot.writeFieldBegin(HEADER_TRANSPORT_FIELD_DESC);
          struct.headerTransport.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.atendimentosOdontologicos != null) {
        if (struct.isSetAtendimentosOdontologicos()) {
          oprot.writeFieldBegin(ATENDIMENTOS_ODONTOLOGICOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.atendimentosOdontologicos.size()));
            for (FichaAtendimentoOdontologicoChildThrift _iter67 : struct.atendimentosOdontologicos)
            {
              _iter67.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTpCdsOrigem()) {
        oprot.writeFieldBegin(TP_CDS_ORIGEM_FIELD_DESC);
        oprot.writeI32(struct.tpCdsOrigem);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FichaAtendimentoOdontologicoMasterThriftTupleSchemeFactory implements SchemeFactory {
    public FichaAtendimentoOdontologicoMasterThriftTupleScheme getScheme() {
      return new FichaAtendimentoOdontologicoMasterThriftTupleScheme();
    }
  }

  private static class FichaAtendimentoOdontologicoMasterThriftTupleScheme extends TupleScheme<FichaAtendimentoOdontologicoMasterThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FichaAtendimentoOdontologicoMasterThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.uuidFicha);
      BitSet optionals = new BitSet();
      if (struct.isSetHeaderTransport()) {
        optionals.set(0);
      }
      if (struct.isSetAtendimentosOdontologicos()) {
        optionals.set(1);
      }
      if (struct.isSetTpCdsOrigem()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetHeaderTransport()) {
        struct.headerTransport.write(oprot);
      }
      if (struct.isSetAtendimentosOdontologicos()) {
        {
          oprot.writeI32(struct.atendimentosOdontologicos.size());
          for (FichaAtendimentoOdontologicoChildThrift _iter68 : struct.atendimentosOdontologicos)
          {
            _iter68.write(oprot);
          }
        }
      }
      if (struct.isSetTpCdsOrigem()) {
        oprot.writeI32(struct.tpCdsOrigem);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FichaAtendimentoOdontologicoMasterThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuidFicha = iprot.readString();
      struct.setUuidFichaIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.headerTransport = new br.gov.saude.esusab.ras.common.VariasLotacoesHeaderThrift();
        struct.headerTransport.read(iprot);
        struct.setHeaderTransportIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.atendimentosOdontologicos = new ArrayList<FichaAtendimentoOdontologicoChildThrift>(_list69.size);
          FichaAtendimentoOdontologicoChildThrift _elem70;
          for (int _i71 = 0; _i71 < _list69.size; ++_i71)
          {
            _elem70 = new FichaAtendimentoOdontologicoChildThrift();
            _elem70.read(iprot);
            struct.atendimentosOdontologicos.add(_elem70);
          }
        }
        struct.setAtendimentosOdontologicosIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tpCdsOrigem = iprot.readI32();
        struct.setTpCdsOrigemIsSet(true);
      }
    }
  }

}

