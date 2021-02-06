package com.java.practice;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = n*(n+1)/2;
		System.out.println(sum);
		

	}

}
