---
layout: doc
title: Ficha de Atendimento Individual
id: dicionario-fai
order: 1
---

# Ficha de Atendimento Individual

## FichaAtendimentoIndividualMaster

1	headerTransport	Profissionais que realizaram o atendimento	VariasLotacoesHeader	Requerido	-	-	-	Ver Profissional	-
2	atendimentosIndividuais	Registro individualizado dos atendimentos.	List<FichaAtendimentoIndividualChild>	Requerido	1	13	No máximo 13 atendimentos podem ser registrados.	Ver FichaAtendimentoOdontologicoChild	-
3	uuidFicha	Código UUID para identificar a ficha na base de dados nacional.	String	Requerido	36	44	É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier	-
4	tpCdsOrigem	Tipo de origem dos dados do registro.	Integer	Requerido	1	1	Utilizar valor 3 (sistemas terceiros).	-	-

## FichaAtendimentoIndividualChild

1	numeroProntuario	Número do prontuário.	String	Opcional	0	30	Apenas letras e números são aceitos.	-	-
2	cns	CNS do cidadão.	String	Opcional	15	15	CNS válido de acordo com o algoritmo.	Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.  	-
3	dataNascimento	Data de nascimento do cidadão.	Long	Requerido	-	-	Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)	-
4	localDeAtendimento	Local onde o atendimento foi realizado.	Long	Requerido	-	-	Apenas valores de "1L" a "10L".	Ver LocalDeAtendimento	-
5	sexo	Sexo do cidadão.	Long	Requerido	-	-	-	Ver Sexo	-
6	turno	Turno em que o atendimento foi realizado.	Long	Opcional	-	-	-	Ver Turno	-
7	tipoAtendimento	Tipo de atendimento realizado. 	Long	Requerido	-	-	Apenas valores de "1L" a "6L"	Ver TipoDeAtendimento	-
8	pesoAcompanhamentoNutricional	Peso do cidadão em Kg.	Double	Opcional	1	6*	"• Apenas números e vírgula ("" , "").
• Máximo de números após a vírgula.
• Se tiver vírgula, tamanho máximo = 7.
• Valor mínimo = 0,5 e máximo = 500;"	-	-
9	alturaAcompanhamentoNutricional	Altura do cidadão em cm.	Double	Opcional	2	4*	"• Apenas números e vírgula ("" , "").
• Máximo de números após a vírgula.
• Se tiver vírgula, tamanho máximo = 5.
• Valor mínimo 20 e máximo 250. "	-	-
10	aleitamentoMaterno	Marcadores referentes ao aleitamento materno.	Long	Opcional	-	-	-	Ver AleitamentoMaterno	-
11	dumDaGestante	Data da Última Mestruação da gestante.	Long	Opcional	-	-	"• Não pode ser superior a data do atendimento, nem inferior a data de nascimento.
• Não pode ser preenchido quando sexo = masculino."	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)	-
12	idadeGestacional	Idade gestacional em semanas.	Integer	Opcional	0	2	"• Valor mínimo 1 e máximo 42.
• Não pode ser preenchido quando sexo = masculino."	-	-
13	atencaoDomiciliarModalidade	Modalidade AD do cidadão atendido.	Long	Opcional	-	-	Apenas valores de 1 L a 3 L	Ver ModalidadeAD	-
14	problemaCondicaoAvaliada	Situações de saúde avaliadas no atendimento.	ProblemaCondicaoAvaliacaoAI	Requerido	-	-	-	Ver ProblemaCondicaoAvaliada	-
15	examesSolicitados	Lista de exames solicitados que são apresentados na ficha .	List<String>	Opcional	0	23	Não pode conter dois exames iguais.	Ver ListaExamesAB	-
16	examesAvaliados	Lista de exames avaliados que são apresentados na ficha.	List<String>	Opcional	0	23	Não pode conter dois exames iguais.	Ver ListaExamesAB	-
17	outrosSia	Lista de outros exames.	List<OutrosSia>	Opcional	0	3	-	Ver OutrosSia	-
18	vacinaEmDia	Marcador referente a vacinação em dia do cidadão.	Boolean	Opcional	-	-	-	-	-
19	pic	Práticas Integrativas e Comprelementares.	Long	Opcional	-	-	-	Ver PraticasIntegrativasComplementares	-
20	ficouEmObservacao	Marcador referente se o cidadão ficou em observação no atendimento.	Boolean	Opcional	-	-	-	-	-
21	nasfs	Ações realizadas pelo Núcleo de Atenção a Saúde da Família.	List<Long>	Opcional	0	3	-	Ver Nasf	-
22	condutas	Condutas adotadas no atendimento.	List<Long>	Requerido	1	12	Não deve conter duas condutas iguais.	Ver CondutaEncaminhamento	-
23	stGravidezPlanejada	Marcador que indica se a gravidez é planejada.	Boolean	Opcional	-	-	Não pode ser preenchido quando sexo = masculino.	-	-
24	nuGestasPrevias	Número de gestações prévias. 	Integer	Opcional	0	2	Não pode ser preenchido quando sexo = masculino.	-	-
25	nuPartos	Número de partos que a mulher já teve. 	Integer	Opcional	0	2	Não pode ser preenchido quando sexo = masculino.	-	-

