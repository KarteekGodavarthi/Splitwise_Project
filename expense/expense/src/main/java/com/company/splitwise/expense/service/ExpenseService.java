package com.company.splitwise.expense.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.company.splitwise.expense.bean.Expense;
import com.company.splitwise.expense.repo.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Autowired(required = true)
	private GroupServiceProxy groupServiceProxy;
	
	// Whenever i add an expense here , the group add expense should also added automatically by feign
	public Expense addExpense(Expense expense) {
		Expense expense1=expenseRepository.insert(expense);
		groupServiceProxy.addExpense(expense1.getgId(), expense1.geteId());
		return expense1;
	}
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);

	}
	public Optional<Expense> getExpense(int eId){
		return expenseRepository.findById(eId);
	}
	public void deleteExpense(int eId) {
		expenseRepository.deleteById(eId);
	}
	public List<Expense> getAllExpense(){
		return expenseRepository.findAll();
	}
	public List<Expense> getAllExpenseBygId(int gId){
		return expenseRepository.findBygId(gId);
	}
	
	public Expense addExpenseMember(int eid,int uid) {
		Optional<Expense> expense=this.getExpense(eid);
		Expense expense1=expense.get();
		ArrayList<Integer> expenseLog=expense1.geteMembers();
		expenseLog.add(uid);
		expense1.seteMembers(expenseLog);
		return this.updateExpense(expense1);
		
	}
}
