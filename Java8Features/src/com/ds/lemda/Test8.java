package com.ds.lemda;

interface interf{
	public void m1();
}

public class Test8 {
	
	int x =111;
	
	public void m2() {
		interf i = new interf() {
			int x =222;
			
			public void m1() {
				System.out.println(this.x);
			}
			
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Test8 test = new Test8();
		test.m2();
	}

}
