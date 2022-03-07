package stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test_Stream {

	public static <E> void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		
		
		list.add(new Employee(1, "Akash", 1, "active", 25000));
		list.add(new Employee(2, "Prakash", 2, "active", 35000));
		list.add(new Employee(3, "Nitesh", 1, "active", 30000));
		list.add(new Employee(4, "tejas", 3, "inactive", 25000));
		list.add(new Employee(5, "rahul", 2, "inactive", 54000));
		list.add(new Employee(6, "Nikhil", 3, "active", 45000));
		list.add(new Employee(7, "mitil", 4, "active", 51000));		
		
		
		//get number of employees in each department
		Map<Integer,List<Employee>> emplist = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptid, Collectors.toList()));
		
		emplist.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		//get list of inactive Employee
		list.stream().filter(e->!e.getStatus().equals("active"))
		.collect(Collectors.toList()).forEach(n->System.out.println(n.getName()));
		
		//get count of inactive Employee	
		long count = list.stream().filter(e->!e.getStatus().equals("active")).count();
		
		//get employee having max salary 
		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Employee having max salary=>"+max);
		
		//get employee having min salary 
		Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Employee having min salary=>"+min);
		
				
				
		
		//get number of employees in each department
		Map<Integer,Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.counting()));
		System.out.println("Employee in each department-->");
		collect.entrySet().forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));
		
		//find max salary in each department
		Map<Integer, Optional<Employee>> salaryByDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptid,Collectors
						.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println("Max salary in each department");
		salaryByDept.entrySet().forEach(e->System.out.println("department ["+e.getKey()+"] have max salary"+e.getValue()));
	}
}
