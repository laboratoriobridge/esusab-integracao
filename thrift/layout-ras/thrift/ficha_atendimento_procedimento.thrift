include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.procedimento
namespace php br.gov.saude.esus.cds.transport.generated.thrift.procedimento
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.procedimento
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.procedimento
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.procedimento

struct FichaProcedimentoChildThrift {
	1:optional string numProntuario;
	2:optional string cnsCidadao;
	3:optional i64 dtNascimento;
	4:optional i64 sexo;
	5:optional i64 localAtendimento;
	6:optional i64 turno;
	7:optional bool statusEscutaInicialOrientacao;
	8:optional list<string> procedimentos;
	9:optional list<string> outrosSiaProcedimentosV321;
	10:optional i64 dataHoraInicialAtendimento;
	11:optional i64 dataHoraFinalAtendimento;
	12:optional string cpfCidadao;
}

struct FichaProcedimentoMasterThrift {
	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	3:optional common.UnicaLotacaoHeaderThrift headerTransport;
	4:optional list<FichaProcedimentoChildThrift> atendProcedimentos;
	5:optional i64 numTotalAfericaoPa;
	6:optional i64 numTotalGlicemiaCapilar;
	7:optional i64 numTotalAfericaoTemperatura;
	8:optional i64 numTotalMedicaoAltura;
	9:optional i64 numTotalCurativoSimples;
	10:optional i64 numTotalMedicaoPeso;
	11:optional i64 numTotalColetaMaterialParaExameLaboratorial;
}
