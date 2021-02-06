package com.java.practice;

public class SumOfDigit {
	public static void main(String[] args) {
		int num = 45687;
		int sum = 0;
		while(num>0) {
			sum +=num%10;
			
			num =num/10;
		}
		System.out.println(sum);
	}

}
