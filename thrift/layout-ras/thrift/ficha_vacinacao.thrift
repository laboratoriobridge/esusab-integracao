include "./common.thrift"

namespace java br.gov.saude.esusab.ras.vacinacao
namespace php br.gov.saude.esusab.ras.vacinacao
namespace delphi br.gov.saude.esusab.ras.vacinacao
namespace csharp br.gov.saude.esusab.ras.vacinacao
namespace rb br.gov.saude.esusab.ras.vacinacao
namespace go br.gov.saude.esusab.ras.vacinacao
namespace py br.gov.saude.esusab.ras.vacinacao

struct VacinaRowThrift {
	1:optional i64 imunobiologico;
	2:optional i64 estrategiaVacinacao;
	3:optional i64 dose;
	4:optional string lote;
	5:optional string fabricante;
	6:optional i64 grupoAtendimento;
}

struct FichaVacinacaoChildThrift {
	1:optional i64 turno;
	2:optional string numProntuario;
	3:optional string cnsCidadao;
	4:optional i64 dtNascimento;
	5:optional i64 sexo;
	6:optional i64 localAtendimento;
	7:optional bool viajante;
	8:optional bool comunicanteHanseniase;
	9:optional bool gestante;
	10:optional bool puerpera;	
	11:optional list<VacinaRowThrift> vacinas;
	12:optional i64 dataHoraInicialAtendimento;
	13:optional i64 dataHoraFinalAtendimento;
	14:optional string cpfCidadao;
}

struct FichaVacinacaoMasterThrift {
	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	3:optional common.UnicaLotacaoHeaderThrift headerTransport;
	4:optional list<FichaVacinacaoChildThrift> vacinacoes;
}