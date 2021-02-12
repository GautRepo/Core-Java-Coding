package com.ds.MethodRefrence;

public class MethRefTest {
	
	public static void m2() {
		System.out.println("MethRefTest.m2()");
	}

	public static void main(String[] args) {
		
		Interf i = MethRefTest::m2;
		i.m1();
		
		
	}

}
