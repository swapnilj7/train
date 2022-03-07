package java8;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String mobno;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobno=" + mobno + "]";
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	
	public Customer(int id, String name, String mobno) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
	}
	
	
	
	public Customer() {
		super();
	}
	public List<Customer> getalldata(){
		return List.of(
				new Customer(1, "swapnil", "554854853215"),
				new Customer(2, "akash", "54853215"),
				new Customer(3, "mahesh", "53215"),
				new Customer(4, "ut", "54656214564654853215")
				);
	}
	

}
