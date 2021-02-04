package com.kl.practice;

import java.util.Scanner;

public class InsertingValInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter the index");
		int a = sc.nextInt();
		System.out.println("Enter the value");
		int val = sc.nextInt();
		
		int arr[]= {5,10,20,14,0};
		
		for(int v : arr) {
			System.out.print(v+" ");
		}
		for(int i=arr.length-1;i>a;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[a]=val;
		System.out.println();
		for(int v : arr) {
			System.out.print(v+" ");
		}
		

	}

}
