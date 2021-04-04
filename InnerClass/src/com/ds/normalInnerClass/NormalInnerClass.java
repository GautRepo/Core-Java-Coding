package com.ds.normalInnerClass;

public class NormalInnerClass {
	
	class Inner{
		public void m1() {
			System.out.println("Inner class");
		}
	}

	public static void main(String[] args) {
		
		NormalInnerClass nic = new NormalInnerClass();
		NormalInnerClass.Inner  inner = nic.new Inner();
		inner.m1();
		System.out.println("____________________");
		new NormalInnerClass().new Inner().m1();
	}

}
