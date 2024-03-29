<?php
namespace br\gov\saude\esusab\ras\consumoalimentar;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


final class PerguntaCriancasMenoresSeisMesesEnumThrift {
  const A_CRIANCA_ONTEM_TOMOU_LEITE_DO_PEITO = 1;
  const MINGAU = 3;
  const AGUA_CHA = 4;
  const LEITE_VACA = 5;
  const FORMULA_INFANTIL = 6;
  const SUCO_FRUTA = 7;
  const FRUTA = 8;
  const COMIDA_DE_SAL = 9;
  const OUTROS_ALIMENTOS_BEBIDAS = 10;
  static public $__names = array(
    1 => 'A_CRIANCA_ONTEM_TOMOU_LEITE_DO_PEITO',
    3 => 'MINGAU',
    4 => 'AGUA_CHA',
    5 => 'LEITE_VACA',
    6 => 'FORMULA_INFANTIL',
    7 => 'SUCO_FRUTA',
    8 => 'FRUTA',
    9 => 'COMIDA_DE_SAL',
    10 => 'OUTROS_ALIMENTOS_BEBIDAS',
  );
}

final class PerguntaCriancasDeSeisVinteTresMesesEnumThrift {
  const A_CRIANCA_ONTEM_TOMOU_LEITE_PEITO = 21;
  const ONTEM_A_CRIANCA_COMEU_FRUTA_INTEIRA_PEDACO_AMASSADO = 22;
  const SE_SIM_QUANTAS_VEZES = 23;
  const ONTEM_A_CRIANCA_COMEU_COMIDA_DE_SAL = 24;
  const SE_COMEU_COMIDA_DE_SAL_QUANTAS_VEZES = 25;
  const SE_SIM_ESSA_COMIDA_FOI_OFERECIDA = 26;
  const OUTRO_LEITE_QUE_NAO_LEITE_DO_PEITO = 28;
  const MINGAU_COM_LEITE = 29;
  const IOGURTE = 30;
  const LEGUMES = 31;
  const VEGETAL_OU_FRUTAS_COR_ALARANJADA_OU_FOLHAS_ESCURAS = 32;
  const VERDURA_DE_FOLHA = 33;
  const CARNE = 34;
  const FIGADO = 35;
  const FEIJAO = 36;
  const ARROZ_BATATA_INHAME_MANDIOCA_FARINHA_MACARRAO = 37;
  const HAMBURGUER_E_OU_EMBUTIDOS = 38;
  const BEBIDAS_ADOCADAS = 39;
  const MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS = 40;
  const BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS = 41;
  static public $__names = array(
    21 => 'A_CRIANCA_ONTEM_TOMOU_LEITE_PEITO',
    22 => 'ONTEM_A_CRIANCA_COMEU_FRUTA_INTEIRA_PEDACO_AMASSADO',
    23 => 'SE_SIM_QUANTAS_VEZES',
    24 => 'ONTEM_A_CRIANCA_COMEU_COMIDA_DE_SAL',
    25 => 'SE_COMEU_COMIDA_DE_SAL_QUANTAS_VEZES',
    26 => 'SE_SIM_ESSA_COMIDA_FOI_OFERECIDA',
    28 => 'OUTRO_LEITE_QUE_NAO_LEITE_DO_PEITO',
    29 => 'MINGAU_COM_LEITE',
    30 => 'IOGURTE',
    31 => 'LEGUMES',
    32 => 'VEGETAL_OU_FRUTAS_COR_ALARANJADA_OU_FOLHAS_ESCURAS',
    33 => 'VERDURA_DE_FOLHA',
    34 => 'CARNE',
    35 => 'FIGADO',
    36 => 'FEIJAO',
    37 => 'ARROZ_BATATA_INHAME_MANDIOCA_FARINHA_MACARRAO',
    38 => 'HAMBURGUER_E_OU_EMBUTIDOS',
    39 => 'BEBIDAS_ADOCADAS',
    40 => 'MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS',
    41 => 'BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS',
  );
}

