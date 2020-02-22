package com.company.splitwise.group.bean;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Group {
	@Id
	private int gId;
	private List<Integer> expenseLog;
	private List<Integer> gMemberId;
	public Group(int gId, List<Integer> expenseLog, List<Integer> gMemberId) {
		super();
		this.gId = gId;
		this.expenseLog = expenseLog;
		this.gMemberId = gMemberId;
	}
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public List<Integer> getExpenseLog() {
		return expenseLog;
	}
	public void setExpenseLog(List<Integer> expenseLog) {
		this.expenseLog = expenseLog;
	}
	public List<Integer> getgMemberId() {
		return gMemberId;
	}
	public void setgMemberId(List<Integer> gMemberId) {
		this.gMemberId = gMemberId;
	}
}
