package com.nt.methodLocal;

public class MethodLocalInnerClass2 {
 int x =10;
	static int y=20; 
	
	public static void m1() {
		class MLInner2{
			public void pri() {
				System.out.println(new MethodLocalInnerClass2().x);
				System.out.println(y);
			}
		}
		
		MLInner2 inner = new MLInner2();
		inner.pri();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass2 test= new MethodLocalInnerClass2();
		test.m1();
		
	}

}
