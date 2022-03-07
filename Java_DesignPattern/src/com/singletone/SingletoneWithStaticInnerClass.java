package com.singletone;

public class SingletoneWithStaticInnerClass {

	
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Lazy_singletoneinner instance2 = Lazy_singletoneinner.getInstance();
				System.out.println(instance2.hashCode());
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Lazy_singletoneinner instance2 = Lazy_singletoneinner.getInstance();
				System.out.println(instance2.hashCode());
			}
		});
		t1.start();
		t2.start();
		
		
		//Test_lazy_Singletone instance1 = Test_lazy_Singletone.getInstance();
		//Test_lazy_Singletone instance2 = Test_lazy_Singletone.getInstance();
		//System.out.println(instance1.hashCode());
		//System.out.println(instance2.hashCode());SingletoneWithStaticInnerClass
	}




}



class Lazy_singletoneinner {
private Lazy_singletoneinner() {
	// TODO Auto-generated constructor stub
}
	
	private static class innerclass{
		private static final Lazy_singletoneinner inclass = new Lazy_singletoneinner(); 
	}

	public static Lazy_singletoneinner getInstance() {
		return innerclass.inclass;
	}

}