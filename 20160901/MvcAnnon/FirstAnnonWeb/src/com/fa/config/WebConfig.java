package com.fa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
	@Bean(name = { "/home.htm" })
	public Controller newHomeController() {
		ParameterizableViewController controller = new ParameterizableViewController();
		controller.setViewName("home");

		return controller;
	}

	@Bean
	public ViewResolver newJspViewResolver() {
		InternalResourceViewResolver jspViewResolver = new InternalResourceViewResolver();
		jspViewResolver.setPrefix("/WEB-INF/jsp/");
		jspViewResolver.setSuffix(".jsp");

		return jspViewResolver;
	}
}
