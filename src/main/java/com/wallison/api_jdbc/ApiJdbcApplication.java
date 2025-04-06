package com.wallison.api_jdbc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
                title = "Clientes",
				version = "0.0.1")
)
@SpringBootApplication
public class ApiJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJdbcApplication.class, args);
	}

}
