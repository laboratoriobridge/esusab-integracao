namespace java br.gov.saude.esus.cds.transport.generated.thrift.common
namespace php br.gov.saude.esus.cds.transport.generated.thrift.common
namespace delphi br.gov.saude.esus.cds.transport.generated.thrift.common
namespace csharp br.gov.saude.esus.cds.transport.generated.thrift.common
namespace rb br.gov.saude.esus.cds.transport.generated.thrift.common


struct HeaderCdsCadastroThrift {
	1:optional string cnesUnidadeSaude;
	2:optional string cnsProfissional;
	3:optional string codigoIbgeMunicipio;
	4:optional i64 dataAtendimento;
	5:optional string ineEquipe;
	6:optional i64 microarea;
}

/**
 * Representa um profissional
 */
struct LotacaoHeaderThrift{
	1:optional string profissionalCNS;

	2:optional string cboCodigo_2002;

	3:optional string cnes;

	4:optional string ine;
}

struct UnicaLotacaoHeaderThrift{
	1:optional string profissionalCNS;

	2:optional string cboCodigo_2002;

	3:optional string cnes;

	4:optional string ine;

	5:optional i64 dataAtendimento;

	6:optional string codigoIbgeMunicipio;
}

struct VariasLotacoesHeaderThrift {
	1:optional UnicaLotacaoHeaderThrift lotacaoFormPrincipalV2000;

	2:optional string profissionalCNS1v2000;
	3:optional string cboCodigo_2002_1v2000;

	4:optional string profissionalCNS2v2000;
	5:optional string cboCodigo_2002_2v2000;

	6:optional LotacaoHeaderThrift lotacaoFormPrincipal;
	7:optional LotacaoHeaderThrift lotacaoFormAtendimentoCompartilhado;

	8:optional i64 dataAtendimento;
	9:optional string codigoIbgeMunicipio;
}

struct EnderecoLocalPermanenciaThrift {
	1:optional string bairro,
	2:optional string cep,
	3:optional string codigoIbgeMunicipio,
	4:optional string complemento,
	5:optional string nomeLogradouro,
	6:optional string numero,
	7:optional string numeroDneUf,
	8:optional string telefoneContato,
	9:optional string telefoneResidencia,
	10:optional string tipoLogradouroNumeroDne,
	11:optional bool stSemNumero,
	12:optional string pontoReferencia,
	13:optional string microArea,
	14:optional bool stForaArea;
	15:optional double latitude;
	16:optional double longitude;
}

struct MedicamentoThrift {
	1:optional string codigoCatmat;
	2:optional i64 viaAdministracao;
	3:optional string dose;
	4:optional bool doseUnica;
	5:optional bool usoContinuo;
	6:optional i64 doseFrequenciaTipo;
	7:optional string doseFrequencia;
	8:optional i32 doseFrequenciaQuantidade;
	9:optional i64 doseFrequenciaUnidadeMedida;
	10:optional i64 dtInicioTratamento;
	11:optional i32 duracaoTratamento;
	12:optional i64 duracaoTratamentoMedida;
	13:optional i32 quantidadeReceitada;
}

struct EncaminhamentoExternoThrift {
	1:optional i64 especialidade;
	2:optional string hipoteseDiagnosticoCid10;
	3:optional string hipoteseDiagnosticoCiap2;
	4:optional i64 classificacaoRisco;
}

struct ResultadoExameThrift {
    1:optional i32 tipoResultado;
    2:optional string valorResultado;
}

struct ResultadosExameThrift {
    1:optional string exame;
    2:optional i64 dataSolicitacao;
    3:optional i64 dataRealizacao;
    4:optional i64 dataResultado;
    5:optional string resultado;
    6:optional list<ResultadoExameThrift> exameResultadoEspecifico;
}
