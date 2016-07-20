include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar
namespace php br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar

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
	10:optional bool stDiponibilidadeEnergiaeletrica,
	11:optional i64 tipoAcessoDomicilio,
	12:optional i64 tipoDomicilio,
	13:optional i64 tratamentoAguaDomicilio
}

struct FamiliaRowThrift {
	1:optional i64 dataNascimentoResponsavel,
	2:optional string numeroCnsResponsavel,
	3:optional i32 numeroMembrosFamilia,
	4:optional string numeroProntuario,
	5:optional i64 rendaFamiliar,
	6:optional i64 resideDesde,
	7:optional bool stMudanca,
}

struct CadastroDomiciliarThrift {
	1:optional list<i64> animaisNoDomicilio,
	2:optional CondicaoMoradiaThrift condicaoMoradia,
	3:required common.HeaderCdsCadastroThrift dadosGerais,
	4:optional common.EnderecoLocalPermanenciaThrift enderecoLocalPermanencia,
	5:optional list<FamiliaRowThrift> familias,
	6:optional bool fichaAtualizada,
	7:optional string quantosAnimaisNoDomicilio,
	8:optional bool stAnimaisNoDomicilio,
	9:optional bool statusTermoRecusaCadastroDomiciliarAtencaoBasica,
	10:optional i32 tpCdsOrigem,
	11:required string uuid
	12:optional string uuidFichaOriginadora;
}