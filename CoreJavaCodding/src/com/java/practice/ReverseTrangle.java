package com.java.practice;

public class ReverseTrangle {

	public static void main(String[] args) {
		int a =1;
		for(int i=1; i<=9;i++) {
			a=1;
			for(int j=9; j>=i;j--) {
				System.out.print(a);
				a++;
			}
			System.out.println();
			
		}

	}

}
