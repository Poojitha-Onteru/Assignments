package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI openApi() {
		return new OpenAPI()
				.info(new Info().title("User Management Application")
				.description("Swagger Configuration demo using Springboot user application")
				.version("1.0")
				.contact(new Contact().name("API support team")
						.email("pooji@gmail.com")
						.url("com.spring.userApp"))
						.license(new License()
								.name("Apache 2.0")
								.url("http://wwwa.apache.org./licenses/LICENSES")));
	}

}
