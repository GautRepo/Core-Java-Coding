package com.java.practice;

import java.util.Scanner;

public class NevenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number");
		int a = sc.nextInt();
		int count =0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("Total even number "+count);

	}

}
