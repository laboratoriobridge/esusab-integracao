![Banner](https://raw.githubusercontent.com/laboratoriobridge/esusab-integracao/master/banner.png?token=ABpXJ3jdFgxnlXYzJMp5hI1wi6RiHdyyks5cj8d7wA%3D%3D)
# Integração e-SUS APS

O e-SUS AB fornece dois tipos de arquivos para o envio de informações para o PEC Prontuário/Centralizador municipal. São disponibilizados os seguintes formatos:

* XML
* THRIFT

Esse repositório contém esses arquivos além de exemplos de como utilizá-los.
IMPORTANTE: a implementação de alterações deve ser pautada majoritariamente pelo [LEDI]({% url layout_ab %}), e não somente pelos arquivos de exemplos.

# Organização do repositório:
 * **XSD** - Arquivos XSD fornecidos para integração via XML.
 * **thrift-exemplo** - Exemplos de código preenchendo e serializando fichas no formato thrift.
 * **thrift** - Arquivos fornecidos para integração via thrift nas linguagens C#, Delphi, Go, Java, Php, Python, NodeJS e Ruby.
 * **xml-exemplo** - Exemplo de arquivos xml preenchidos com dados válidos. 
 
# Dicionário de dados
O dicionário de dados contém as regras de preenchimento e utilização desses arquivos de integração. Ele está disponível no link: https://integracao.esusab.ufsc.br
 
# Suporte
Em caso de dúvidas ou problemas na integração com o e-SUS APS faça o cadastro no portal e registre sua solicitação: http://esusaps.bridge.ufsc.br/a/

