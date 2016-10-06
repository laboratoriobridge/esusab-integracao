
namespace java br.gov.saude.esusab.ras.common
namespace php br.gov.saude.esusab.ras.common
namespace delphi br.gov.saude.esusab.ras.common
namespace csharp br.gov.saude.esusab.ras.common
namespace rb br.gov.saude.esusab.ras.common
namespace go br.gov.saude.esusab.ras.common
namespace py br.gov.saude.esusab.ras.common

struct LotacaoHeaderThrift{
	1:optional string profissionalCNS;

	2:optional string cboCodigo_2002;
	
	3:optional string cnes;
	
	4:optional string ine;
}

struct UnicaLotacaoHeaderThrift{
	1:optional string profissionalCNS;

	2:optional string cboCodigo_2002;
	
	3:optional string cnes;
	
	4:optional string ine;
	
	5:optional i64 dataAtendimento;	
	
	6:optional string codigoIbgeMunicipio;
}

struct VariasLotacoesHeaderThrift {
	6:optional LotacaoHeaderThrift lotacaoFormPrincipal;
	7:optional LotacaoHeaderThrift lotacaoFormAtendimentoCompartilhado;
	
	8:optional i64 dataAtendimento;	
	9:optional string codigoIbgeMunicipio;
}

struct EnderecoLocalPermanenciaThrift {
	1:optional string bairro,
	2:optional string cep,
	3:optional string codigoIbgeMunicipio,
	4:optional string complemento,
	5:optional string nomeLogradouro,
	6:optional string numero,
	7:optional string numeroDneUf,
	8:optional string telefoneContato,
	9:optional string telefoneResidencia,
	10:optional string tipoLogradouroNumeroDne,
	11:optional bool stSemNumero,
	12:optional string pontoReferencia,
	13:optional string microArea,
	14:optional bool stForaArea;
}