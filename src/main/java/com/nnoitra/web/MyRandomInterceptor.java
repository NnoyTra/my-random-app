package com.nnoitra.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyRandomInterceptor implements HandlerInterceptor{

	private final Logger LOG = LoggerFactory.getLogger(MyRandomInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("FROM MY-RANDOM-INTERCEPTOR");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
