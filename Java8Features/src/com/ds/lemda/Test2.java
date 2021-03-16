package com.ds.lemda;

interface interf2 {
	public void add(int a, int b);
}

public class Test2 {
	
	public static void main(String[] args) {
		interf2 i =(a,b)-> System.out.println(a+b);
		i.add(10, 20);
	}

}
