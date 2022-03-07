package java8;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Get_Customer {

	public static void main(String[] args) {
		Customer customer=new Customer();
		List<Customer> getalldata = customer.getalldata();
		String memo="In this video, we are going to learn the whole  basics of multithreading programming using java. we ";
		
		
		getalldata.stream().map(data->data.getMobno()).forEach(System.out::println);
		getalldata.stream().map(data->data.getName()).forEach(System.out::println);
		List<Customer> collects = getalldata.stream().filter(data->data.getMobno().length()<=5).collect(Collectors.toList());
		System.out.println(collects);
		getalldata.stream().map(data->data.getName()).filter(n->n.length()<3).collect(Collectors.toList()).forEach(System.out::println);
	
	}
	
}
