package com.prototype2;

public class Employee implements Cloneable{
private long moNo;
private String role;
private String city;
private Contact contact;
public Employee(long moNo, String role, String city, Contact contact) {
	super();
	this.moNo = moNo;
	this.role = role;
	this.city = city;
	this.contact = contact;
}
public Employee() {
	super();
}
public long getMoNo() {
	return moNo;
}
public void setMoNo(long moNo) {
	this.moNo = moNo;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Employee [moNo=" + moNo + ", role=" + role + ", city=" + city + ", contact=" + contact + "]";
}
@Override
protected Employee clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Employee employee =(Employee) super.clone();
	employee.contact=(Contact) contact.clone();
	
	return employee;
} 





}
