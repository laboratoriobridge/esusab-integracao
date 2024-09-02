//
// Autogenerated by Thrift Compiler (0.9.3)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//


FichaAtendimentoDomiciliarChildThrift = function(args) {
  this.turno = null;
  this.cnsCidadao = null;
  this.dataNascimento = null;
  this.sexo = null;
  this.localAtendimento = null;
  this.atencaoDomiciliarModalidade = null;
  this.tipoAtendimento = null;
  this.condicoesAvaliadas = null;
  this.cid = null;
  this.ciap = null;
  this.procedimentos = null;
  this.condutaDesfecho = null;
  this.cpfCidadao = null;
  this.problemasCondicoes = null;
  if (args) {
    if (args.turno !== undefined && args.turno !== null) {
      this.turno = args.turno;
    }
    if (args.cnsCidadao !== undefined && args.cnsCidadao !== null) {
      this.cnsCidadao = args.cnsCidadao;
    }
    if (args.dataNascimento !== undefined && args.dataNascimento !== null) {
      this.dataNascimento = args.dataNascimento;
    }
    if (args.sexo !== undefined && args.sexo !== null) {
      this.sexo = args.sexo;
    }
    if (args.localAtendimento !== undefined && args.localAtendimento !== null) {
      this.localAtendimento = args.localAtendimento;
    }
    if (args.atencaoDomiciliarModalidade !== undefined && args.atencaoDomiciliarModalidade !== null) {
      this.atencaoDomiciliarModalidade = args.atencaoDomiciliarModalidade;
    }
    if (args.tipoAtendimento !== undefined && args.tipoAtendimento !== null) {
      this.tipoAtendimento = args.tipoAtendimento;
    }
    if (args.condicoesAvaliadas !== undefined && args.condicoesAvaliadas !== null) {
      this.condicoesAvaliadas = Thrift.copyList(args.condicoesAvaliadas, [null]);
    }
    if (args.cid !== undefined && args.cid !== null) {
      this.cid = args.cid;
    }
    if (args.ciap !== undefined && args.ciap !== null) {
      this.ciap = args.ciap;
    }
    if (args.procedimentos !== undefined && args.procedimentos !== null) {
      this.procedimentos = Thrift.copyList(args.procedimentos, [null]);
    }
    if (args.condutaDesfecho !== undefined && args.condutaDesfecho !== null) {
      this.condutaDesfecho = args.condutaDesfecho;
    }
    if (args.cpfCidadao !== undefined && args.cpfCidadao !== null) {
      this.cpfCidadao = args.cpfCidadao;
    }
    if (args.problemasCondicoes !== undefined && args.problemasCondicoes !== null) {
      this.problemasCondicoes = Thrift.copyList(args.problemasCondicoes, [ProblemaCondicaoThrift]);
    }
  }
};
FichaAtendimentoDomiciliarChildThrift.prototype = {};
FichaAtendimentoDomiciliarChildThrift.prototype.read = function(input) {
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
        this.turno = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cnsCidadao = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.dataNascimento = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.sexo = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.localAtendimento = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I64) {
        this.atencaoDomiciliarModalidade = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I64) {
        this.tipoAtendimento = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.LIST) {
        var _size0 = 0;
        var _rtmp34;
        this.condicoesAvaliadas = [];
        var _etype3 = 0;
        _rtmp34 = input.readListBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = input.readI64().value;
          this.condicoesAvaliadas.push(elem6);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.STRING) {
        this.cid = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.STRING) {
        this.ciap = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.LIST) {
        var _size7 = 0;
        var _rtmp311;
        this.procedimentos = [];
        var _etype10 = 0;
        _rtmp311 = input.readListBegin();
        _etype10 = _rtmp311.etype;
        _size7 = _rtmp311.size;
        for (var _i12 = 0; _i12 < _size7; ++_i12)
        {
          var elem13 = null;
          elem13 = input.readString().value;
          this.procedimentos.push(elem13);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 13:
      if (ftype == Thrift.Type.I64) {
        this.condutaDesfecho = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 15:
      if (ftype == Thrift.Type.STRING) {
        this.cpfCidadao = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 16:
      if (ftype == Thrift.Type.LIST) {
        var _size14 = 0;
        var _rtmp318;
        this.problemasCondicoes = [];
        var _etype17 = 0;
        _rtmp318 = input.readListBegin();
        _etype17 = _rtmp318.etype;
        _size14 = _rtmp318.size;
        for (var _i19 = 0; _i19 < _size14; ++_i19)
        {
          var elem20 = null;
          elem20 = new ProblemaCondicaoThrift();
          elem20.read(input);
          this.problemasCondicoes.push(elem20);
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

FichaAtendimentoDomiciliarChildThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoDomiciliarChildThrift');
  if (this.turno !== null && this.turno !== undefined) {
    output.writeFieldBegin('turno', Thrift.Type.I64, 1);
    output.writeI64(this.turno);
    output.writeFieldEnd();
  }
  if (this.cnsCidadao !== null && this.cnsCidadao !== undefined) {
    output.writeFieldBegin('cnsCidadao', Thrift.Type.STRING, 2);
    output.writeString(this.cnsCidadao);
    output.writeFieldEnd();
  }
  if (this.dataNascimento !== null && this.dataNascimento !== undefined) {
    output.writeFieldBegin('dataNascimento', Thrift.Type.I64, 3);
    output.writeI64(this.dataNascimento);
    output.writeFieldEnd();
  }
  if (this.sexo !== null && this.sexo !== undefined) {
    output.writeFieldBegin('sexo', Thrift.Type.I64, 4);
    output.writeI64(this.sexo);
    output.writeFieldEnd();
  }
  if (this.localAtendimento !== null && this.localAtendimento !== undefined) {
    output.writeFieldBegin('localAtendimento', Thrift.Type.I64, 5);
    output.writeI64(this.localAtendimento);
    output.writeFieldEnd();
  }
  if (this.atencaoDomiciliarModalidade !== null && this.atencaoDomiciliarModalidade !== undefined) {
    output.writeFieldBegin('atencaoDomiciliarModalidade', Thrift.Type.I64, 6);
    output.writeI64(this.atencaoDomiciliarModalidade);
    output.writeFieldEnd();
  }
  if (this.tipoAtendimento !== null && this.tipoAtendimento !== undefined) {
    output.writeFieldBegin('tipoAtendimento', Thrift.Type.I64, 7);
    output.writeI64(this.tipoAtendimento);
    output.writeFieldEnd();
  }
  if (this.condicoesAvaliadas !== null && this.condicoesAvaliadas !== undefined) {
    output.writeFieldBegin('condicoesAvaliadas', Thrift.Type.LIST, 8);
    output.writeListBegin(Thrift.Type.I64, this.condicoesAvaliadas.length);
    for (var iter21 in this.condicoesAvaliadas)
    {
      if (this.condicoesAvaliadas.hasOwnProperty(iter21))
      {
        iter21 = this.condicoesAvaliadas[iter21];
        output.writeI64(iter21);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.cid !== null && this.cid !== undefined) {
    output.writeFieldBegin('cid', Thrift.Type.STRING, 9);
    output.writeString(this.cid);
    output.writeFieldEnd();
  }
  if (this.ciap !== null && this.ciap !== undefined) {
    output.writeFieldBegin('ciap', Thrift.Type.STRING, 10);
    output.writeString(this.ciap);
    output.writeFieldEnd();
  }
  if (this.procedimentos !== null && this.procedimentos !== undefined) {
    output.writeFieldBegin('procedimentos', Thrift.Type.LIST, 11);
    output.writeListBegin(Thrift.Type.STRING, this.procedimentos.length);
    for (var iter22 in this.procedimentos)
    {
      if (this.procedimentos.hasOwnProperty(iter22))
      {
        iter22 = this.procedimentos[iter22];
        output.writeString(iter22);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.condutaDesfecho !== null && this.condutaDesfecho !== undefined) {
    output.writeFieldBegin('condutaDesfecho', Thrift.Type.I64, 13);
    output.writeI64(this.condutaDesfecho);
    output.writeFieldEnd();
  }
  if (this.cpfCidadao !== null && this.cpfCidadao !== undefined) {
    output.writeFieldBegin('cpfCidadao', Thrift.Type.STRING, 15);
    output.writeString(this.cpfCidadao);
    output.writeFieldEnd();
  }
  if (this.problemasCondicoes !== null && this.problemasCondicoes !== undefined) {
    output.writeFieldBegin('problemasCondicoes', Thrift.Type.LIST, 16);
    output.writeListBegin(Thrift.Type.STRUCT, this.problemasCondicoes.length);
    for (var iter23 in this.problemasCondicoes)
    {
      if (this.problemasCondicoes.hasOwnProperty(iter23))
      {
        iter23 = this.problemasCondicoes[iter23];
        iter23.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FichaAtendimentoDomiciliarMasterThrift = function(args) {
  this.uuidFicha = null;
  this.tpCdsOrigem = null;
  this.atendimentosDomiciliares = null;
  this.headerTransport = null;
  if (args) {
    if (args.uuidFicha !== undefined && args.uuidFicha !== null) {
      this.uuidFicha = args.uuidFicha;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field uuidFicha is unset!');
    }
    if (args.tpCdsOrigem !== undefined && args.tpCdsOrigem !== null) {
      this.tpCdsOrigem = args.tpCdsOrigem;
    }
    if (args.atendimentosDomiciliares !== undefined && args.atendimentosDomiciliares !== null) {
      this.atendimentosDomiciliares = Thrift.copyList(args.atendimentosDomiciliares, [FichaAtendimentoDomiciliarChildThrift]);
    }
    if (args.headerTransport !== undefined && args.headerTransport !== null) {
      this.headerTransport = new VariasLotacoesHeaderThrift(args.headerTransport);
    }
  }
};
FichaAtendimentoDomiciliarMasterThrift.prototype = {};
FichaAtendimentoDomiciliarMasterThrift.prototype.read = function(input) {
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
        this.uuidFicha = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.tpCdsOrigem = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.LIST) {
        var _size24 = 0;
        var _rtmp328;
        this.atendimentosDomiciliares = [];
        var _etype27 = 0;
        _rtmp328 = input.readListBegin();
        _etype27 = _rtmp328.etype;
        _size24 = _rtmp328.size;
        for (var _i29 = 0; _i29 < _size24; ++_i29)
        {
          var elem30 = null;
          elem30 = new FichaAtendimentoDomiciliarChildThrift();
          elem30.read(input);
          this.atendimentosDomiciliares.push(elem30);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRUCT) {
        this.headerTransport = new VariasLotacoesHeaderThrift();
        this.headerTransport.read(input);
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

FichaAtendimentoDomiciliarMasterThrift.prototype.write = function(output) {
  output.writeStructBegin('FichaAtendimentoDomiciliarMasterThrift');
  if (this.uuidFicha !== null && this.uuidFicha !== undefined) {
    output.writeFieldBegin('uuidFicha', Thrift.Type.STRING, 1);
    output.writeString(this.uuidFicha);
    output.writeFieldEnd();
  }
  if (this.tpCdsOrigem !== null && this.tpCdsOrigem !== undefined) {
    output.writeFieldBegin('tpCdsOrigem', Thrift.Type.I32, 2);
    output.writeI32(this.tpCdsOrigem);
    output.writeFieldEnd();
  }
  if (this.atendimentosDomiciliares !== null && this.atendimentosDomiciliares !== undefined) {
    output.writeFieldBegin('atendimentosDomiciliares', Thrift.Type.LIST, 4);
    output.writeListBegin(Thrift.Type.STRUCT, this.atendimentosDomiciliares.length);
    for (var iter31 in this.atendimentosDomiciliares)
    {
      if (this.atendimentosDomiciliares.hasOwnProperty(iter31))
      {
        iter31 = this.atendimentosDomiciliares[iter31];
        iter31.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.headerTransport !== null && this.headerTransport !== undefined) {
    output.writeFieldBegin('headerTransport', Thrift.Type.STRUCT, 5);
    this.headerTransport.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

