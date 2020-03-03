package com.example.zuul.netflixzuulapigateway.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="splitwise-user")
@RibbonClient(name="splitwise-user")
public interface UserProxy {
	@GetMapping("/splitwise/user-by-name/{userName}")
	public HttpEntity<Object> getUserName(@PathVariable("userName") String userName);
}
