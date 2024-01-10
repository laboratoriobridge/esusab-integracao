//
// Autogenerated by Thrift Compiler (0.9.3)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
var thrift = require('thrift');
var Thrift = thrift.Thrift;
var Q = thrift.Q;

var common_ttypes = require('./common_types')


var ttypes = module.exports = {};
ProcedimentoQuantidadeThrift = module.exports.ProcedimentoQuantidadeThrift = function(args) {
  this.coMsProcedimento = null;
  this.quantidade = null;
  if (args) {
    if (args.coMsProcedimento !== undefined && args.coMsProcedimento !== null) {
      this.coMsProcedimento = args.coMsProcedimento;
    }
    if (args.quantidade !== undefined && args.quantidade !== null) {
      this.quantidade = args.quantidade;
    }
  }
};
ProcedimentoQuantidadeThrift.prototype = {};
ProcedimentoQuantidadeThrift.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.coMsProcedimento = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.quantidade = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ProcedimentoQuantidadeThrift.prototype.write = function(output) {
  output.writeStructBegin('ProcedimentoQuantidadeThrift');
  if (this.coMsProcedimento !== null && this.coMsProcedimento !== undefined) {
    output.writeFieldBegin('coMsProcedimento', Thrift.Type.STRING, 1);
    output.writeString(this.coMsProcedimento);
    output.writeFieldEnd();
  }
  if (this.quantidade !== null && this.quantidade !== undefined) {
    output.writeFieldBegin('quantidade', Thrift.Type.I32, 2);
    output.writeI32(this.quantidade);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FichaAtendimentoOdontologicoChildThrift = module.exports.FichaAtendimentoOdontologicoChildThrift = function(args) {
  this.dtNascimento = null;
  this.cnsCidadao = null;
  this.numProntuario = null;
  this.gestante = null;
  this.necessidadesEspeciais = null;
  this.localAtendimento = null;
  this.tipoAtendimento = null;
  this.tiposEncamOdonto = null;
  this.tiposFornecimOdonto = null;
  this.tiposVigilanciaSaudeBucal = null;
  this.tiposConsultaOdonto = null;
  this.procedimentosRealizados = null;
  this.sexo = null;
  this.turno = null;
  this.dataHoraInicialAtendimento = null;
  this.dataHoraFinalAtendimento = null;
  this.cpfCidadao = null;
  this.medicamentos = null;
  this.encaminhamentos = null;
  this.resultadosExames = null;
  this.pesoAcompanhamentoNutricional = null;
  this.alturaAcompanhamentoNutricional = null;
  if (args) {
    if (args.dtNascimento !== undefined && args.dtNascimento !== null) {
      this.dtNascimento = args.dtNascimento;
    }
    if (args.cnsCidadao !== undefined && args.cnsCidadao !== null) {
      this.cnsCidadao = args.cnsCidadao;
    }
    if (args.numProntuario !== undefined && args.numProntuario !== null) {
      this.numProntuario = args.numProntuario;
    }
    if (args.gestante !== undefined && args.gestante !== null) {
      this.gestante = args.gestante;
    }
    if (args.necessidadesEspeciais !== undefined && args.necessidadesEspeciais !== null) {
      this.necessidadesEspeciais = args.necessidadesEspeciais;
    }
    if (args.localAtendimento !== undefined && args.localAtendimento !== null) {
      this.localAtendimento = args.localAtendimento;
    }
    if (args.tipoAtendimento !== undefined && args.tipoAtendimento !== null) {
      this.tipoAtendimento = args.tipoAtendimento;
    }
    if (args.tiposEncamOdonto !== undefined && args.tiposEncamOdonto !== null) {
      this.tiposEncamOdonto = Thrift.copyList(args.tiposEncamOdonto, [null]);
    }
    if (args.tiposFornecimOdonto !== undefined && args.tiposFornecimOdonto !== null) {
      this.tiposFornecimOdonto = Thrift.copyList(args.tiposFornecimOdonto, [null]);
    }
    if (args.tiposVigilanciaSaudeBucal !== undefined && args.tiposVigilanciaSaudeBucal !== null) {
      this.tiposVigilanciaSaudeBucal = Thrift.copyList(args.tiposVigilanciaSaudeBucal, [null]);
    }
    if (args.tiposConsultaOdonto !== undefined && args.tiposConsultaOdonto !== null) {
      this.tiposConsultaOdonto = Thrift.copyList(args.tiposConsultaOdonto, [null]);
    }
    if (args.procedimentosRealizados !== undefined && args.procedimentosRealizados !== null) {
      this.procedimentosRealizados = Thrift.copyList(args.procedimentosRealizados, [ttypes.ProcedimentoQuantidadeThrift]);
    }
    if (args.sexo !== undefined && args.sexo !== null) {
      this.sexo = args.sexo;
    }
    if (args.turno !== undefined && args.turno !== null) {
      this.turno = args.turno;
    }
    if (args.dataHoraInicialAtendimento !== undefined && args.dataHoraInicialAtendimento !== null) {
      this.dataHoraInicialAtendimento = args.dataHoraInicialAtendimento;
    }
    if (args.dataHoraFinalAtendimento !== undefined && args.dataHoraFinalAtendimento !== null) {
      this.dataHoraFinalAtendimento = args.dataHoraFinalAtendimento;
    }
    if (args.cpfCidadao !== undefined && args.cpfCidadao !== null) {
      this.cpfCidadao = args.cpfCidadao;
    }
    if (args.medicamentos !== undefined && args.medicamentos !== null) {
      this.medicamentos = Thrift.copyList(args.medicamentos, [common_ttypes.MedicamentoThrift]);
    }
    if (args.encaminhamentos !== undefined && args.encaminhamentos !== null) {
      this.encaminhamentos = Thrift.copyList(args.encaminhamentos, [common_ttypes.EncaminhamentoExternoThrift]);
    }
    if (args.resultadosExames !== undefined && args.resultadosExames !== null) {
      this.resultadosExames = Thrift.copyList(args.resultadosExames, [common_ttypes.ResultadosExameThrift]);
    }
    if (args.pesoAcompanhamentoNutricional !== undefined && args.pesoAcompanhamentoNutricional !== null) {
      this.pesoAcompanhamentoNutricional = args.pesoAcompanhamentoNutricional;
    }
    if (args.alturaAcompanhamentoNutricional !== undefined && args.alturaAcompanhamentoNutricional !== null) {
      this.alturaAcompanhamentoNutricional = args.alturaAcompanhamentoNutricional;
    }
  }
};
FichaAtendimentoOdontologicoChildThrift.prototype = {};
FichaAtendimentoOdontologicoChildThrift.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.dtNascimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cnsCidadao = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.numProntuario = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.BOOL) {
        this.gestante = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.BOOL) {
        this.necessidadesEspeciais = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I64) {
        this.localAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I64) {
        this.tipoAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.LIST) {
        var _size0 = 0;
        var _rtmp34;
        this.tiposEncamOdonto = [];
        var _etype3 = 0;
        _rtmp34 = input.readListBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = input.readI64();
          this.tiposEncamOdonto.push(elem6);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.LIST) {
        var _size7 = 0;
        var _rtmp311;
        this.tiposFornecimOdonto = [];
        var _etype10 = 0;
        _rtmp311 = input.readListBegin();
        _etype10 = _rtmp311.etype;
        _size7 = _rtmp311.size;
        for (var _i12 = 0; _i12 < _size7; ++_i12)
        {
          var elem13 = null;
          elem13 = input.readI64();
          this.tiposFornecimOdonto.push(elem13);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.LIST) {
        var _size14 = 0;
        var _rtmp318;
        this.tiposVigilanciaSaudeBucal = [];
        var _etype17 = 0;
        _rtmp318 = input.readListBegin();
        _etype17 = _rtmp318.etype;
        _size14 = _rtmp318.size;
        for (var _i19 = 0; _i19 < _size14; ++_i19)
        {
          var elem20 = null;
          elem20 = input.readI64();
          this.tiposVigilanciaSaudeBucal.push(elem20);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.LIST) {
        var _size21 = 0;
        var _rtmp325;
        this.tiposConsultaOdonto = [];
        var _etype24 = 0;
        _rtmp325 = input.readListBegin();
        _etype24 = _rtmp325.etype;
        _size21 = _rtmp325.size;
        for (var _i26 = 0; _i26 < _size21; ++_i26)
        {
          var elem27 = null;
          elem27 = input.readI64();
          this.tiposConsultaOdonto.push(elem27);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 12:
      if (ftype == Thrift.Type.LIST) {
        var _size28 = 0;
        var _rtmp332;
        this.procedimentosRealizados = [];
        var _etype31 = 0;
        _rtmp332 = input.readListBegin();
        _etype31 = _rtmp332.etype;
        _size28 = _rtmp332.size;
        for (var _i33 = 0; _i33 < _size28; ++_i33)
        {
          var elem34 = null;
          elem34 = new ttypes.ProcedimentoQuantidadeThrift();
          elem34.read(input);
          this.procedimentosRealizados.push(elem34);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 14:
      if (ftype == Thrift.Type.I64) {
        this.sexo = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 15:
      if (ftype == Thrift.Type.I64) {
        this.turno = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 16:
      if (ftype == Thrift.Type.I64) {
        this.dataHoraInicialAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 17:
      if (ftype == Thrift.Type.I64) {
        this.dataHoraFinalAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 18:
      if (ftype == Thrift.Type.STRING) {
        this.cpfCidadao = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 19:
      if (ftype == Thrift.Type.LIST) {
        var _size35 = 0;
        var _rtmp339;
        this.medicamentos = [];
        var _etype38 = 0;
        _rtmp339 = input.readListBegin();
        _etype38 = _rtmp339.etype;
        _size35 = _rtmp339.size;
        for (var _i40 = 0; _i40 < _size35; ++_i40)
        {
          var elem41 = null;
          elem41 = new common_ttypes.MedicamentoThrift();
          elem41.read(input);
          this.medicamentos.push(elem41);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 20:
      if (ftype == Thrift.Type.LIST) {
        var _size42 = 0;
        var _rtmp346;
        this.encaminhamentos = [];
        var _etype45 = 0;
        _rtmp346 = input.readListBegin();
        _etype45 = _rtmp346.etype;
        _size42 = _rtmp346.size;
        for (var _i47 = 0; _i47 < _size42; ++_i47)
        {
          var elem48 = null;
          elem48 = new common_ttypes.EncaminhamentoExternoThrift();
          elem48.read(input);
          this.encaminhamentos.push(elem48);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 21:
      if (ftype == Thrift.Type.LIST) {
        var _size49 = 0;
        var _rtmp353;
        this.resultadosExames = [];
        var _etype52 = 0;
        _rtmp353 = input.readListBegin();
        _etype52 = _rtmp353.etype;
        _size49 = _rtmp353.size;
        for (var _i54 = 0; _i54 < _size49; ++_i54)
        {
          var elem55 = null;
          elem55 = new common_ttypes.ResultadosExameThrift();
          elem55.read(input);
          this.resultadosExames.push(elem55);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 22:
      if (ftype == Thrift.Type.DOUBLE) {
        this.pesoAcompanhamentoNutricional = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 23:
      if (ftype == Thrift.Type.DOUBLE) {
        this.alturaAcompanhamentoNutricional = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

FichaAtendimentoOdontologicoChildThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoOdontologicoChildThrift');
  if (this.dtNascimento !== null && this.dtNascimento !== undefined) {
    output.writeFieldBegin('dtNascimento', Thrift.Type.I64, 1);
    output.writeI64(this.dtNascimento);
    output.writeFieldEnd();
  }
  if (this.cnsCidadao !== null && this.cnsCidadao !== undefined) {
    output.writeFieldBegin('cnsCidadao', Thrift.Type.STRING, 2);
    output.writeString(this.cnsCidadao);
    output.writeFieldEnd();
  }
  if (this.numProntuario !== null && this.numProntuario !== undefined) {
    output.writeFieldBegin('numProntuario', Thrift.Type.STRING, 3);
    output.writeString(this.numProntuario);
    output.writeFieldEnd();
  }
  if (this.gestante !== null && this.gestante !== undefined) {
    output.writeFieldBegin('gestante', Thrift.Type.BOOL, 4);
    output.writeBool(this.gestante);
    output.writeFieldEnd();
  }
  if (this.necessidadesEspeciais !== null && this.necessidadesEspeciais !== undefined) {
    output.writeFieldBegin('necessidadesEspeciais', Thrift.Type.BOOL, 5);
    output.writeBool(this.necessidadesEspeciais);
    output.writeFieldEnd();
  }
  if (this.localAtendimento !== null && this.localAtendimento !== undefined) {
    output.writeFieldBegin('localAtendimento', Thrift.Type.I64, 6);
    output.writeI64(this.localAtendimento);
    output.writeFieldEnd();
  }
  if (this.tipoAtendimento !== null && this.tipoAtendimento !== undefined) {
    output.writeFieldBegin('tipoAtendimento', Thrift.Type.I64, 7);
    output.writeI64(this.tipoAtendimento);
    output.writeFieldEnd();
  }
  if (this.tiposEncamOdonto !== null && this.tiposEncamOdonto !== undefined) {
    output.writeFieldBegin('tiposEncamOdonto', Thrift.Type.LIST, 8);
    output.writeListBegin(Thrift.Type.I64, this.tiposEncamOdonto.length);
    for (var iter56 in this.tiposEncamOdonto)
    {
      if (this.tiposEncamOdonto.hasOwnProperty(iter56))
      {
        iter56 = this.tiposEncamOdonto[iter56];
        output.writeI64(iter56);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.tiposFornecimOdonto !== null && this.tiposFornecimOdonto !== undefined) {
    output.writeFieldBegin('tiposFornecimOdonto', Thrift.Type.LIST, 9);
    output.writeListBegin(Thrift.Type.I64, this.tiposFornecimOdonto.length);
    for (var iter57 in this.tiposFornecimOdonto)
    {
      if (this.tiposFornecimOdonto.hasOwnProperty(iter57))
      {
        iter57 = this.tiposFornecimOdonto[iter57];
        output.writeI64(iter57);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.tiposVigilanciaSaudeBucal !== null && this.tiposVigilanciaSaudeBucal !== undefined) {
    output.writeFieldBegin('tiposVigilanciaSaudeBucal', Thrift.Type.LIST, 10);
    output.writeListBegin(Thrift.Type.I64, this.tiposVigilanciaSaudeBucal.length);
    for (var iter58 in this.tiposVigilanciaSaudeBucal)
    {
      if (this.tiposVigilanciaSaudeBucal.hasOwnProperty(iter58))
      {
        iter58 = this.tiposVigilanciaSaudeBucal[iter58];
        output.writeI64(iter58);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.tiposConsultaOdonto !== null && this.tiposConsultaOdonto !== undefined) {
    output.writeFieldBegin('tiposConsultaOdonto', Thrift.Type.LIST, 11);
    output.writeListBegin(Thrift.Type.I64, this.tiposConsultaOdonto.length);
    for (var iter59 in this.tiposConsultaOdonto)
    {
      if (this.tiposConsultaOdonto.hasOwnProperty(iter59))
      {
        iter59 = this.tiposConsultaOdonto[iter59];
        output.writeI64(iter59);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.procedimentosRealizados !== null && this.procedimentosRealizados !== undefined) {
    output.writeFieldBegin('procedimentosRealizados', Thrift.Type.LIST, 12);
    output.writeListBegin(Thrift.Type.STRUCT, this.procedimentosRealizados.length);
    for (var iter60 in this.procedimentosRealizados)
    {
      if (this.procedimentosRealizados.hasOwnProperty(iter60))
      {
        iter60 = this.procedimentosRealizados[iter60];
        iter60.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.sexo !== null && this.sexo !== undefined) {
    output.writeFieldBegin('sexo', Thrift.Type.I64, 14);
    output.writeI64(this.sexo);
    output.writeFieldEnd();
  }
  if (this.turno !== null && this.turno !== undefined) {
    output.writeFieldBegin('turno', Thrift.Type.I64, 15);
    output.writeI64(this.turno);
    output.writeFieldEnd();
  }
  if (this.dataHoraInicialAtendimento !== null && this.dataHoraInicialAtendimento !== undefined) {
    output.writeFieldBegin('dataHoraInicialAtendimento', Thrift.Type.I64, 16);
    output.writeI64(this.dataHoraInicialAtendimento);
    output.writeFieldEnd();
  }
  if (this.dataHoraFinalAtendimento !== null && this.dataHoraFinalAtendimento !== undefined) {
    output.writeFieldBegin('dataHoraFinalAtendimento', Thrift.Type.I64, 17);
    output.writeI64(this.dataHoraFinalAtendimento);
    output.writeFieldEnd();
  }
  if (this.cpfCidadao !== null && this.cpfCidadao !== undefined) {
    output.writeFieldBegin('cpfCidadao', Thrift.Type.STRING, 18);
    output.writeString(this.cpfCidadao);
    output.writeFieldEnd();
  }
  if (this.medicamentos !== null && this.medicamentos !== undefined) {
    output.writeFieldBegin('medicamentos', Thrift.Type.LIST, 19);
    output.writeListBegin(Thrift.Type.STRUCT, this.medicamentos.length);
    for (var iter61 in this.medicamentos)
    {
      if (this.medicamentos.hasOwnProperty(iter61))
      {
        iter61 = this.medicamentos[iter61];
        iter61.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.encaminhamentos !== null && this.encaminhamentos !== undefined) {
    output.writeFieldBegin('encaminhamentos', Thrift.Type.LIST, 20);
    output.writeListBegin(Thrift.Type.STRUCT, this.encaminhamentos.length);
    for (var iter62 in this.encaminhamentos)
    {
      if (this.encaminhamentos.hasOwnProperty(iter62))
      {
        iter62 = this.encaminhamentos[iter62];
        iter62.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.resultadosExames !== null && this.resultadosExames !== undefined) {
    output.writeFieldBegin('resultadosExames', Thrift.Type.LIST, 21);
    output.writeListBegin(Thrift.Type.STRUCT, this.resultadosExames.length);
    for (var iter63 in this.resultadosExames)
    {
      if (this.resultadosExames.hasOwnProperty(iter63))
      {
        iter63 = this.resultadosExames[iter63];
        iter63.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.pesoAcompanhamentoNutricional !== null && this.pesoAcompanhamentoNutricional !== undefined) {
    output.writeFieldBegin('pesoAcompanhamentoNutricional', Thrift.Type.DOUBLE, 22);
    output.writeDouble(this.pesoAcompanhamentoNutricional);
    output.writeFieldEnd();
  }
  if (this.alturaAcompanhamentoNutricional !== null && this.alturaAcompanhamentoNutricional !== undefined) {
    output.writeFieldBegin('alturaAcompanhamentoNutricional', Thrift.Type.DOUBLE, 23);
    output.writeDouble(this.alturaAcompanhamentoNutricional);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FichaAtendimentoOdontologicoMasterThrift = module.exports.FichaAtendimentoOdontologicoMasterThrift = function(args) {
  this.uuidFicha = null;
  this.headerTransport = null;
  this.atendimentosOdontologicos = null;
  this.tpCdsOrigem = null;
  if (args) {
    if (args.uuidFicha !== undefined && args.uuidFicha !== null) {
      this.uuidFicha = args.uuidFicha;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field uuidFicha is unset!');
    }
    if (args.headerTransport !== undefined && args.headerTransport !== null) {
      this.headerTransport = new common_ttypes.VariasLotacoesHeaderThrift(args.headerTransport);
    }
    if (args.atendimentosOdontologicos !== undefined && args.atendimentosOdontologicos !== null) {
      this.atendimentosOdontologicos = Thrift.copyList(args.atendimentosOdontologicos, [ttypes.FichaAtendimentoOdontologicoChildThrift]);
    }
    if (args.tpCdsOrigem !== undefined && args.tpCdsOrigem !== null) {
      this.tpCdsOrigem = args.tpCdsOrigem;
    }
  }
};
FichaAtendimentoOdontologicoMasterThrift.prototype = {};
FichaAtendimentoOdontologicoMasterThrift.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.uuidFicha = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.headerTransport = new common_ttypes.VariasLotacoesHeaderThrift();
        this.headerTransport.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.LIST) {
        var _size64 = 0;
        var _rtmp368;
        this.atendimentosOdontologicos = [];
        var _etype67 = 0;
        _rtmp368 = input.readListBegin();
        _etype67 = _rtmp368.etype;
        _size64 = _rtmp368.size;
        for (var _i69 = 0; _i69 < _size64; ++_i69)
        {
          var elem70 = null;
          elem70 = new ttypes.FichaAtendimentoOdontologicoChildThrift();
          elem70.read(input);
          this.atendimentosOdontologicos.push(elem70);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I32) {
        this.tpCdsOrigem = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

FichaAtendimentoOdontologicoMasterThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoOdontologicoMasterThrift');
  if (this.uuidFicha !== null && this.uuidFicha !== undefined) {
    output.writeFieldBegin('uuidFicha', Thrift.Type.STRING, 1);
    output.writeString(this.uuidFicha);
    output.writeFieldEnd();
  }
  if (this.headerTransport !== null && this.headerTransport !== undefined) {
    output.writeFieldBegin('headerTransport', Thrift.Type.STRUCT, 2);
    this.headerTransport.write(output);
    output.writeFieldEnd();
  }
  if (this.atendimentosOdontologicos !== null && this.atendimentosOdontologicos !== undefined) {
    output.writeFieldBegin('atendimentosOdontologicos', Thrift.Type.LIST, 3);
    output.writeListBegin(Thrift.Type.STRUCT, this.atendimentosOdontologicos.length);
    for (var iter71 in this.atendimentosOdontologicos)
    {
      if (this.atendimentosOdontologicos.hasOwnProperty(iter71))
      {
        iter71 = this.atendimentosOdontologicos[iter71];
        iter71.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.tpCdsOrigem !== null && this.tpCdsOrigem !== undefined) {
    output.writeFieldBegin('tpCdsOrigem', Thrift.Type.I32, 4);
    output.writeI32(this.tpCdsOrigem);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};
