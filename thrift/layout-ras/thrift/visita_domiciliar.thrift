include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar
namespace php br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar

struct FichaVisitaDomiciliarChildThrift {
	1:optional i64 turno;
	2:optional string numProntuario;
	3:optional string numCartaoSus;
	4:optional i64 dtNascimento;
	5:optional i64 sexo;
	6:optional bool statusVisitaCompartilhadaOutroProfissional;
	7:optional list<i64> motivosVisita;
	8:optional i64 desfecho;
}

struct FichaVisitaDomiciliarMasterThrift {
	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	3:required common.UnicaLotacaoHeaderThrift headerTransport;
	4:optional list<FichaVisitaDomiciliarChildThrift> visitasDomiciliares;
}