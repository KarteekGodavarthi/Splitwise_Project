package com.company.splitwise.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.splitwise.user.bean.User;
import com.company.splitwise.user.bean.UserDetails;
import com.company.splitwise.user.repo.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User insertUser(User user) {
		return userRepository.insert(user);
	}
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	public void deleteUser(int Userid) {
		userRepository.deleteById(Userid);
	}
	public Optional<User> getUser(int uid) {
		return userRepository.findById(uid);
	}
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	public String getUserName(int uid) {
		return userRepository.findById(uid).get().getUserName();
	}
	public UserDetails getUserByUserName(String userName) {
		List<User> users=userRepository.getUserByUserName(userName);
		if(users.size()==1) {
			UserDetails userDetails=new UserDetails(users.get(0).getUserName(),users.get(0).getPassword());
			return userDetails;
		}
		else {
			return new UserDetails();
		}
	}
}
