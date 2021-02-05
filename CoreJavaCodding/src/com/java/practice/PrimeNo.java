package com.java.practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		boolean flag=true;
		for(int i=2; i<a;i++) {
			if(a%i==0)
				flag=false;
			
		}
		
		if(flag)
			System.out.println("prime no");
		else
			System.out.println("not prime no");

	}

}
