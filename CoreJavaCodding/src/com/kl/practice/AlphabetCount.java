package com.kl.practice;

import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen= sc.nextLine();
		System.out.println("Enter the char to be count");
		char ch = sc.next().charAt(0);
		String st = sen.replace(String.valueOf(ch), "");
		
		System.out.println((sen.length()-st.length()));

	}

}
