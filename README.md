# BarbeShop-Back-End-
Documentação da API - Sistema de Gestão de Agendamentos da Barbearia

Esta documentação foi gerada para fornecer uma visão clara de como utilizar a API de Gestão de Agendamentos da Barbearia, construída utilizando Spring Boot. A API permite que os usuários façam, visualizem, editem e cancelem agendamentos diretamente para os serviços oferecidos pela barbearia.

Acessando a API via Swagger UI

A documentação da API foi disponibilizada de forma interativa e acessível através do Swagger UI. Ela serve como uma interface gráfica onde você pode testar todos os endpoints da API de forma fácil e sem a necessidade de escrever código manualmente.

Para utilizar a Swagger UI e testar a API localmente, basta acessar o seguinte link:

http://localhost:8080/swagger-ui/index.html#/usuario-controller/getAll

Acesse a Swagger UI

Nota: O link está configurado para rodar localmente, ou seja, você precisa ter a aplicação do Spring Boot em funcionamento em sua máquina para conseguir interagir com a API.

Como usar a documentação?

Endpoints Visíveis: Ao acessar o Swagger UI, você verá todos os endpoints disponíveis na API listados na interface.

Testar Funções: Para testar uma função específica, como agendar, editar ou excluir um agendamento, basta clicar sobre o método desejado e preencher os campos solicitados. O Swagger UI faz com que a interação com a API seja simples e sem necessidade de configurar ferramentas adicionais como o Postman.

Resposta Automática: Após enviar a requisição, você receberá a resposta diretamente na interface do Swagger UI, com detalhes sobre o sucesso ou falha da operação.

Funcionalidades principais

Agendar: Realize agendamentos de horários para cortes e outros serviços.

Visualizar Agendamentos: Verifique os agendamentos feitos para um determinado período ou cliente.

Editar: Modifique os agendamentos já feitos, caso o cliente precise alterar o horário.

Cancelar: Permita que os clientes cancelem agendamentos previamente feitos.

Requisitos

Spring Boot: A aplicação está desenvolvida com o framework Spring Boot, o que garante facilidade de integração, escalabilidade e manutenção.

Banco de Dados: Para persistir as informações de agendamentos, a aplicação precisa de um banco de dados configurado, no momento está configurada em MySQL.

Conclusão

Esta API foi desenvolvida para facilitar o gerenciamento de agendamentos de forma eficiente e prática, oferecendo uma interface interativa e fácil de usar através do Swagger UI.
