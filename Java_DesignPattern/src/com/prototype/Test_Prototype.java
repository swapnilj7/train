package com.prototype;

public class Test_Prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Shop s1 =new Shop();
		s1.setShopName("crossworld");
		s1.load_Book();
		
		
		
		s1.getBooks().remove(5);
		Shop s2 = s1.clone();
		s1.getBooks().remove(2);
		s2.setShopName("pragati");
		s2.setOwner("xyz");
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
