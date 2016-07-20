include "common/common.thrift"

namespace java br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade
namespace php br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade

struct FichaAvaliacaoElegibilidadeThrift {

	1:required string uuidFicha;
	2:optional i32 tpCdsOrigem;
	3:required common.UnicaLotacaoHeaderThrift headerTransport;
	4:optional string numeroCartaoSus;
	5:optional string nomeCidadao;
	6:optional string nomeSocialCidadao;
	7:optional i64 dataNascimentoCidadao;
	8:optional i64 sexoCidadao;
	9:optional i64 racaCorCidadao;
	10:optional string nomeMaeCidadao;
	11:optional bool desconheceNomeMae;
	12:optional string codigoIbgeMunicipioNascimento;
	13:optional i64 codigoNacionalidade;
	14:optional string emailCidadao;
	15:optional string numeroNisPisPasep;
	16:optional common.EnderecoLocalPermanenciaThrift endereco;
	17:optional i64 atencaoDomiciliarOrigem;
	18:optional i64 atencaoDomiciliarModalidade;  
	19:optional list<i64> situacoesPresentes;  
	20:optional string cid10Principal;
	21:optional string cid10Segundo;
	22:optional string cid10Terceiro;
	23:optional i64 conclusaoDestinoElegivel;
	24:optional list<i64> conclusaoDestinoInelegivel; 
	25:optional i64 cuidadorCidadao; 
	
}