package com.singletone;

public class Test_Singletone {
	
public static void main(String[] args) {
	
	//SingletoneClass single= new SingletoneClass();
	/*
	 * SingletoneClass instance = SingletoneClass.getInstance();
	 * 
	 * SingletoneClass instance2 = SingletoneClass.getInstance();
	 * 
	 * System.out.println(instance.hashCode());
	 * System.out.println(instance2.hashCode());
	 * 
	 * SingletoneWithStaticInnerClass instance3 =
	 * SingletoneWithStaticInnerClass.getInstance(); SingletoneWithStaticInnerClass
	 * instance4 = SingletoneWithStaticInnerClass.getInstance();
	 * System.out.println(instance3.hashCode());
	 * System.out.println(instance4.hashCode());
	 */
	
	// test using Multithreading
//	
//	Thread t1 = new Thread(new Runnable() {
//		public void run() {
//			SingletoneWithStaticInnerClass instance2 = SingletoneWithStaticInnerClass.getInstance();
//			System.out.println(instance2.hashCode());
//		}
//	});
//	
//	Thread t2 = new Thread(new Runnable() {
//		public void run() {
//			SingletoneWithStaticInnerClass instance2 = SingletoneWithStaticInnerClass.getInstance();
//			System.out.println(instance2.hashCode());
//		}
//	});
//	
//	t1.start();
//	t2.start();
}
}
