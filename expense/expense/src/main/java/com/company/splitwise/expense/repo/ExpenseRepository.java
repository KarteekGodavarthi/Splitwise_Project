package com.company.splitwise.expense.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.splitwise.expense.bean.Expense;



public interface ExpenseRepository extends MongoRepository<Expense, Integer> {

	@Query(value = "{'gId':?0}",fields="{'eId':1,'gId':1,'expenseName':1,'eMembers':1,'expense':1,'paidId':1}")
	List<Expense> findBygId(int gId);
	
}
