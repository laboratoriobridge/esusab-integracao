include "./common.thrift"

namespace java br.gov.saude.esusab.ras.cuidadocompartilhado
namespace php br.gov.saude.esusab.ras.cuidadocompartilhado
namespace delphi br.gov.saude.esusab.ras.cuidadocompartilhado
namespace csharp br.gov.saude.esusab.ras.cuidadocompartilhado
namespace rb br.gov.saude.esusab.ras.cuidadocompartilhado
namespace go br.gov.saude.esusab.ras.cuidadocompartilhado
namespace py br.gov.saude.esusab.ras.cuidadocompartilhado

struct CuidadoCompartilhadoThrift {
    1:required string uuidEvolucao;
    2:optional common.LotacaoThrift lotacaoEvolucao;
    3:optional i64 dataEvolucao;
    4:optional i64 dataEvolucaoAnterior;
    5:optional i32 coSequencialEvolucao;
    6:optional i64 condutaEvolucao;
    7:optional i32 tpCdsOrigem;
    8:optional string cnsCidadao;
    9:optional string cpfCidadao;
    10:optional i64 sexoCidadao;
    11:optional string dataNascimentoCidadao;
    12:required string uuidCuidadoCompartilhado;
    13:optional common.LotacaoThrift solicitante;
    14:optional common.LotacaoThrift executante;
    15:optional i64 dataCriacaoCuidado;
    16:optional string cid10;
    17:optional string ciap;
    18:optional string uuidFichaOrigem;
    19:optional i32 tpDadoTranspFichaOrigem;
    20:optional i32 prioridadeCuidado;
    21:optional i32 reclassificacaoPrioridadeCuidado;
}
