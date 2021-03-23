package com.ds.test;

import java.util.ArrayList;
import java.util.List;

public class GenericComunicaton {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("g");
		list.add("k");
		
		m1(list);
		System.out.println(list);

	}

	public static void m1(List list) {
		
		list.add("a");
		list.add(10);
	}

}
