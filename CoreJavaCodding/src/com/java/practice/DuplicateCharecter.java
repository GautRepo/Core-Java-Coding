package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharecter {

	public static void main(String[] args) {
		String str = "Gautammm";
		char[] ch =str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		for(Map.Entry<Character,Integer> m: map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}

	}

}
