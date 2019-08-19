package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> pEmpList) {
		this.empList = pEmpList;
	}
	
	//this method is like loading data from a database
	public void loadData() {
		empList.add("Raj");
		empList.add("John");
		empList.add("Jay");
		empList.add("Gandhi");		
	}
	
	public List<String> getEmpList() {
		return this.empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tmpEmpList = new ArrayList<String>();
		for (String name: this.empList) {
			tmpEmpList.add(name);
		}
		return new Employees(tmpEmpList);
	}
}
