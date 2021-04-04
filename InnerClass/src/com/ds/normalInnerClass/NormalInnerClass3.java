package com.ds.normalInnerClass;

public class NormalInnerClass3 {

	class Inner3{
		public void m1() {
			System.out.println("inner class");
		}
	}
}

class Test{
	public static void main(String[] args) {
		NormalInnerClass3 nic = new NormalInnerClass3();
		NormalInnerClass3.Inner3 inner = nic.new Inner3();
		inner.m1();
		System.out.println("==============");
		
		new NormalInnerClass3().new Inner3().m1();
		
		
	}
}
