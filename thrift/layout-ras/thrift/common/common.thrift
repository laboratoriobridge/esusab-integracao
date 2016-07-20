namespace java br.gov.saude.esus.cds.transport.generated.thrift.common
namespace php br.gov.saude.esus.cds.transport.generated.thrift.common
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.common
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.common
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.common


struct HeaderCdsCadastroThrift {
	1:required string cnesUnidadeSaude;
	2:optional string cnsProfissional;
	3:optional string codigoIbgeMunicipio;
	4:optional i64 dataAtendimento;
	5:optional string ineEquipe;
	6:optional i64 microarea;
}

/**
 * Representa um profissional
 */
struct UnicaLotacaoHeaderThrift{
	1:optional string profissionalCNS;

	2:optional string cboCodigo_2002;
	
	3:required string cnes;
	
	4:optional string ine;
	
	5:optional i64 dataAtendimento;	
	
	6:optional string codigoIbgeMunicipio;
}

struct VariasLotacoesHeaderThrift {
	1:required UnicaLotacaoHeaderThrift lotacaoForm;

	2:optional string profissionalCNS1;
	3:optional string cboCodigo_2002_1;

	4:optional string profissionalCNS2;
	5:optional string cboCodigo_2002_2;
	
}

struct EnderecoLocalPermanenciaThrift {
	1:optional string bairro,
	2:optional string cep,
	3:optional string codigoIbgeMunicipio,
	4:optional string complemento,
	5:optional string nomeLogradouro,
	6:optional string numero,
	7:optional string numeroDneUf,
	8:optional string telReferencial,
	9:optional string telResidencial,
	10:optional string tipoLogradouroNumeroDne
	11:optional bool stSemNumero;
}