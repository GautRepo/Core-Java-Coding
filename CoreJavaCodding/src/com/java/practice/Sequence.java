package com.java.practice;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in)
		 System.out.println("enter");
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            test(a,b,n);
	        }
	        
	        in.close();

	}

	private static void test(int a, int b, int n) {
		int sum =0;
		for(int i=1;i<n;i++) {
			sum = sum +a+i*b;
			System.out.print(sum + " ");
			
		}
		
	}

}
