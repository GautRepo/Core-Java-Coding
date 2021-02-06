package com.java.practice;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n =sc.nextInt();
		int esum = n*(n+1)/2;
		int asum = 0;
		
		for(int a : arr ) {
			asum += a;
		}
		System.out.println(esum-asum);
		

	}

}
