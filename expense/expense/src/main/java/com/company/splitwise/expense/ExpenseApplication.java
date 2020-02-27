package com.company.splitwise.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients("com.company.splitwise.expense.service")
@SpringBootApplication(scanBasePackages = {"com.company.splitwise.expense.service","com.company.splitwise.expense.controller"})
public class ExpenseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseApplication.class, args);
	}

}
