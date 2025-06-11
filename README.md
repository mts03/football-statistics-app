Projeto em desenvolvimento buscando implementar funcionalidades relacionadas a estatisticas futebolisticas utilizando informações de APIs externas.

Desenvolvido utilizando Java com o framework Spring Boot para o backend e React para o Frontend.

Endpoints atuais:

Get /teams: Método get usado apenas como teste, retornando dados de uma api aleatória

Get /teams/id1/id2/stats: Método get passando o id de dois times, retornando informações selecionadas dos dois times.

Get /teams/name: Retorna o id de um time passando o nome dele. Será utilizado para conseguir recuperar o id do time ao usuário digitar seu nome, a fim de usar esse id para obter mais informações na API.