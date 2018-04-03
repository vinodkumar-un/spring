package com.je.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowRegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<String> cities = null;

		cities = new ArrayList<String>();
		// query the data from database and populate into list
		cities.add("hyderabad");
		cities.add("chennai");
		cities.add("banglore");
		cities.add("pune");
		cities.add("gurgoan");

		request.setAttribute("cities", cities);
		request.getRequestDispatcher("/register.jsp")
				.forward(request, response);
	}
}
