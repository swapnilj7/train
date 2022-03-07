package com.builder_Pattern1;

public class Test_Builder {
public static void main(String[] args) {
	Phone p1= new Phone().setCpu("octa core").setMemory(2).getPhone();
	
	
	
	System.out.println(p1);
}
}
