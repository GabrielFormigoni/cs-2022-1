### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

# O quê é uma Rest API?

Pra começar, uma API, que é uma sigla para application programming interface, ou “Interface de Programação de Aplicações”, pode ser entendida como um conjunto de regras que definem como aplicações ou aparelhos podem se comunicar e se conectar entre si. Já uma REST API, é uma API que segue os princípios REST, ou representational state transfer architectural style. Entre os benefícios oferecidos pelo REST, destaca-se o fato de ele garantir ao seus usuários uma grande liberdade e flexibilidade, o que fez com que as REST APIs emergissem como um dos melhores métodos para conectar aplicações e componentes em uma arquitetura de microsserviços.

# Como funciona e alguns princípios

REST APIs se comunicam por meio de HTTP requests para que possam realizar algumas operações, que são create, read, update e delete, também chamado de CRUD, com algum tipo de recurso. Por exemplo, uma REST API usaria um GET request para ler um registro, um POST request para criar um registro, um PUT request para atualizar um registro, e um DELETE request para deletá-lo. Todos os métodos HTTP podem ser utilizados com API calls. Uma REST API com um bom design se parece com um website rodando em um web browser com funcionalidade HTTP imbutida.

Pra simplificar, quando um cliente faz uma solicitação usando uma API RESTful, essa API transfere uma representação do estado do recurso ao solicitante ou endpoint. Essa representação é entregue via HTTP utilizando alguns formatos, dentre eles, o mais popular sendo JSON, pelo fato de ele ser independente de qualquer outra linguagem e poder ser lido por máquinas e humanos. 

Para que uma API seja considerada do tipo RESTful, ela precisa está em conformidade com os seguintes critérios:

- Interface uniforme: Todas as API requests para o mesmo recurso devem seguir o mesmo padrão, não importando de onde esse recurso vier.

- Client-server decoupling: No design de uma REST API, aplicações cliente-servidor devem ser completamente independentes entre si.

- Statelessness: Cada requisição acionada entre a comunicação cliente-servidor deve possuir toda a informação necessária e compreensível para realizar a origem da requisição, não sendo de responsabilidade do servidor armazenar qualquer tipo de contexto.

- Cache: É utilizado para melhorar a performance de comunicação entre aplicações, otimizando o tempo de resposta na comunicação entre cliente-servidor.

- Camadas: A separação de responsabilidades é importante nesse modelo de arquitetura. Os princípios e as boas práticas na arquitetura e design de um projeto, sugerem a construção de camadas independentes e auto gerenciadas, em que cada camada não pode conhecer as demais camadas. Caso ocorra mudanças em uma delas, as demais não serão impactadas. Nesse modelo, o cliente não deve conectar-se diretamente ao servidor da aplicação, porém uma camada de balanceamento de carga deverá ser acionada para essa responsabilidade.

# Vantagens e Desvantagens

Entre as vantagens em se utilizar REST APIs, destaca-se: o fato de ocorrer uma separação entre cliente-servidor, a praticidade no acesso aos contratos da aplicação, a confiabilidade e segurança na aplicação, a sua alta escalabilidade para aplicações, principalmente nos modelos de microsserviços, o fato de ela ser multiplataforma, considerando que os dados podem retornar nos padrões XML e JSON, etc.

Já dentre as desvantagens, temos que: é necessário se ter conhecimento dos padrões de projeto para o modelo REST API, a sua implementação é considerada “Lo-rest”, ou seja, suas aplicações disponibilizam apenas dois endpoints: HTTP GET e HTTP POST e, por fim, o fato de elas trabalharem de maneira assíncrona, o que pode causar sobrecarga nas solicitações.


# Conclusão

Tendo em vista os conceitos discutidos, assim como os grandes benefícios em se utilizar as REST APIs, temos que as REST API não só permitem a criação de websites e aplicações com maior rapidez e robustez, como também permitem que os dados sejam acessados, criados e atualizados sincronizadamente, sem comprometer a integridade das informações. Logo, percebe-se que essa área é muito importante, e a tendência é continuar sendo, no processo de desenvolvimento de software, especialmente se considerarmos o crescente número de interações em redes sociais, o avanço da internet das coisas e a praticidade e segurança no consumo de dados entre distintas aplicações.
