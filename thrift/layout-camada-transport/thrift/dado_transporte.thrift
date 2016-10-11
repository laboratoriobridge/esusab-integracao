
namespace java br.gov.saude.esusab.dadotransp
namespace php br.gov.saude.esusab.dadotransp
namespace delphi br.gov.saude.esusab.dadotransp
namespace csharp br.gov.saude.esusab.dadotransp
namespace rb br.gov.saude.esusab.dadotransp
namespace go br.gov.saude.esusab.dadotransp
namespace py br.gov.saude.esusab.dadotransp

/**
 * Indica a versão do dado a ser transportado. A versão do dado não necessariamente reflete a versão do sistema.
 */
struct VersaoThrift {
	1:required i32 major,
	2:required i32 minor,
	3:required i32 revision
}

/**
 * Dados para identificar a instalacao que cadastrou/gerou os dados e/ou enviou
 */
struct DadoInstalacaoThrift {
	/**
	 * Identifica o software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
	 */
	1:required string contraChave;

	/**
	 * É um identificador da instalação do software que gerou o dado. Seja ele o e-SUS ou software de terceiro.
	 */
	2:optional string uuidInstalacao;

	/**
	 * Cpf do responsável ou CNPJ da empresa responsável
	 */
	3:required string cpfOuCnpj;

	/**
	 * Nome do responsável ou Razão Social da empresa responsável
	 */
	4:required string nomeOuRazaoSocial;

	/**
	 * Telefone da pessoa ou empresa responsável
	 */
	5:optional string fone;

	/**
	 * Email da pessoa ou empresa responsável
	 */
	6:optional string email;

	/**
	 * Versão do software
	 */
	7:optional string versaoSistema;

	/**
	 * Nome do banco de dados que o software utiliza
	 */
  8:optional string nomeBancoDados;
}

/**
 * Objeto que encapsula uma ficha serializada com TBinaryProtocol e alguns de seus dados de identificação
 */
struct DadoTransporteThrift {
	/**
	 * UUID do dado (identificador "universal" gerado na criação do item)
	 */
	1:required string uuidDadoSerializado;

	/**
	 * Tipo/classe do objeto serializado através do TBinaryProtocol.
	 */
	2:required i64 tipoDadoSerializado;

	/**
	 * Código CNES da unidade de saúde.
	 */
	3:required string cnesDadoSerializado;

	/**
	 * Código IBGE do dado serializado
	 */
	4:optional string codIbge;

	/**
	 * Código INE da equipe que gerou a ficha.
	 */
	5:optional string ineDadoSerializado;

	/**
	 * Numero do lote em {@link DadoTransporteThrift#originadora}
	 */
	6:optional i64 numLote;

	/**
	 * Ficha serializado através do TBinaryProtocol.
	 */
	7:required binary dadoSerializado;

	/**
	 * Identifica a instalação que enviou o dado
	 * @see DadoInstalacaoThrift
	 */
	8:required DadoInstalacaoThrift remetente;

	/**
	 * Identifica a instalação que cadastrou/digitou
	 * @see DadoInstalacaoThrift
	 */
	9:required DadoInstalacaoThrift originadora;

	/**
	 * Versão da ficha
	 * @see VersaoThrift
	 */
	10:optional VersaoThrift versao;
}
