package com.company.splitwise.group.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.stereotype.Service;

import com.company.splitwise.group.bean.Group;
import com.company.splitwise.group.repo.GroupRepository;

@Service
public class GroupService{
	@Autowired
	private GroupRepository groupRepository;
	
	public Optional<Group> getGroup(int gId) {
		return groupRepository.findById(gId);
	}
	
	public Group insertGroup(Group group) {
		return groupRepository.insert(group);
	}
	
	public Group updateGroup(Group group) {
		return groupRepository.save(group);
	}
	
	public void deleteGroup(int gId) {
		groupRepository.deleteById(gId);
	}
	
	public List<Group> getAllGroups(){
		return groupRepository.findAll();
	}
	
	public Group addExpense(int gid,int eid) {
		Optional<Group> group=this.getGroup(gid);
		Group group1=group.get();
		List<Integer> expenseLog=group1.getExpenseLog();
		expenseLog.add(eid);
		group1.setExpenseLog(expenseLog);
		return this.updateGroup(group1);
	}
	public Group addGMember(int gid,int GmemberId) {
		Optional<Group> group=this.getGroup(gid);
		Group group1=group.get();
		List<Integer> gMemberId=group1.getgMemberId();
		gMemberId.add(GmemberId);
		group1.setgMemberId(gMemberId);
		return this.updateGroup(group1);
	}
}
