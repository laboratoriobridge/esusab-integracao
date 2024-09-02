#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
import br.gov.saude.esusab.ras.common.ttypes


from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None



class ProcedimentoQuantidadeThrift:
  """
  Attributes:
   - coMsProcedimento
   - quantidade
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'coMsProcedimento', None, None, ), # 1
    (2, TType.I32, 'quantidade', None, None, ), # 2
  )

  def __init__(self, coMsProcedimento=None, quantidade=None,):
    self.coMsProcedimento = coMsProcedimento
    self.quantidade = quantidade

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.coMsProcedimento = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.quantidade = iprot.readI32()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('ProcedimentoQuantidadeThrift')
    if self.coMsProcedimento is not None:
      oprot.writeFieldBegin('coMsProcedimento', TType.STRING, 1)
      oprot.writeString(self.coMsProcedimento)
      oprot.writeFieldEnd()
    if self.quantidade is not None:
      oprot.writeFieldBegin('quantidade', TType.I32, 2)
      oprot.writeI32(self.quantidade)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.coMsProcedimento)
    value = (value * 31) ^ hash(self.quantidade)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class FichaAtendimentoOdontologicoChildThrift:
  """
  Attributes:
   - dtNascimento
   - cnsCidadao
   - numProntuario
   - gestante
   - necessidadesEspeciais
   - localAtendimento
   - tipoAtendimento
   - tiposEncamOdonto
   - tiposFornecimOdonto
   - tiposVigilanciaSaudeBucal
   - tiposConsultaOdonto
   - procedimentosRealizados
   - sexo
   - turno
   - dataHoraInicialAtendimento
   - dataHoraFinalAtendimento
   - cpfCidadao
   - medicamentos
   - encaminhamentos
   - resultadosExames
   - pesoAcompanhamentoNutricional
   - alturaAcompanhamentoNutricional
   - medicoes
  """

  thrift_spec = (
    None, # 0
    (1, TType.I64, 'dtNascimento', None, None, ), # 1
    (2, TType.STRING, 'cnsCidadao', None, None, ), # 2
    (3, TType.STRING, 'numProntuario', None, None, ), # 3
    (4, TType.BOOL, 'gestante', None, None, ), # 4
    (5, TType.BOOL, 'necessidadesEspeciais', None, None, ), # 5
    (6, TType.I64, 'localAtendimento', None, None, ), # 6
    (7, TType.I64, 'tipoAtendimento', None, None, ), # 7
    (8, TType.LIST, 'tiposEncamOdonto', (TType.I64,None), None, ), # 8
    (9, TType.LIST, 'tiposFornecimOdonto', (TType.I64,None), None, ), # 9
    (10, TType.LIST, 'tiposVigilanciaSaudeBucal', (TType.I64,None), None, ), # 10
    (11, TType.LIST, 'tiposConsultaOdonto', (TType.I64,None), None, ), # 11
    (12, TType.LIST, 'procedimentosRealizados', (TType.STRUCT,(ProcedimentoQuantidadeThrift, ProcedimentoQuantidadeThrift.thrift_spec)), None, ), # 12
    None, # 13
    (14, TType.I64, 'sexo', None, None, ), # 14
    (15, TType.I64, 'turno', None, None, ), # 15
    (16, TType.I64, 'dataHoraInicialAtendimento', None, None, ), # 16
    (17, TType.I64, 'dataHoraFinalAtendimento', None, None, ), # 17
    (18, TType.STRING, 'cpfCidadao', None, None, ), # 18
    (19, TType.LIST, 'medicamentos', (TType.STRUCT,(br.gov.saude.esusab.ras.common.ttypes.MedicamentoThrift, br.gov.saude.esusab.ras.common.ttypes.MedicamentoThrift.thrift_spec)), None, ), # 19
    (20, TType.LIST, 'encaminhamentos', (TType.STRUCT,(br.gov.saude.esusab.ras.common.ttypes.EncaminhamentoExternoThrift, br.gov.saude.esusab.ras.common.ttypes.EncaminhamentoExternoThrift.thrift_spec)), None, ), # 20
    (21, TType.LIST, 'resultadosExames', (TType.STRUCT,(br.gov.saude.esusab.ras.common.ttypes.ResultadosExameThrift, br.gov.saude.esusab.ras.common.ttypes.ResultadosExameThrift.thrift_spec)), None, ), # 21
    (22, TType.DOUBLE, 'pesoAcompanhamentoNutricional', None, None, ), # 22
    (23, TType.DOUBLE, 'alturaAcompanhamentoNutricional', None, None, ), # 23
    None, # 24
    None, # 25
    None, # 26
    (27, TType.STRUCT, 'medicoes', (br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift, br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift.thrift_spec), None, ), # 27
  )

  def __init__(self, dtNascimento=None, cnsCidadao=None, numProntuario=None, gestante=None, necessidadesEspeciais=None, localAtendimento=None, tipoAtendimento=None, tiposEncamOdonto=None, tiposFornecimOdonto=None, tiposVigilanciaSaudeBucal=None, tiposConsultaOdonto=None, procedimentosRealizados=None, sexo=None, turno=None, dataHoraInicialAtendimento=None, dataHoraFinalAtendimento=None, cpfCidadao=None, medicamentos=None, encaminhamentos=None, resultadosExames=None, pesoAcompanhamentoNutricional=None, alturaAcompanhamentoNutricional=None, medicoes=None,):
    self.dtNascimento = dtNascimento
    self.cnsCidadao = cnsCidadao
    self.numProntuario = numProntuario
    self.gestante = gestante
    self.necessidadesEspeciais = necessidadesEspeciais
    self.localAtendimento = localAtendimento
    self.tipoAtendimento = tipoAtendimento
    self.tiposEncamOdonto = tiposEncamOdonto
    self.tiposFornecimOdonto = tiposFornecimOdonto
    self.tiposVigilanciaSaudeBucal = tiposVigilanciaSaudeBucal
    self.tiposConsultaOdonto = tiposConsultaOdonto
    self.procedimentosRealizados = procedimentosRealizados
    self.sexo = sexo
    self.turno = turno
    self.dataHoraInicialAtendimento = dataHoraInicialAtendimento
    self.dataHoraFinalAtendimento = dataHoraFinalAtendimento
    self.cpfCidadao = cpfCidadao
    self.medicamentos = medicamentos
    self.encaminhamentos = encaminhamentos
    self.resultadosExames = resultadosExames
    self.pesoAcompanhamentoNutricional = pesoAcompanhamentoNutricional
    self.alturaAcompanhamentoNutricional = alturaAcompanhamentoNutricional
    self.medicoes = medicoes

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I64:
          self.dtNascimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.cnsCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRING:
          self.numProntuario = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.BOOL:
          self.gestante = iprot.readBool()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.BOOL:
          self.necessidadesEspeciais = iprot.readBool()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.I64:
          self.localAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.I64:
          self.tipoAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.LIST:
          self.tiposEncamOdonto = []
          (_etype3, _size0) = iprot.readListBegin()
          for _i4 in xrange(_size0):
            _elem5 = iprot.readI64()
            self.tiposEncamOdonto.append(_elem5)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.LIST:
          self.tiposFornecimOdonto = []
          (_etype9, _size6) = iprot.readListBegin()
          for _i10 in xrange(_size6):
            _elem11 = iprot.readI64()
            self.tiposFornecimOdonto.append(_elem11)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.LIST:
          self.tiposVigilanciaSaudeBucal = []
          (_etype15, _size12) = iprot.readListBegin()
          for _i16 in xrange(_size12):
            _elem17 = iprot.readI64()
            self.tiposVigilanciaSaudeBucal.append(_elem17)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.LIST:
          self.tiposConsultaOdonto = []
          (_etype21, _size18) = iprot.readListBegin()
          for _i22 in xrange(_size18):
            _elem23 = iprot.readI64()
            self.tiposConsultaOdonto.append(_elem23)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 12:
        if ftype == TType.LIST:
          self.procedimentosRealizados = []
          (_etype27, _size24) = iprot.readListBegin()
          for _i28 in xrange(_size24):
            _elem29 = ProcedimentoQuantidadeThrift()
            _elem29.read(iprot)
            self.procedimentosRealizados.append(_elem29)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 14:
        if ftype == TType.I64:
          self.sexo = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 15:
        if ftype == TType.I64:
          self.turno = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 16:
        if ftype == TType.I64:
          self.dataHoraInicialAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 17:
        if ftype == TType.I64:
          self.dataHoraFinalAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 18:
        if ftype == TType.STRING:
          self.cpfCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 19:
        if ftype == TType.LIST:
          self.medicamentos = []
          (_etype33, _size30) = iprot.readListBegin()
          for _i34 in xrange(_size30):
            _elem35 = br.gov.saude.esusab.ras.common.ttypes.MedicamentoThrift()
            _elem35.read(iprot)
            self.medicamentos.append(_elem35)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 20:
        if ftype == TType.LIST:
          self.encaminhamentos = []
          (_etype39, _size36) = iprot.readListBegin()
          for _i40 in xrange(_size36):
            _elem41 = br.gov.saude.esusab.ras.common.ttypes.EncaminhamentoExternoThrift()
            _elem41.read(iprot)
            self.encaminhamentos.append(_elem41)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 21:
        if ftype == TType.LIST:
          self.resultadosExames = []
          (_etype45, _size42) = iprot.readListBegin()
          for _i46 in xrange(_size42):
            _elem47 = br.gov.saude.esusab.ras.common.ttypes.ResultadosExameThrift()
            _elem47.read(iprot)
            self.resultadosExames.append(_elem47)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 22:
        if ftype == TType.DOUBLE:
          self.pesoAcompanhamentoNutricional = iprot.readDouble()
        else:
          iprot.skip(ftype)
      elif fid == 23:
        if ftype == TType.DOUBLE:
          self.alturaAcompanhamentoNutricional = iprot.readDouble()
        else:
          iprot.skip(ftype)
      elif fid == 27:
        if ftype == TType.STRUCT:
          self.medicoes = br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift()
          self.medicoes.read(iprot)
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('FichaAtendimentoOdontologicoChildThrift')
    if self.dtNascimento is not None:
      oprot.writeFieldBegin('dtNascimento', TType.I64, 1)
      oprot.writeI64(self.dtNascimento)
      oprot.writeFieldEnd()
    if self.cnsCidadao is not None:
      oprot.writeFieldBegin('cnsCidadao', TType.STRING, 2)
      oprot.writeString(self.cnsCidadao)
      oprot.writeFieldEnd()
    if self.numProntuario is not None:
      oprot.writeFieldBegin('numProntuario', TType.STRING, 3)
      oprot.writeString(self.numProntuario)
      oprot.writeFieldEnd()
    if self.gestante is not None:
      oprot.writeFieldBegin('gestante', TType.BOOL, 4)
      oprot.writeBool(self.gestante)
      oprot.writeFieldEnd()
    if self.necessidadesEspeciais is not None:
      oprot.writeFieldBegin('necessidadesEspeciais', TType.BOOL, 5)
      oprot.writeBool(self.necessidadesEspeciais)
      oprot.writeFieldEnd()
    if self.localAtendimento is not None:
      oprot.writeFieldBegin('localAtendimento', TType.I64, 6)
      oprot.writeI64(self.localAtendimento)
      oprot.writeFieldEnd()
    if self.tipoAtendimento is not None:
      oprot.writeFieldBegin('tipoAtendimento', TType.I64, 7)
      oprot.writeI64(self.tipoAtendimento)
      oprot.writeFieldEnd()
    if self.tiposEncamOdonto is not None:
      oprot.writeFieldBegin('tiposEncamOdonto', TType.LIST, 8)
      oprot.writeListBegin(TType.I64, len(self.tiposEncamOdonto))
      for iter48 in self.tiposEncamOdonto:
        oprot.writeI64(iter48)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.tiposFornecimOdonto is not None:
      oprot.writeFieldBegin('tiposFornecimOdonto', TType.LIST, 9)
      oprot.writeListBegin(TType.I64, len(self.tiposFornecimOdonto))
      for iter49 in self.tiposFornecimOdonto:
        oprot.writeI64(iter49)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.tiposVigilanciaSaudeBucal is not None:
      oprot.writeFieldBegin('tiposVigilanciaSaudeBucal', TType.LIST, 10)
      oprot.writeListBegin(TType.I64, len(self.tiposVigilanciaSaudeBucal))
      for iter50 in self.tiposVigilanciaSaudeBucal:
        oprot.writeI64(iter50)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.tiposConsultaOdonto is not None:
      oprot.writeFieldBegin('tiposConsultaOdonto', TType.LIST, 11)
      oprot.writeListBegin(TType.I64, len(self.tiposConsultaOdonto))
      for iter51 in self.tiposConsultaOdonto:
        oprot.writeI64(iter51)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.procedimentosRealizados is not None:
      oprot.writeFieldBegin('procedimentosRealizados', TType.LIST, 12)
      oprot.writeListBegin(TType.STRUCT, len(self.procedimentosRealizados))
      for iter52 in self.procedimentosRealizados:
        iter52.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.sexo is not None:
      oprot.writeFieldBegin('sexo', TType.I64, 14)
      oprot.writeI64(self.sexo)
      oprot.writeFieldEnd()
    if self.turno is not None:
      oprot.writeFieldBegin('turno', TType.I64, 15)
      oprot.writeI64(self.turno)
      oprot.writeFieldEnd()
    if self.dataHoraInicialAtendimento is not None:
      oprot.writeFieldBegin('dataHoraInicialAtendimento', TType.I64, 16)
      oprot.writeI64(self.dataHoraInicialAtendimento)
      oprot.writeFieldEnd()
    if self.dataHoraFinalAtendimento is not None:
      oprot.writeFieldBegin('dataHoraFinalAtendimento', TType.I64, 17)
      oprot.writeI64(self.dataHoraFinalAtendimento)
      oprot.writeFieldEnd()
    if self.cpfCidadao is not None:
      oprot.writeFieldBegin('cpfCidadao', TType.STRING, 18)
      oprot.writeString(self.cpfCidadao)
      oprot.writeFieldEnd()
    if self.medicamentos is not None:
      oprot.writeFieldBegin('medicamentos', TType.LIST, 19)
      oprot.writeListBegin(TType.STRUCT, len(self.medicamentos))
      for iter53 in self.medicamentos:
        iter53.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.encaminhamentos is not None:
      oprot.writeFieldBegin('encaminhamentos', TType.LIST, 20)
      oprot.writeListBegin(TType.STRUCT, len(self.encaminhamentos))
      for iter54 in self.encaminhamentos:
        iter54.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.resultadosExames is not None:
      oprot.writeFieldBegin('resultadosExames', TType.LIST, 21)
      oprot.writeListBegin(TType.STRUCT, len(self.resultadosExames))
      for iter55 in self.resultadosExames:
        iter55.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.pesoAcompanhamentoNutricional is not None:
      oprot.writeFieldBegin('pesoAcompanhamentoNutricional', TType.DOUBLE, 22)
      oprot.writeDouble(self.pesoAcompanhamentoNutricional)
      oprot.writeFieldEnd()
    if self.alturaAcompanhamentoNutricional is not None:
      oprot.writeFieldBegin('alturaAcompanhamentoNutricional', TType.DOUBLE, 23)
      oprot.writeDouble(self.alturaAcompanhamentoNutricional)
      oprot.writeFieldEnd()
    if self.medicoes is not None:
      oprot.writeFieldBegin('medicoes', TType.STRUCT, 27)
      self.medicoes.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.dtNascimento)
    value = (value * 31) ^ hash(self.cnsCidadao)
    value = (value * 31) ^ hash(self.numProntuario)
    value = (value * 31) ^ hash(self.gestante)
    value = (value * 31) ^ hash(self.necessidadesEspeciais)
    value = (value * 31) ^ hash(self.localAtendimento)
    value = (value * 31) ^ hash(self.tipoAtendimento)
    value = (value * 31) ^ hash(self.tiposEncamOdonto)
    value = (value * 31) ^ hash(self.tiposFornecimOdonto)
    value = (value * 31) ^ hash(self.tiposVigilanciaSaudeBucal)
    value = (value * 31) ^ hash(self.tiposConsultaOdonto)
    value = (value * 31) ^ hash(self.procedimentosRealizados)
    value = (value * 31) ^ hash(self.sexo)
    value = (value * 31) ^ hash(self.turno)
    value = (value * 31) ^ hash(self.dataHoraInicialAtendimento)
    value = (value * 31) ^ hash(self.dataHoraFinalAtendimento)
    value = (value * 31) ^ hash(self.cpfCidadao)
    value = (value * 31) ^ hash(self.medicamentos)
    value = (value * 31) ^ hash(self.encaminhamentos)
    value = (value * 31) ^ hash(self.resultadosExames)
    value = (value * 31) ^ hash(self.pesoAcompanhamentoNutricional)
    value = (value * 31) ^ hash(self.alturaAcompanhamentoNutricional)
    value = (value * 31) ^ hash(self.medicoes)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class FichaAtendimentoOdontologicoMasterThrift:
  """
  Attributes:
   - uuidFicha
   - headerTransport
   - atendimentosOdontologicos
   - tpCdsOrigem
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'uuidFicha', None, None, ), # 1
    (2, TType.STRUCT, 'headerTransport', (br.gov.saude.esusab.ras.common.ttypes.VariasLotacoesHeaderThrift, br.gov.saude.esusab.ras.common.ttypes.VariasLotacoesHeaderThrift.thrift_spec), None, ), # 2
    (3, TType.LIST, 'atendimentosOdontologicos', (TType.STRUCT,(FichaAtendimentoOdontologicoChildThrift, FichaAtendimentoOdontologicoChildThrift.thrift_spec)), None, ), # 3
    (4, TType.I32, 'tpCdsOrigem', None, None, ), # 4
  )

  def __init__(self, uuidFicha=None, headerTransport=None, atendimentosOdontologicos=None, tpCdsOrigem=None,):
    self.uuidFicha = uuidFicha
    self.headerTransport = headerTransport
    self.atendimentosOdontologicos = atendimentosOdontologicos
    self.tpCdsOrigem = tpCdsOrigem

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.uuidFicha = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRUCT:
          self.headerTransport = br.gov.saude.esusab.ras.common.ttypes.VariasLotacoesHeaderThrift()
          self.headerTransport.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.LIST:
          self.atendimentosOdontologicos = []
          (_etype59, _size56) = iprot.readListBegin()
          for _i60 in xrange(_size56):
            _elem61 = FichaAtendimentoOdontologicoChildThrift()
            _elem61.read(iprot)
            self.atendimentosOdontologicos.append(_elem61)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I32:
          self.tpCdsOrigem = iprot.readI32()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('FichaAtendimentoOdontologicoMasterThrift')
    if self.uuidFicha is not None:
      oprot.writeFieldBegin('uuidFicha', TType.STRING, 1)
      oprot.writeString(self.uuidFicha)
      oprot.writeFieldEnd()
    if self.headerTransport is not None:
      oprot.writeFieldBegin('headerTransport', TType.STRUCT, 2)
      self.headerTransport.write(oprot)
      oprot.writeFieldEnd()
    if self.atendimentosOdontologicos is not None:
      oprot.writeFieldBegin('atendimentosOdontologicos', TType.LIST, 3)
      oprot.writeListBegin(TType.STRUCT, len(self.atendimentosOdontologicos))
      for iter62 in self.atendimentosOdontologicos:
        iter62.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.tpCdsOrigem is not None:
      oprot.writeFieldBegin('tpCdsOrigem', TType.I32, 4)
      oprot.writeI32(self.tpCdsOrigem)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.uuidFicha is None:
      raise TProtocol.TProtocolException(message='Required field uuidFicha is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.uuidFicha)
    value = (value * 31) ^ hash(self.headerTransport)
    value = (value * 31) ^ hash(self.atendimentosOdontologicos)
    value = (value * 31) ^ hash(self.tpCdsOrigem)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
