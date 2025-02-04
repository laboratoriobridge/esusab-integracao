/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.cadastroindividual;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2025-01-16")
public class InformacoesSocioEconomicasThrift implements org.apache.thrift.TBase<InformacoesSocioEconomicasThrift, InformacoesSocioEconomicasThrift._Fields>, java.io.Serializable, Cloneable, Comparable<InformacoesSocioEconomicasThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InformacoesSocioEconomicasThrift");

  private static final org.apache.thrift.protocol.TField ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS_FIELD_DESC = new org.apache.thrift.protocol.TField("alimentosAcabaramAntesTerDinheiroComprarMais", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU_FIELD_DESC = new org.apache.thrift.protocol.TField("comeuAlgunsAlimentosQueTinhaDinheiroAcabou", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InformacoesSocioEconomicasThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InformacoesSocioEconomicasThriftTupleSchemeFactory());
  }

  private boolean alimentosAcabaramAntesTerDinheiroComprarMais; // optional
  private boolean comeuAlgunsAlimentosQueTinhaDinheiroAcabou; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS((short)1, "alimentosAcabaramAntesTerDinheiroComprarMais"),
    COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU((short)2, "comeuAlgunsAlimentosQueTinhaDinheiroAcabou");

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
        case 1: // ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS
          return ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS;
        case 2: // COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU
          return COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU;
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
  private static final int __ALIMENTOSACABARAMANTESTERDINHEIROCOMPRARMAIS_ISSET_ID = 0;
  private static final int __COMEUALGUNSALIMENTOSQUETINHADINHEIROACABOU_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS,_Fields.COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS, new org.apache.thrift.meta_data.FieldMetaData("alimentosAcabaramAntesTerDinheiroComprarMais", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU, new org.apache.thrift.meta_data.FieldMetaData("comeuAlgunsAlimentosQueTinhaDinheiroAcabou", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InformacoesSocioEconomicasThrift.class, metaDataMap);
  }

  public InformacoesSocioEconomicasThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InformacoesSocioEconomicasThrift(InformacoesSocioEconomicasThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.alimentosAcabaramAntesTerDinheiroComprarMais = other.alimentosAcabaramAntesTerDinheiroComprarMais;
    this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou = other.comeuAlgunsAlimentosQueTinhaDinheiroAcabou;
  }

  public InformacoesSocioEconomicasThrift deepCopy() {
    return new InformacoesSocioEconomicasThrift(this);
  }

  @Override
  public void clear() {
    setAlimentosAcabaramAntesTerDinheiroComprarMaisIsSet(false);
    this.alimentosAcabaramAntesTerDinheiroComprarMais = false;
    setComeuAlgunsAlimentosQueTinhaDinheiroAcabouIsSet(false);
    this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou = false;
  }

  public boolean isAlimentosAcabaramAntesTerDinheiroComprarMais() {
    return this.alimentosAcabaramAntesTerDinheiroComprarMais;
  }

  public void setAlimentosAcabaramAntesTerDinheiroComprarMais(boolean alimentosAcabaramAntesTerDinheiroComprarMais) {
    this.alimentosAcabaramAntesTerDinheiroComprarMais = alimentosAcabaramAntesTerDinheiroComprarMais;
    setAlimentosAcabaramAntesTerDinheiroComprarMaisIsSet(true);
  }

  public void unsetAlimentosAcabaramAntesTerDinheiroComprarMais() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALIMENTOSACABARAMANTESTERDINHEIROCOMPRARMAIS_ISSET_ID);
  }

  /** Returns true if field alimentosAcabaramAntesTerDinheiroComprarMais is set (has been assigned a value) and false otherwise */
  public boolean isSetAlimentosAcabaramAntesTerDinheiroComprarMais() {
    return EncodingUtils.testBit(__isset_bitfield, __ALIMENTOSACABARAMANTESTERDINHEIROCOMPRARMAIS_ISSET_ID);
  }

  public void setAlimentosAcabaramAntesTerDinheiroComprarMaisIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALIMENTOSACABARAMANTESTERDINHEIROCOMPRARMAIS_ISSET_ID, value);
  }

  public boolean isComeuAlgunsAlimentosQueTinhaDinheiroAcabou() {
    return this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou;
  }

  public void setComeuAlgunsAlimentosQueTinhaDinheiroAcabou(boolean comeuAlgunsAlimentosQueTinhaDinheiroAcabou) {
    this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou = comeuAlgunsAlimentosQueTinhaDinheiroAcabou;
    setComeuAlgunsAlimentosQueTinhaDinheiroAcabouIsSet(true);
  }

  public void unsetComeuAlgunsAlimentosQueTinhaDinheiroAcabou() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMEUALGUNSALIMENTOSQUETINHADINHEIROACABOU_ISSET_ID);
  }

  /** Returns true if field comeuAlgunsAlimentosQueTinhaDinheiroAcabou is set (has been assigned a value) and false otherwise */
  public boolean isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou() {
    return EncodingUtils.testBit(__isset_bitfield, __COMEUALGUNSALIMENTOSQUETINHADINHEIROACABOU_ISSET_ID);
  }

  public void setComeuAlgunsAlimentosQueTinhaDinheiroAcabouIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMEUALGUNSALIMENTOSQUETINHADINHEIROACABOU_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS:
      if (value == null) {
        unsetAlimentosAcabaramAntesTerDinheiroComprarMais();
      } else {
        setAlimentosAcabaramAntesTerDinheiroComprarMais((Boolean)value);
      }
      break;

    case COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU:
      if (value == null) {
        unsetComeuAlgunsAlimentosQueTinhaDinheiroAcabou();
      } else {
        setComeuAlgunsAlimentosQueTinhaDinheiroAcabou((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS:
      return isAlimentosAcabaramAntesTerDinheiroComprarMais();

    case COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU:
      return isComeuAlgunsAlimentosQueTinhaDinheiroAcabou();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS:
      return isSetAlimentosAcabaramAntesTerDinheiroComprarMais();
    case COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU:
      return isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InformacoesSocioEconomicasThrift)
      return this.equals((InformacoesSocioEconomicasThrift)that);
    return false;
  }

  public boolean equals(InformacoesSocioEconomicasThrift that) {
    if (that == null)
      return false;

    boolean this_present_alimentosAcabaramAntesTerDinheiroComprarMais = true && this.isSetAlimentosAcabaramAntesTerDinheiroComprarMais();
    boolean that_present_alimentosAcabaramAntesTerDinheiroComprarMais = true && that.isSetAlimentosAcabaramAntesTerDinheiroComprarMais();
    if (this_present_alimentosAcabaramAntesTerDinheiroComprarMais || that_present_alimentosAcabaramAntesTerDinheiroComprarMais) {
      if (!(this_present_alimentosAcabaramAntesTerDinheiroComprarMais && that_present_alimentosAcabaramAntesTerDinheiroComprarMais))
        return false;
      if (this.alimentosAcabaramAntesTerDinheiroComprarMais != that.alimentosAcabaramAntesTerDinheiroComprarMais)
        return false;
    }

    boolean this_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou = true && this.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou();
    boolean that_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou = true && that.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou();
    if (this_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou || that_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou) {
      if (!(this_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou && that_present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou))
        return false;
      if (this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou != that.comeuAlgunsAlimentosQueTinhaDinheiroAcabou)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_alimentosAcabaramAntesTerDinheiroComprarMais = true && (isSetAlimentosAcabaramAntesTerDinheiroComprarMais());
    list.add(present_alimentosAcabaramAntesTerDinheiroComprarMais);
    if (present_alimentosAcabaramAntesTerDinheiroComprarMais)
      list.add(alimentosAcabaramAntesTerDinheiroComprarMais);

    boolean present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou = true && (isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou());
    list.add(present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou);
    if (present_comeuAlgunsAlimentosQueTinhaDinheiroAcabou)
      list.add(comeuAlgunsAlimentosQueTinhaDinheiroAcabou);

    return list.hashCode();
  }

  @Override
  public int compareTo(InformacoesSocioEconomicasThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAlimentosAcabaramAntesTerDinheiroComprarMais()).compareTo(other.isSetAlimentosAcabaramAntesTerDinheiroComprarMais());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlimentosAcabaramAntesTerDinheiroComprarMais()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alimentosAcabaramAntesTerDinheiroComprarMais, other.alimentosAcabaramAntesTerDinheiroComprarMais);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()).compareTo(other.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou, other.comeuAlgunsAlimentosQueTinhaDinheiroAcabou);
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
    StringBuilder sb = new StringBuilder("InformacoesSocioEconomicasThrift(");
    boolean first = true;

    if (isSetAlimentosAcabaramAntesTerDinheiroComprarMais()) {
      sb.append("alimentosAcabaramAntesTerDinheiroComprarMais:");
      sb.append(this.alimentosAcabaramAntesTerDinheiroComprarMais);
      first = false;
    }
    if (isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()) {
      if (!first) sb.append(", ");
      sb.append("comeuAlgunsAlimentosQueTinhaDinheiroAcabou:");
      sb.append(this.comeuAlgunsAlimentosQueTinhaDinheiroAcabou);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InformacoesSocioEconomicasThriftStandardSchemeFactory implements SchemeFactory {
    public InformacoesSocioEconomicasThriftStandardScheme getScheme() {
      return new InformacoesSocioEconomicasThriftStandardScheme();
    }
  }

  private static class InformacoesSocioEconomicasThriftStandardScheme extends StandardScheme<InformacoesSocioEconomicasThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InformacoesSocioEconomicasThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.alimentosAcabaramAntesTerDinheiroComprarMais = iprot.readBool();
              struct.setAlimentosAcabaramAntesTerDinheiroComprarMaisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.comeuAlgunsAlimentosQueTinhaDinheiroAcabou = iprot.readBool();
              struct.setComeuAlgunsAlimentosQueTinhaDinheiroAcabouIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InformacoesSocioEconomicasThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetAlimentosAcabaramAntesTerDinheiroComprarMais()) {
        oprot.writeFieldBegin(ALIMENTOS_ACABARAM_ANTES_TER_DINHEIRO_COMPRAR_MAIS_FIELD_DESC);
        oprot.writeBool(struct.alimentosAcabaramAntesTerDinheiroComprarMais);
        oprot.writeFieldEnd();
      }
      if (struct.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()) {
        oprot.writeFieldBegin(COMEU_ALGUNS_ALIMENTOS_QUE_TINHA_DINHEIRO_ACABOU_FIELD_DESC);
        oprot.writeBool(struct.comeuAlgunsAlimentosQueTinhaDinheiroAcabou);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InformacoesSocioEconomicasThriftTupleSchemeFactory implements SchemeFactory {
    public InformacoesSocioEconomicasThriftTupleScheme getScheme() {
      return new InformacoesSocioEconomicasThriftTupleScheme();
    }
  }

  private static class InformacoesSocioEconomicasThriftTupleScheme extends TupleScheme<InformacoesSocioEconomicasThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InformacoesSocioEconomicasThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAlimentosAcabaramAntesTerDinheiroComprarMais()) {
        optionals.set(0);
      }
      if (struct.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAlimentosAcabaramAntesTerDinheiroComprarMais()) {
        oprot.writeBool(struct.alimentosAcabaramAntesTerDinheiroComprarMais);
      }
      if (struct.isSetComeuAlgunsAlimentosQueTinhaDinheiroAcabou()) {
        oprot.writeBool(struct.comeuAlgunsAlimentosQueTinhaDinheiroAcabou);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InformacoesSocioEconomicasThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.alimentosAcabaramAntesTerDinheiroComprarMais = iprot.readBool();
        struct.setAlimentosAcabaramAntesTerDinheiroComprarMaisIsSet(true);
      }
      if (incoming.get(1)) {
        struct.comeuAlgunsAlimentosQueTinhaDinheiroAcabou = iprot.readBool();
        struct.setComeuAlgunsAlimentosQueTinhaDinheiroAcabouIsSet(true);
      }
    }
  }

}

