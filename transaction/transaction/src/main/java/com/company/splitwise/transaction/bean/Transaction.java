package com.company.splitwise.transaction.bean;

import org.springframework.data.annotation.Id;

public class Transaction {
	@Id
	private int tId;
	private String fromUser;
	private String toUser;
	private int gId;
	private int eId;
	private int amount;
	private String comment;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Transaction(int tId, String fromUser, String toUser, int gId, int eId, int amount, String comment) {
		super();
		this.tId = tId;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.gId = gId;
		this.eId = eId;
		this.amount = amount;
		this.comment = comment;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transaction [tId=" + tId + ", fromUser=" + fromUser + ", toUser=" + toUser + ", gId=" + gId + ", eId="
				+ eId + ", amount=" + amount + ", comment=" + comment + "]";
	}
	
	
}
