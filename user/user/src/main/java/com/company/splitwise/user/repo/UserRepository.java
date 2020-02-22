package com.company.splitwise.user.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.splitwise.user.bean.User;


public interface UserRepository extends MongoRepository<User, Integer>  {
//	@Query(value="{'uid':?0}",fields="{'uid':1,'firstName':1,'lastName':1,'email':1,'phoneNumber':1,'userName':1,'password':1}")
//	List<User> getUserById(int uid);
}
