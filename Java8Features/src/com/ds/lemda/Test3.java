package com.ds.lemda;

interface interf3{
	public int getLen(String s);
}

public class Test3 {
	
	public static void main(String[] args) {
		interf3 i = s -> s.length();
		
		System.out.println(i.getLen("gautam"));
	}

}
