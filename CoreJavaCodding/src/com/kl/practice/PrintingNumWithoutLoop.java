package com.kl.practice;

public class PrintingNumWithoutLoop {

	public static void main(String[] args) {
		
		printnum(1);

	}
	
	public static void printnum(int num) {
		if(num <= 10) {
			System.out.println(num);
			printnum(num+1);
		}
		
	}

}
