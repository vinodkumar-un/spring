package com.redbus.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class RedbusInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;
		XmlWebApplicationContext appContext = null;
		XmlWebApplicationContext webContext = null;

		appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("/WEB-INF/application-context.xml");
		contextLoaderListener = new ContextLoaderListener(appContext);
		context.addListener(contextLoaderListener);

		webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		dispatcherServlet = new DispatcherServlet(webContext);
		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher",
				dispatcherServlet);
		servlet.setLoadOnStartup(2);
		servlet.addMapping("*.htm");
	}
}
