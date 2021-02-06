package com.java.practice;

public class EvenAndOddDigits {

	public static void main(String[] args) {
		int num = 354512;
		int ecount=0;
		int ocount=0;
		
		int dummy=0;
		while(num>0) {
			dummy= num%10;
			if(dummy%2==0) {
				ecount++;
			}else
				ocount++;
			num = num/10;
			
		}
		System.out.println("even number count::"+ecount+" odd number count::"+ocount );

	}

}
