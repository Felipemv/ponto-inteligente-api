package com.felipe.pontointeligente.api;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebSecurity extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
	}
}
