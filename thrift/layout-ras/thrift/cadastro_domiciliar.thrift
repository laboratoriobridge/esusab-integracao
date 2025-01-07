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
	13:optional i64 aguaConsumoDomicilio,
	14:optional i64 tipoOrigemEnergiaEletrica;
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
	4:optional common.EnderecoLocalPermanenciaThrift enderecoLocalPermanencia,
	5:optional list<FamiliaRowThrift> familias,
	6:optional bool fichaAtualizada,
	7:optional string quantosAnimaisNoDomicilio,
	8:optional bool stAnimaisNoDomicilio,
	9:optional bool statusTermoRecusa,
	10:optional i32 tpCdsOrigem,
	11:required string uuid,
	12:optional string uuidFichaOriginadora,
	13:optional i64 tipoDeImovel,
	14:optional InstituicaoPermanenciaThrift instituicaoPermanencia,
	15:optional common.UnicaLotacaoHeaderThrift headerTransport,
	17:optional double latitude;
    18:optional double longitude,
    20:optional i64 tipoEndereco;
}