## OutrosSia

1	codigoExame	Código do exame solicitado ou avaliado.	String	Requerido	-	-	Deve ser um procedimento com um código válido.	Para ver a referência da tabela do SIGTAP acesse: http://sigtap.datasus.gov.br/tabela-unificada/app/sec/procedimento/publicados/consultar	Sem ponto ou hifen, ex: 0101010010
2	solicitadoAvaliado	Indicador se o exame foi "Solicitado" e / ou "Avaliado".	List<String>	Requerido	-	-	-	Ver SituacaoExame	-

## ProblemaCondicaoAvaliacaoAI

1	ciaps	Lista de Ciaps apresentados na lista.	List<String>	Opcional*	0	22	Não deve conter dois "Problemas / Condições" iguais.	Ver ProblemaCondicaoAvaliadaAI	* É Requerido o preenchimento de pelo menos um dos itens.
2	outroCiap1	CIAP1 registrado no antedimento.	String	Opcional*	-	-	Não pode ser igual a outroCiap1.	-
3	outroCiap2	CIAP2 registrado no antedimento.	String	Opcional*	-	-	Não pode ser igual a outroCiap2.	-
4	cid10	CID10 registrado no atendimento.	String	Opcional*	-	-	-	-

## ListaCiapCondicaoAvaliada

|Código| Descrição|
|---|---|
|ABP009|	Asma|
|ABP019|	Dengue|
|ABP008|	Desnutrição|
|ABP006|	Diabetes|
|ABP010|	DPOC|
|ABP020|	DST|
|ABP018|	Hanseníase|
|ABP005|	Hipertensão Arterial|
|ABP007|	Obesidade|
|ABP001|	Pré-natal|
|ABP004|	Puericultura|
|ABP002|	Puerpério (até 42 dias)|
|ABP023|	Rastreamento de Câncer de mama|
|ABP022|	Rastreamento de Câncer do colo do útero|
|ABP024|	Rastreamento de Risco cardiovascular|
|ABP015|	Reabilitação|
|ABP014|	Saúde Mental|
|ABP003|	Saúde Sexual e Reprodutiva|
|ABP011|	Tabagismo|
|ABP017|	Tuberculose|
|ABP012|	Usuário de alcool|
|ABP013|	Usuário de outras drogas|

## ListaExameSolicitado

|Código| Descrição|
|---|---|
|ABEX002|		Colesterol total|
|ABEX003|		Creatinina|
|ABEX027|		EAS / EQU|
|ABEX004|		Eletrocardiograma|
|ABEX030|		Eletroforese de Hemoglobina|
|ABEX005|		Espirometria|
|ABEX006|		Exame de escarro|
|ABEX026|		Glicemia|
|ABEX007|		HDL|
|ABEX008|		Hemoglobina glicosilada|
|ABEX028|		Hemograma|
|ABEX009|		LDL|
|ABEX013|		Retinografia/Fundo de olho com oftamologista|
|ABEX019|		Sorologia de Sifilis (VDRL)|
|ABEX016|		Sorologia para Dengue|
|ABEX018|		Sorologia para HIV|
|ABEX031|		Teste indireto de antiglobulina humana (TIA)|
|ABEX020|		Teste da orelhinha|
|ABEX023|		Teste de gravidez|
|ABEX022|		Teste do olhinho|
|ABEX021|		Teste do pezinho|
|ABEX024|		Ultrassonografia obstetrica|
|ABEX029|		Urocultura|
