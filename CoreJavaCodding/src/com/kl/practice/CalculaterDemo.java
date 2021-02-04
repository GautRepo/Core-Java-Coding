package com.kl.practice;

import java.util.Scanner;

public class CalculaterDemo {

	public static void main(String[] args) {
		
		System.out.println(cal(20,10));

	}
	
	public static Double cal(double a, double b) {
		Scanner sc = new Scanner(System.in);
		double result=0.0;
		System.out.println("Enter opration");
		char ch =sc.next().charAt(0);
		
		switch(ch) {
		case '+': 
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
			
		case '/':
			result = a/b;
			break;
		case '*':
			result = a*b;
		}
		
		
		return result;
	}

}
