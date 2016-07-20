include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar
namespace php br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar

struct FichaAtendimentoDomiciliarChildThrift {
	1:optional i64 turno;                                
	2:optional string cns;                       
	3:optional i64 dataNascimento;              
	4:optional i64 sexo;                        
	5:optional i64 localAtendimento;            
	6:optional i64 atencaoDomiciliarModalidade; 
	7:optional i64 tipoAtendimento;             
	8:optional list<i64> situacoesPresentes;   
	9:optional string cid;                       
	10:optional string ciap;                      
	11:optional list<string> procedimentos;       
	12:optional list<string> outrosProcedimentos; 
	13:optional i64 condutaDesfecho;
	14:optional bool statusInicioAcompanhamentoPosObito;
}

struct FichaAtendimentoDomiciliarMasterThrift {
	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	3:required common.UnicaLotacaoHeaderThrift headerTransport;
	4:optional list<FichaAtendimentoDomiciliarChildThrift> atendimentosDomiciliares;
}