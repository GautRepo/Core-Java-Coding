package com.java.practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("________________");
		for(int i =1; i<=10;i++) {
			System.out.println(a*i);
		}

	}

}
