package com.java.practice;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int result = (num/2)*2;
		if(result == num )
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}

}