final class PerguntaCriancasComMaisDoisAnosEnumThrift {
  const VOCE_TEM_COSTUME_DE_REALIZAR_AS_REFEICOES_ASSISTINDO_TV_MEXENDO_NO_COMPUTADOR_E_OU_CELULAR = 11;
  const QUAIS_REFEICOES_VOCE_FAZ_AO_LONGO_DO_DIA = 12;
  const FEIJAO = 14;
  const FRUTAS_FRESCAS = 15;
  const VERDURAS_E_OU_LEGUMES = 16;
  const HAMBURGUER_E_OU_EMBUTIDOS = 17;
  const BEBIDAS_ADOCADAS = 18;
  const MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS = 19;
  const BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS = 20;
  static public $__names = array(
    11 => 'VOCE_TEM_COSTUME_DE_REALIZAR_AS_REFEICOES_ASSISTINDO_TV_MEXENDO_NO_COMPUTADOR_E_OU_CELULAR',
    12 => 'QUAIS_REFEICOES_VOCE_FAZ_AO_LONGO_DO_DIA',
    14 => 'FEIJAO',
    15 => 'FRUTAS_FRESCAS',
    16 => 'VERDURAS_E_OU_LEGUMES',
    17 => 'HAMBURGUER_E_OU_EMBUTIDOS',
    18 => 'BEBIDAS_ADOCADAS',
    19 => 'MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS',
    20 => 'BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS',
  );
}

final class RespostaUnicaEscolhaEnumThrift {
  const SIM = 1;
  const NAO = 2;
  const NAO_SABE = 3;
  const UMA_VEZ = 4;
  const DUAS_VEZES = 5;
  const TRES_VEZES_OU_MAIS = 6;
  const EM_PEDACOS = 7;
  const AMASSADA = 8;
  const PASSADA_NA_PENEIRA = 9;
  const LIQUIDIFICADA = 10;
  const SO_O_CALDO = 11;
  static public $__names = array(
    1 => 'SIM',
    2 => 'NAO',
    3 => 'NAO_SABE',
    4 => 'UMA_VEZ',
    5 => 'DUAS_VEZES',
    6 => 'TRES_VEZES_OU_MAIS',
    7 => 'EM_PEDACOS',
    8 => 'AMASSADA',
    9 => 'PASSADA_NA_PENEIRA',
    10 => 'LIQUIDIFICADA',
    11 => 'SO_O_CALDO',
  );
}

final class RespostaMultiplaEscolhaEnumThrift {
  const CAFE_DA_MANHA = 12;
  const LANCHE_DA_MANHA = 13;
  const ALMOCO = 14;
  const LANCHE_DA_TARDE = 15;
  const JANTAR = 16;
  const CEIA = 17;
  static public $__names = array(
    12 => 'CAFE_DA_MANHA',
    13 => 'LANCHE_DA_MANHA',
    14 => 'ALMOCO',
    15 => 'LANCHE_DA_TARDE',
    16 => 'JANTAR',
    17 => 'CEIA',
  );
}

class PerguntaQuestionarioCriancasMenoresSeisMesesThrift {
  static $_TSPEC;

