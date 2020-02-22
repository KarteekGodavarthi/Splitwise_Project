package com.company.splitwise.expense.bean;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class Expense {
	@Id
	private int eId;
	private int gId;
	private String expenseName;
	private ArrayList<Integer> eMembers;
	private int expense;
	private int paidId;
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expense(int eId, int gId, String expenseName, ArrayList<Integer> eMembers, int expense, int paidId) {
		super();
		this.eId = eId;
		this.gId = gId;
		this.expenseName = expenseName;
		this.eMembers = eMembers;
		this.expense = expense;
		this.paidId = paidId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getExpenseName() {
		return expenseName;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public ArrayList<Integer> geteMembers() {
		return eMembers;
	}
	public void seteMembers(ArrayList<Integer> eMembers) {
		this.eMembers = eMembers;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getPaidId() {
		return paidId;
	}
	public void setPaidId(int paidId) {
		this.paidId = paidId;
	}

}
