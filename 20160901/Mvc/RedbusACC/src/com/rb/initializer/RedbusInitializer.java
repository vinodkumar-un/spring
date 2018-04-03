package com.rb.initializer;

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
		XmlWebApplicationContext appContext = null;
		XmlWebApplicationContext webContext = null;
		ContextLoaderListener listener = null;
		DispatcherServlet dispatcher = null;

		appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("/WEB-INF/application-context.xml");
		listener = new ContextLoaderListener(appContext);
		context.addListener(listener);

		webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/webbeans.xml");
		dispatcher = new DispatcherServlet(webContext);
		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher",
				dispatcher);
		servlet.addMapping("*.htm");
	}
}





