package com.nt.methodLocal;

public class MethodLocalInnerClass1 {
	
	public void m1() {
		class MLInner{
			public void sum(int a, int b) {
				System.out.println(a+b);
			}
		}
		
		MLInner inner = new MLInner();
		inner.sum(10, 20);
		inner.sum(40, 60);
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass1 ml = new MethodLocalInnerClass1();
		ml.m1();
	}

}
