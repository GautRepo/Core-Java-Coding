package com.ds.normalInnerClass;

public class NormalInnerClass4 {
	
	int x =10;
	static int y =20; 
	
	class Test4{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		new NormalInnerClass4().new Test4().m1();

	}

}
