---
layout: doc
title: Ficha de Cadastro Individual
id: dicionario-fci
order: 1
---

# Ficha de Cadastro Individual

### \#1 condicoesDeSaude
Formulário referente as condições de saúde do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|CondicoesDeSaude |Condicional |- |- |

**Referência**: [Ver CondicoesDeSaude]()

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#2 dadosGerais	Dados
referentes ao profissional e a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|HeaderCdsCadastro |Sim |- |- |

**Referência**: [Ver HeaderCdsCadastro]().

### \#3 emSituacaoDeRua
Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|EmSituacaoDeRua |Condicional |- |- |

**Referência**: [Ver EmSituacaoDeRua]().

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#4 fichaAtualizada
Marcador que indica se a ficha é uma atualização.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|boolean |Sim |- |- |

### \#5 identificacaoUsuarioCidadao
Dados que identificam o cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|IdentificacaoUsuarioCidadao |Condicional |- |- |

**Referência**: [Ver IdentificacaoUsuarioCidadao]()

Observação: Opcional se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#6 informacoesSocioDemograficas
Informações sócio-demográficas fornecidas pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|InformacoesSocioDemograficas |Condicional |- |- |

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#7 statusTermoRecusaCadastroIndividualAtencaoBasica
Marcador que indica se o termo de recusa foi assinalado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#8 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#9 uuid
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)

### \#10 uuidFichaOriginadora
Código UUID para identificar a ficha que deu origem ao cadastro do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** Se for uma ficha de atualização, deve ser preenchido com o UUID da ficha que deu origem ao registro. Se for a ficha de cadastro, este campo deve ser igual ao campo uuid.

**Referência**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)
