package stream2;

public class Employee {
private int id;
private String name;
private int deptid;
private String status;
private float salary;
private int age;
private String gender;
private int yearOfJoining;


public Employee(int id, String name, int deptid, String status, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.deptid = deptid;
	this.status = status;
	this.salary = salary;
}


public Employee(int id, String name, int deptid, String status, float salary, int age, String gender,
		int yearOfJoining) {
	super();
	this.id = id;
	this.name = name;
	this.deptid = deptid;
	this.status = status;
	this.salary = salary;
	this.age = age;
	this.gender = gender;
	this.yearOfJoining = yearOfJoining;
}


public int getAge() {
	return age;
}


public String getGender() {
	return gender;
}


public int getYearOfJoining() {
	return yearOfJoining;
}


public Employee() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", status=" + status + ", salary=" + salary
			+ "]";
}



}
