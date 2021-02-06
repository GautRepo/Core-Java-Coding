package com.java.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "abcde";
		String test ="eabd";
		
		char[] str1 = str.toCharArray();
		char[] test1 = test.toCharArray();
		
		if(str1.length!= test1.length)
			System.out.println("Not an anagram");
		
		Arrays.sort(str1);
		Arrays.sort(test1);
		
		if(Arrays.equals(str1, test1))
			System.out.println("is An anagram");
	}

}
