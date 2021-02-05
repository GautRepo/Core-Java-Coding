package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReversingMapElement {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("banana", "banana");
		map.put("apple", "apple");
		map.put("guava", "guava");
		
		for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("________________________________________");
		Map<String,String> treemap = new TreeMap<>(map);
		
		for(Map.Entry<String, String> m : treemap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
