
package com.company.splitwise.transaction.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.splitwise.transaction.bean.Transaction;
import com.company.splitwise.transaction.repo.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction insertTransaction(Transaction transaction) {
		return transactionRepository.insert(transaction);
	}
	
	public void deleteTransaction(int tId) {
		transactionRepository.deleteById(tId);
	}
	
	public Optional<Transaction> getTransaction(int tId){
		return transactionRepository.findById(tId);
	}
	
	public List<Transaction> getAllTransaction(){
		return transactionRepository.findAll();
	}
	
	public void printTransactionBygId(int gId){
		List<Transaction> list=transactionRepository.findBygId(gId);

        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("ExpenseTransactionLogBygId.log"), StandardCharsets.UTF_8)
        )) {


            for (Transaction s : list) {
                writer.write(s + "\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

	}
	
	public void printTransactionByeId(int eId){
		List<Transaction> list=transactionRepository.findByeId(eId);

        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("ExpenseTransactionLogByeId.log"), StandardCharsets.UTF_8)
        )) {


            for (Transaction s : list) {
                writer.write(s + "\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

	}
}
