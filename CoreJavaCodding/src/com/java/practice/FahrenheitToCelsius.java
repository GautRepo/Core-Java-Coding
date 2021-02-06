package com.java.practice;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fahrenheit temp");
		float f= sc.nextFloat();
		float c = ((f-32)*5)/9;
		System.out.println("Temp in degree celsius::"+c);
	}

}
