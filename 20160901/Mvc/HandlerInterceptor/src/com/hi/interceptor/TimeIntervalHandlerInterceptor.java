package com.hi.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeIntervalHandlerInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		int hour = 0;
		Calendar calendar = null;

		calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);

		if (hour >= 19 && hour <= 22) {
			response.sendRedirect("maintainance.jsp");
			return false;
		}

		return true;
	}
}
