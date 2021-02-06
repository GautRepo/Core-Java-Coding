package com.java.practice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();int b =sc.nextInt();int c =sc.nextInt();
		//System.out.println(Integer.max((Integer.max(a, b)),c));
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c)
			System.out.println(b);
		else
			System.out.println(c);

	}

}
