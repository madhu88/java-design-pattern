package com.designpatterns.creational.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees emps1 = (Employees) emps.clone();
		emps1.getEmpList().add("Rohan");
		
		Employees emps3 = (Employees) emps.clone();
		emps3.getEmpList().remove("Raj");
		
		System.out.println("Emps = " + emps.getEmpList());
		System.out.println("Emps1 = " + emps1.getEmpList());
		System.out.println("Emps3 = " + emps3.getEmpList());
		System.out.println("Emps = " + emps.getEmpList());
	}

}
