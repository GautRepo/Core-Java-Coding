package com.java.practice;

import java.util.Scanner;

public class NoOfCharOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word/sentence");
		String dummy=sc.nextLine();
		
		System.out.println("Enter the letter/word");
		String test=sc.next();
		
		int a= dummy.length();
		dummy=dummy.replace(test, "");
		int b=dummy.length();
		System.out.println("no. of occurrence of "+test +" is "+(a-b));
		
	}

}
