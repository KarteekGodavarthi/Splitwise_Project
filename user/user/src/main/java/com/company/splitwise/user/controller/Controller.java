package com.company.splitwise.user.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.splitwise.user.bean.User;
import com.company.splitwise.user.bean.UserDetails;
import com.company.splitwise.user.repo.UserRepository;
import com.company.splitwise.user.service.UserService;

@RestController
public class Controller {

	@Autowired
	private UserService userService;
	
	@GetMapping("/splitwise/user")
	public List<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	@GetMapping("/splitwise/user/{uid}")
	public Optional<User> getUser(@PathVariable int uid){
		return userService.getUser(uid);
	}
	
	@GetMapping("/splitwise/username/{uid}")
	public String getUserName(@PathVariable int uid){
		return userService.getUserName(uid);
	}
	
	@PostMapping("/splitwise/user")
	public User insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@DeleteMapping("/splitwise/user/{uid}")
	public void deleteUser(@PathVariable int uid) {
		userService.deleteUser(uid);
	}
	
	@PutMapping("/splitwise/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/splitwise/user-by-name/{userName}")
	public UserDetails getUserByUserName(@PathVariable String userName) {
		return userService.getUserByUserName(userName);
	}
}	
