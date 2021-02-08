package com.java.practice;

import java.util.Scanner;

public class AscciValueOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char value");
		char ch = sc.next().charAt(0);
		int a = ch;
		System.out.println("Ascii value of "+ch +" is "+ a);

	}

}
