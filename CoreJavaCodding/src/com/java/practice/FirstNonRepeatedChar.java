package com.java.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str ="abcfabcae";
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : ch) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non repeated character is "+entry.getKey());
				return;
			}
		}
			

	}

}
