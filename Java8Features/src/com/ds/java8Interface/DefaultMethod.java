package com.ds.java8Interface;


interface A{
	public default void m1() {
		System.out.println("A.m1()");
	}
}
interface B{
	public default void m1() {
		System.out.println("B.m1()");
	}
}

public class DefaultMethod implements A,B{

	public static void main(String[] args) {
		
		DefaultMethod dm = new DefaultMethod();
		dm.m1();

	}

	public void m1() {
		B.super.m1();
	}

}
