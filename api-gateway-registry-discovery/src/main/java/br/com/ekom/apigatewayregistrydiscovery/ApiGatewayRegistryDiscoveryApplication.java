package br.com.ekom.apigatewayregistrydiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiGatewayRegistryDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayRegistryDiscoveryApplication.class, args);
	}

}
