package com.company.splitwise.expense.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="splitwise-user")
@RibbonClient(name="splitwise-user")
public interface UserServiceProxy {
	@GetMapping("/splitwise/username/{uid}")
	public HttpEntity<String> getUserName(@PathVariable("uid") int uid);
}
