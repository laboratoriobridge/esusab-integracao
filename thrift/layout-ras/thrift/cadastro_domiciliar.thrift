include "./common.thrift"

namespace java br.gov.saude.esusab.ras.cadastrodomiciliar
namespace php br.gov.saude.esusab.ras.cadastrodomiciliar
namespace delphi br.gov.saude.esusab.ras.cadastrodomiciliar
namespace csharp br.gov.saude.esusab.ras.cadastrodomiciliar
namespace rb br.gov.saude.esusab.ras.cadastrodomiciliar
namespace go br.gov.saude.esusab.ras.cadastrodomiciliar
namespace py br.gov.saude.esusab.ras.cadastrodomiciliar

struct InstituicaoPermanenciaThrift {
	1:optional string nomeInstituicaoPermanencia,
	2:optional bool stOutrosProfissionaisVinculados,
	3:optional string nomeResponsavelTecnico,
	4:optional string cnsResponsavelTecnico,
	5:optional string cargoInstituicao,
	6:optional string telefoneResponsavelTecnico;
}

struct CondicaoMoradiaThrift {
	1:optional i64 abastecimentoAgua,
	2:optional i64 areaProducaoRural,
	3:optional i64 destinoLixo,
	4:optional i64 formaEscoamentoBanheiro,
	5:optional i64 localizacao,
	6:optional i64 materialPredominanteParedesExtDomicilio,
	7:optional string nuComodos,
	8:optional string nuMoradores,
	9:optional i64 situacaoMoradiaPosseTerra,
	10:optional bool stDisponibilidadeEnergiaEletrica,
	11:optional i64 tipoAcessoDomicilio,
	12:optional i64 tipoDomicilio,
	13:optional i64 aguaConsumoDomicilio;
}

struct FamiliaRowThrift {
	1:optional i64 dataNascimentoResponsavel,
	2:optional string numeroCnsResponsavel,
	3:optional i32 numeroMembrosFamilia,
	4:optional string numeroProntuario,
	5:optional i64 rendaFamiliar,
	6:optional i64 resideDesde,
	7:optional bool stMudanca,
	8:optional string cpfResponsavel;
}

struct CadastroDomiciliarThrift {
	1:optional list<i64> animaisNoDomicilio,
	2:optional CondicaoMoradiaThrift condicaoMoradia,
	3:optional common.EnderecoLocalPermanenciaThrift enderecoLocalPermanencia,
	4:optional list<FamiliaRowThrift> familias,
	5:optional bool fichaAtualizada,
	6:optional string quantosAnimaisNoDomicilio,
	7:optional bool stAnimaisNoDomicilio,
	8:optional bool statusTermoRecusa,
	9:optional i32 tpCdsOrigem,
	10:required string uuid,
	11:optional string uuidFichaOriginadora,
	12:optional i64 tipoDeImovel,
	13:optional InstituicaoPermanenciaThrift instituicaoPermanencia,
	14:optional common.UnicaLotacaoHeaderThrift headerTransport,
	15:optional double latitude;
    16:optional double longitude;
}