  /**
   * @var int
   */
  public $pergunta = null;
  /**
   * @var int
   */
  public $respostaUnicaEscolha = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'pergunta',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'respostaUnicaEscolha',
          'type' => TType::I32,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['pergunta'])) {
        $this->pergunta = $vals['pergunta'];
      }
      if (isset($vals['respostaUnicaEscolha'])) {
        $this->respostaUnicaEscolha = $vals['respostaUnicaEscolha'];
      }
    }
  }

  public function getName() {
    return 'PerguntaQuestionarioCriancasMenoresSeisMesesThrift';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->pergunta);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->respostaUnicaEscolha);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('PerguntaQuestionarioCriancasMenoresSeisMesesThrift');
    if ($this->pergunta !== null) {
      $xfer += $output->writeFieldBegin('pergunta', TType::I32, 1);
      $xfer += $output->writeI32($this->pergunta);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->respostaUnicaEscolha !== null) {
      $xfer += $output->writeFieldBegin('respostaUnicaEscolha', TType::I32, 2);
      $xfer += $output->writeI32($this->respostaUnicaEscolha);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift {
  static $_TSPEC;

  /**
   * @var int
   */
  public $pergunta = null;
  /**
   * @var int
   */
  public $respostaUnicaEscolha = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'pergunta',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'respostaUnicaEscolha',
          'type' => TType::I32,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['pergunta'])) {
        $this->pergunta = $vals['pergunta'];
      }
      if (isset($vals['respostaUnicaEscolha'])) {
        $this->respostaUnicaEscolha = $vals['respostaUnicaEscolha'];
      }
    }
  }

  public function getName() {
    return 'PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->pergunta);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->respostaUnicaEscolha);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift');
    if ($this->pergunta !== null) {
      $xfer += $output->writeFieldBegin('pergunta', TType::I32, 1);
      $xfer += $output->writeI32($this->pergunta);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->respostaUnicaEscolha !== null) {
      $xfer += $output->writeFieldBegin('respostaUnicaEscolha', TType::I32, 2);
      $xfer += $output->writeI32($this->respostaUnicaEscolha);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class PerguntaQuestionarioCriancasComMaisDoisAnosThrift {
  static $_TSPEC;

  /**
   * @var int
   */
  public $pergunta = null;
  /**
   * @var int
   */
  public $respostaUnicaEscolha = null;
  /**
   * @var int[]
   */
  public $respostaMultiplaEscolha = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'pergunta',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'respostaUnicaEscolha',
          'type' => TType::I32,
          ),
        3 => array(
          'var' => 'respostaMultiplaEscolha',
          'type' => TType::LST,
          'etype' => TType::I32,
          'elem' => array(
            'type' => TType::I32,
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['pergunta'])) {
        $this->pergunta = $vals['pergunta'];
      }
      if (isset($vals['respostaUnicaEscolha'])) {
        $this->respostaUnicaEscolha = $vals['respostaUnicaEscolha'];
      }
      if (isset($vals['respostaMultiplaEscolha'])) {
        $this->respostaMultiplaEscolha = $vals['respostaMultiplaEscolha'];
      }
    }
  }

  public function getName() {
    return 'PerguntaQuestionarioCriancasComMaisDoisAnosThrift';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->pergunta);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->respostaUnicaEscolha);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::LST) {
            $this->respostaMultiplaEscolha = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $xfer += $input->readI32($elem5);
              $this->respostaMultiplaEscolha []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('PerguntaQuestionarioCriancasComMaisDoisAnosThrift');
    if ($this->pergunta !== null) {
      $xfer += $output->writeFieldBegin('pergunta', TType::I32, 1);
      $xfer += $output->writeI32($this->pergunta);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->respostaUnicaEscolha !== null) {
      $xfer += $output->writeFieldBegin('respostaUnicaEscolha', TType::I32, 2);
      $xfer += $output->writeI32($this->respostaUnicaEscolha);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->respostaMultiplaEscolha !== null) {
      if (!is_array($this->respostaMultiplaEscolha)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('respostaMultiplaEscolha', TType::LST, 3);
      {
        $output->writeListBegin(TType::I32, count($this->respostaMultiplaEscolha));
        {
          foreach ($this->respostaMultiplaEscolha as $iter6)
          {
            $xfer += $output->writeI32($iter6);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class FichaConsumoAlimentarThrift {
  static $_TSPEC;

  /**
   * @var \br\gov\saude\esusab\ras\common\UnicaLotacaoHeaderThrift
   */
  public $headerTransport = null;
  /**
   * @var string
   */
  public $cnsCidadao = null;
  /**
   * @var int
   */
  public $dataNascimento = null;
  /**
   * @var int
   */
  public $sexo = null;
  /**
   * @var int
   */
  public $localAtendimento = null;
  /**
   * @var \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasMenoresSeisMesesThrift[]
   */
  public $perguntasQuestionarioCriancasMenoresSeisMeses = null;
  /**
   * @var \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift[]
   */
  public $perguntasQuestionarioCriancasDeSeisVinteTresMeses = null;
  /**
   * @var \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasComMaisDoisAnosThrift[]
   */
  public $perguntasQuestionarioCriancasComMaisDoisAnos = null;
  /**
   * @var string
   */
  public $uuidFicha = null;
  /**
   * @var int
   */
  public $tpCdsOrigem = null;
  /**
   * @var string
   */
  public $cpfCidadao = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'headerTransport',
          'type' => TType::STRUCT,
          'class' => '\br\gov\saude\esusab\ras\common\UnicaLotacaoHeaderThrift',
          ),
        2 => array(
          'var' => 'cnsCidadao',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'dataNascimento',
          'type' => TType::I64,
          ),
        5 => array(
          'var' => 'sexo',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'localAtendimento',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'perguntasQuestionarioCriancasMenoresSeisMeses',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasMenoresSeisMesesThrift',
            ),
          ),
        8 => array(
          'var' => 'perguntasQuestionarioCriancasDeSeisVinteTresMeses',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift',
            ),
          ),
        9 => array(
          'var' => 'perguntasQuestionarioCriancasComMaisDoisAnos',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasComMaisDoisAnosThrift',
            ),
          ),
        10 => array(
          'var' => 'uuidFicha',
          'type' => TType::STRING,
          ),
        11 => array(
          'var' => 'tpCdsOrigem',
          'type' => TType::I32,
          ),
        12 => array(
          'var' => 'cpfCidadao',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['headerTransport'])) {
        $this->headerTransport = $vals['headerTransport'];
      }
      if (isset($vals['cnsCidadao'])) {
        $this->cnsCidadao = $vals['cnsCidadao'];
      }
      if (isset($vals['dataNascimento'])) {
        $this->dataNascimento = $vals['dataNascimento'];
      }
      if (isset($vals['sexo'])) {
        $this->sexo = $vals['sexo'];
      }
      if (isset($vals['localAtendimento'])) {
        $this->localAtendimento = $vals['localAtendimento'];
      }
      if (isset($vals['perguntasQuestionarioCriancasMenoresSeisMeses'])) {
        $this->perguntasQuestionarioCriancasMenoresSeisMeses = $vals['perguntasQuestionarioCriancasMenoresSeisMeses'];
      }
      if (isset($vals['perguntasQuestionarioCriancasDeSeisVinteTresMeses'])) {
        $this->perguntasQuestionarioCriancasDeSeisVinteTresMeses = $vals['perguntasQuestionarioCriancasDeSeisVinteTresMeses'];
      }
      if (isset($vals['perguntasQuestionarioCriancasComMaisDoisAnos'])) {
        $this->perguntasQuestionarioCriancasComMaisDoisAnos = $vals['perguntasQuestionarioCriancasComMaisDoisAnos'];
      }
      if (isset($vals['uuidFicha'])) {
        $this->uuidFicha = $vals['uuidFicha'];
      }
      if (isset($vals['tpCdsOrigem'])) {
        $this->tpCdsOrigem = $vals['tpCdsOrigem'];
      }
      if (isset($vals['cpfCidadao'])) {
        $this->cpfCidadao = $vals['cpfCidadao'];
      }
    }
  }

  public function getName() {
    return 'FichaConsumoAlimentarThrift';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->headerTransport = new \br\gov\saude\esusab\ras\common\UnicaLotacaoHeaderThrift();
            $xfer += $this->headerTransport->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->cnsCidadao);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->dataNascimento);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->sexo);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->localAtendimento);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::LST) {
            $this->perguntasQuestionarioCriancasMenoresSeisMeses = array();
            $_size7 = 0;
            $_etype10 = 0;
            $xfer += $input->readListBegin($_etype10, $_size7);
            for ($_i11 = 0; $_i11 < $_size7; ++$_i11)
            {
              $elem12 = null;
              $elem12 = new \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasMenoresSeisMesesThrift();
              $xfer += $elem12->read($input);
              $this->perguntasQuestionarioCriancasMenoresSeisMeses []= $elem12;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::LST) {
            $this->perguntasQuestionarioCriancasDeSeisVinteTresMeses = array();
            $_size13 = 0;
            $_etype16 = 0;
            $xfer += $input->readListBegin($_etype16, $_size13);
            for ($_i17 = 0; $_i17 < $_size13; ++$_i17)
            {
              $elem18 = null;
              $elem18 = new \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift();
              $xfer += $elem18->read($input);
              $this->perguntasQuestionarioCriancasDeSeisVinteTresMeses []= $elem18;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::LST) {
            $this->perguntasQuestionarioCriancasComMaisDoisAnos = array();
            $_size19 = 0;
            $_etype22 = 0;
            $xfer += $input->readListBegin($_etype22, $_size19);
            for ($_i23 = 0; $_i23 < $_size19; ++$_i23)
            {
              $elem24 = null;
              $elem24 = new \br\gov\saude\esusab\ras\consumoalimentar\PerguntaQuestionarioCriancasComMaisDoisAnosThrift();
              $xfer += $elem24->read($input);
              $this->perguntasQuestionarioCriancasComMaisDoisAnos []= $elem24;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->uuidFicha);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 11:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->tpCdsOrigem);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 12:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->cpfCidadao);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('FichaConsumoAlimentarThrift');
    if ($this->headerTransport !== null) {
      if (!is_object($this->headerTransport)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('headerTransport', TType::STRUCT, 1);
      $xfer += $this->headerTransport->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->cnsCidadao !== null) {
      $xfer += $output->writeFieldBegin('cnsCidadao', TType::STRING, 2);
      $xfer += $output->writeString($this->cnsCidadao);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataNascimento !== null) {
      $xfer += $output->writeFieldBegin('dataNascimento', TType::I64, 4);
      $xfer += $output->writeI64($this->dataNascimento);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->sexo !== null) {
      $xfer += $output->writeFieldBegin('sexo', TType::I64, 5);
      $xfer += $output->writeI64($this->sexo);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->localAtendimento !== null) {
      $xfer += $output->writeFieldBegin('localAtendimento', TType::I64, 6);
      $xfer += $output->writeI64($this->localAtendimento);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->perguntasQuestionarioCriancasMenoresSeisMeses !== null) {
      if (!is_array($this->perguntasQuestionarioCriancasMenoresSeisMeses)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('perguntasQuestionarioCriancasMenoresSeisMeses', TType::LST, 7);
      {
        $output->writeListBegin(TType::STRUCT, count($this->perguntasQuestionarioCriancasMenoresSeisMeses));
        {
          foreach ($this->perguntasQuestionarioCriancasMenoresSeisMeses as $iter25)
          {
            $xfer += $iter25->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->perguntasQuestionarioCriancasDeSeisVinteTresMeses !== null) {
      if (!is_array($this->perguntasQuestionarioCriancasDeSeisVinteTresMeses)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('perguntasQuestionarioCriancasDeSeisVinteTresMeses', TType::LST, 8);
      {
        $output->writeListBegin(TType::STRUCT, count($this->perguntasQuestionarioCriancasDeSeisVinteTresMeses));
        {
          foreach ($this->perguntasQuestionarioCriancasDeSeisVinteTresMeses as $iter26)
          {
            $xfer += $iter26->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->perguntasQuestionarioCriancasComMaisDoisAnos !== null) {
      if (!is_array($this->perguntasQuestionarioCriancasComMaisDoisAnos)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('perguntasQuestionarioCriancasComMaisDoisAnos', TType::LST, 9);
      {
        $output->writeListBegin(TType::STRUCT, count($this->perguntasQuestionarioCriancasComMaisDoisAnos));
        {
          foreach ($this->perguntasQuestionarioCriancasComMaisDoisAnos as $iter27)
          {
            $xfer += $iter27->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->uuidFicha !== null) {
      $xfer += $output->writeFieldBegin('uuidFicha', TType::STRING, 10);
      $xfer += $output->writeString($this->uuidFicha);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->tpCdsOrigem !== null) {
      $xfer += $output->writeFieldBegin('tpCdsOrigem', TType::I32, 11);
      $xfer += $output->writeI32($this->tpCdsOrigem);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->cpfCidadao !== null) {
      $xfer += $output->writeFieldBegin('cpfCidadao', TType::STRING, 12);
      $xfer += $output->writeString($this->cpfCidadao);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


