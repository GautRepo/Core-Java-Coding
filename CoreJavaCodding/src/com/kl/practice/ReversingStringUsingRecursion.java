package com.kl.practice;

public class ReversingStringUsingRecursion {

	public static void main(String[] args) {
		String str ="Gautam";
		System.out.println(recursiveMethod(str));

	}
	
	public static String recursiveMethod(String s) {
		if(s==null || s=="") {
			return s;
		}
		return recursiveMethod(s.substring(1))+s.charAt(0);
	}

}
