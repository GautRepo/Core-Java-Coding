package com.ds.normalInnerClass;

public class NormalInnerClass2 {
	
	class Inner2{
		public void m1() {
			System.out.println("inner class");
		}
	}
	
	public void m2() {
		Inner2 inner = new Inner2();
		inner.m1();
	}

	public static void main(String[] args) {
		
		NormalInnerClass2 nic = new NormalInnerClass2();
		nic.m2();
	}

}
