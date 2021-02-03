package com.kl.practice;

import java.util.Scanner;

public class NoOfVowelInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		str = str.toLowerCase();
		char[] ch =str.toCharArray();
		int count =0;
		for(char c : ch ) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			
			}
			
		}
		System.out.println("No of voweles are "+ count);
	}

}
