package com.java.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstLogestString {

	public static void main(String[] args) {
		String str ="abcdeabcdef";
		String longest="";
		String dummy="";
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(set.contains(str.charAt(i))) {
				set.clear();
				dummy="";
				
			}
			set.add(str.charAt(i));
			dummy=dummy+str.charAt(i);
			
			if(dummy.length()>longest.length()) {
				longest=dummy;
			}
		}
		System.out.println(longest);
	}

}
