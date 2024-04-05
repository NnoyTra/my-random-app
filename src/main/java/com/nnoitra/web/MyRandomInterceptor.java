package com.nnoitra.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyRandomInterceptor implements HandlerInterceptor{

	private final Logger LOG = LoggerFactory.getLogger(MyRandomInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("FROM MY-RANDOM-INTERCEPTOR {}", "preHandle");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOG.info("FROM MY-RANDOM-INTERCEPTOR {}", "postHandle");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOG.info("FROM MY-RANDOM-INTERCEPTOR {}", "afterCompletion");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
