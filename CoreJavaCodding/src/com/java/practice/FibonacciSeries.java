package com.java.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a =0;
		int b=1;
		int sum =0;
		int i=0;
		
		while (i<10) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}
		

	}

}
