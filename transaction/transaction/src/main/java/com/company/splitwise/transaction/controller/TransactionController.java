package com.company.splitwise.transaction.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.splitwise.transaction.bean.Transaction;
import com.company.splitwise.transaction.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	
	@GetMapping("/splitwise/transaction")
	public List<Transaction> getAllTransaction(){
		return transactionService.getAllTransaction();
	}
	
	@GetMapping("/splitwise/transaction/{tId}")
	public Optional<Transaction> getTransaction(@PathVariable int tId){
		return transactionService.getTransaction(tId);
	}
	
	@PostMapping("/splitwise/transaction")
	public Transaction doTransaction(@RequestBody Transaction transaction) {
		return transactionService.insertTransaction(transaction);
	}
	
	@DeleteMapping("/splitwise/transaction/{tId}")
	public void deleteTransaction(@PathVariable int tId) {
		transactionService.deleteTransaction(tId);
	}
	
	@GetMapping("/splitwise/transaction_printbygid/{gId}")
	public void printTransactionLogBygId(@PathVariable int gId) {
		transactionService.printTransactionBygId(gId);
	}
	
	@GetMapping("/splitwise/transaction_printbyeid/{eId}")
	public void printTransactionLogByeId(@PathVariable int eId) {
		transactionService.printTransactionByeId(eId);
	}
}
