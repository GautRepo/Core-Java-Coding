package com.nt.methodLocal;

public class MethodLocalInnerClass3 {
	
	public void m1() {
		int a =10;
		
		class MLinner3{
			public void acc() {
				System.out.println(a);		// a should be final
			}
			
		}
		MLinner3 ml = new MLinner3();
		ml.acc();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass3 test = new MethodLocalInnerClass3();
		test.m1();
	}

}
