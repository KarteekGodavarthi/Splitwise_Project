package com.example.zuul.netflixzuulapigateway.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserProxy userProxy;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		ObjectMapper mapper=new ObjectMapper();
		
		com.example.zuul.netflixzuulapigateway.bean.UserDetails userDetails=mapper.convertValue(userProxy.getUserName(username).getBody(),com.example.zuul.netflixzuulapigateway.bean.UserDetails.class);
		System.out.println(userDetails.getUserName());
		System.out.println(userDetails.getPassword());
		return new User(userDetails.getUserName(), userDetails.getPassword(), new ArrayList<>() );
	}	

	
}
