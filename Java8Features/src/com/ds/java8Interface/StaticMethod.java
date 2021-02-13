package com.ds.java8Interface;

interface Left{
	public static void m1() {
		System.out.println("Left.m1()");
	}
}

public class StaticMethod implements Left{

	public static void main(String[] args) {
		Left.m1();                 //only way to call static method of interface
		/*m1();
		StaticMethod.m1()
		*/		
	}
	
	/*public static void m1() {
		
	}*/

}
