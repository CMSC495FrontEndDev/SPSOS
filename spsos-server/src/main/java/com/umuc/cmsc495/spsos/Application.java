package com.umuc.cmsc495.spsos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.umuc.cmsc495.spsos.service.OrderServiceInterface;
import com.umuc.cmsc495.spsos.service.SandwichServiceInterface;
import com.umuc.cmsc495.spsos.service.UserServiceInterface;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.umuc.cmsc495.spsos"))
				.paths(PathSelectors.any())
				.build();
	}

	@Bean
	public OrderServiceInterface orderService() {
		return null; // TODO
	}
	
	@Bean
	public SandwichServiceInterface sandwichService() {
		return null; // TODO
	}
	
	@Bean
	public UserServiceInterface userService() {
		return null; // TODO
	}
}
