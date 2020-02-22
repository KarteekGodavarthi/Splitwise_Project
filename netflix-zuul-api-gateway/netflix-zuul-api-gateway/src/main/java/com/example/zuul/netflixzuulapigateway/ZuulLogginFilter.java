package com.example.zuul.netflixzuulapigateway;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLogginFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// all you logic will go here 
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info("Request -> {} request URI -> {}", request, request.getRequestURI());
		
		return null;
	}

	
	// values are pre, post, error (to know when to executed zuul filter) 
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
	
}