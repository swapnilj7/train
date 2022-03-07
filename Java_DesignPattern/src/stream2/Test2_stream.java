package stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test2_stream {
public static void main(String[] args) {
	ArrayList<Employee> emplist = new ArrayList<Employee>();
	
	
	emplist.add(new Employee(11, "kalesh", 1, "active", 440000, 29, "male", 2012));
	emplist.add(new Employee(12, "kalpana", 2, "active", 460000, 29, "female", 2011));
	emplist.add(new Employee(13, "jidnesh", 3, "inactive", 340000, 35, "male", 2010));
	emplist.add(new Employee(14, "sarika", 2, "active", 410000, 29, "female", 2011));
	emplist.add(new Employee(15, "kalpesh", 1, "inactive", 400000, 30, "male", 2009));
	emplist.add(new Employee(16, "getta", 4, "active", 440000, 28, "female", 2013));
	emplist.add(new Employee(18, "raghu", 3, "active", 430000, 29, "male", 2013));
	emplist.add(new Employee(19, "mithul", 3, "active", 490000, 36, "male", 2015));
	
	// Query 1 : How many male and female employees are there in the organization?
	//Map<String,Long> collect = emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	//collect.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

	
	// Query 2 : Print the name of all departments/names of employee in the organization?
	//emplist.stream().map(e->e.getName()).distinct().collect(Collectors.toList()).forEach(System.out::println);

	//Query 3 : What is the average age of male and female employees?
	Map<String,Double> empavgage = emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
	empavgage.entrySet().forEach(e->System.out.println(e.getKey() +"-> "+e.getValue()));
	
	//Query 4 : Get the details of highest paid employee in the organization?
	Optional<Employee> max = emplist.stream().max(Comparator.comparing(Employee::getSalary));
	System.out.println(max.get().getName());
}
}
