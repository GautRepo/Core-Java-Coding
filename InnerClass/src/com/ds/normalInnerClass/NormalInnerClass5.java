package com.ds.normalInnerClass;

public class NormalInnerClass5 {
	
	int x =10;
	
	class Test5{
		int x =100;
		
		public void m1() {
			int x =1000;
			System.out.println(x);
			System.out.println(this.x); //or
			System.out.println(Test5.this.x);
			System.out.println(NormalInnerClass5.this.x);
		}
		
	}
	public static void main(String[] args) {
		new NormalInnerClass5().new Test5().m1();

	}

}
