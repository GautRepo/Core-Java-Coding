package com.nt.staticNested;

public class StaticNestedClass1 {
	
	static class Nasted1{
		public void m1() {
			System.out.println("Nested class");
		}
	}

	public static void main(String[] args) {
		Nasted1 n = new Nasted1();
		n.m1();

	}

}
