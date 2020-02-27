package com.company.splitwise.expense.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.splitwise.expense.bean.Expense;
import com.company.splitwise.expense.bean.SplitObject;
import com.company.splitwise.expense.service.ExpenseService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@RestController
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
	@HystrixCommand(fallbackMethod = "addExpenseFallBack")
	@PostMapping("/splitwise/expense")
	public Expense addExpense(@RequestBody Expense expense) {
		return expenseService.addExpense(expense);
	}
	
	@GetMapping("splitwise/expense")
	public List<Expense> getAllExpense() {
		return expenseService.getAllExpense();
	}
	
	@GetMapping("splitwise/expense/{eid}")
	public Optional<Expense> getExpense(@PathVariable int eid){
		return expenseService.getExpense(eid);
	}
	
	@GetMapping("splitwise/expense_by_group/{gid}")
	public List<Expense> getExpenseBygId(@PathVariable int gid){
		return expenseService.getAllExpenseBygId(gid);
	}
	
	@PutMapping("splitwise/expense")
	public Expense updateExpense(@RequestBody Expense expense) {
		return expenseService.updateExpense(expense);
	}
	
	@PutMapping("splitwise/expense/addEmember/{eid}/{uid}")
	public Expense addExpenseMember(@PathVariable int eid,@PathVariable int uid) {
		return expenseService.addExpenseMember(eid, uid);
	}
	
	@DeleteMapping("splitwise/expense/{eid}")
	public void deleteExpense(@PathVariable int eid) {
		expenseService.deleteExpense(eid);
	}
	
	
	@GetMapping("splitwise/expense_split/{eid}")
	@HystrixCommand(fallbackMethod = "getExpenseSplitFallBack")
	public SplitObject getExpenseSplit(@PathVariable int eid) {
		return expenseService.getSplitbyeId(eid);
	}
	
	public Expense addExpenseFallBack(@RequestBody Expense expense) {
		Expense expense1=null;
		System.out.println("Fall Back for adding expense! Please check the Group Server running");
		return expense1;
	}
	
	public SplitObject getExpenseSplitFallBack(@PathVariable int eid) {
		SplitObject splitObject=null;
		System.out.println("Fall Back for adding expense! Please check the User Server running");
		return splitObject;
	}
	
	
}
