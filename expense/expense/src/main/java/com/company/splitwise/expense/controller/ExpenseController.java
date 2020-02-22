package com.company.splitwise.expense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.splitwise.expense.bean.Expense;
import com.company.splitwise.expense.service.ExpenseService;

@RestController
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
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
}
