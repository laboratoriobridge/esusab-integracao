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
ExameThrift = module.exports.ExameThrift = function(args) {
  this.codigoExame = null;
  this.solicitadoAvaliado = null;
  if (args) {
    if (args.codigoExame !== undefined && args.codigoExame !== null) {
      this.codigoExame = args.codigoExame;
    }
    if (args.solicitadoAvaliado !== undefined && args.solicitadoAvaliado !== null) {
      this.solicitadoAvaliado = Thrift.copyList(args.solicitadoAvaliado, [null]);
    }
  }
};
ExameThrift.prototype = {};
ExameThrift.prototype.read = function(input) {
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
        this.codigoExame = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size0 = 0;
        var _rtmp34;
        this.solicitadoAvaliado = [];
        var _etype3 = 0;
        _rtmp34 = input.readListBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = input.readString();
          this.solicitadoAvaliado.push(elem6);
        }
        input.readListEnd();
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

ExameThrift.prototype.write = function(output) {
  output.writeStructBegin('ExameThrift');
  if (this.codigoExame !== null && this.codigoExame !== undefined) {
    output.writeFieldBegin('codigoExame', Thrift.Type.STRING, 1);
    output.writeString(this.codigoExame);
    output.writeFieldEnd();
  }
  if (this.solicitadoAvaliado !== null && this.solicitadoAvaliado !== undefined) {
    output.writeFieldBegin('solicitadoAvaliado', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRING, this.solicitadoAvaliado.length);
    for (var iter7 in this.solicitadoAvaliado)
    {
      if (this.solicitadoAvaliado.hasOwnProperty(iter7))
      {
        iter7 = this.solicitadoAvaliado[iter7];
        output.writeString(iter7);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ProblemaCondicaoAvaliacaoAIThrift = module.exports.ProblemaCondicaoAvaliacaoAIThrift = function(args) {
  this.ciaps = null;
  this.outroCiap1 = null;
  this.outroCiap2 = null;
  this.cid10 = null;
  this.cid10_2 = null;
  if (args) {
    if (args.ciaps !== undefined && args.ciaps !== null) {
      this.ciaps = Thrift.copyList(args.ciaps, [null]);
    }
    if (args.outroCiap1 !== undefined && args.outroCiap1 !== null) {
      this.outroCiap1 = args.outroCiap1;
    }
    if (args.outroCiap2 !== undefined && args.outroCiap2 !== null) {
      this.outroCiap2 = args.outroCiap2;
    }
    if (args.cid10 !== undefined && args.cid10 !== null) {
      this.cid10 = args.cid10;
    }
    if (args.cid10_2 !== undefined && args.cid10_2 !== null) {
      this.cid10_2 = args.cid10_2;
    }
  }
};
ProblemaCondicaoAvaliacaoAIThrift.prototype = {};
ProblemaCondicaoAvaliacaoAIThrift.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.LIST) {
        var _size8 = 0;
        var _rtmp312;
        this.ciaps = [];
        var _etype11 = 0;
        _rtmp312 = input.readListBegin();
        _etype11 = _rtmp312.etype;
        _size8 = _rtmp312.size;
        for (var _i13 = 0; _i13 < _size8; ++_i13)
        {
          var elem14 = null;
          elem14 = input.readString();
          this.ciaps.push(elem14);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.outroCiap1 = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.outroCiap2 = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.cid10 = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRING) {
        this.cid10_2 = input.readString();
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

ProblemaCondicaoAvaliacaoAIThrift.prototype.write = function(output) {
  output.writeStructBegin('ProblemaCondicaoAvaliacaoAIThrift');
  if (this.ciaps !== null && this.ciaps !== undefined) {
    output.writeFieldBegin('ciaps', Thrift.Type.LIST, 1);
    output.writeListBegin(Thrift.Type.STRING, this.ciaps.length);
    for (var iter15 in this.ciaps)
    {
      if (this.ciaps.hasOwnProperty(iter15))
      {
        iter15 = this.ciaps[iter15];
        output.writeString(iter15);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.outroCiap1 !== null && this.outroCiap1 !== undefined) {
    output.writeFieldBegin('outroCiap1', Thrift.Type.STRING, 2);
    output.writeString(this.outroCiap1);
    output.writeFieldEnd();
  }
  if (this.outroCiap2 !== null && this.outroCiap2 !== undefined) {
    output.writeFieldBegin('outroCiap2', Thrift.Type.STRING, 3);
    output.writeString(this.outroCiap2);
    output.writeFieldEnd();
  }
  if (this.cid10 !== null && this.cid10 !== undefined) {
    output.writeFieldBegin('cid10', Thrift.Type.STRING, 4);
    output.writeString(this.cid10);
    output.writeFieldEnd();
  }
  if (this.cid10_2 !== null && this.cid10_2 !== undefined) {
    output.writeFieldBegin('cid10_2', Thrift.Type.STRING, 5);
    output.writeString(this.cid10_2);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FichaAtendimentoIndividualChildThrift = module.exports.FichaAtendimentoIndividualChildThrift = function(args) {
  this.numeroProntuario = null;
  this.cns = null;
  this.dataNascimento = null;
  this.localDeAtendimento = null;
  this.sexo = null;
  this.turno = null;
  this.tipoAtendimento = null;
  this.aleitamentoMaterno = null;
  this.dumDaGestante = null;
  this.idadeGestacional = null;
  this.atencaoDomiciliarModalidade = null;
  this.exame = null;
  this.vacinaEmDia = null;
  this.pic = null;
  this.ficouEmObservacao = null;
  this.nasfs = null;
  this.condutas = null;
  this.stGravidezPlanejada = null;
  this.nuGestasPrevias = null;
  this.nuPartos = null;
  this.racionalidadeSaude = null;
  this.dataHoraInicialAtendimento = null;
  this.dataHoraFinalAtendimento = null;
  this.cpfCidadao = null;
  this.medicamentos = null;
  this.encaminhamentos = null;
  this.resultadosExames = null;
  this.finalizadorObservacao = null;
  this.tipoParticipacaoCidadao = null;
  this.tipoParticipacaoProfissionalConvidado = null;
  this.emultis = null;
  this.medicoes = null;
  this.problemasCondicoes = null;
  this.ivcf = null;
  if (args) {
    if (args.numeroProntuario !== undefined && args.numeroProntuario !== null) {
      this.numeroProntuario = args.numeroProntuario;
    }
    if (args.cns !== undefined && args.cns !== null) {
      this.cns = args.cns;
    }
    if (args.dataNascimento !== undefined && args.dataNascimento !== null) {
      this.dataNascimento = args.dataNascimento;
    }
    if (args.localDeAtendimento !== undefined && args.localDeAtendimento !== null) {
      this.localDeAtendimento = args.localDeAtendimento;
    }
    if (args.sexo !== undefined && args.sexo !== null) {
      this.sexo = args.sexo;
    }
    if (args.turno !== undefined && args.turno !== null) {
      this.turno = args.turno;
    }
    if (args.tipoAtendimento !== undefined && args.tipoAtendimento !== null) {
      this.tipoAtendimento = args.tipoAtendimento;
    }
    if (args.aleitamentoMaterno !== undefined && args.aleitamentoMaterno !== null) {
      this.aleitamentoMaterno = args.aleitamentoMaterno;
    }
    if (args.dumDaGestante !== undefined && args.dumDaGestante !== null) {
      this.dumDaGestante = args.dumDaGestante;
    }
    if (args.idadeGestacional !== undefined && args.idadeGestacional !== null) {
      this.idadeGestacional = args.idadeGestacional;
    }
    if (args.atencaoDomiciliarModalidade !== undefined && args.atencaoDomiciliarModalidade !== null) {
      this.atencaoDomiciliarModalidade = args.atencaoDomiciliarModalidade;
    }
    if (args.exame !== undefined && args.exame !== null) {
      this.exame = Thrift.copyList(args.exame, [ttypes.ExameThrift]);
    }
    if (args.vacinaEmDia !== undefined && args.vacinaEmDia !== null) {
      this.vacinaEmDia = args.vacinaEmDia;
    }
    if (args.pic !== undefined && args.pic !== null) {
      this.pic = args.pic;
    }
    if (args.ficouEmObservacao !== undefined && args.ficouEmObservacao !== null) {
      this.ficouEmObservacao = args.ficouEmObservacao;
    }
    if (args.nasfs !== undefined && args.nasfs !== null) {
      this.nasfs = Thrift.copyList(args.nasfs, [null]);
    }
    if (args.condutas !== undefined && args.condutas !== null) {
      this.condutas = Thrift.copyList(args.condutas, [null]);
    }
    if (args.stGravidezPlanejada !== undefined && args.stGravidezPlanejada !== null) {
      this.stGravidezPlanejada = args.stGravidezPlanejada;
    }
    if (args.nuGestasPrevias !== undefined && args.nuGestasPrevias !== null) {
      this.nuGestasPrevias = args.nuGestasPrevias;
    }
    if (args.nuPartos !== undefined && args.nuPartos !== null) {
      this.nuPartos = args.nuPartos;
    }
    if (args.racionalidadeSaude !== undefined && args.racionalidadeSaude !== null) {
      this.racionalidadeSaude = args.racionalidadeSaude;
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
    if (args.finalizadorObservacao !== undefined && args.finalizadorObservacao !== null) {
      this.finalizadorObservacao = new common_ttypes.LotacaoHeaderThrift(args.finalizadorObservacao);
    }
    if (args.tipoParticipacaoCidadao !== undefined && args.tipoParticipacaoCidadao !== null) {
      this.tipoParticipacaoCidadao = args.tipoParticipacaoCidadao;
    }
    if (args.tipoParticipacaoProfissionalConvidado !== undefined && args.tipoParticipacaoProfissionalConvidado !== null) {
      this.tipoParticipacaoProfissionalConvidado = args.tipoParticipacaoProfissionalConvidado;
    }
    if (args.emultis !== undefined && args.emultis !== null) {
      this.emultis = Thrift.copyList(args.emultis, [null]);
    }
    if (args.medicoes !== undefined && args.medicoes !== null) {
      this.medicoes = new common_ttypes.MedicoesThrift(args.medicoes);
    }
    if (args.problemasCondicoes !== undefined && args.problemasCondicoes !== null) {
      this.problemasCondicoes = Thrift.copyList(args.problemasCondicoes, [common_ttypes.ProblemaCondicaoThrift]);
    }
    if (args.ivcf !== undefined && args.ivcf !== null) {
      this.ivcf = new common_ttypes.IvcfThrift(args.ivcf);
    }
  }
};
FichaAtendimentoIndividualChildThrift.prototype = {};
FichaAtendimentoIndividualChildThrift.prototype.read = function(input) {
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
        this.numeroProntuario = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cns = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.dataNascimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.localDeAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.sexo = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I64) {
        this.turno = input.readI64();
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
      case 10:
      if (ftype == Thrift.Type.I64) {
        this.aleitamentoMaterno = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.I64) {
        this.dumDaGestante = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 12:
      if (ftype == Thrift.Type.I32) {
        this.idadeGestacional = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 13:
      if (ftype == Thrift.Type.I64) {
        this.atencaoDomiciliarModalidade = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 17:
      if (ftype == Thrift.Type.LIST) {
        var _size16 = 0;
        var _rtmp320;
        this.exame = [];
        var _etype19 = 0;
        _rtmp320 = input.readListBegin();
        _etype19 = _rtmp320.etype;
        _size16 = _rtmp320.size;
        for (var _i21 = 0; _i21 < _size16; ++_i21)
        {
          var elem22 = null;
          elem22 = new ttypes.ExameThrift();
          elem22.read(input);
          this.exame.push(elem22);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 18:
      if (ftype == Thrift.Type.BOOL) {
        this.vacinaEmDia = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 19:
      if (ftype == Thrift.Type.I64) {
        this.pic = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 20:
      if (ftype == Thrift.Type.BOOL) {
        this.ficouEmObservacao = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 21:
      if (ftype == Thrift.Type.LIST) {
        var _size23 = 0;
        var _rtmp327;
        this.nasfs = [];
        var _etype26 = 0;
        _rtmp327 = input.readListBegin();
        _etype26 = _rtmp327.etype;
        _size23 = _rtmp327.size;
        for (var _i28 = 0; _i28 < _size23; ++_i28)
        {
          var elem29 = null;
          elem29 = input.readI64();
          this.nasfs.push(elem29);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 22:
      if (ftype == Thrift.Type.LIST) {
        var _size30 = 0;
        var _rtmp334;
        this.condutas = [];
        var _etype33 = 0;
        _rtmp334 = input.readListBegin();
        _etype33 = _rtmp334.etype;
        _size30 = _rtmp334.size;
        for (var _i35 = 0; _i35 < _size30; ++_i35)
        {
          var elem36 = null;
          elem36 = input.readI64();
          this.condutas.push(elem36);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 23:
      if (ftype == Thrift.Type.BOOL) {
        this.stGravidezPlanejada = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 24:
      if (ftype == Thrift.Type.I32) {
        this.nuGestasPrevias = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 25:
      if (ftype == Thrift.Type.I32) {
        this.nuPartos = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 26:
      if (ftype == Thrift.Type.I64) {
        this.racionalidadeSaude = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 28:
      if (ftype == Thrift.Type.I64) {
        this.dataHoraInicialAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 29:
      if (ftype == Thrift.Type.I64) {
        this.dataHoraFinalAtendimento = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 30:
      if (ftype == Thrift.Type.STRING) {
        this.cpfCidadao = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 31:
      if (ftype == Thrift.Type.LIST) {
        var _size37 = 0;
        var _rtmp341;
        this.medicamentos = [];
        var _etype40 = 0;
        _rtmp341 = input.readListBegin();
        _etype40 = _rtmp341.etype;
        _size37 = _rtmp341.size;
        for (var _i42 = 0; _i42 < _size37; ++_i42)
        {
          var elem43 = null;
          elem43 = new common_ttypes.MedicamentoThrift();
          elem43.read(input);
          this.medicamentos.push(elem43);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 32:
      if (ftype == Thrift.Type.LIST) {
        var _size44 = 0;
        var _rtmp348;
        this.encaminhamentos = [];
        var _etype47 = 0;
        _rtmp348 = input.readListBegin();
        _etype47 = _rtmp348.etype;
        _size44 = _rtmp348.size;
        for (var _i49 = 0; _i49 < _size44; ++_i49)
        {
          var elem50 = null;
          elem50 = new common_ttypes.EncaminhamentoExternoThrift();
          elem50.read(input);
          this.encaminhamentos.push(elem50);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 33:
      if (ftype == Thrift.Type.LIST) {
        var _size51 = 0;
        var _rtmp355;
        this.resultadosExames = [];
        var _etype54 = 0;
        _rtmp355 = input.readListBegin();
        _etype54 = _rtmp355.etype;
        _size51 = _rtmp355.size;
        for (var _i56 = 0; _i56 < _size51; ++_i56)
        {
          var elem57 = null;
          elem57 = new common_ttypes.ResultadosExameThrift();
          elem57.read(input);
          this.resultadosExames.push(elem57);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 35:
      if (ftype == Thrift.Type.STRUCT) {
        this.finalizadorObservacao = new common_ttypes.LotacaoHeaderThrift();
        this.finalizadorObservacao.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 36:
      if (ftype == Thrift.Type.I64) {
        this.tipoParticipacaoCidadao = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 37:
      if (ftype == Thrift.Type.I64) {
        this.tipoParticipacaoProfissionalConvidado = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 38:
      if (ftype == Thrift.Type.LIST) {
        var _size58 = 0;
        var _rtmp362;
        this.emultis = [];
        var _etype61 = 0;
        _rtmp362 = input.readListBegin();
        _etype61 = _rtmp362.etype;
        _size58 = _rtmp362.size;
        for (var _i63 = 0; _i63 < _size58; ++_i63)
        {
          var elem64 = null;
          elem64 = input.readI64();
          this.emultis.push(elem64);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 39:
      if (ftype == Thrift.Type.STRUCT) {
        this.medicoes = new common_ttypes.MedicoesThrift();
        this.medicoes.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 40:
      if (ftype == Thrift.Type.LIST) {
        var _size65 = 0;
        var _rtmp369;
        this.problemasCondicoes = [];
        var _etype68 = 0;
        _rtmp369 = input.readListBegin();
        _etype68 = _rtmp369.etype;
        _size65 = _rtmp369.size;
        for (var _i70 = 0; _i70 < _size65; ++_i70)
        {
          var elem71 = null;
          elem71 = new common_ttypes.ProblemaCondicaoThrift();
          elem71.read(input);
          this.problemasCondicoes.push(elem71);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 41:
      if (ftype == Thrift.Type.STRUCT) {
        this.ivcf = new common_ttypes.IvcfThrift();
        this.ivcf.read(input);
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

FichaAtendimentoIndividualChildThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoIndividualChildThrift');
  if (this.numeroProntuario !== null && this.numeroProntuario !== undefined) {
    output.writeFieldBegin('numeroProntuario', Thrift.Type.STRING, 1);
    output.writeString(this.numeroProntuario);
    output.writeFieldEnd();
  }
  if (this.cns !== null && this.cns !== undefined) {
    output.writeFieldBegin('cns', Thrift.Type.STRING, 2);
    output.writeString(this.cns);
    output.writeFieldEnd();
  }
  if (this.dataNascimento !== null && this.dataNascimento !== undefined) {
    output.writeFieldBegin('dataNascimento', Thrift.Type.I64, 3);
    output.writeI64(this.dataNascimento);
    output.writeFieldEnd();
  }
  if (this.localDeAtendimento !== null && this.localDeAtendimento !== undefined) {
    output.writeFieldBegin('localDeAtendimento', Thrift.Type.I64, 4);
    output.writeI64(this.localDeAtendimento);
    output.writeFieldEnd();
  }
  if (this.sexo !== null && this.sexo !== undefined) {
    output.writeFieldBegin('sexo', Thrift.Type.I64, 5);
    output.writeI64(this.sexo);
    output.writeFieldEnd();
  }
  if (this.turno !== null && this.turno !== undefined) {
    output.writeFieldBegin('turno', Thrift.Type.I64, 6);
    output.writeI64(this.turno);
    output.writeFieldEnd();
  }
  if (this.tipoAtendimento !== null && this.tipoAtendimento !== undefined) {
    output.writeFieldBegin('tipoAtendimento', Thrift.Type.I64, 7);
    output.writeI64(this.tipoAtendimento);
    output.writeFieldEnd();
  }
  if (this.aleitamentoMaterno !== null && this.aleitamentoMaterno !== undefined) {
    output.writeFieldBegin('aleitamentoMaterno', Thrift.Type.I64, 10);
    output.writeI64(this.aleitamentoMaterno);
    output.writeFieldEnd();
  }
  if (this.dumDaGestante !== null && this.dumDaGestante !== undefined) {
    output.writeFieldBegin('dumDaGestante', Thrift.Type.I64, 11);
    output.writeI64(this.dumDaGestante);
    output.writeFieldEnd();
  }
  if (this.idadeGestacional !== null && this.idadeGestacional !== undefined) {
    output.writeFieldBegin('idadeGestacional', Thrift.Type.I32, 12);
    output.writeI32(this.idadeGestacional);
    output.writeFieldEnd();
  }
  if (this.atencaoDomiciliarModalidade !== null && this.atencaoDomiciliarModalidade !== undefined) {
    output.writeFieldBegin('atencaoDomiciliarModalidade', Thrift.Type.I64, 13);
    output.writeI64(this.atencaoDomiciliarModalidade);
    output.writeFieldEnd();
  }
  if (this.exame !== null && this.exame !== undefined) {
    output.writeFieldBegin('exame', Thrift.Type.LIST, 17);
    output.writeListBegin(Thrift.Type.STRUCT, this.exame.length);
    for (var iter72 in this.exame)
    {
      if (this.exame.hasOwnProperty(iter72))
      {
        iter72 = this.exame[iter72];
        iter72.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.vacinaEmDia !== null && this.vacinaEmDia !== undefined) {
    output.writeFieldBegin('vacinaEmDia', Thrift.Type.BOOL, 18);
    output.writeBool(this.vacinaEmDia);
    output.writeFieldEnd();
  }
  if (this.pic !== null && this.pic !== undefined) {
    output.writeFieldBegin('pic', Thrift.Type.I64, 19);
    output.writeI64(this.pic);
    output.writeFieldEnd();
  }
  if (this.ficouEmObservacao !== null && this.ficouEmObservacao !== undefined) {
    output.writeFieldBegin('ficouEmObservacao', Thrift.Type.BOOL, 20);
    output.writeBool(this.ficouEmObservacao);
    output.writeFieldEnd();
  }
  if (this.nasfs !== null && this.nasfs !== undefined) {
    output.writeFieldBegin('nasfs', Thrift.Type.LIST, 21);
    output.writeListBegin(Thrift.Type.I64, this.nasfs.length);
    for (var iter73 in this.nasfs)
    {
      if (this.nasfs.hasOwnProperty(iter73))
      {
        iter73 = this.nasfs[iter73];
        output.writeI64(iter73);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.condutas !== null && this.condutas !== undefined) {
    output.writeFieldBegin('condutas', Thrift.Type.LIST, 22);
    output.writeListBegin(Thrift.Type.I64, this.condutas.length);
    for (var iter74 in this.condutas)
    {
      if (this.condutas.hasOwnProperty(iter74))
      {
        iter74 = this.condutas[iter74];
        output.writeI64(iter74);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.stGravidezPlanejada !== null && this.stGravidezPlanejada !== undefined) {
    output.writeFieldBegin('stGravidezPlanejada', Thrift.Type.BOOL, 23);
    output.writeBool(this.stGravidezPlanejada);
    output.writeFieldEnd();
  }
  if (this.nuGestasPrevias !== null && this.nuGestasPrevias !== undefined) {
    output.writeFieldBegin('nuGestasPrevias', Thrift.Type.I32, 24);
    output.writeI32(this.nuGestasPrevias);
    output.writeFieldEnd();
  }
  if (this.nuPartos !== null && this.nuPartos !== undefined) {
    output.writeFieldBegin('nuPartos', Thrift.Type.I32, 25);
    output.writeI32(this.nuPartos);
    output.writeFieldEnd();
  }
  if (this.racionalidadeSaude !== null && this.racionalidadeSaude !== undefined) {
    output.writeFieldBegin('racionalidadeSaude', Thrift.Type.I64, 26);
    output.writeI64(this.racionalidadeSaude);
    output.writeFieldEnd();
  }
  if (this.dataHoraInicialAtendimento !== null && this.dataHoraInicialAtendimento !== undefined) {
    output.writeFieldBegin('dataHoraInicialAtendimento', Thrift.Type.I64, 28);
    output.writeI64(this.dataHoraInicialAtendimento);
    output.writeFieldEnd();
  }
  if (this.dataHoraFinalAtendimento !== null && this.dataHoraFinalAtendimento !== undefined) {
    output.writeFieldBegin('dataHoraFinalAtendimento', Thrift.Type.I64, 29);
    output.writeI64(this.dataHoraFinalAtendimento);
    output.writeFieldEnd();
  }
  if (this.cpfCidadao !== null && this.cpfCidadao !== undefined) {
    output.writeFieldBegin('cpfCidadao', Thrift.Type.STRING, 30);
    output.writeString(this.cpfCidadao);
    output.writeFieldEnd();
  }
  if (this.medicamentos !== null && this.medicamentos !== undefined) {
    output.writeFieldBegin('medicamentos', Thrift.Type.LIST, 31);
    output.writeListBegin(Thrift.Type.STRUCT, this.medicamentos.length);
    for (var iter75 in this.medicamentos)
    {
      if (this.medicamentos.hasOwnProperty(iter75))
      {
        iter75 = this.medicamentos[iter75];
        iter75.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.encaminhamentos !== null && this.encaminhamentos !== undefined) {
    output.writeFieldBegin('encaminhamentos', Thrift.Type.LIST, 32);
    output.writeListBegin(Thrift.Type.STRUCT, this.encaminhamentos.length);
    for (var iter76 in this.encaminhamentos)
    {
      if (this.encaminhamentos.hasOwnProperty(iter76))
      {
        iter76 = this.encaminhamentos[iter76];
        iter76.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.resultadosExames !== null && this.resultadosExames !== undefined) {
    output.writeFieldBegin('resultadosExames', Thrift.Type.LIST, 33);
    output.writeListBegin(Thrift.Type.STRUCT, this.resultadosExames.length);
    for (var iter77 in this.resultadosExames)
    {
      if (this.resultadosExames.hasOwnProperty(iter77))
      {
        iter77 = this.resultadosExames[iter77];
        iter77.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.finalizadorObservacao !== null && this.finalizadorObservacao !== undefined) {
    output.writeFieldBegin('finalizadorObservacao', Thrift.Type.STRUCT, 35);
    this.finalizadorObservacao.write(output);
    output.writeFieldEnd();
  }
  if (this.tipoParticipacaoCidadao !== null && this.tipoParticipacaoCidadao !== undefined) {
    output.writeFieldBegin('tipoParticipacaoCidadao', Thrift.Type.I64, 36);
    output.writeI64(this.tipoParticipacaoCidadao);
    output.writeFieldEnd();
  }
  if (this.tipoParticipacaoProfissionalConvidado !== null && this.tipoParticipacaoProfissionalConvidado !== undefined) {
    output.writeFieldBegin('tipoParticipacaoProfissionalConvidado', Thrift.Type.I64, 37);
    output.writeI64(this.tipoParticipacaoProfissionalConvidado);
    output.writeFieldEnd();
  }
  if (this.emultis !== null && this.emultis !== undefined) {
    output.writeFieldBegin('emultis', Thrift.Type.LIST, 38);
    output.writeListBegin(Thrift.Type.I64, this.emultis.length);
    for (var iter78 in this.emultis)
    {
      if (this.emultis.hasOwnProperty(iter78))
      {
        iter78 = this.emultis[iter78];
        output.writeI64(iter78);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.medicoes !== null && this.medicoes !== undefined) {
    output.writeFieldBegin('medicoes', Thrift.Type.STRUCT, 39);
    this.medicoes.write(output);
    output.writeFieldEnd();
  }
  if (this.problemasCondicoes !== null && this.problemasCondicoes !== undefined) {
    output.writeFieldBegin('problemasCondicoes', Thrift.Type.LIST, 40);
    output.writeListBegin(Thrift.Type.STRUCT, this.problemasCondicoes.length);
    for (var iter79 in this.problemasCondicoes)
    {
      if (this.problemasCondicoes.hasOwnProperty(iter79))
      {
        iter79 = this.problemasCondicoes[iter79];
        iter79.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.ivcf !== null && this.ivcf !== undefined) {
    output.writeFieldBegin('ivcf', Thrift.Type.STRUCT, 41);
    this.ivcf.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FichaAtendimentoIndividualMasterThrift = module.exports.FichaAtendimentoIndividualMasterThrift = function(args) {
  this.headerTransport = null;
  this.atendimentosIndividuais = null;
  this.uuidFicha = null;
  this.tpCdsOrigem = null;
  if (args) {
    if (args.headerTransport !== undefined && args.headerTransport !== null) {
      this.headerTransport = new common_ttypes.VariasLotacoesHeaderThrift(args.headerTransport);
    }
    if (args.atendimentosIndividuais !== undefined && args.atendimentosIndividuais !== null) {
      this.atendimentosIndividuais = Thrift.copyList(args.atendimentosIndividuais, [ttypes.FichaAtendimentoIndividualChildThrift]);
    }
    if (args.uuidFicha !== undefined && args.uuidFicha !== null) {
      this.uuidFicha = args.uuidFicha;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field uuidFicha is unset!');
    }
    if (args.tpCdsOrigem !== undefined && args.tpCdsOrigem !== null) {
      this.tpCdsOrigem = args.tpCdsOrigem;
    }
  }
};
FichaAtendimentoIndividualMasterThrift.prototype = {};
FichaAtendimentoIndividualMasterThrift.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.STRUCT) {
        this.headerTransport = new common_ttypes.VariasLotacoesHeaderThrift();
        this.headerTransport.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size80 = 0;
        var _rtmp384;
        this.atendimentosIndividuais = [];
        var _etype83 = 0;
        _rtmp384 = input.readListBegin();
        _etype83 = _rtmp384.etype;
        _size80 = _rtmp384.size;
        for (var _i85 = 0; _i85 < _size80; ++_i85)
        {
          var elem86 = null;
          elem86 = new ttypes.FichaAtendimentoIndividualChildThrift();
          elem86.read(input);
          this.atendimentosIndividuais.push(elem86);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.uuidFicha = input.readString();
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

FichaAtendimentoIndividualMasterThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoIndividualMasterThrift');
  if (this.headerTransport !== null && this.headerTransport !== undefined) {
    output.writeFieldBegin('headerTransport', Thrift.Type.STRUCT, 1);
    this.headerTransport.write(output);
    output.writeFieldEnd();
  }
  if (this.atendimentosIndividuais !== null && this.atendimentosIndividuais !== undefined) {
    output.writeFieldBegin('atendimentosIndividuais', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.atendimentosIndividuais.length);
    for (var iter87 in this.atendimentosIndividuais)
    {
      if (this.atendimentosIndividuais.hasOwnProperty(iter87))
      {
        iter87 = this.atendimentosIndividuais[iter87];
        iter87.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.uuidFicha !== null && this.uuidFicha !== undefined) {
    output.writeFieldBegin('uuidFicha', Thrift.Type.STRING, 3);
    output.writeString(this.uuidFicha);
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

