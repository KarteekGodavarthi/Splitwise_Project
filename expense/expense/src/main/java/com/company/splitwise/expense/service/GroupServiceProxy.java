package com.company.splitwise.expense.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name="splitwise-group")
@RibbonClient(name="splitwise-group")
public interface GroupServiceProxy {
	@PutMapping("/splitwise/group_addExpense/{gId}/{eId}")
	public HttpEntity<Object> addExpense(@PathVariable("gId") int gId,@PathVariable("eId") int eId);
}
