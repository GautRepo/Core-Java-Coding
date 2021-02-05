package com.java.practice;

import java.util.Scanner;

public class AddingArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i=0;
		int sum =0;
		while(i<size) {
			System.out.println("Enter array element");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			i++;
		}
		System.out.println("Array sum::"+sum);
		for(int a : arr) {
			System.out.print(a+" ");
		}
				

	}

}
