package com.company.splitwise.transaction.dbconfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.splitwise.transaction.repo.TransactionRepository;


@Configuration
@EnableMongoRepositories(basePackageClasses =TransactionRepository.class)
public class MongoConfig {

}
