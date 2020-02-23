package com.company.splitwise.expense.bean;

import java.util.ArrayList;
import java.util.List;

public class SplitObject {
	private List<String> string;

	public List<String> getString() {
		return string;
	}

	public void setString(List<String> string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "SplitObject [string=" + string + "]";
	}

	public SplitObject() {
		this.string=new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	
	public void addString(String str) {
		string.add(str);
	}
	
	
}
