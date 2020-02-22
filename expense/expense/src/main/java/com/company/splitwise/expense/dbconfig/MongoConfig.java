package com.company.splitwise.expense.dbconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.splitwise.expense.repo.ExpenseRepository;



@Configuration
@EnableMongoRepositories(basePackageClasses = ExpenseRepository.class)
public class MongoConfig{
	
}