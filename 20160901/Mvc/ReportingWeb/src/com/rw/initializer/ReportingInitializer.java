package com.rw.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ReportingInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext servletApplicationContext = null;

		servletApplicationContext = new XmlWebApplicationContext();
		servletApplicationContext
				.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");

		return servletApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

}
