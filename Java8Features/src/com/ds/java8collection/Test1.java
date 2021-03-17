package com.ds.java8collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(50);
		list.add(5);
		list.add(2);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,(i1,i2) -> i2.compareTo(i1));
		System.out.println(list);

	}

}
