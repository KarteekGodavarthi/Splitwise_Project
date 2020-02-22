package com.company.splitwise.group.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.splitwise.group.bean.Group;

public interface GroupRepository extends MongoRepository<Group, Integer>{
	

}
