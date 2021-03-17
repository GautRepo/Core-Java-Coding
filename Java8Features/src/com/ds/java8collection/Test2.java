package com.ds.java8collection;

import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>((i1,i2) -> i2.compareTo(i1));
		ts.add(1);
		ts.add(50);
		ts.add(5);
		ts.add(2);
		
		System.out.println(ts);
		
		

	}

}
