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



class CuidadoCompartilhadoThrift:
  """
  Attributes:
   - uuidEvolucao
   - lotacaoEvolucao
   - dataEvolucao
   - dataEvolucaoAnterior
   - coSequencialEvolucao
   - condutaEvolucao
   - tpCdsOrigem
   - cnsCidadao
   - cpfCidadao
   - sexoCidadao
   - dataNascimentoCidadao
   - uuidCuidadoCompartilhado
   - solicitante
   - executante
   - dataCriacaoCuidado
   - cid10
   - ciap
   - uuidFichaOrigem
   - tpDadoTranspFichaOrigem
   - prioridadeCuidado
   - reclassificacaoPrioridadeCuidado
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'uuidEvolucao', None, None, ), # 1
    (2, TType.STRUCT, 'lotacaoEvolucao', (br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift, br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift.thrift_spec), None, ), # 2
    (3, TType.I64, 'dataEvolucao', None, None, ), # 3
    (4, TType.I64, 'dataEvolucaoAnterior', None, None, ), # 4
    (5, TType.I32, 'coSequencialEvolucao', None, None, ), # 5
    (6, TType.I64, 'condutaEvolucao', None, None, ), # 6
    (7, TType.I32, 'tpCdsOrigem', None, None, ), # 7
    (8, TType.STRING, 'cnsCidadao', None, None, ), # 8
    (9, TType.STRING, 'cpfCidadao', None, None, ), # 9
    (10, TType.I64, 'sexoCidadao', None, None, ), # 10
    (11, TType.STRING, 'dataNascimentoCidadao', None, None, ), # 11
    (12, TType.STRING, 'uuidCuidadoCompartilhado', None, None, ), # 12
    (13, TType.STRUCT, 'solicitante', (br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift, br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift.thrift_spec), None, ), # 13
    (14, TType.STRUCT, 'executante', (br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift, br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift.thrift_spec), None, ), # 14
    (15, TType.I64, 'dataCriacaoCuidado', None, None, ), # 15
    (16, TType.STRING, 'cid10', None, None, ), # 16
    (17, TType.STRING, 'ciap', None, None, ), # 17
    (18, TType.STRING, 'uuidFichaOrigem', None, None, ), # 18
    (19, TType.I32, 'tpDadoTranspFichaOrigem', None, None, ), # 19
    (20, TType.I32, 'prioridadeCuidado', None, None, ), # 20
    (21, TType.I32, 'reclassificacaoPrioridadeCuidado', None, None, ), # 21
  )

  def __init__(self, uuidEvolucao=None, lotacaoEvolucao=None, dataEvolucao=None, dataEvolucaoAnterior=None, coSequencialEvolucao=None, condutaEvolucao=None, tpCdsOrigem=None, cnsCidadao=None, cpfCidadao=None, sexoCidadao=None, dataNascimentoCidadao=None, uuidCuidadoCompartilhado=None, solicitante=None, executante=None, dataCriacaoCuidado=None, cid10=None, ciap=None, uuidFichaOrigem=None, tpDadoTranspFichaOrigem=None, prioridadeCuidado=None, reclassificacaoPrioridadeCuidado=None,):
    self.uuidEvolucao = uuidEvolucao
    self.lotacaoEvolucao = lotacaoEvolucao
    self.dataEvolucao = dataEvolucao
    self.dataEvolucaoAnterior = dataEvolucaoAnterior
    self.coSequencialEvolucao = coSequencialEvolucao
    self.condutaEvolucao = condutaEvolucao
    self.tpCdsOrigem = tpCdsOrigem
    self.cnsCidadao = cnsCidadao
    self.cpfCidadao = cpfCidadao
    self.sexoCidadao = sexoCidadao
    self.dataNascimentoCidadao = dataNascimentoCidadao
    self.uuidCuidadoCompartilhado = uuidCuidadoCompartilhado
    self.solicitante = solicitante
    self.executante = executante
    self.dataCriacaoCuidado = dataCriacaoCuidado
    self.cid10 = cid10
    self.ciap = ciap
    self.uuidFichaOrigem = uuidFichaOrigem
    self.tpDadoTranspFichaOrigem = tpDadoTranspFichaOrigem
    self.prioridadeCuidado = prioridadeCuidado
    self.reclassificacaoPrioridadeCuidado = reclassificacaoPrioridadeCuidado

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
          self.uuidEvolucao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRUCT:
          self.lotacaoEvolucao = br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift()
          self.lotacaoEvolucao.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I64:
          self.dataEvolucao = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.dataEvolucaoAnterior = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I32:
          self.coSequencialEvolucao = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.I64:
          self.condutaEvolucao = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.I32:
          self.tpCdsOrigem = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.STRING:
          self.cnsCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.STRING:
          self.cpfCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.I64:
          self.sexoCidadao = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.STRING:
          self.dataNascimentoCidadao = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 12:
        if ftype == TType.STRING:
          self.uuidCuidadoCompartilhado = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 13:
        if ftype == TType.STRUCT:
          self.solicitante = br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift()
          self.solicitante.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 14:
        if ftype == TType.STRUCT:
          self.executante = br.gov.saude.esusab.ras.common.ttypes.LotacaoThrift()
          self.executante.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 15:
        if ftype == TType.I64:
          self.dataCriacaoCuidado = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 16:
        if ftype == TType.STRING:
          self.cid10 = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 17:
        if ftype == TType.STRING:
          self.ciap = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 18:
        if ftype == TType.STRING:
          self.uuidFichaOrigem = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 19:
        if ftype == TType.I32:
          self.tpDadoTranspFichaOrigem = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 20:
        if ftype == TType.I32:
          self.prioridadeCuidado = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 21:
        if ftype == TType.I32:
          self.reclassificacaoPrioridadeCuidado = iprot.readI32()
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
    oprot.writeStructBegin('CuidadoCompartilhadoThrift')
    if self.uuidEvolucao is not None:
      oprot.writeFieldBegin('uuidEvolucao', TType.STRING, 1)
      oprot.writeString(self.uuidEvolucao)
      oprot.writeFieldEnd()
    if self.lotacaoEvolucao is not None:
      oprot.writeFieldBegin('lotacaoEvolucao', TType.STRUCT, 2)
      self.lotacaoEvolucao.write(oprot)
      oprot.writeFieldEnd()
    if self.dataEvolucao is not None:
      oprot.writeFieldBegin('dataEvolucao', TType.I64, 3)
      oprot.writeI64(self.dataEvolucao)
      oprot.writeFieldEnd()
    if self.dataEvolucaoAnterior is not None:
      oprot.writeFieldBegin('dataEvolucaoAnterior', TType.I64, 4)
      oprot.writeI64(self.dataEvolucaoAnterior)
      oprot.writeFieldEnd()
    if self.coSequencialEvolucao is not None:
      oprot.writeFieldBegin('coSequencialEvolucao', TType.I32, 5)
      oprot.writeI32(self.coSequencialEvolucao)
      oprot.writeFieldEnd()
    if self.condutaEvolucao is not None:
      oprot.writeFieldBegin('condutaEvolucao', TType.I64, 6)
      oprot.writeI64(self.condutaEvolucao)
      oprot.writeFieldEnd()
    if self.tpCdsOrigem is not None:
      oprot.writeFieldBegin('tpCdsOrigem', TType.I32, 7)
      oprot.writeI32(self.tpCdsOrigem)
      oprot.writeFieldEnd()
    if self.cnsCidadao is not None:
      oprot.writeFieldBegin('cnsCidadao', TType.STRING, 8)
      oprot.writeString(self.cnsCidadao)
      oprot.writeFieldEnd()
    if self.cpfCidadao is not None:
      oprot.writeFieldBegin('cpfCidadao', TType.STRING, 9)
      oprot.writeString(self.cpfCidadao)
      oprot.writeFieldEnd()
    if self.sexoCidadao is not None:
      oprot.writeFieldBegin('sexoCidadao', TType.I64, 10)
      oprot.writeI64(self.sexoCidadao)
      oprot.writeFieldEnd()
    if self.dataNascimentoCidadao is not None:
      oprot.writeFieldBegin('dataNascimentoCidadao', TType.STRING, 11)
      oprot.writeString(self.dataNascimentoCidadao)
      oprot.writeFieldEnd()
    if self.uuidCuidadoCompartilhado is not None:
      oprot.writeFieldBegin('uuidCuidadoCompartilhado', TType.STRING, 12)
      oprot.writeString(self.uuidCuidadoCompartilhado)
      oprot.writeFieldEnd()
    if self.solicitante is not None:
      oprot.writeFieldBegin('solicitante', TType.STRUCT, 13)
      self.solicitante.write(oprot)
      oprot.writeFieldEnd()
    if self.executante is not None:
      oprot.writeFieldBegin('executante', TType.STRUCT, 14)
      self.executante.write(oprot)
      oprot.writeFieldEnd()
    if self.dataCriacaoCuidado is not None:
      oprot.writeFieldBegin('dataCriacaoCuidado', TType.I64, 15)
      oprot.writeI64(self.dataCriacaoCuidado)
      oprot.writeFieldEnd()
    if self.cid10 is not None:
      oprot.writeFieldBegin('cid10', TType.STRING, 16)
      oprot.writeString(self.cid10)
      oprot.writeFieldEnd()
    if self.ciap is not None:
      oprot.writeFieldBegin('ciap', TType.STRING, 17)
      oprot.writeString(self.ciap)
      oprot.writeFieldEnd()
    if self.uuidFichaOrigem is not None:
      oprot.writeFieldBegin('uuidFichaOrigem', TType.STRING, 18)
      oprot.writeString(self.uuidFichaOrigem)
      oprot.writeFieldEnd()
    if self.tpDadoTranspFichaOrigem is not None:
      oprot.writeFieldBegin('tpDadoTranspFichaOrigem', TType.I32, 19)
      oprot.writeI32(self.tpDadoTranspFichaOrigem)
      oprot.writeFieldEnd()
    if self.prioridadeCuidado is not None:
      oprot.writeFieldBegin('prioridadeCuidado', TType.I32, 20)
      oprot.writeI32(self.prioridadeCuidado)
      oprot.writeFieldEnd()
    if self.reclassificacaoPrioridadeCuidado is not None:
      oprot.writeFieldBegin('reclassificacaoPrioridadeCuidado', TType.I32, 21)
      oprot.writeI32(self.reclassificacaoPrioridadeCuidado)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.uuidEvolucao is None:
      raise TProtocol.TProtocolException(message='Required field uuidEvolucao is unset!')
    if self.uuidCuidadoCompartilhado is None:
      raise TProtocol.TProtocolException(message='Required field uuidCuidadoCompartilhado is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.uuidEvolucao)
    value = (value * 31) ^ hash(self.lotacaoEvolucao)
    value = (value * 31) ^ hash(self.dataEvolucao)
    value = (value * 31) ^ hash(self.dataEvolucaoAnterior)
    value = (value * 31) ^ hash(self.coSequencialEvolucao)
    value = (value * 31) ^ hash(self.condutaEvolucao)
    value = (value * 31) ^ hash(self.tpCdsOrigem)
    value = (value * 31) ^ hash(self.cnsCidadao)
    value = (value * 31) ^ hash(self.cpfCidadao)
    value = (value * 31) ^ hash(self.sexoCidadao)
    value = (value * 31) ^ hash(self.dataNascimentoCidadao)
    value = (value * 31) ^ hash(self.uuidCuidadoCompartilhado)
    value = (value * 31) ^ hash(self.solicitante)
    value = (value * 31) ^ hash(self.executante)
    value = (value * 31) ^ hash(self.dataCriacaoCuidado)
    value = (value * 31) ^ hash(self.cid10)
    value = (value * 31) ^ hash(self.ciap)
    value = (value * 31) ^ hash(self.uuidFichaOrigem)
    value = (value * 31) ^ hash(self.tpDadoTranspFichaOrigem)
    value = (value * 31) ^ hash(self.prioridadeCuidado)
    value = (value * 31) ^ hash(self.reclassificacaoPrioridadeCuidado)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
