package com.java.practice;

import java.math.BigInteger;

public class FactorialOfBigNum {

	public static void main(String[] args) {
		int num =20;
		BigInteger fact= BigInteger.ONE;
		
		for(int i =1; i<=num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);

	}

}
