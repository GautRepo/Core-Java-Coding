package com.ds.lemda;

interface interf6{
	public void m1() ;
}

public class Test9 {
	int x =111;
	public void m2() {
		interf6 i = () ->{
			int x=222;
			System.out.println(this.x);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Test9 t = new Test9();
		t.m2();
	}

}
