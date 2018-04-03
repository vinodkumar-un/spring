package com.rbsfc.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class RedbusSFCInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;

		contextLoaderListener = new ContextLoaderListener();
		context.addListener(contextLoaderListener);

		dispatcherServlet = new DispatcherServlet();
		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher",
				dispatcherServlet);
		servlet.setLoadOnStartup(2);
		servlet.addMapping("*.htm");
	}

}
