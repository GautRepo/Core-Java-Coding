package com.ds.java8collection;

import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>((i1,i2) -> i2.compareTo(i1));
		tm.put(15, "a");
		tm.put(5, "k");
		tm.put(7, "x");
		tm.put(2, "p");
		
		System.out.println(tm);

	}

}
