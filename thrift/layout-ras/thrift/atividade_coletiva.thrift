include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva
namespace php br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva


struct ParticipanteRowItemThrift {
	1:optional string cns;
	2:optional i64 dataNascimento;
	3:optional bool avaliacaoAlterada;
	4:optional double peso;
	5:optional double altura;
	6:optional bool cessouHabitoFumar;
	7:optional bool abandonouGrupo;
}

struct ProfissionalCboRowItemThrift {
	1:optional string cns;
	2:optional string codigoCbo2002;
}

struct FichaAtividadeColetivaThrift {
	1:required string uuidFicha;
	2:optional i64 dtAtividadeColetiva;
	3:optional i32 numParticipantesProgramados;
	4:optional string localAtividade;
	5:optional i64 horaInicio;
	6:optional i64 horaFim;
	7:optional i64 inep;
	
	8:optional string responsavelCns;
	9:required string responsavelCnesUnidade;
	10:optional string responsavelNumIne;
	11:optional i32 numParticipantes;
	12:optional i32 numAvaliacoesAlteradas;
	
	13:optional list<ProfissionalCboRowItemThrift> profissionais;
	14:optional i64 atividadeTipo;
	15:optional list<i64> temasParaReuniao;
	16:optional list<i64> publicoAlvo;
	17:optional list<i64> praticasTemasParaSaude;
	18:optional list<ParticipanteRowItemThrift> participantes;
	19:optional i32 tbCdsOrigem;
	20:optional string codigoIbgeMunicipio;
}