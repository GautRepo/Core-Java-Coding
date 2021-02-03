package com.kl.practice;

import java.util.Scanner;

public class ReversingTheWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str = sc.nextLine();
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
