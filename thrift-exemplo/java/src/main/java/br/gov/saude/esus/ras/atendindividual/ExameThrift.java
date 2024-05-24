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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-05-24")
public class ExameThrift implements org.apache.thrift.TBase<ExameThrift, ExameThrift._Fields>, java.io.Serializable, Cloneable, Comparable<ExameThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExameThrift");

  private static final org.apache.thrift.protocol.TField CODIGO_EXAME_FIELD_DESC = new org.apache.thrift.protocol.TField("codigoExame", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SOLICITADO_AVALIADO_FIELD_DESC = new org.apache.thrift.protocol.TField("solicitadoAvaliado", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExameThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExameThriftTupleSchemeFactory());
  }

  private String codigoExame; // optional
  private List<String> solicitadoAvaliado; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODIGO_EXAME((short)1, "codigoExame"),
    SOLICITADO_AVALIADO((short)2, "solicitadoAvaliado");

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
        case 1: // CODIGO_EXAME
          return CODIGO_EXAME;
        case 2: // SOLICITADO_AVALIADO
          return SOLICITADO_AVALIADO;
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
  private static final _Fields optionals[] = {_Fields.CODIGO_EXAME,_Fields.SOLICITADO_AVALIADO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODIGO_EXAME, new org.apache.thrift.meta_data.FieldMetaData("codigoExame", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOLICITADO_AVALIADO, new org.apache.thrift.meta_data.FieldMetaData("solicitadoAvaliado", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExameThrift.class, metaDataMap);
  }

  public ExameThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExameThrift(ExameThrift other) {
    if (other.isSetCodigoExame()) {
      this.codigoExame = other.codigoExame;
    }
    if (other.isSetSolicitadoAvaliado()) {
      List<String> __this__solicitadoAvaliado = new ArrayList<String>(other.solicitadoAvaliado);
      this.solicitadoAvaliado = __this__solicitadoAvaliado;
    }
  }

  public ExameThrift deepCopy() {
    return new ExameThrift(this);
  }

  @Override
  public void clear() {
    this.codigoExame = null;
    this.solicitadoAvaliado = null;
  }

  public String getCodigoExame() {
    return this.codigoExame;
  }

  public void setCodigoExame(String codigoExame) {
    this.codigoExame = codigoExame;
  }

  public void unsetCodigoExame() {
    this.codigoExame = null;
  }

  /** Returns true if field codigoExame is set (has been assigned a value) and false otherwise */
  public boolean isSetCodigoExame() {
    return this.codigoExame != null;
  }

  public void setCodigoExameIsSet(boolean value) {
    if (!value) {
      this.codigoExame = null;
    }
  }

  public int getSolicitadoAvaliadoSize() {
    return (this.solicitadoAvaliado == null) ? 0 : this.solicitadoAvaliado.size();
  }

  public java.util.Iterator<String> getSolicitadoAvaliadoIterator() {
    return (this.solicitadoAvaliado == null) ? null : this.solicitadoAvaliado.iterator();
  }

  public void addToSolicitadoAvaliado(String elem) {
    if (this.solicitadoAvaliado == null) {
      this.solicitadoAvaliado = new ArrayList<String>();
    }
    this.solicitadoAvaliado.add(elem);
  }

  public List<String> getSolicitadoAvaliado() {
    return this.solicitadoAvaliado;
  }

  public void setSolicitadoAvaliado(List<String> solicitadoAvaliado) {
    this.solicitadoAvaliado = solicitadoAvaliado;
  }

  public void unsetSolicitadoAvaliado() {
    this.solicitadoAvaliado = null;
  }

  /** Returns true if field solicitadoAvaliado is set (has been assigned a value) and false otherwise */
  public boolean isSetSolicitadoAvaliado() {
    return this.solicitadoAvaliado != null;
  }

  public void setSolicitadoAvaliadoIsSet(boolean value) {
    if (!value) {
      this.solicitadoAvaliado = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODIGO_EXAME:
      if (value == null) {
        unsetCodigoExame();
      } else {
        setCodigoExame((String)value);
      }
      break;

    case SOLICITADO_AVALIADO:
      if (value == null) {
        unsetSolicitadoAvaliado();
      } else {
        setSolicitadoAvaliado((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODIGO_EXAME:
      return getCodigoExame();

    case SOLICITADO_AVALIADO:
      return getSolicitadoAvaliado();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODIGO_EXAME:
      return isSetCodigoExame();
    case SOLICITADO_AVALIADO:
      return isSetSolicitadoAvaliado();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExameThrift)
      return this.equals((ExameThrift)that);
    return false;
  }

  public boolean equals(ExameThrift that) {
    if (that == null)
      return false;

    boolean this_present_codigoExame = true && this.isSetCodigoExame();
    boolean that_present_codigoExame = true && that.isSetCodigoExame();
    if (this_present_codigoExame || that_present_codigoExame) {
      if (!(this_present_codigoExame && that_present_codigoExame))
        return false;
      if (!this.codigoExame.equals(that.codigoExame))
        return false;
    }

    boolean this_present_solicitadoAvaliado = true && this.isSetSolicitadoAvaliado();
    boolean that_present_solicitadoAvaliado = true && that.isSetSolicitadoAvaliado();
    if (this_present_solicitadoAvaliado || that_present_solicitadoAvaliado) {
      if (!(this_present_solicitadoAvaliado && that_present_solicitadoAvaliado))
        return false;
      if (!this.solicitadoAvaliado.equals(that.solicitadoAvaliado))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_codigoExame = true && (isSetCodigoExame());
    list.add(present_codigoExame);
    if (present_codigoExame)
      list.add(codigoExame);

    boolean present_solicitadoAvaliado = true && (isSetSolicitadoAvaliado());
    list.add(present_solicitadoAvaliado);
    if (present_solicitadoAvaliado)
      list.add(solicitadoAvaliado);

    return list.hashCode();
  }

  @Override
  public int compareTo(ExameThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCodigoExame()).compareTo(other.isSetCodigoExame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodigoExame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codigoExame, other.codigoExame);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSolicitadoAvaliado()).compareTo(other.isSetSolicitadoAvaliado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSolicitadoAvaliado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.solicitadoAvaliado, other.solicitadoAvaliado);
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
    StringBuilder sb = new StringBuilder("ExameThrift(");
    boolean first = true;

    if (isSetCodigoExame()) {
      sb.append("codigoExame:");
      if (this.codigoExame == null) {
        sb.append("null");
      } else {
        sb.append(this.codigoExame);
      }
      first = false;
    }
    if (isSetSolicitadoAvaliado()) {
      if (!first) sb.append(", ");
      sb.append("solicitadoAvaliado:");
      if (this.solicitadoAvaliado == null) {
        sb.append("null");
      } else {
        sb.append(this.solicitadoAvaliado);
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

  private static class ExameThriftStandardSchemeFactory implements SchemeFactory {
    public ExameThriftStandardScheme getScheme() {
      return new ExameThriftStandardScheme();
    }
  }

  private static class ExameThriftStandardScheme extends StandardScheme<ExameThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExameThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODIGO_EXAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.codigoExame = iprot.readString();
              struct.setCodigoExameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOLICITADO_AVALIADO
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.solicitadoAvaliado = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.solicitadoAvaliado.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSolicitadoAvaliadoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExameThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.codigoExame != null) {
        if (struct.isSetCodigoExame()) {
          oprot.writeFieldBegin(CODIGO_EXAME_FIELD_DESC);
          oprot.writeString(struct.codigoExame);
          oprot.writeFieldEnd();
        }
      }
      if (struct.solicitadoAvaliado != null) {
        if (struct.isSetSolicitadoAvaliado()) {
          oprot.writeFieldBegin(SOLICITADO_AVALIADO_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.solicitadoAvaliado.size()));
            for (String _iter3 : struct.solicitadoAvaliado)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExameThriftTupleSchemeFactory implements SchemeFactory {
    public ExameThriftTupleScheme getScheme() {
      return new ExameThriftTupleScheme();
    }
  }

  private static class ExameThriftTupleScheme extends TupleScheme<ExameThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCodigoExame()) {
        optionals.set(0);
      }
      if (struct.isSetSolicitadoAvaliado()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCodigoExame()) {
        oprot.writeString(struct.codigoExame);
      }
      if (struct.isSetSolicitadoAvaliado()) {
        {
          oprot.writeI32(struct.solicitadoAvaliado.size());
          for (String _iter4 : struct.solicitadoAvaliado)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.codigoExame = iprot.readString();
        struct.setCodigoExameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.solicitadoAvaliado = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.solicitadoAvaliado.add(_elem6);
          }
        }
        struct.setSolicitadoAvaliadoIsSet(true);
      }
    }
  }

}

