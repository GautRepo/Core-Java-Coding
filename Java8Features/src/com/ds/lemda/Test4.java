package com.ds.lemda;

interface interf4{
	
	public int square(int a);
}

public class Test4 {
	
	public static void main(String[] args) {
		
		interf4 i = a-> a*a;
		
		System.out.println(i.square(4));
	}

}
