package com.synechron.javatraining.variables;

public class Employee {

	String empName;
	String empID;
	String empEmail;
	
	static String company = "Synechron";
	
	static final String CEO = "AAAA";
	
	public static void main(String[] args) {
		System.out.println(company);
		
		Employee e1 = new Employee();
		e1.empName = "Employee-1";
		e1.empID = "Emp123";
		e1.empEmail = "emp1@synechron.com";
		e1.company = "XYZ";
		//e1.CEO = "Rahul";
		Employee e2 = new Employee();
		e2.empName = "Employee-2";
		e2.empID = "Emp456";
		e2.empEmail = "emp2@synechron.com";
	
		
		System.out.println(e1.empName);
		System.out.println(e1.empID);
		System.out.println(e1.empEmail);
		System.out.println(Employee.company);
		
		System.out.println(e2.empName);
		System.out.println(e2.empID);
		System.out.println(e2.empEmail);
		System.out.println(e2.company);
		
	}
}
