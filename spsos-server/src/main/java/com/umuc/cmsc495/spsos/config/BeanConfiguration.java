package com.umuc.cmsc495.spsos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.umuc.cmsc495.spsos.service.OrderService;
import com.umuc.cmsc495.spsos.service.SandwichService;
import com.umuc.cmsc495.spsos.service.UserService;

@Configuration
public class BeanConfiguration {

	// TODO remove this class when we have real beans

	@Bean
	public OrderService orderService() {
		return null;
	}

	@Bean
	public SandwichService sandwichService() {
		return null;
	}

	@Bean
	public UserService userService() {
		return null;
	}

}
