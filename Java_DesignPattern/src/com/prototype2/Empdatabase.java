package com.prototype2;

public class Empdatabase implements Cloneable{
public static void main(String[] args) throws CloneNotSupportedException {
	Employee emp = new Employee();
	emp.setCity("pune");
	emp.setMoNo(2132323);
	emp.setRole("Tester");
	emp.setContact(new Contact(23, "Akash"));
	
	Employee clone = emp.clone();
	clone.setContact(new Contact(22, "Mahesh"));
	
	System.out.println(emp);
	System.out.println(clone);
	
}
}
