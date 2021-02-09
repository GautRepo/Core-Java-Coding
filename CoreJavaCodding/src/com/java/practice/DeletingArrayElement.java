package com.java.practice;

import java.util.Scanner;

public class DeletingArrayElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int a =sc.nextInt();
		int[] arr1 = new int[arr.length-1];
		int k =0;
		for(int i=0;i<arr.length;i++) {
			if(i==a) {
				continue;
			}
				arr1[k++]=arr[i];
		}
		for(int i : arr1) {
			System.out.print(i+" ");
		}
	}

}
