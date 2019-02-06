struct EnderecoTransportThrift {
   1:optional string bairroNome;
   2:optional string bairroDne;
   3:optional string localidadeCep;
   4:optional string localidadeDne;
   5:optional string localidadeIbge;
   6:optional string complemento;
   7:optional string logradouro;
   8:optional string logradouroDne;
   9:optional string numero;
   10:optional string pontoReferencia;
   11:required bool semNumero;
   12:optional string ufSigla;
   13:optional string area;
   14:optional string microArea;
}

enum SexoThrift {
  MASCULINO = 0,
  FEMININO = 1,
  AMBOS = 2,
  NAO_INFORMADO = 3
}

enum TipoSanguineoThrift {
  A_POSITIVO = 0,
  A_NEGATIVO = 1,
  B_POSITIVO = 2,
  B_NEGATIVO = 3,
  AB_POSITIVO = 4,
  AB_NEGATIVO = 5,
  O_POSITIVO = 6,
  O_NEGATIVO = 7
}

struct CidadaoTransportThrift {
   1:required bool naoPossuiCns;
   2:required string cns;
   3:optional string cpf;
   4:required i64 dataNascimento;
   5:required bool desconheceNomeMae;
   6:optional string nomeMae;
   7:optional string email;
   8:optional EnderecoTransportThrift endereco;
   9:optional i64 escolaridadeId;
   10:optional i64 estadoCivilId;
   11:required bool estrangeiro;
   12:optional i64 etniaId;
   13:optional bool faleceu;
   14:required string municipioNascimentoCep;
   15:required string municipioNascimentoDne;
   16:optional string municipioNascimentoIbge;
   17:optional string nisPisPasep;
   18:required string nomeCompleto;
   19:optional string nomeSocial;
   20:optional string numeroProntuario;
   22:optional string numeroProntuarioCnes;
   23:required i64 racaCorId;
   24:required SexoThrift sexo;
   25:optional string telefoneCelular;
   26:optional string telefoneContato;
   27:optional string telefoneResidencial;
   28:optional TipoSanguineoThrift tipoSanguineo;
   29:optional string cboNumero;
}