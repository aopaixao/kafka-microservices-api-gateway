# Descrição
API Gateway com Microserviços e Kafka.

<img src="/assets/apigateway-springboot.jpg" />

# Composição

* API Gateway - Server e Discovery implementados com Spring Boot
* Microserviços implementados com Spring Boot 
* Publicação e Consumo em tópico do Apache Kafka

### Dependências

* Serviço Kafka (ver pasta 'apache-kafka-docker-container') 
* Verificar o pom.xml de cada aplicação


### Configurações Gerais

* O Discovery do Gateway foi configurado para rodar na porta 8080
* O Server do Gateway foi configurado para rodar na porta 8761
* O serviço Kafdrop foi configurado, no docker-compose, para rodar na porta 19000
* Cada micro serviço foi configurado para rodar numa porta específica (ver application.properties)


### Utilização

* Os serviços deverão ser inicializados na seguinte ordem:
  - Apache Kafka (via docker)
  - api-gateway-registry-discovery (via spring)
  - api-gateway (via spring)
  - order-service (via spring)
  - stock-service (via spring)
  - email-service (via spring)


## Funcionalidades implementadas

* API Gateway (Server e Discovery) para Micro serviços
* Apache Kafka
* Publicação de mensagens em tópico Kafka
* Consumo de mensagens em tópico Kafka

## Sobre

- Author - [Alexandre Paixão]

## Licença

GNU GPL