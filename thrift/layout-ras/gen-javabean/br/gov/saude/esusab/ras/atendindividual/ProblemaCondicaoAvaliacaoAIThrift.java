/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.atendindividual;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2025-06-18")
public class ProblemaCondicaoAvaliacaoAIThrift implements org.apache.thrift.TBase<ProblemaCondicaoAvaliacaoAIThrift, ProblemaCondicaoAvaliacaoAIThrift._Fields>, java.io.Serializable, Cloneable, Comparable<ProblemaCondicaoAvaliacaoAIThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProblemaCondicaoAvaliacaoAIThrift");

  private static final org.apache.thrift.protocol.TField CIAPS_FIELD_DESC = new org.apache.thrift.protocol.TField("ciaps", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField OUTRO_CIAP1_FIELD_DESC = new org.apache.thrift.protocol.TField("outroCiap1", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OUTRO_CIAP2_FIELD_DESC = new org.apache.thrift.protocol.TField("outroCiap2", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CID10_FIELD_DESC = new org.apache.thrift.protocol.TField("cid10", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CID10_2_FIELD_DESC = new org.apache.thrift.protocol.TField("cid10_2", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProblemaCondicaoAvaliacaoAIThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProblemaCondicaoAvaliacaoAIThriftTupleSchemeFactory());
  }

  private List<String> ciaps; // optional
  private String outroCiap1; // optional
  private String outroCiap2; // optional
  private String cid10; // optional
  private String cid10_2; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CIAPS((short)1, "ciaps"),
    OUTRO_CIAP1((short)2, "outroCiap1"),
    OUTRO_CIAP2((short)3, "outroCiap2"),
    CID10((short)4, "cid10"),
    CID10_2((short)5, "cid10_2");

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
        case 1: // CIAPS
          return CIAPS;
        case 2: // OUTRO_CIAP1
          return OUTRO_CIAP1;
        case 3: // OUTRO_CIAP2
          return OUTRO_CIAP2;
        case 4: // CID10
          return CID10;
        case 5: // CID10_2
          return CID10_2;
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
  private static final _Fields optionals[] = {_Fields.CIAPS,_Fields.OUTRO_CIAP1,_Fields.OUTRO_CIAP2,_Fields.CID10,_Fields.CID10_2};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CIAPS, new org.apache.thrift.meta_data.FieldMetaData("ciaps", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OUTRO_CIAP1, new org.apache.thrift.meta_data.FieldMetaData("outroCiap1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OUTRO_CIAP2, new org.apache.thrift.meta_data.FieldMetaData("outroCiap2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CID10, new org.apache.thrift.meta_data.FieldMetaData("cid10", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CID10_2, new org.apache.thrift.meta_data.FieldMetaData("cid10_2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProblemaCondicaoAvaliacaoAIThrift.class, metaDataMap);
  }

  public ProblemaCondicaoAvaliacaoAIThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProblemaCondicaoAvaliacaoAIThrift(ProblemaCondicaoAvaliacaoAIThrift other) {
    if (other.isSetCiaps()) {
      List<String> __this__ciaps = new ArrayList<String>(other.ciaps);
      this.ciaps = __this__ciaps;
    }
    if (other.isSetOutroCiap1()) {
      this.outroCiap1 = other.outroCiap1;
    }
    if (other.isSetOutroCiap2()) {
      this.outroCiap2 = other.outroCiap2;
    }
    if (other.isSetCid10()) {
      this.cid10 = other.cid10;
    }
    if (other.isSetCid10_2()) {
      this.cid10_2 = other.cid10_2;
    }
  }

  public ProblemaCondicaoAvaliacaoAIThrift deepCopy() {
    return new ProblemaCondicaoAvaliacaoAIThrift(this);
  }

  @Override
  public void clear() {
    this.ciaps = null;
    this.outroCiap1 = null;
    this.outroCiap2 = null;
    this.cid10 = null;
    this.cid10_2 = null;
  }

  public int getCiapsSize() {
    return (this.ciaps == null) ? 0 : this.ciaps.size();
  }

  public java.util.Iterator<String> getCiapsIterator() {
    return (this.ciaps == null) ? null : this.ciaps.iterator();
  }

  public void addToCiaps(String elem) {
    if (this.ciaps == null) {
      this.ciaps = new ArrayList<String>();
    }
    this.ciaps.add(elem);
  }

  public List<String> getCiaps() {
    return this.ciaps;
  }

  public void setCiaps(List<String> ciaps) {
    this.ciaps = ciaps;
  }

  public void unsetCiaps() {
    this.ciaps = null;
  }

  /** Returns true if field ciaps is set (has been assigned a value) and false otherwise */
  public boolean isSetCiaps() {
    return this.ciaps != null;
  }

  public void setCiapsIsSet(boolean value) {
    if (!value) {
      this.ciaps = null;
    }
  }

  public String getOutroCiap1() {
    return this.outroCiap1;
  }

  public void setOutroCiap1(String outroCiap1) {
    this.outroCiap1 = outroCiap1;
  }

  public void unsetOutroCiap1() {
    this.outroCiap1 = null;
  }

  /** Returns true if field outroCiap1 is set (has been assigned a value) and false otherwise */
  public boolean isSetOutroCiap1() {
    return this.outroCiap1 != null;
  }

  public void setOutroCiap1IsSet(boolean value) {
    if (!value) {
      this.outroCiap1 = null;
    }
  }

  public String getOutroCiap2() {
    return this.outroCiap2;
  }

  public void setOutroCiap2(String outroCiap2) {
    this.outroCiap2 = outroCiap2;
  }

  public void unsetOutroCiap2() {
    this.outroCiap2 = null;
  }

  /** Returns true if field outroCiap2 is set (has been assigned a value) and false otherwise */
  public boolean isSetOutroCiap2() {
    return this.outroCiap2 != null;
  }

  public void setOutroCiap2IsSet(boolean value) {
    if (!value) {
      this.outroCiap2 = null;
    }
  }

  public String getCid10() {
    return this.cid10;
  }

  public void setCid10(String cid10) {
    this.cid10 = cid10;
  }

  public void unsetCid10() {
    this.cid10 = null;
  }

  /** Returns true if field cid10 is set (has been assigned a value) and false otherwise */
  public boolean isSetCid10() {
    return this.cid10 != null;
  }

  public void setCid10IsSet(boolean value) {
    if (!value) {
      this.cid10 = null;
    }
  }

  public String getCid10_2() {
    return this.cid10_2;
  }

  public void setCid10_2(String cid10_2) {
    this.cid10_2 = cid10_2;
  }

  public void unsetCid10_2() {
    this.cid10_2 = null;
  }

  /** Returns true if field cid10_2 is set (has been assigned a value) and false otherwise */
  public boolean isSetCid10_2() {
    return this.cid10_2 != null;
  }

  public void setCid10_2IsSet(boolean value) {
    if (!value) {
      this.cid10_2 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CIAPS:
      if (value == null) {
        unsetCiaps();
      } else {
        setCiaps((List<String>)value);
      }
      break;

    case OUTRO_CIAP1:
      if (value == null) {
        unsetOutroCiap1();
      } else {
        setOutroCiap1((String)value);
      }
      break;

    case OUTRO_CIAP2:
      if (value == null) {
        unsetOutroCiap2();
      } else {
        setOutroCiap2((String)value);
      }
      break;

    case CID10:
      if (value == null) {
        unsetCid10();
      } else {
        setCid10((String)value);
      }
      break;

    case CID10_2:
      if (value == null) {
        unsetCid10_2();
      } else {
        setCid10_2((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CIAPS:
      return getCiaps();

    case OUTRO_CIAP1:
      return getOutroCiap1();

    case OUTRO_CIAP2:
      return getOutroCiap2();

    case CID10:
      return getCid10();

    case CID10_2:
      return getCid10_2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CIAPS:
      return isSetCiaps();
    case OUTRO_CIAP1:
      return isSetOutroCiap1();
    case OUTRO_CIAP2:
      return isSetOutroCiap2();
    case CID10:
      return isSetCid10();
    case CID10_2:
      return isSetCid10_2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProblemaCondicaoAvaliacaoAIThrift)
      return this.equals((ProblemaCondicaoAvaliacaoAIThrift)that);
    return false;
  }

  public boolean equals(ProblemaCondicaoAvaliacaoAIThrift that) {
    if (that == null)
      return false;

    boolean this_present_ciaps = true && this.isSetCiaps();
    boolean that_present_ciaps = true && that.isSetCiaps();
    if (this_present_ciaps || that_present_ciaps) {
      if (!(this_present_ciaps && that_present_ciaps))
        return false;
      if (!this.ciaps.equals(that.ciaps))
        return false;
    }

    boolean this_present_outroCiap1 = true && this.isSetOutroCiap1();
    boolean that_present_outroCiap1 = true && that.isSetOutroCiap1();
    if (this_present_outroCiap1 || that_present_outroCiap1) {
      if (!(this_present_outroCiap1 && that_present_outroCiap1))
        return false;
      if (!this.outroCiap1.equals(that.outroCiap1))
        return false;
    }

    boolean this_present_outroCiap2 = true && this.isSetOutroCiap2();
    boolean that_present_outroCiap2 = true && that.isSetOutroCiap2();
    if (this_present_outroCiap2 || that_present_outroCiap2) {
      if (!(this_present_outroCiap2 && that_present_outroCiap2))
        return false;
      if (!this.outroCiap2.equals(that.outroCiap2))
        return false;
    }

    boolean this_present_cid10 = true && this.isSetCid10();
    boolean that_present_cid10 = true && that.isSetCid10();
    if (this_present_cid10 || that_present_cid10) {
      if (!(this_present_cid10 && that_present_cid10))
        return false;
      if (!this.cid10.equals(that.cid10))
        return false;
    }

    boolean this_present_cid10_2 = true && this.isSetCid10_2();
    boolean that_present_cid10_2 = true && that.isSetCid10_2();
    if (this_present_cid10_2 || that_present_cid10_2) {
      if (!(this_present_cid10_2 && that_present_cid10_2))
        return false;
      if (!this.cid10_2.equals(that.cid10_2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ciaps = true && (isSetCiaps());
    list.add(present_ciaps);
    if (present_ciaps)
      list.add(ciaps);

    boolean present_outroCiap1 = true && (isSetOutroCiap1());
    list.add(present_outroCiap1);
    if (present_outroCiap1)
      list.add(outroCiap1);

    boolean present_outroCiap2 = true && (isSetOutroCiap2());
    list.add(present_outroCiap2);
    if (present_outroCiap2)
      list.add(outroCiap2);

    boolean present_cid10 = true && (isSetCid10());
    list.add(present_cid10);
    if (present_cid10)
      list.add(cid10);

    boolean present_cid10_2 = true && (isSetCid10_2());
    list.add(present_cid10_2);
    if (present_cid10_2)
      list.add(cid10_2);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProblemaCondicaoAvaliacaoAIThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCiaps()).compareTo(other.isSetCiaps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCiaps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ciaps, other.ciaps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutroCiap1()).compareTo(other.isSetOutroCiap1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutroCiap1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outroCiap1, other.outroCiap1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutroCiap2()).compareTo(other.isSetOutroCiap2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutroCiap2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outroCiap2, other.outroCiap2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCid10()).compareTo(other.isSetCid10());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCid10()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cid10, other.cid10);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCid10_2()).compareTo(other.isSetCid10_2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCid10_2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cid10_2, other.cid10_2);
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
    StringBuilder sb = new StringBuilder("ProblemaCondicaoAvaliacaoAIThrift(");
    boolean first = true;

    if (isSetCiaps()) {
      sb.append("ciaps:");
      if (this.ciaps == null) {
        sb.append("null");
      } else {
        sb.append(this.ciaps);
      }
      first = false;
    }
    if (isSetOutroCiap1()) {
      if (!first) sb.append(", ");
      sb.append("outroCiap1:");
      if (this.outroCiap1 == null) {
        sb.append("null");
      } else {
        sb.append(this.outroCiap1);
      }
      first = false;
    }
    if (isSetOutroCiap2()) {
      if (!first) sb.append(", ");
      sb.append("outroCiap2:");
      if (this.outroCiap2 == null) {
        sb.append("null");
      } else {
        sb.append(this.outroCiap2);
      }
      first = false;
    }
    if (isSetCid10()) {
      if (!first) sb.append(", ");
      sb.append("cid10:");
      if (this.cid10 == null) {
        sb.append("null");
      } else {
        sb.append(this.cid10);
      }
      first = false;
    }
    if (isSetCid10_2()) {
      if (!first) sb.append(", ");
      sb.append("cid10_2:");
      if (this.cid10_2 == null) {
        sb.append("null");
      } else {
        sb.append(this.cid10_2);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProblemaCondicaoAvaliacaoAIThriftStandardSchemeFactory implements SchemeFactory {
    public ProblemaCondicaoAvaliacaoAIThriftStandardScheme getScheme() {
      return new ProblemaCondicaoAvaliacaoAIThriftStandardScheme();
    }
  }

  private static class ProblemaCondicaoAvaliacaoAIThriftStandardScheme extends StandardScheme<ProblemaCondicaoAvaliacaoAIThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProblemaCondicaoAvaliacaoAIThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CIAPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ciaps = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.ciaps.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setCiapsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OUTRO_CIAP1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.outroCiap1 = iprot.readString();
              struct.setOutroCiap1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTRO_CIAP2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.outroCiap2 = iprot.readString();
              struct.setOutroCiap2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CID10
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cid10 = iprot.readString();
              struct.setCid10IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CID10_2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cid10_2 = iprot.readString();
              struct.setCid10_2IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProblemaCondicaoAvaliacaoAIThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ciaps != null) {
        if (struct.isSetCiaps()) {
          oprot.writeFieldBegin(CIAPS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ciaps.size()));
            for (String _iter3 : struct.ciaps)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.outroCiap1 != null) {
        if (struct.isSetOutroCiap1()) {
          oprot.writeFieldBegin(OUTRO_CIAP1_FIELD_DESC);
          oprot.writeString(struct.outroCiap1);
          oprot.writeFieldEnd();
        }
      }
      if (struct.outroCiap2 != null) {
        if (struct.isSetOutroCiap2()) {
          oprot.writeFieldBegin(OUTRO_CIAP2_FIELD_DESC);
          oprot.writeString(struct.outroCiap2);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cid10 != null) {
        if (struct.isSetCid10()) {
          oprot.writeFieldBegin(CID10_FIELD_DESC);
          oprot.writeString(struct.cid10);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cid10_2 != null) {
        if (struct.isSetCid10_2()) {
          oprot.writeFieldBegin(CID10_2_FIELD_DESC);
          oprot.writeString(struct.cid10_2);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProblemaCondicaoAvaliacaoAIThriftTupleSchemeFactory implements SchemeFactory {
    public ProblemaCondicaoAvaliacaoAIThriftTupleScheme getScheme() {
      return new ProblemaCondicaoAvaliacaoAIThriftTupleScheme();
    }
  }

  private static class ProblemaCondicaoAvaliacaoAIThriftTupleScheme extends TupleScheme<ProblemaCondicaoAvaliacaoAIThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProblemaCondicaoAvaliacaoAIThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCiaps()) {
        optionals.set(0);
      }
      if (struct.isSetOutroCiap1()) {
        optionals.set(1);
      }
      if (struct.isSetOutroCiap2()) {
        optionals.set(2);
      }
      if (struct.isSetCid10()) {
        optionals.set(3);
      }
      if (struct.isSetCid10_2()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCiaps()) {
        {
          oprot.writeI32(struct.ciaps.size());
          for (String _iter4 : struct.ciaps)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetOutroCiap1()) {
        oprot.writeString(struct.outroCiap1);
      }
      if (struct.isSetOutroCiap2()) {
        oprot.writeString(struct.outroCiap2);
      }
      if (struct.isSetCid10()) {
        oprot.writeString(struct.cid10);
      }
      if (struct.isSetCid10_2()) {
        oprot.writeString(struct.cid10_2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProblemaCondicaoAvaliacaoAIThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ciaps = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.ciaps.add(_elem6);
          }
        }
        struct.setCiapsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.outroCiap1 = iprot.readString();
        struct.setOutroCiap1IsSet(true);
      }
      if (incoming.get(2)) {
        struct.outroCiap2 = iprot.readString();
        struct.setOutroCiap2IsSet(true);
      }
      if (incoming.get(3)) {
        struct.cid10 = iprot.readString();
        struct.setCid10IsSet(true);
      }
      if (incoming.get(4)) {
        struct.cid10_2 = iprot.readString();
        struct.setCid10_2IsSet(true);
      }
    }
  }

}

