---
layout: doc
title: RF-FCI.03 Atualizar Ficha de Cadastro Individual
id: rf-fci.03_atualizar
order: 2
parent: fci
---

Toda a ficha possui um identificador único denominado UUID. Este campo não é apresentado em tela. É responsável por controlar a ficha e manter a rastreabilidade do UUID master (histórico de atualizações). 

Todas as atualizações deverão referenciar no UUID master, ou seja, o UUID da primeira ficha criada.

Ao atualizar uma ficha:

- O sistema apresenta a ficha com todas informações, exceto o campo 'Saída do cidadão do cadastro', preenchidas e permitindo a alteração dos dados;
- O Campo CNS não deve ser editável, caso seja trazido preenchido;
- Os campos do cabeçalho, que incluem: Profissional, CBO, INE, Microárea e Data, não devem vir preenchidos;
- O sistema deve apresentar as informações do último registro salvo.

Ao informar o CNS, o sistema deve verificar se o CNS informado já existe e:

- Se existir, apresenta a mensagem "CNS já cadastrado no sistema." com opção "OK" e não permite salvar o registro até que esta inconsistência seja resolvida;
- Se não existir, salva as alterações normalmente.

Ao atualizar uma ficha, o sistema deve considerar a data de atualização:

- Se a data de atualização for posterior a data da última atualização, então o sistema atualiza os dados do cidadão na base de dados do PEC;
- Se a data de atualização for anterior a data da última atualização, então o sistema não atualiza os dados do cidadão na base de dados do PEC mas salva a atualização da ficha.

**Fichas de Cadastro Individual Importadas de outras Instalações**

O relacionamento entre as fichas de um mesmo cidadão com cadastro em mais de uma base de dados é realizado unicamente através do CNS.

**Fichas importadas com CNS**

- Todas as fichas são importadas;
- Cada ficha mantém a referência para o seu UUID master;
- A identificação de que as fichas pertencem ao mesmo cidadão é realizado através do próprio CNS;
- Se a data de atualização da ficha importada for superior a data da última atualização realizada no sistema importador, então atualiza os dados do cidadão na base de dados do PEC.

**Fichas importadas sem CNS**

- Importar as fichas e não relacionar a nenhuma ficha ou cadastro de cidadão existente;
- Não criar cidadãos na base de dados do PEC.

**Atualização do registro de cidadão no PEC**

- O processo de criar ou atualizar o cidadão no cadastro de cidadãos está especificado em {% link rf-itm.02_fci_cidadao %};

- O {% link rf-itm.01_processamento_ficha_nucleo_familiar %} descreve em que momento ocorrerá esse processamento das fichas para composição do núcleo familiar.