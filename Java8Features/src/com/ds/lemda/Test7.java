package com.ds.lemda;

public class Test7 {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {
			for(int i =0;i<10;i++) {
				System.out.println("hi");
			}
		});
		
		t.start();
		for(int i =0; i<10;i++) {
			System.out.println("hello");
		}
		

	}

}
