package com.company.splitwise.transaction.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.splitwise.transaction.bean.Transaction;


public interface TransactionRepository extends MongoRepository<Transaction, Integer>{
	@Query(value = "{'gId':?0}",fields="{'tId':1,'fromUser':1,'toUser':1,'gId':1,'eId':1,'amount':1,'comment':1}")
	List<Transaction> findBygId(int gId);
	
	@Query(value = "{'eId':?0}",fields="{'tId':1,'fromUser':1,'toUser':1,'gId':1,'eId':1,'amount':1,'comment':1}")
	List<Transaction> findByeId(int eId);
}
