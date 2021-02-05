package com.java.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = "Gautam";
		char[] ch =str.toCharArray();
		StringBuffer sf = new StringBuffer();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : ch) {
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		
		System.out.println(str);
		System.out.println(sf.toString());
		

	}

}
