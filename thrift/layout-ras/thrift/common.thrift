namespace java br.gov.saude.esusab.ras.common
namespace php br.gov.saude.esusab.ras.common
namespace delphi br.gov.saude.esusab.ras.common
namespace csharp br.gov.saude.esusab.ras.common
namespace rb br.gov.saude.esusab.ras.common
namespace go br.gov.saude.esusab.ras.common
namespace py br.gov.saude.esusab.ras.common

struct HeaderCdsCadastroThrift {
	1:optional string cnesUnidadeSaude;
	2:optional string cnsProfissional;
	3:optional string codigoIbgeMunicipio;
	4:optional i64 dataAtendimento;
	5:optional string ineEquipe;
	6:optional i64 microarea;
}

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
	6:optional LotacaoHeaderThrift lotacaoFormPrincipal;
	7:optional LotacaoHeaderThrift lotacaoFormAtendimentoCompartilhado;

	8:optional i64 dataAtendimento;
	9:optional string codigoIbgeMunicipio;
}

struct LotacaoThrift {
	1:optional string cpf;
	2:optional string cns;
	3:optional string cboCodigo_2002;
	4:optional string ine;
	5:optional string cnes;
	6:optional string codigoIbgeMunicipio;
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
	14:optional string qtDoseManha;
	15:optional string qtDoseTarde;
	16:optional string qtDoseNoite;
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
    6:optional list<ResultadoExameThrift> resultadoExame;
}

struct MedicoesThrift {
    1:optional double circunferenciaAbdominal;
    2:optional double perimetroPanturrilha;
    3:optional i32 pressaoArterialSistolica;
    4:optional i32 pressaoArterialDiastolica;
    5:optional i32 frequenciaRespiratoria;
    6:optional i32 frequenciaCardiaca;
    7:optional double temperatura;
    8:optional i32 saturacaoO2;
    9:optional i32 glicemiaCapilar;
    10:optional i64 tipoGlicemiaCapilar;
    //    Campos jah enviados antes da 6.0.0
    11:optional double peso;
    12:optional double altura;
    13:optional double perimetroCefalico;
}

struct ProblemaCondicaoThrift {
    1:optional string uuidProblema
    2:optional string uuidEvolucaoProblema
    3:optional i64 coSequencialEvolucao
    4:optional string ciap
    5:optional string cid10
    6:optional i64 situacao
    7:optional i64 dataInicioProblema
    8:optional i64 dataFimProblema
    9:optional bool isAvaliado
}

struct IvcfThrift {
    1:optional i32 resultado;
    2:optional bool hasSgIdade;
    3:optional bool hasSgPercepcaoSaude;
    4:optional bool hasSgAvdInstrumental;
    5:optional bool hasSgAvdBasica;
    6:optional bool hasSgCognicao;
    7:optional bool hasSgHumor;
    8:optional bool hasSgAlcancePreensaoPinca;
    9:optional bool hasSgCapAerobicaMuscular;
    10:optional bool hasSgMarcha;
    11:optional bool hasSgContinencia;
    12:optional bool hasSgVisao;
    13:optional bool hasSgAudicao;
    14:optional bool hasSgComorbidade;
    15:optional i64 dataResultado;
}
