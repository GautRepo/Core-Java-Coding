package com.java.practice;

import java.util.Arrays;

public class SortCharacter {

	public static void main(String[] args) {
		
		String s ="purushottam";
		char[] ch =s.toCharArray();
		Arrays.sort(ch);
		String str=new String(ch);
		
		System.out.println(str);

	}

}
