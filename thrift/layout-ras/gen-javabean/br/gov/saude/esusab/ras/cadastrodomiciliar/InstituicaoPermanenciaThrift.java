/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.cadastrodomiciliar;

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
public class InstituicaoPermanenciaThrift implements org.apache.thrift.TBase<InstituicaoPermanenciaThrift, InstituicaoPermanenciaThrift._Fields>, java.io.Serializable, Cloneable, Comparable<InstituicaoPermanenciaThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InstituicaoPermanenciaThrift");

  private static final org.apache.thrift.protocol.TField NOME_INSTITUICAO_PERMANENCIA_FIELD_DESC = new org.apache.thrift.protocol.TField("nomeInstituicaoPermanencia", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ST_OUTROS_PROFISSIONAIS_VINCULADOS_FIELD_DESC = new org.apache.thrift.protocol.TField("stOutrosProfissionaisVinculados", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField NOME_RESPONSAVEL_TECNICO_FIELD_DESC = new org.apache.thrift.protocol.TField("nomeResponsavelTecnico", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CNS_RESPONSAVEL_TECNICO_FIELD_DESC = new org.apache.thrift.protocol.TField("cnsResponsavelTecnico", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CARGO_INSTITUICAO_FIELD_DESC = new org.apache.thrift.protocol.TField("cargoInstituicao", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TELEFONE_RESPONSAVEL_TECNICO_FIELD_DESC = new org.apache.thrift.protocol.TField("telefoneResponsavelTecnico", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InstituicaoPermanenciaThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InstituicaoPermanenciaThriftTupleSchemeFactory());
  }

  private String nomeInstituicaoPermanencia; // optional
  private boolean stOutrosProfissionaisVinculados; // optional
  private String nomeResponsavelTecnico; // optional
  private String cnsResponsavelTecnico; // optional
  private String cargoInstituicao; // optional
  private String telefoneResponsavelTecnico; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOME_INSTITUICAO_PERMANENCIA((short)1, "nomeInstituicaoPermanencia"),
    ST_OUTROS_PROFISSIONAIS_VINCULADOS((short)2, "stOutrosProfissionaisVinculados"),
    NOME_RESPONSAVEL_TECNICO((short)3, "nomeResponsavelTecnico"),
    CNS_RESPONSAVEL_TECNICO((short)4, "cnsResponsavelTecnico"),
    CARGO_INSTITUICAO((short)5, "cargoInstituicao"),
    TELEFONE_RESPONSAVEL_TECNICO((short)6, "telefoneResponsavelTecnico");

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
        case 1: // NOME_INSTITUICAO_PERMANENCIA
          return NOME_INSTITUICAO_PERMANENCIA;
        case 2: // ST_OUTROS_PROFISSIONAIS_VINCULADOS
          return ST_OUTROS_PROFISSIONAIS_VINCULADOS;
        case 3: // NOME_RESPONSAVEL_TECNICO
          return NOME_RESPONSAVEL_TECNICO;
        case 4: // CNS_RESPONSAVEL_TECNICO
          return CNS_RESPONSAVEL_TECNICO;
        case 5: // CARGO_INSTITUICAO
          return CARGO_INSTITUICAO;
        case 6: // TELEFONE_RESPONSAVEL_TECNICO
          return TELEFONE_RESPONSAVEL_TECNICO;
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
  private static final int __STOUTROSPROFISSIONAISVINCULADOS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NOME_INSTITUICAO_PERMANENCIA,_Fields.ST_OUTROS_PROFISSIONAIS_VINCULADOS,_Fields.NOME_RESPONSAVEL_TECNICO,_Fields.CNS_RESPONSAVEL_TECNICO,_Fields.CARGO_INSTITUICAO,_Fields.TELEFONE_RESPONSAVEL_TECNICO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOME_INSTITUICAO_PERMANENCIA, new org.apache.thrift.meta_data.FieldMetaData("nomeInstituicaoPermanencia", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ST_OUTROS_PROFISSIONAIS_VINCULADOS, new org.apache.thrift.meta_data.FieldMetaData("stOutrosProfissionaisVinculados", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NOME_RESPONSAVEL_TECNICO, new org.apache.thrift.meta_data.FieldMetaData("nomeResponsavelTecnico", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CNS_RESPONSAVEL_TECNICO, new org.apache.thrift.meta_data.FieldMetaData("cnsResponsavelTecnico", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CARGO_INSTITUICAO, new org.apache.thrift.meta_data.FieldMetaData("cargoInstituicao", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TELEFONE_RESPONSAVEL_TECNICO, new org.apache.thrift.meta_data.FieldMetaData("telefoneResponsavelTecnico", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InstituicaoPermanenciaThrift.class, metaDataMap);
  }

  public InstituicaoPermanenciaThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InstituicaoPermanenciaThrift(InstituicaoPermanenciaThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNomeInstituicaoPermanencia()) {
      this.nomeInstituicaoPermanencia = other.nomeInstituicaoPermanencia;
    }
    this.stOutrosProfissionaisVinculados = other.stOutrosProfissionaisVinculados;
    if (other.isSetNomeResponsavelTecnico()) {
      this.nomeResponsavelTecnico = other.nomeResponsavelTecnico;
    }
    if (other.isSetCnsResponsavelTecnico()) {
      this.cnsResponsavelTecnico = other.cnsResponsavelTecnico;
    }
    if (other.isSetCargoInstituicao()) {
      this.cargoInstituicao = other.cargoInstituicao;
    }
    if (other.isSetTelefoneResponsavelTecnico()) {
      this.telefoneResponsavelTecnico = other.telefoneResponsavelTecnico;
    }
  }

  public InstituicaoPermanenciaThrift deepCopy() {
    return new InstituicaoPermanenciaThrift(this);
  }

  @Override
  public void clear() {
    this.nomeInstituicaoPermanencia = null;
    setStOutrosProfissionaisVinculadosIsSet(false);
    this.stOutrosProfissionaisVinculados = false;
    this.nomeResponsavelTecnico = null;
    this.cnsResponsavelTecnico = null;
    this.cargoInstituicao = null;
    this.telefoneResponsavelTecnico = null;
  }

  public String getNomeInstituicaoPermanencia() {
    return this.nomeInstituicaoPermanencia;
  }

  public void setNomeInstituicaoPermanencia(String nomeInstituicaoPermanencia) {
    this.nomeInstituicaoPermanencia = nomeInstituicaoPermanencia;
  }

  public void unsetNomeInstituicaoPermanencia() {
    this.nomeInstituicaoPermanencia = null;
  }

  /** Returns true if field nomeInstituicaoPermanencia is set (has been assigned a value) and false otherwise */
  public boolean isSetNomeInstituicaoPermanencia() {
    return this.nomeInstituicaoPermanencia != null;
  }

  public void setNomeInstituicaoPermanenciaIsSet(boolean value) {
    if (!value) {
      this.nomeInstituicaoPermanencia = null;
    }
  }

  public boolean isStOutrosProfissionaisVinculados() {
    return this.stOutrosProfissionaisVinculados;
  }

  public void setStOutrosProfissionaisVinculados(boolean stOutrosProfissionaisVinculados) {
    this.stOutrosProfissionaisVinculados = stOutrosProfissionaisVinculados;
    setStOutrosProfissionaisVinculadosIsSet(true);
  }

  public void unsetStOutrosProfissionaisVinculados() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STOUTROSPROFISSIONAISVINCULADOS_ISSET_ID);
  }

  /** Returns true if field stOutrosProfissionaisVinculados is set (has been assigned a value) and false otherwise */
  public boolean isSetStOutrosProfissionaisVinculados() {
    return EncodingUtils.testBit(__isset_bitfield, __STOUTROSPROFISSIONAISVINCULADOS_ISSET_ID);
  }

  public void setStOutrosProfissionaisVinculadosIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STOUTROSPROFISSIONAISVINCULADOS_ISSET_ID, value);
  }

  public String getNomeResponsavelTecnico() {
    return this.nomeResponsavelTecnico;
  }

  public void setNomeResponsavelTecnico(String nomeResponsavelTecnico) {
    this.nomeResponsavelTecnico = nomeResponsavelTecnico;
  }

  public void unsetNomeResponsavelTecnico() {
    this.nomeResponsavelTecnico = null;
  }

  /** Returns true if field nomeResponsavelTecnico is set (has been assigned a value) and false otherwise */
  public boolean isSetNomeResponsavelTecnico() {
    return this.nomeResponsavelTecnico != null;
  }

  public void setNomeResponsavelTecnicoIsSet(boolean value) {
    if (!value) {
      this.nomeResponsavelTecnico = null;
    }
  }

  public String getCnsResponsavelTecnico() {
    return this.cnsResponsavelTecnico;
  }

  public void setCnsResponsavelTecnico(String cnsResponsavelTecnico) {
    this.cnsResponsavelTecnico = cnsResponsavelTecnico;
  }

  public void unsetCnsResponsavelTecnico() {
    this.cnsResponsavelTecnico = null;
  }

  /** Returns true if field cnsResponsavelTecnico is set (has been assigned a value) and false otherwise */
  public boolean isSetCnsResponsavelTecnico() {
    return this.cnsResponsavelTecnico != null;
  }

  public void setCnsResponsavelTecnicoIsSet(boolean value) {
    if (!value) {
      this.cnsResponsavelTecnico = null;
    }
  }

  public String getCargoInstituicao() {
    return this.cargoInstituicao;
  }

  public void setCargoInstituicao(String cargoInstituicao) {
    this.cargoInstituicao = cargoInstituicao;
  }

  public void unsetCargoInstituicao() {
    this.cargoInstituicao = null;
  }

  /** Returns true if field cargoInstituicao is set (has been assigned a value) and false otherwise */
  public boolean isSetCargoInstituicao() {
    return this.cargoInstituicao != null;
  }

  public void setCargoInstituicaoIsSet(boolean value) {
    if (!value) {
      this.cargoInstituicao = null;
    }
  }

  public String getTelefoneResponsavelTecnico() {
    return this.telefoneResponsavelTecnico;
  }

  public void setTelefoneResponsavelTecnico(String telefoneResponsavelTecnico) {
    this.telefoneResponsavelTecnico = telefoneResponsavelTecnico;
  }

  public void unsetTelefoneResponsavelTecnico() {
    this.telefoneResponsavelTecnico = null;
  }

  /** Returns true if field telefoneResponsavelTecnico is set (has been assigned a value) and false otherwise */
  public boolean isSetTelefoneResponsavelTecnico() {
    return this.telefoneResponsavelTecnico != null;
  }

  public void setTelefoneResponsavelTecnicoIsSet(boolean value) {
    if (!value) {
      this.telefoneResponsavelTecnico = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOME_INSTITUICAO_PERMANENCIA:
      if (value == null) {
        unsetNomeInstituicaoPermanencia();
      } else {
        setNomeInstituicaoPermanencia((String)value);
      }
      break;

    case ST_OUTROS_PROFISSIONAIS_VINCULADOS:
      if (value == null) {
        unsetStOutrosProfissionaisVinculados();
      } else {
        setStOutrosProfissionaisVinculados((Boolean)value);
      }
      break;

    case NOME_RESPONSAVEL_TECNICO:
      if (value == null) {
        unsetNomeResponsavelTecnico();
      } else {
        setNomeResponsavelTecnico((String)value);
      }
      break;

    case CNS_RESPONSAVEL_TECNICO:
      if (value == null) {
        unsetCnsResponsavelTecnico();
      } else {
        setCnsResponsavelTecnico((String)value);
      }
      break;

    case CARGO_INSTITUICAO:
      if (value == null) {
        unsetCargoInstituicao();
      } else {
        setCargoInstituicao((String)value);
      }
      break;

    case TELEFONE_RESPONSAVEL_TECNICO:
      if (value == null) {
        unsetTelefoneResponsavelTecnico();
      } else {
        setTelefoneResponsavelTecnico((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOME_INSTITUICAO_PERMANENCIA:
      return getNomeInstituicaoPermanencia();

    case ST_OUTROS_PROFISSIONAIS_VINCULADOS:
      return isStOutrosProfissionaisVinculados();

    case NOME_RESPONSAVEL_TECNICO:
      return getNomeResponsavelTecnico();

    case CNS_RESPONSAVEL_TECNICO:
      return getCnsResponsavelTecnico();

    case CARGO_INSTITUICAO:
      return getCargoInstituicao();

    case TELEFONE_RESPONSAVEL_TECNICO:
      return getTelefoneResponsavelTecnico();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOME_INSTITUICAO_PERMANENCIA:
      return isSetNomeInstituicaoPermanencia();
    case ST_OUTROS_PROFISSIONAIS_VINCULADOS:
      return isSetStOutrosProfissionaisVinculados();
    case NOME_RESPONSAVEL_TECNICO:
      return isSetNomeResponsavelTecnico();
    case CNS_RESPONSAVEL_TECNICO:
      return isSetCnsResponsavelTecnico();
    case CARGO_INSTITUICAO:
      return isSetCargoInstituicao();
    case TELEFONE_RESPONSAVEL_TECNICO:
      return isSetTelefoneResponsavelTecnico();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InstituicaoPermanenciaThrift)
      return this.equals((InstituicaoPermanenciaThrift)that);
    return false;
  }

  public boolean equals(InstituicaoPermanenciaThrift that) {
    if (that == null)
      return false;

    boolean this_present_nomeInstituicaoPermanencia = true && this.isSetNomeInstituicaoPermanencia();
    boolean that_present_nomeInstituicaoPermanencia = true && that.isSetNomeInstituicaoPermanencia();
    if (this_present_nomeInstituicaoPermanencia || that_present_nomeInstituicaoPermanencia) {
      if (!(this_present_nomeInstituicaoPermanencia && that_present_nomeInstituicaoPermanencia))
        return false;
      if (!this.nomeInstituicaoPermanencia.equals(that.nomeInstituicaoPermanencia))
        return false;
    }

    boolean this_present_stOutrosProfissionaisVinculados = true && this.isSetStOutrosProfissionaisVinculados();
    boolean that_present_stOutrosProfissionaisVinculados = true && that.isSetStOutrosProfissionaisVinculados();
    if (this_present_stOutrosProfissionaisVinculados || that_present_stOutrosProfissionaisVinculados) {
      if (!(this_present_stOutrosProfissionaisVinculados && that_present_stOutrosProfissionaisVinculados))
        return false;
      if (this.stOutrosProfissionaisVinculados != that.stOutrosProfissionaisVinculados)
        return false;
    }

    boolean this_present_nomeResponsavelTecnico = true && this.isSetNomeResponsavelTecnico();
    boolean that_present_nomeResponsavelTecnico = true && that.isSetNomeResponsavelTecnico();
    if (this_present_nomeResponsavelTecnico || that_present_nomeResponsavelTecnico) {
      if (!(this_present_nomeResponsavelTecnico && that_present_nomeResponsavelTecnico))
        return false;
      if (!this.nomeResponsavelTecnico.equals(that.nomeResponsavelTecnico))
        return false;
    }

    boolean this_present_cnsResponsavelTecnico = true && this.isSetCnsResponsavelTecnico();
    boolean that_present_cnsResponsavelTecnico = true && that.isSetCnsResponsavelTecnico();
    if (this_present_cnsResponsavelTecnico || that_present_cnsResponsavelTecnico) {
      if (!(this_present_cnsResponsavelTecnico && that_present_cnsResponsavelTecnico))
        return false;
      if (!this.cnsResponsavelTecnico.equals(that.cnsResponsavelTecnico))
        return false;
    }

    boolean this_present_cargoInstituicao = true && this.isSetCargoInstituicao();
    boolean that_present_cargoInstituicao = true && that.isSetCargoInstituicao();
    if (this_present_cargoInstituicao || that_present_cargoInstituicao) {
      if (!(this_present_cargoInstituicao && that_present_cargoInstituicao))
        return false;
      if (!this.cargoInstituicao.equals(that.cargoInstituicao))
        return false;
    }

    boolean this_present_telefoneResponsavelTecnico = true && this.isSetTelefoneResponsavelTecnico();
    boolean that_present_telefoneResponsavelTecnico = true && that.isSetTelefoneResponsavelTecnico();
    if (this_present_telefoneResponsavelTecnico || that_present_telefoneResponsavelTecnico) {
      if (!(this_present_telefoneResponsavelTecnico && that_present_telefoneResponsavelTecnico))
        return false;
      if (!this.telefoneResponsavelTecnico.equals(that.telefoneResponsavelTecnico))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nomeInstituicaoPermanencia = true && (isSetNomeInstituicaoPermanencia());
    list.add(present_nomeInstituicaoPermanencia);
    if (present_nomeInstituicaoPermanencia)
      list.add(nomeInstituicaoPermanencia);

    boolean present_stOutrosProfissionaisVinculados = true && (isSetStOutrosProfissionaisVinculados());
    list.add(present_stOutrosProfissionaisVinculados);
    if (present_stOutrosProfissionaisVinculados)
      list.add(stOutrosProfissionaisVinculados);

    boolean present_nomeResponsavelTecnico = true && (isSetNomeResponsavelTecnico());
    list.add(present_nomeResponsavelTecnico);
    if (present_nomeResponsavelTecnico)
      list.add(nomeResponsavelTecnico);

    boolean present_cnsResponsavelTecnico = true && (isSetCnsResponsavelTecnico());
    list.add(present_cnsResponsavelTecnico);
    if (present_cnsResponsavelTecnico)
      list.add(cnsResponsavelTecnico);

    boolean present_cargoInstituicao = true && (isSetCargoInstituicao());
    list.add(present_cargoInstituicao);
    if (present_cargoInstituicao)
      list.add(cargoInstituicao);

    boolean present_telefoneResponsavelTecnico = true && (isSetTelefoneResponsavelTecnico());
    list.add(present_telefoneResponsavelTecnico);
    if (present_telefoneResponsavelTecnico)
      list.add(telefoneResponsavelTecnico);

    return list.hashCode();
  }

  @Override
  public int compareTo(InstituicaoPermanenciaThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNomeInstituicaoPermanencia()).compareTo(other.isSetNomeInstituicaoPermanencia());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNomeInstituicaoPermanencia()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nomeInstituicaoPermanencia, other.nomeInstituicaoPermanencia);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStOutrosProfissionaisVinculados()).compareTo(other.isSetStOutrosProfissionaisVinculados());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStOutrosProfissionaisVinculados()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stOutrosProfissionaisVinculados, other.stOutrosProfissionaisVinculados);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNomeResponsavelTecnico()).compareTo(other.isSetNomeResponsavelTecnico());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNomeResponsavelTecnico()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nomeResponsavelTecnico, other.nomeResponsavelTecnico);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCnsResponsavelTecnico()).compareTo(other.isSetCnsResponsavelTecnico());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCnsResponsavelTecnico()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cnsResponsavelTecnico, other.cnsResponsavelTecnico);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCargoInstituicao()).compareTo(other.isSetCargoInstituicao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCargoInstituicao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cargoInstituicao, other.cargoInstituicao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTelefoneResponsavelTecnico()).compareTo(other.isSetTelefoneResponsavelTecnico());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTelefoneResponsavelTecnico()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.telefoneResponsavelTecnico, other.telefoneResponsavelTecnico);
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
    StringBuilder sb = new StringBuilder("InstituicaoPermanenciaThrift(");
    boolean first = true;

    if (isSetNomeInstituicaoPermanencia()) {
      sb.append("nomeInstituicaoPermanencia:");
      if (this.nomeInstituicaoPermanencia == null) {
        sb.append("null");
      } else {
        sb.append(this.nomeInstituicaoPermanencia);
      }
      first = false;
    }
    if (isSetStOutrosProfissionaisVinculados()) {
      if (!first) sb.append(", ");
      sb.append("stOutrosProfissionaisVinculados:");
      sb.append(this.stOutrosProfissionaisVinculados);
      first = false;
    }
    if (isSetNomeResponsavelTecnico()) {
      if (!first) sb.append(", ");
      sb.append("nomeResponsavelTecnico:");
      if (this.nomeResponsavelTecnico == null) {
        sb.append("null");
      } else {
        sb.append(this.nomeResponsavelTecnico);
      }
      first = false;
    }
    if (isSetCnsResponsavelTecnico()) {
      if (!first) sb.append(", ");
      sb.append("cnsResponsavelTecnico:");
      if (this.cnsResponsavelTecnico == null) {
        sb.append("null");
      } else {
        sb.append(this.cnsResponsavelTecnico);
      }
      first = false;
    }
    if (isSetCargoInstituicao()) {
      if (!first) sb.append(", ");
      sb.append("cargoInstituicao:");
      if (this.cargoInstituicao == null) {
        sb.append("null");
      } else {
        sb.append(this.cargoInstituicao);
      }
      first = false;
    }
    if (isSetTelefoneResponsavelTecnico()) {
      if (!first) sb.append(", ");
      sb.append("telefoneResponsavelTecnico:");
      if (this.telefoneResponsavelTecnico == null) {
        sb.append("null");
      } else {
        sb.append(this.telefoneResponsavelTecnico);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InstituicaoPermanenciaThriftStandardSchemeFactory implements SchemeFactory {
    public InstituicaoPermanenciaThriftStandardScheme getScheme() {
      return new InstituicaoPermanenciaThriftStandardScheme();
    }
  }

  private static class InstituicaoPermanenciaThriftStandardScheme extends StandardScheme<InstituicaoPermanenciaThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InstituicaoPermanenciaThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOME_INSTITUICAO_PERMANENCIA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nomeInstituicaoPermanencia = iprot.readString();
              struct.setNomeInstituicaoPermanenciaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ST_OUTROS_PROFISSIONAIS_VINCULADOS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stOutrosProfissionaisVinculados = iprot.readBool();
              struct.setStOutrosProfissionaisVinculadosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOME_RESPONSAVEL_TECNICO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nomeResponsavelTecnico = iprot.readString();
              struct.setNomeResponsavelTecnicoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CNS_RESPONSAVEL_TECNICO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cnsResponsavelTecnico = iprot.readString();
              struct.setCnsResponsavelTecnicoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CARGO_INSTITUICAO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cargoInstituicao = iprot.readString();
              struct.setCargoInstituicaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TELEFONE_RESPONSAVEL_TECNICO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.telefoneResponsavelTecnico = iprot.readString();
              struct.setTelefoneResponsavelTecnicoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InstituicaoPermanenciaThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nomeInstituicaoPermanencia != null) {
        if (struct.isSetNomeInstituicaoPermanencia()) {
          oprot.writeFieldBegin(NOME_INSTITUICAO_PERMANENCIA_FIELD_DESC);
          oprot.writeString(struct.nomeInstituicaoPermanencia);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStOutrosProfissionaisVinculados()) {
        oprot.writeFieldBegin(ST_OUTROS_PROFISSIONAIS_VINCULADOS_FIELD_DESC);
        oprot.writeBool(struct.stOutrosProfissionaisVinculados);
        oprot.writeFieldEnd();
      }
      if (struct.nomeResponsavelTecnico != null) {
        if (struct.isSetNomeResponsavelTecnico()) {
          oprot.writeFieldBegin(NOME_RESPONSAVEL_TECNICO_FIELD_DESC);
          oprot.writeString(struct.nomeResponsavelTecnico);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cnsResponsavelTecnico != null) {
        if (struct.isSetCnsResponsavelTecnico()) {
          oprot.writeFieldBegin(CNS_RESPONSAVEL_TECNICO_FIELD_DESC);
          oprot.writeString(struct.cnsResponsavelTecnico);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cargoInstituicao != null) {
        if (struct.isSetCargoInstituicao()) {
          oprot.writeFieldBegin(CARGO_INSTITUICAO_FIELD_DESC);
          oprot.writeString(struct.cargoInstituicao);
          oprot.writeFieldEnd();
        }
      }
      if (struct.telefoneResponsavelTecnico != null) {
        if (struct.isSetTelefoneResponsavelTecnico()) {
          oprot.writeFieldBegin(TELEFONE_RESPONSAVEL_TECNICO_FIELD_DESC);
          oprot.writeString(struct.telefoneResponsavelTecnico);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InstituicaoPermanenciaThriftTupleSchemeFactory implements SchemeFactory {
    public InstituicaoPermanenciaThriftTupleScheme getScheme() {
      return new InstituicaoPermanenciaThriftTupleScheme();
    }
  }

  private static class InstituicaoPermanenciaThriftTupleScheme extends TupleScheme<InstituicaoPermanenciaThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InstituicaoPermanenciaThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNomeInstituicaoPermanencia()) {
        optionals.set(0);
      }
      if (struct.isSetStOutrosProfissionaisVinculados()) {
        optionals.set(1);
      }
      if (struct.isSetNomeResponsavelTecnico()) {
        optionals.set(2);
      }
      if (struct.isSetCnsResponsavelTecnico()) {
        optionals.set(3);
      }
      if (struct.isSetCargoInstituicao()) {
        optionals.set(4);
      }
      if (struct.isSetTelefoneResponsavelTecnico()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetNomeInstituicaoPermanencia()) {
        oprot.writeString(struct.nomeInstituicaoPermanencia);
      }
      if (struct.isSetStOutrosProfissionaisVinculados()) {
        oprot.writeBool(struct.stOutrosProfissionaisVinculados);
      }
      if (struct.isSetNomeResponsavelTecnico()) {
        oprot.writeString(struct.nomeResponsavelTecnico);
      }
      if (struct.isSetCnsResponsavelTecnico()) {
        oprot.writeString(struct.cnsResponsavelTecnico);
      }
      if (struct.isSetCargoInstituicao()) {
        oprot.writeString(struct.cargoInstituicao);
      }
      if (struct.isSetTelefoneResponsavelTecnico()) {
        oprot.writeString(struct.telefoneResponsavelTecnico);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InstituicaoPermanenciaThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.nomeInstituicaoPermanencia = iprot.readString();
        struct.setNomeInstituicaoPermanenciaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stOutrosProfissionaisVinculados = iprot.readBool();
        struct.setStOutrosProfissionaisVinculadosIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nomeResponsavelTecnico = iprot.readString();
        struct.setNomeResponsavelTecnicoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cnsResponsavelTecnico = iprot.readString();
        struct.setCnsResponsavelTecnicoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.cargoInstituicao = iprot.readString();
        struct.setCargoInstituicaoIsSet(true);
      }
      if (incoming.get(5)) {
        struct.telefoneResponsavelTecnico = iprot.readString();
        struct.setTelefoneResponsavelTecnicoIsSet(true);
      }
    }
  }

}

