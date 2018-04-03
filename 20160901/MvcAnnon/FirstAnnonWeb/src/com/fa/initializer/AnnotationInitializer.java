package com.fa.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fa.config.RootConfig;
import com.fa.config.WebConfig;

public class AnnotationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = null;
		AnnotationConfigWebApplicationContext webContext = null;
		ContextLoaderListener listener = null;
		DispatcherServlet dispatcher = null;

		rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		listener = new ContextLoaderListener(rootContext);
		context.addListener(listener);

		webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebConfig.class);

		dispatcher = new DispatcherServlet(webContext);
		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher",
				dispatcher);
		servlet.setLoadOnStartup(2);
		servlet.addMapping("*.htm");
	}

}
