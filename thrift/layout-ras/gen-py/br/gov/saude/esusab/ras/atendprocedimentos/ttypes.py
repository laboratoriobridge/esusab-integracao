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



class FichaProcedimentoChildThrift:
  """
  Attributes:
   - numProntuario
   - cnsCidadao
   - dtNascimento
   - sexo
   - localAtendimento
   - turno
   - statusEscutaInicialOrientacao
   - procedimentos
   - dataHoraInicialAtendimento
   - dataHoraFinalAtendimento
   - cpfCidadao
   - medicoes
   - ivcf
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'numProntuario', None, None, ), # 1
    (2, TType.STRING, 'cnsCidadao', None, None, ), # 2
    (3, TType.I64, 'dtNascimento', None, None, ), # 3
    (4, TType.I64, 'sexo', None, None, ), # 4
    (5, TType.I64, 'localAtendimento', None, None, ), # 5
    (6, TType.I64, 'turno', None, None, ), # 6
    (7, TType.BOOL, 'statusEscutaInicialOrientacao', None, None, ), # 7
    (8, TType.LIST, 'procedimentos', (TType.STRING,None), None, ), # 8
    None, # 9
    (10, TType.I64, 'dataHoraInicialAtendimento', None, None, ), # 10
    (11, TType.I64, 'dataHoraFinalAtendimento', None, None, ), # 11
    (12, TType.STRING, 'cpfCidadao', None, None, ), # 12
    None, # 13
    None, # 14
    None, # 15
    (16, TType.STRUCT, 'medicoes', (br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift, br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift.thrift_spec), None, ), # 16
    (17, TType.STRUCT, 'ivcf', (br.gov.saude.esusab.ras.common.ttypes.IvcfThrift, br.gov.saude.esusab.ras.common.ttypes.IvcfThrift.thrift_spec), None, ), # 17
  )

  def __init__(self, numProntuario=None, cnsCidadao=None, dtNascimento=None, sexo=None, localAtendimento=None, turno=None, statusEscutaInicialOrientacao=None, procedimentos=None, dataHoraInicialAtendimento=None, dataHoraFinalAtendimento=None, cpfCidadao=None, medicoes=None, ivcf=None,):
    self.numProntuario = numProntuario
    self.cnsCidadao = cnsCidadao
    self.dtNascimento = dtNascimento
    self.sexo = sexo
    self.localAtendimento = localAtendimento
    self.turno = turno
    self.statusEscutaInicialOrientacao = statusEscutaInicialOrientacao
    self.procedimentos = procedimentos
    self.dataHoraInicialAtendimento = dataHoraInicialAtendimento
    self.dataHoraFinalAtendimento = dataHoraFinalAtendimento
    self.cpfCidadao = cpfCidadao
    self.medicoes = medicoes
    self.ivcf = ivcf

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
          self.numProntuario = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.cnsCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I64:
          self.dtNascimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.sexo = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I64:
          self.localAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.I64:
          self.turno = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.BOOL:
          self.statusEscutaInicialOrientacao = iprot.readBool()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.LIST:
          self.procedimentos = []
          (_etype3, _size0) = iprot.readListBegin()
          for _i4 in xrange(_size0):
            _elem5 = iprot.readString()
            self.procedimentos.append(_elem5)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.I64:
          self.dataHoraInicialAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.I64:
          self.dataHoraFinalAtendimento = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 12:
        if ftype == TType.STRING:
          self.cpfCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 16:
        if ftype == TType.STRUCT:
          self.medicoes = br.gov.saude.esusab.ras.common.ttypes.MedicoesThrift()
          self.medicoes.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 17:
        if ftype == TType.STRUCT:
          self.ivcf = br.gov.saude.esusab.ras.common.ttypes.IvcfThrift()
          self.ivcf.read(iprot)
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
    oprot.writeStructBegin('FichaProcedimentoChildThrift')
    if self.numProntuario is not None:
      oprot.writeFieldBegin('numProntuario', TType.STRING, 1)
      oprot.writeString(self.numProntuario)
      oprot.writeFieldEnd()
    if self.cnsCidadao is not None:
      oprot.writeFieldBegin('cnsCidadao', TType.STRING, 2)
      oprot.writeString(self.cnsCidadao)
      oprot.writeFieldEnd()
    if self.dtNascimento is not None:
      oprot.writeFieldBegin('dtNascimento', TType.I64, 3)
      oprot.writeI64(self.dtNascimento)
      oprot.writeFieldEnd()
    if self.sexo is not None:
      oprot.writeFieldBegin('sexo', TType.I64, 4)
      oprot.writeI64(self.sexo)
      oprot.writeFieldEnd()
    if self.localAtendimento is not None:
      oprot.writeFieldBegin('localAtendimento', TType.I64, 5)
      oprot.writeI64(self.localAtendimento)
      oprot.writeFieldEnd()
    if self.turno is not None:
      oprot.writeFieldBegin('turno', TType.I64, 6)
      oprot.writeI64(self.turno)
      oprot.writeFieldEnd()
    if self.statusEscutaInicialOrientacao is not None:
      oprot.writeFieldBegin('statusEscutaInicialOrientacao', TType.BOOL, 7)
      oprot.writeBool(self.statusEscutaInicialOrientacao)
      oprot.writeFieldEnd()
    if self.procedimentos is not None:
      oprot.writeFieldBegin('procedimentos', TType.LIST, 8)
      oprot.writeListBegin(TType.STRING, len(self.procedimentos))
      for iter6 in self.procedimentos:
        oprot.writeString(iter6)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.dataHoraInicialAtendimento is not None:
      oprot.writeFieldBegin('dataHoraInicialAtendimento', TType.I64, 10)
      oprot.writeI64(self.dataHoraInicialAtendimento)
      oprot.writeFieldEnd()
    if self.dataHoraFinalAtendimento is not None:
      oprot.writeFieldBegin('dataHoraFinalAtendimento', TType.I64, 11)
      oprot.writeI64(self.dataHoraFinalAtendimento)
      oprot.writeFieldEnd()
    if self.cpfCidadao is not None:
      oprot.writeFieldBegin('cpfCidadao', TType.STRING, 12)
      oprot.writeString(self.cpfCidadao)
      oprot.writeFieldEnd()
    if self.medicoes is not None:
      oprot.writeFieldBegin('medicoes', TType.STRUCT, 16)
      self.medicoes.write(oprot)
      oprot.writeFieldEnd()
    if self.ivcf is not None:
      oprot.writeFieldBegin('ivcf', TType.STRUCT, 17)
      self.ivcf.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.numProntuario)
    value = (value * 31) ^ hash(self.cnsCidadao)
    value = (value * 31) ^ hash(self.dtNascimento)
    value = (value * 31) ^ hash(self.sexo)
    value = (value * 31) ^ hash(self.localAtendimento)
    value = (value * 31) ^ hash(self.turno)
    value = (value * 31) ^ hash(self.statusEscutaInicialOrientacao)
    value = (value * 31) ^ hash(self.procedimentos)
    value = (value * 31) ^ hash(self.dataHoraInicialAtendimento)
    value = (value * 31) ^ hash(self.dataHoraFinalAtendimento)
    value = (value * 31) ^ hash(self.cpfCidadao)
    value = (value * 31) ^ hash(self.medicoes)
    value = (value * 31) ^ hash(self.ivcf)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class FichaProcedimentoMasterThrift:
  """
  Attributes:
   - uuidFicha
   - tpCdsOrigem
   - headerTransport
   - atendProcedimentos
   - numTotalAfericaoPa
   - numTotalGlicemiaCapilar
   - numTotalAfericaoTemperatura
   - numTotalMedicaoAltura
   - numTotalCurativoSimples
   - numTotalMedicaoPeso
   - numTotalColetaMaterialParaExameLaboratorial
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'uuidFicha', None, None, ), # 1
    (2, TType.I32, 'tpCdsOrigem', None, None, ), # 2
    (3, TType.STRUCT, 'headerTransport', (br.gov.saude.esusab.ras.common.ttypes.UnicaLotacaoHeaderThrift, br.gov.saude.esusab.ras.common.ttypes.UnicaLotacaoHeaderThrift.thrift_spec), None, ), # 3
    (4, TType.LIST, 'atendProcedimentos', (TType.STRUCT,(FichaProcedimentoChildThrift, FichaProcedimentoChildThrift.thrift_spec)), None, ), # 4
    (5, TType.I64, 'numTotalAfericaoPa', None, None, ), # 5
    (6, TType.I64, 'numTotalGlicemiaCapilar', None, None, ), # 6
    (7, TType.I64, 'numTotalAfericaoTemperatura', None, None, ), # 7
    (8, TType.I64, 'numTotalMedicaoAltura', None, None, ), # 8
    (9, TType.I64, 'numTotalCurativoSimples', None, None, ), # 9
    (10, TType.I64, 'numTotalMedicaoPeso', None, None, ), # 10
    (11, TType.I64, 'numTotalColetaMaterialParaExameLaboratorial', None, None, ), # 11
  )

  def __init__(self, uuidFicha=None, tpCdsOrigem=None, headerTransport=None, atendProcedimentos=None, numTotalAfericaoPa=None, numTotalGlicemiaCapilar=None, numTotalAfericaoTemperatura=None, numTotalMedicaoAltura=None, numTotalCurativoSimples=None, numTotalMedicaoPeso=None, numTotalColetaMaterialParaExameLaboratorial=None,):
    self.uuidFicha = uuidFicha
    self.tpCdsOrigem = tpCdsOrigem
    self.headerTransport = headerTransport
    self.atendProcedimentos = atendProcedimentos
    self.numTotalAfericaoPa = numTotalAfericaoPa
    self.numTotalGlicemiaCapilar = numTotalGlicemiaCapilar
    self.numTotalAfericaoTemperatura = numTotalAfericaoTemperatura
    self.numTotalMedicaoAltura = numTotalMedicaoAltura
    self.numTotalCurativoSimples = numTotalCurativoSimples
    self.numTotalMedicaoPeso = numTotalMedicaoPeso
    self.numTotalColetaMaterialParaExameLaboratorial = numTotalColetaMaterialParaExameLaboratorial

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
        if ftype == TType.I32:
          self.tpCdsOrigem = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRUCT:
          self.headerTransport = br.gov.saude.esusab.ras.common.ttypes.UnicaLotacaoHeaderThrift()
          self.headerTransport.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.LIST:
          self.atendProcedimentos = []
          (_etype10, _size7) = iprot.readListBegin()
          for _i11 in xrange(_size7):
            _elem12 = FichaProcedimentoChildThrift()
            _elem12.read(iprot)
            self.atendProcedimentos.append(_elem12)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I64:
          self.numTotalAfericaoPa = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.I64:
          self.numTotalGlicemiaCapilar = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.I64:
          self.numTotalAfericaoTemperatura = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.I64:
          self.numTotalMedicaoAltura = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.I64:
          self.numTotalCurativoSimples = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.I64:
          self.numTotalMedicaoPeso = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.I64:
          self.numTotalColetaMaterialParaExameLaboratorial = iprot.readI64()
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
    oprot.writeStructBegin('FichaProcedimentoMasterThrift')
    if self.uuidFicha is not None:
      oprot.writeFieldBegin('uuidFicha', TType.STRING, 1)
      oprot.writeString(self.uuidFicha)
      oprot.writeFieldEnd()
    if self.tpCdsOrigem is not None:
      oprot.writeFieldBegin('tpCdsOrigem', TType.I32, 2)
      oprot.writeI32(self.tpCdsOrigem)
      oprot.writeFieldEnd()
    if self.headerTransport is not None:
      oprot.writeFieldBegin('headerTransport', TType.STRUCT, 3)
      self.headerTransport.write(oprot)
      oprot.writeFieldEnd()
    if self.atendProcedimentos is not None:
      oprot.writeFieldBegin('atendProcedimentos', TType.LIST, 4)
      oprot.writeListBegin(TType.STRUCT, len(self.atendProcedimentos))
      for iter13 in self.atendProcedimentos:
        iter13.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.numTotalAfericaoPa is not None:
      oprot.writeFieldBegin('numTotalAfericaoPa', TType.I64, 5)
      oprot.writeI64(self.numTotalAfericaoPa)
      oprot.writeFieldEnd()
    if self.numTotalGlicemiaCapilar is not None:
      oprot.writeFieldBegin('numTotalGlicemiaCapilar', TType.I64, 6)
      oprot.writeI64(self.numTotalGlicemiaCapilar)
      oprot.writeFieldEnd()
    if self.numTotalAfericaoTemperatura is not None:
      oprot.writeFieldBegin('numTotalAfericaoTemperatura', TType.I64, 7)
      oprot.writeI64(self.numTotalAfericaoTemperatura)
      oprot.writeFieldEnd()
    if self.numTotalMedicaoAltura is not None:
      oprot.writeFieldBegin('numTotalMedicaoAltura', TType.I64, 8)
      oprot.writeI64(self.numTotalMedicaoAltura)
      oprot.writeFieldEnd()
    if self.numTotalCurativoSimples is not None:
      oprot.writeFieldBegin('numTotalCurativoSimples', TType.I64, 9)
      oprot.writeI64(self.numTotalCurativoSimples)
      oprot.writeFieldEnd()
    if self.numTotalMedicaoPeso is not None:
      oprot.writeFieldBegin('numTotalMedicaoPeso', TType.I64, 10)
      oprot.writeI64(self.numTotalMedicaoPeso)
      oprot.writeFieldEnd()
    if self.numTotalColetaMaterialParaExameLaboratorial is not None:
      oprot.writeFieldBegin('numTotalColetaMaterialParaExameLaboratorial', TType.I64, 11)
      oprot.writeI64(self.numTotalColetaMaterialParaExameLaboratorial)
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
    value = (value * 31) ^ hash(self.tpCdsOrigem)
    value = (value * 31) ^ hash(self.headerTransport)
    value = (value * 31) ^ hash(self.atendProcedimentos)
    value = (value * 31) ^ hash(self.numTotalAfericaoPa)
    value = (value * 31) ^ hash(self.numTotalGlicemiaCapilar)
    value = (value * 31) ^ hash(self.numTotalAfericaoTemperatura)
    value = (value * 31) ^ hash(self.numTotalMedicaoAltura)
    value = (value * 31) ^ hash(self.numTotalCurativoSimples)
    value = (value * 31) ^ hash(self.numTotalMedicaoPeso)
    value = (value * 31) ^ hash(self.numTotalColetaMaterialParaExameLaboratorial)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
