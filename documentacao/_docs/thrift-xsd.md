---
layout: doc
title: Thrift x XSD
id: thrift-xsd
order: 1
---

# Thrift x XSD

## Ficha de Cadastro Individual

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[CadastroIndividual]({% url dicionario-fci#cadastroindividual %})	|CadastroIndividualThrift	|v2000cadastroindividual.xsd |
|[InformacoesSocioDemograficas]({% url dicionario-fci %}#informacoessociodemograficas)	|InformacoesSocioDemograficasThrift	|v2000informacoessociodemograficas.xsd |
|[IdentificacaoUsuarioCidadao]({% url dicionario-fci %}#identificacaousuariocidadao)	|IdentificacaoUsuarioCidadaoThrift	|v2000identificacaousuariocidadao.xsd |
|[EmSituacaoDeRua]({% url dicionario-fci %}#emsituacaoderua)	|EmSituacaoDeRuaThrift	|v2000emsituacaoderua.xsd |
|[CondicoesDeSaude]({% url dicionario-fci %}#condicoesdesaude)	|CondicoesDeSaudeThrift	|v2000condicoesdesaude.xsd |

## Ficha de Cadastro Domiciliar

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[CadastroDomiciliar]({% url dicionario-fcd %}#cadastrodomiciliar)	|CadastroDomiciliarThrift	|v2000cadastrodomiciliar.xsd |
|[FamiliaRow]({% url dicionario-fcd %}#familiarow)	|FamiliaRowThrift	|v2000familiarow.xsd |
|[CondicaoMoradia]({% url dicionario-fcd %}#condicaomoradia)	|CondicaoMoradiaThrift	|v2000condicaomoradia.xsd |
|[EnderecoLocalPermanencia]({% url dicionario-fcd %}#enderecolocalpermanencia)	|EnderecoLocalPermanenciaThrift	|v2000enderecolocalpermanencia.xsd |

## Ficha de Atendimento Individual

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaAtendimentoIndividualMaster]({% url dicionario-fai %}#fichaatendimentoindividualmaster)	|FichaAtendimentoIndividualMasterThrift	|v2000fichaatendimentoindividualmaster.xsd |
|[FichaAtendimentoIndividualChild]({% url dicionario-fai %}#fichaatendimentoindividualchild)	|FichaAtendimentoIndividualChildThrift	|v2000fichaatendimentoindividualchild.xsd |
|[ProblemaCondicaoAvaliacaoAI]({% url dicionario-fai %}#problemacondicaoavaliacaoai)	|ProblemaCondicaoAvaliacaoAIThrift	|v2000problemacondicaoavaliacaoai.xsd |
|[OutrosSia]({% url dicionario-fai %}#outrossia)	|OutrosSiaThrift	|v2000outrossia.xsd |

## Ficha de Atendimento Odontológico

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaAtendimentoOdontologicoMaster]({% url dicionario-fao %}#fichaatendimentoodontologicomaster)	|FichaAtendimentoOdontologicoMasterThrift	|v2000fichaatendimentoodontologicomaster.xsd |
|[FichaAtendimentoOdontologicoChild]({% url dicionario-fao %}#fichaatendimentoodontologicochild)	|FichaAtendimentoOdontologicoChildThrift	|v2000fichaatendimentoodontologicochild.xsd |
|[ProcedimentoQuantidade]({% url dicionario-fao %}#procedimentoquantidade)	|ProcedimentoQuantidadeThrift	|v2000procedimentoquantidade.xsd |

## Ficha de Atividade Coletiva

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaAtividadeColetiva]({% url dicionario-fac %}#fichaatividadecoletiva)	|FichaAtividadeColetivaThrift	|v2000fichaatividadecoletiva.xsd |
|[ParticipanteRowItem]({% url dicionario-fac %}#participanterowitem)	|ParticipanteRowItemThrift	|v2000participanterowitem.xsd |

## Ficha de Procedimentos

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaProcedimentoMaster]({% url dicionario-fp %}#fichaprocedimentomaster)	|FichaProcedimentoMasterThrift	|v2000fichaprocedimentomaster.xsd |
|[FichaProcedimentoChild]({% url dicionario-fp %}#fichaprocedimentochild)	|FichaProcedimentoChildThrift	|v2000fichaprocedimentochild.xsd |

## Ficha de Visita Domiciliar

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaVisitaDomiciliarMaster]({% url dicionario-fvd %}#fichavisitadomiciliarmaster)	|FichaVisitaDomiciliarMasterThrift	|v2000fichavisitadomiciliarmaster.xsd |
|[FichaVisitaDomiciliarChild]({% url dicionario-fvd %}#fichavisitadomiciliarchild)	|FichaVisitaDomiciliarChildThrift	|v2000fichavisitadomiciliarchild.xsd |

## Marcadores de Consumo Alimentar

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaConsumoAlimentar]({% url dicionario-mca %}#fichaconsumoalimentar)	|FichaConsumoAlimentarThrift	|v2000fichaconsumoalimentar.xsd |
|[PerguntaQuestionarioCriancasComMaisDoisAnos]({% url dicionario-mca %}#perguntaquestionariocriancascommaisdoisanos)	|PerguntaQuestionarioCriancasComMaisDoisAnosThrift	|v2000perguntaquestionariocriancascommaisdoisanos.xsd |
|[PerguntaQuestionarioCriancasDeSeisVinteTresMeses]({% url dicionario-mca %}#perguntaquestionariocriancasdeseisvintetresmeses)	|PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift	|v2000perguntaquestionariocriancasdeseisvintetresmeses.xsd |
|[PerguntaQuestionarioCriancasMenoresSeisMeses]({% url dicionario-mca %}#perguntaquestionariocriancasmenoresseismeses)	|PerguntaQuestionarioCriancasMenoresSeisMesesThrift	|v2000perguntaquestionariocriancasmenoresseismeses.xsd |
|[RespostaMultiplaEscolhaEnum]({% url dicionario-mca %}#respostamultiplaescolhaenum)	|RespostaMultiplaEscolhaEnumThrift	|v2000respostamultiplaescolhaenum.xsd |
|[RespostaUnicaEscolhaEnum]({% url dicionario-mca %}#respostaunicaescolhaenum)	|RespostaUnicaEscolhaEnumThrift	|v2000respostaunicaescolhaenum.xsd |
|[PerguntaCriancasComMaisDoisAnosEnum]({% url dicionario-mca %}#perguntacriancascommaisdoisanosenum)	|PerguntaCriancasComMaisDoisAnosEnumThrift	|v2000perguntacriancascommaisdoisanosenum.xsd |
|[PerguntaCriancasDeSeisVinteTresMesesEnum]({% url dicionario-mca %}#perguntacriancasdeseisvintetresmesesenum)	|PerguntaCriancasDeSeisVinteTresMesesEnumThrift	|v2000perguntacriancasdeseisvintetresmesesenum.xsd |
|[PerguntaCriancasMenoresSeisMesesEnum]({% url dicionario-mca %}#perguntacriancasmenoresseismesesenum)	|PerguntaCriancasMenoresSeisMesesEnumThrift	|v2000perguntacriancasmenoresseismesesenum.xsd |

## Ficha de Avaliação de Elegibilidade

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaAvaliacaoElegibilidade]({% url dicionario-fae %}#fichaavaliacaoelegibilidade)	|FichaAvaliacaoElegibilidadeThrift	|v2000fichaavaliacaoelegibilidade.xsd |


## Ficha de Atendimento Domiciliar

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[FichaAtendimentoDomiciliarMaster]({% url dicionario-fad %}#fichaatendimentodomiciliarmaster)	|FichaAtendimentoDomiciliarMasterThrift	|v2000fichaatendimentodomiciliarmaster.xsd |
|[FichaAtendimentoDomiciliarChild]({% url dicionario-fad %}#fichaatendimentodomiciliarchild)	|FichaAtendimentoDomiciliarChildThrift	|v2000fichaatendimentodomiciliarchild.xsd |

## Profissional

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[ProfissionalCboRowItem]({% url profissional %}#profissionalcborowitem)	|ProfissionalCboRowItemThrift	|v2000profissionalcborowitem.xsd |
|[VariasLotacoesHeader]({% url profissional %}#variaslotacoesheader)	|VariasLotacoesHeaderThrift	|v2000variaslotacoesheader.xsd |
|[UnicaLotacaoHeader]({% url profissional %}#unicalotacaoheader)	|UnicaLotacaoHeaderThrift	|v2000unicalotacaoheader.xsd |
|[HeaderCdsCadastro]({% url profissional %}#headercdscadastro)	|HeaderCdsCadastroThrift	|v2000headercdscadastro.xsd |

## Versão

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[Versao]({% url versao %}#versao)	|VersaoThrift	|v2000versao.xsd |

## Camada de Transporte

|Dicionário de dados |Thrift |XSD |
|--- |--- |--- |
|[DadoTransporte]({% url camada-transporte %}#dadotransporte)	|DadoTransporteThrift	|v2000dadotransporte.xsd |
|[DadoInstalacao]({% url camada-transporte %}#dadoinstalacao)	|DadoInstalacaoThrift	|v2000dadoinstalacao.xsd |
