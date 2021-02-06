package com.java.practice;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		
		int num =23146;
		int first=0;
		int last = num%10;
		
		while(num>=10) {
			first=num/10;
			num= num/10;
		}
		System.out.println("First::"+first+" Last::"+last+" sum::"+(first+last));

	}

}
