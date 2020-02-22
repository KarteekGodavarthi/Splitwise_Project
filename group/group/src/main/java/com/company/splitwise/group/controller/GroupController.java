package com.company.splitwise.group.controller;

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

import com.company.splitwise.group.bean.Group;
import com.company.splitwise.group.service.GroupService;

@RestController
public class GroupController {
	@Autowired
	private GroupService groupService;
	
	@GetMapping("/splitwise/group")
	public List<Group> getAllGroups(){
		return groupService.getAllGroups();
	}
	
	@GetMapping("/splitwise/group/{gId}")
	public Optional<Group> getGroup(@PathVariable int gId){
		return groupService.getGroup(gId);
	}
	
	@PostMapping("/splitwise/group")
	public Group insertGroup(@RequestBody Group group) {
		return groupService.insertGroup(group);
	}
	
	@DeleteMapping("/splitwise/group/{gId}")
	public void deleteGroup(@PathVariable int gId) {
		groupService.deleteGroup(gId);
	}
	
	@PutMapping("/splitwise/group")
	public Group updateGroup(@RequestBody Group group) {
		return groupService.updateGroup(group);
	}
	
	@PutMapping("/splitwise/group_addExpense/{gId}/{eId}")
	public Group addExpense(@PathVariable int gId,@PathVariable int eId) {
		return groupService.addExpense(gId, eId);
	}
	
	@PutMapping("/splitwise/group_addGMember/{gId}/{eId}")
	public Group addGMember(@PathVariable int gId,@PathVariable int gMemberId) {
		return groupService.addExpense(gId, gMemberId);
	}
	
	
	
}
