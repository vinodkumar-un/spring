package com.rb.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class RedbusInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext sContext) throws ServletException {
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcher = null;

		contextLoaderListener = new ContextLoaderListener();
		sContext.addListener(contextLoaderListener);

		dispatcher = new DispatcherServlet();
		ServletRegistration.Dynamic servlet = sContext.addServlet("dispatcher",
				dispatcher);
		servlet.setLoadOnStartup(2);
		servlet.addMapping("*.htm");

	}
}
