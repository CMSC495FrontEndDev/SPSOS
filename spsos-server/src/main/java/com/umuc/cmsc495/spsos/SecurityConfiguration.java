package com.umuc.cmsc495.spsos;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http
			.authorizeRequests()
				.antMatchers("swagger-ui.html").hasRole("ADMIN")
				.anyRequest().authenticated();
		// @formatter:on
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO convert to JDBC:
		// https://docs.spring.io/spring-security/site/docs/current-SNAPSHOT/reference/htmlsingle/#jc-form

		// @formatter:off
		auth
			.inMemoryAuthentication()
				.withUser("root").password("password").roles("ADMIN");
		// @formatter:on
	}

}
