package com.java.practice;

import java.util.HashSet;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String str = "Gautam";
		char ch[] = str.toCharArray();
		int count =0;
		
		for(char c : ch) {
			String dummy = str.replace(String.valueOf(c), "");
			count =(str.length()-dummy.length());
			System.out.println(c +" "+count);
		}

	}

}
