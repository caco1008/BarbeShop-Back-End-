package com.br.barberShop.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springbarberShopOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("Projeto Barber Shop")
					.description("API de Barbearia construído em linguagem Java")
					.version("v0.0.1")
				.license(new License()
					.name("Caíque Ramos")
					.url("https://www.instagram.com/caccoo_/"))
				.contact(new Contact()
					.name("Projeto Barber Shop")
					.url("https://github.com/caco1008")
					.email("caco.ramos10@icloud.com")))
				.externalDocs(new ExternalDocumentation()
					.description("Github")
					.url("https://github.com/caco1008"));
	}

}
