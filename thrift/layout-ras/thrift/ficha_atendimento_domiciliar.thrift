include "./common.thrift"

namespace java br.gov.saude.esusab.ras.atenddomiciliar
namespace php br.gov.saude.esusab.ras.atenddomiciliar
namespace delphi br.gov.saude.esusab.ras.atenddomiciliar
namespace csharp br.gov.saude.esusab.ras.atenddomiciliar
namespace rb br.gov.saude.esusab.ras.atenddomiciliar
namespace go br.gov.saude.esusab.ras.atenddomiciliar
namespace py br.gov.saude.esusab.ras.atenddomiciliar

struct FichaAtendimentoDomiciliarChildThrift {
	1:optional i64 turno;
	2:optional string cnsCidadao;
	3:optional i64 dataNascimento;
	4:optional i64 sexo;
	5:optional i64 localAtendimento;
	6:optional i64 atencaoDomiciliarModalidade;
	7:optional i64 tipoAtendimento;
	8:optional list<i64> condicoesAvaliadas;
	9:optional string cid;
	10:optional string ciap;
	11:optional list<string> procedimentos;
	13:optional i64 condutaDesfecho;
	15:optional string cpfCidadao;
}

struct FichaAtendimentoDomiciliarMasterThrift {
	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	4:optional list<FichaAtendimentoDomiciliarChildThrift> atendimentosDomiciliares;
	5:optional common.VariasLotacoesHeaderThrift headerTransport;
}