package com.singletone;



public class Lazy_singletone {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				SingletoneWithStaticInnerClass1 instance2 = SingletoneWithStaticInnerClass1.getInstance();
				System.out.println(instance2.hashCode());
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				SingletoneWithStaticInnerClass1 instance2 = SingletoneWithStaticInnerClass1.getInstance();
				System.out.println(instance2.hashCode());
			}
		});
		t1.start();
		t2.start();
		
		
//		Test_lazy_Singletone instance1 = Test_lazy_Singletone.getInstance();
//		Test_lazy_Singletone instance2 = Test_lazy_Singletone.getInstance();
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
	}

}

class SingletoneWithStaticInnerClass1 {


private SingletoneWithStaticInnerClass1() {
	// TODO Auto-generated constructor stub
}


private static class innerclass{
	private static final SingletoneWithStaticInnerClass1 inclass = new SingletoneWithStaticInnerClass1(); 
}

public static SingletoneWithStaticInnerClass1 getInstance() {
	return innerclass.inclass;
}
}




class Test_lazy_Singletone{
	private static Test_lazy_Singletone tls;
	//private static Test_lazy_Singletone tls1= new Test_lazy_Singletone();
	
	private Test_lazy_Singletone() {
		
	}
	
	
	public static synchronized Test_lazy_Singletone getInstance() {
		if(tls==null) {
		tls= new Test_lazy_Singletone();
		}
	return tls;
	}
	
}