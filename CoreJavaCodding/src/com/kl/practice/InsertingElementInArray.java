package com.kl.practice;

import java.util.Scanner;

public class InsertingElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the value in array");
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the location");
		int l=sc.nextInt();
		System.out.println("Enter the value");
		int v=sc.nextInt();
		
		for(int i=arr.length;i<l;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[l]=v;
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
