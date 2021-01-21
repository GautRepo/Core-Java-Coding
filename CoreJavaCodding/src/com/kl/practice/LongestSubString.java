package com.kl.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String test ="abcdbcdabcd";
		
		String result ="";
		String dummy="";
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<test.length();i++) {
			char c =test.charAt(i);
			
			if(set.contains(c)) {
				dummy="";
				set.clear();
			}
			set.add(c);
			dummy+=c;
			
			if(dummy.length()>result.length())
				result=dummy;
			
		}
		System.out.println(result);
	}

}
