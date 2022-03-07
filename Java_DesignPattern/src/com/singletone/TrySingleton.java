package com.singletone;

import java.util.Iterator;

public class TrySingleton {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				TestSingletone t1 = TestSingletone.getInstance();
				System.out.println(t1.hashCode());
			}

		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				TestSingletone t1 = TestSingletone.getInstance();
				System.out.println(t1.hashCode());
			}

		});
		
		t1.start();
		t2.start();
		
		
		
		//TestSingletone t2 = TestSingletone.getInstance();

		//System.out.println(t1.hashCode());
		//System.out.println(t2.hashCode());
	}

}

class TestSingletone {

	private static TestSingletone ts;

	private TestSingletone() {

	}

	public static synchronized TestSingletone getInstance() {
		if(ts==null) {
		ts= new TestSingletone();
		}
		return ts;
	}

}
