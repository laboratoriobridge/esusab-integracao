#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module Br
  module Gov
    module Saude
      module Esusab
        module Ras
          module Common
            class HeaderCdsCadastroThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              CNESUNIDADESAUDE = 1
              CNSPROFISSIONAL = 2
              CODIGOIBGEMUNICIPIO = 3
              DATAATENDIMENTO = 4
              INEEQUIPE = 5
              MICROAREA = 6

              FIELDS = {
                CNESUNIDADESAUDE => {:type => ::Thrift::Types::STRING, :name => 'cnesUnidadeSaude', :optional => true},
                CNSPROFISSIONAL => {:type => ::Thrift::Types::STRING, :name => 'cnsProfissional', :optional => true},
                CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true},
                DATAATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataAtendimento', :optional => true},
                INEEQUIPE => {:type => ::Thrift::Types::STRING, :name => 'ineEquipe', :optional => true},
                MICROAREA => {:type => ::Thrift::Types::I64, :name => 'microarea', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class LotacaoHeaderThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              PROFISSIONALCNS = 1
              CBOCODIGO_2002 = 2
              CNES = 3
              INE = 4

              FIELDS = {
                PROFISSIONALCNS => {:type => ::Thrift::Types::STRING, :name => 'profissionalCNS', :optional => true},
                CBOCODIGO_2002 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002', :optional => true},
                CNES => {:type => ::Thrift::Types::STRING, :name => 'cnes', :optional => true},
                INE => {:type => ::Thrift::Types::STRING, :name => 'ine', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class UnicaLotacaoHeaderThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              PROFISSIONALCNS = 1
              CBOCODIGO_2002 = 2
              CNES = 3
              INE = 4
              DATAATENDIMENTO = 5
              CODIGOIBGEMUNICIPIO = 6

              FIELDS = {
                PROFISSIONALCNS => {:type => ::Thrift::Types::STRING, :name => 'profissionalCNS', :optional => true},
                CBOCODIGO_2002 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002', :optional => true},
                CNES => {:type => ::Thrift::Types::STRING, :name => 'cnes', :optional => true},
                INE => {:type => ::Thrift::Types::STRING, :name => 'ine', :optional => true},
                DATAATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataAtendimento', :optional => true},
                CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class VariasLotacoesHeaderThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              LOTACAOFORMPRINCIPAL = 6
              LOTACAOFORMATENDIMENTOCOMPARTILHADO = 7
              DATAATENDIMENTO = 8
              CODIGOIBGEMUNICIPIO = 9

              FIELDS = {
                LOTACAOFORMPRINCIPAL => {:type => ::Thrift::Types::STRUCT, :name => 'lotacaoFormPrincipal', :class => ::Br::Gov::Saude::Esusab::Ras::Common::LotacaoHeaderThrift, :optional => true},
                LOTACAOFORMATENDIMENTOCOMPARTILHADO => {:type => ::Thrift::Types::STRUCT, :name => 'lotacaoFormAtendimentoCompartilhado', :class => ::Br::Gov::Saude::Esusab::Ras::Common::LotacaoHeaderThrift, :optional => true},
                DATAATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataAtendimento', :optional => true},
                CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class LotacaoThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              CPF = 1
              CNS = 2
              CBOCODIGO_2002 = 3
              INE = 4
              CNES = 5
              CODIGOIBGEMUNICIPIO = 6

              FIELDS = {
                CPF => {:type => ::Thrift::Types::STRING, :name => 'cpf', :optional => true},
                CNS => {:type => ::Thrift::Types::STRING, :name => 'cns', :optional => true},
                CBOCODIGO_2002 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002', :optional => true},
                INE => {:type => ::Thrift::Types::STRING, :name => 'ine', :optional => true},
                CNES => {:type => ::Thrift::Types::STRING, :name => 'cnes', :optional => true},
                CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class EnderecoLocalPermanenciaThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              BAIRRO = 1
              CEP = 2
              CODIGOIBGEMUNICIPIO = 3
              COMPLEMENTO = 4
              NOMELOGRADOURO = 5
              NUMERO = 6
              NUMERODNEUF = 7
              TELEFONECONTATO = 8
              TELEFONERESIDENCIA = 9
              TIPOLOGRADOURONUMERODNE = 10
              STSEMNUMERO = 11
              PONTOREFERENCIA = 12
              MICROAREA = 13
              STFORAAREA = 14

              FIELDS = {
                BAIRRO => {:type => ::Thrift::Types::STRING, :name => 'bairro', :optional => true},
                CEP => {:type => ::Thrift::Types::STRING, :name => 'cep', :optional => true},
                CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true},
                COMPLEMENTO => {:type => ::Thrift::Types::STRING, :name => 'complemento', :optional => true},
                NOMELOGRADOURO => {:type => ::Thrift::Types::STRING, :name => 'nomeLogradouro', :optional => true},
                NUMERO => {:type => ::Thrift::Types::STRING, :name => 'numero', :optional => true},
                NUMERODNEUF => {:type => ::Thrift::Types::STRING, :name => 'numeroDneUf', :optional => true},
                TELEFONECONTATO => {:type => ::Thrift::Types::STRING, :name => 'telefoneContato', :optional => true},
                TELEFONERESIDENCIA => {:type => ::Thrift::Types::STRING, :name => 'telefoneResidencia', :optional => true},
                TIPOLOGRADOURONUMERODNE => {:type => ::Thrift::Types::STRING, :name => 'tipoLogradouroNumeroDne', :optional => true},
                STSEMNUMERO => {:type => ::Thrift::Types::BOOL, :name => 'stSemNumero', :optional => true},
                PONTOREFERENCIA => {:type => ::Thrift::Types::STRING, :name => 'pontoReferencia', :optional => true},
                MICROAREA => {:type => ::Thrift::Types::STRING, :name => 'microArea', :optional => true},
                STFORAAREA => {:type => ::Thrift::Types::BOOL, :name => 'stForaArea', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class MedicamentoThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              CODIGOCATMAT = 1
              VIAADMINISTRACAO = 2
              DOSE = 3
              DOSEUNICA = 4
              USOCONTINUO = 5
              DOSEFREQUENCIATIPO = 6
              DOSEFREQUENCIA = 7
              DOSEFREQUENCIAQUANTIDADE = 8
              DOSEFREQUENCIAUNIDADEMEDIDA = 9
              DTINICIOTRATAMENTO = 10
              DURACAOTRATAMENTO = 11
              DURACAOTRATAMENTOMEDIDA = 12
              QUANTIDADERECEITADA = 13
              QTDOSEMANHA = 15
              QTDOSETARDE = 16
              QTDOSENOITE = 17

              FIELDS = {
                CODIGOCATMAT => {:type => ::Thrift::Types::STRING, :name => 'codigoCatmat', :optional => true},
                VIAADMINISTRACAO => {:type => ::Thrift::Types::I64, :name => 'viaAdministracao', :optional => true},
                DOSE => {:type => ::Thrift::Types::STRING, :name => 'dose', :optional => true},
                DOSEUNICA => {:type => ::Thrift::Types::BOOL, :name => 'doseUnica', :optional => true},
                USOCONTINUO => {:type => ::Thrift::Types::BOOL, :name => 'usoContinuo', :optional => true},
                DOSEFREQUENCIATIPO => {:type => ::Thrift::Types::I64, :name => 'doseFrequenciaTipo', :optional => true},
                DOSEFREQUENCIA => {:type => ::Thrift::Types::STRING, :name => 'doseFrequencia', :optional => true},
                DOSEFREQUENCIAQUANTIDADE => {:type => ::Thrift::Types::I32, :name => 'doseFrequenciaQuantidade', :optional => true},
                DOSEFREQUENCIAUNIDADEMEDIDA => {:type => ::Thrift::Types::I64, :name => 'doseFrequenciaUnidadeMedida', :optional => true},
                DTINICIOTRATAMENTO => {:type => ::Thrift::Types::I64, :name => 'dtInicioTratamento', :optional => true},
                DURACAOTRATAMENTO => {:type => ::Thrift::Types::I32, :name => 'duracaoTratamento', :optional => true},
                DURACAOTRATAMENTOMEDIDA => {:type => ::Thrift::Types::I64, :name => 'duracaoTratamentoMedida', :optional => true},
                QUANTIDADERECEITADA => {:type => ::Thrift::Types::I32, :name => 'quantidadeReceitada', :optional => true},
                QTDOSEMANHA => {:type => ::Thrift::Types::STRING, :name => 'qtDoseManha', :optional => true},
                QTDOSETARDE => {:type => ::Thrift::Types::STRING, :name => 'qtDoseTarde', :optional => true},
                QTDOSENOITE => {:type => ::Thrift::Types::STRING, :name => 'qtDoseNoite', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class EncaminhamentoExternoThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              ESPECIALIDADE = 1
              HIPOTESEDIAGNOSTICOCID10 = 2
              HIPOTESEDIAGNOSTICOCIAP2 = 3
              CLASSIFICACAORISCO = 4

              FIELDS = {
                ESPECIALIDADE => {:type => ::Thrift::Types::I64, :name => 'especialidade', :optional => true},
                HIPOTESEDIAGNOSTICOCID10 => {:type => ::Thrift::Types::STRING, :name => 'hipoteseDiagnosticoCid10', :optional => true},
                HIPOTESEDIAGNOSTICOCIAP2 => {:type => ::Thrift::Types::STRING, :name => 'hipoteseDiagnosticoCiap2', :optional => true},
                CLASSIFICACAORISCO => {:type => ::Thrift::Types::I64, :name => 'classificacaoRisco', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class ResultadoExameThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              TIPORESULTADO = 1
              VALORRESULTADO = 2

              FIELDS = {
                TIPORESULTADO => {:type => ::Thrift::Types::I32, :name => 'tipoResultado', :optional => true},
                VALORRESULTADO => {:type => ::Thrift::Types::STRING, :name => 'valorResultado', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class ResultadosExameThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              EXAME = 1
              DATASOLICITACAO = 2
              DATAREALIZACAO = 3
              DATARESULTADO = 4
              RESULTADOEXAME = 6

              FIELDS = {
                EXAME => {:type => ::Thrift::Types::STRING, :name => 'exame', :optional => true},
                DATASOLICITACAO => {:type => ::Thrift::Types::I64, :name => 'dataSolicitacao', :optional => true},
                DATAREALIZACAO => {:type => ::Thrift::Types::I64, :name => 'dataRealizacao', :optional => true},
                DATARESULTADO => {:type => ::Thrift::Types::I64, :name => 'dataResultado', :optional => true},
                RESULTADOEXAME => {:type => ::Thrift::Types::LIST, :name => 'resultadoExame', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Common::ResultadoExameThrift}, :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class MedicoesThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              CIRCUNFERENCIAABDOMINAL = 1
              PERIMETROPANTURRILHA = 2
              PRESSAOARTERIALSISTOLICA = 3
              PRESSAOARTERIALDIASTOLICA = 4
              FREQUENCIARESPIRATORIA = 5
              FREQUENCIACARDIACA = 6
              TEMPERATURA = 7
              SATURACAOO2 = 8
              GLICEMIACAPILAR = 9
              TIPOGLICEMIACAPILAR = 10
              PESO = 11
              ALTURA = 12
              PERIMETROCEFALICO = 13

              FIELDS = {
                CIRCUNFERENCIAABDOMINAL => {:type => ::Thrift::Types::DOUBLE, :name => 'circunferenciaAbdominal', :optional => true},
                PERIMETROPANTURRILHA => {:type => ::Thrift::Types::DOUBLE, :name => 'perimetroPanturrilha', :optional => true},
                PRESSAOARTERIALSISTOLICA => {:type => ::Thrift::Types::I32, :name => 'pressaoArterialSistolica', :optional => true},
                PRESSAOARTERIALDIASTOLICA => {:type => ::Thrift::Types::I32, :name => 'pressaoArterialDiastolica', :optional => true},
                FREQUENCIARESPIRATORIA => {:type => ::Thrift::Types::I32, :name => 'frequenciaRespiratoria', :optional => true},
                FREQUENCIACARDIACA => {:type => ::Thrift::Types::I32, :name => 'frequenciaCardiaca', :optional => true},
                TEMPERATURA => {:type => ::Thrift::Types::DOUBLE, :name => 'temperatura', :optional => true},
                SATURACAOO2 => {:type => ::Thrift::Types::I32, :name => 'saturacaoO2', :optional => true},
                GLICEMIACAPILAR => {:type => ::Thrift::Types::I32, :name => 'glicemiaCapilar', :optional => true},
                TIPOGLICEMIACAPILAR => {:type => ::Thrift::Types::I64, :name => 'tipoGlicemiaCapilar', :optional => true},
                PESO => {:type => ::Thrift::Types::DOUBLE, :name => 'peso', :optional => true},
                ALTURA => {:type => ::Thrift::Types::DOUBLE, :name => 'altura', :optional => true},
                PERIMETROCEFALICO => {:type => ::Thrift::Types::DOUBLE, :name => 'perimetroCefalico', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class ProblemaCondicaoThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              UUIDPROBLEMA = 1
              UUIDEVOLUCAOPROBLEMA = 2
              COSEQUENCIALEVOLUCAO = 3
              CIAP = 4
              CID10 = 5
              SITUACAO = 6
              DATAINICIOPROBLEMA = 7
              DATAFIMPROBLEMA = 8
              ISAVALIADO = 9

              FIELDS = {
                UUIDPROBLEMA => {:type => ::Thrift::Types::STRING, :name => 'uuidProblema', :optional => true},
                UUIDEVOLUCAOPROBLEMA => {:type => ::Thrift::Types::STRING, :name => 'uuidEvolucaoProblema', :optional => true},
                COSEQUENCIALEVOLUCAO => {:type => ::Thrift::Types::I64, :name => 'coSequencialEvolucao', :optional => true},
                CIAP => {:type => ::Thrift::Types::STRING, :name => 'ciap', :optional => true},
                CID10 => {:type => ::Thrift::Types::STRING, :name => 'cid10', :optional => true},
                SITUACAO => {:type => ::Thrift::Types::I64, :name => 'situacao', :optional => true},
                DATAINICIOPROBLEMA => {:type => ::Thrift::Types::I64, :name => 'dataInicioProblema', :optional => true},
                DATAFIMPROBLEMA => {:type => ::Thrift::Types::I64, :name => 'dataFimProblema', :optional => true},
                ISAVALIADO => {:type => ::Thrift::Types::BOOL, :name => 'isAvaliado', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class IvcfThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              RESULTADO = 1
              HASSGIDADE = 2
              HASSGPERCEPCAOSAUDE = 3
              HASSGAVDINSTRUMENTAL = 4
              HASSGAVDBASICA = 5
              HASSGCOGNICAO = 6
              HASSGHUMOR = 7
              HASSGALCANCEPREENSAOPINCA = 8
              HASSGCAPAEROBICAMUSCULAR = 9
              HASSGMARCHA = 10
              HASSGCONTINENCIA = 11
              HASSGVISAO = 12
              HASSGAUDICAO = 13
              HASSGCOMORBIDADE = 14
              DATARESULTADO = 15

              FIELDS = {
                RESULTADO => {:type => ::Thrift::Types::I32, :name => 'resultado', :optional => true},
                HASSGIDADE => {:type => ::Thrift::Types::BOOL, :name => 'hasSgIdade', :optional => true},
                HASSGPERCEPCAOSAUDE => {:type => ::Thrift::Types::BOOL, :name => 'hasSgPercepcaoSaude', :optional => true},
                HASSGAVDINSTRUMENTAL => {:type => ::Thrift::Types::BOOL, :name => 'hasSgAvdInstrumental', :optional => true},
                HASSGAVDBASICA => {:type => ::Thrift::Types::BOOL, :name => 'hasSgAvdBasica', :optional => true},
                HASSGCOGNICAO => {:type => ::Thrift::Types::BOOL, :name => 'hasSgCognicao', :optional => true},
                HASSGHUMOR => {:type => ::Thrift::Types::BOOL, :name => 'hasSgHumor', :optional => true},
                HASSGALCANCEPREENSAOPINCA => {:type => ::Thrift::Types::BOOL, :name => 'hasSgAlcancePreensaoPinca', :optional => true},
                HASSGCAPAEROBICAMUSCULAR => {:type => ::Thrift::Types::BOOL, :name => 'hasSgCapAerobicaMuscular', :optional => true},
                HASSGMARCHA => {:type => ::Thrift::Types::BOOL, :name => 'hasSgMarcha', :optional => true},
                HASSGCONTINENCIA => {:type => ::Thrift::Types::BOOL, :name => 'hasSgContinencia', :optional => true},
                HASSGVISAO => {:type => ::Thrift::Types::BOOL, :name => 'hasSgVisao', :optional => true},
                HASSGAUDICAO => {:type => ::Thrift::Types::BOOL, :name => 'hasSgAudicao', :optional => true},
                HASSGCOMORBIDADE => {:type => ::Thrift::Types::BOOL, :name => 'hasSgComorbidade', :optional => true},
                DATARESULTADO => {:type => ::Thrift::Types::I64, :name => 'dataResultado', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

          end
        end
      end
    end
  end
end
