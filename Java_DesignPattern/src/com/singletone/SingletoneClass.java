package com.singletone;

public class SingletoneClass {
	private static SingletoneClass singleinstance = new SingletoneClass();

	private SingletoneClass() {
		super();
		
	}
	
	
	public static SingletoneClass getInstance() {
		return singleinstance;
	}
	
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
	
}
