package com.ds.MethodRefrence;

public class MultiThreadUsingMethRef {
	
	public void m1() {
		int i =0;
		while(i<10) {
			System.out.println("Dummy thread");
			i++;
		}
	}

	public static void main(String[] args) {
		
		MultiThreadUsingMethRef mt = new MultiThreadUsingMethRef();
		Runnable r = mt :: m1;
		Thread t = new Thread(r);
		t.start();
		
		int i =0;
		while(i<10) {
			System.out.println("Main thread");
			i++;
		}
		
		
	}

}
