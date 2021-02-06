package com.java.practice;

public class ReversingNumber {

	public static void main(String[] args) {
		
		int num = 1234;
		String snum =String.valueOf(num);
		String test="";
		  for(int i=snum.length()-1;i>=0;i--) {
			  test = test+snum.charAt(i);
		  }
		  int a = Integer.parseInt(test);
		  System.out.println(a);

	}

}
