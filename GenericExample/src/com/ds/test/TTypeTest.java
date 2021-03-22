package com.ds.test;




class Gen<T extends Number & Runnable & Comparable >{
	
	T obj;
	
	public Gen(T obj) {
		this.obj = obj;
	}
	
	public void show() {
		System.out.println(obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
	
}

public class TTypeTest {

	public static void main(String[] args) {
		
		/*Gen<String> gen = new Gen<>("Gautam");
		
		gen.show();
		System.out.println(gen.getObj());
		*/	
	}

}
