package com.kl.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		String dummy="";
		
		for(int i=str.length()-1;i>=0;i--) {
			dummy += str.charAt(i);
		}
		
		
		System.out.println(str.equals(dummy)?"Palindrum":"Not Palindrum");

	}

}
