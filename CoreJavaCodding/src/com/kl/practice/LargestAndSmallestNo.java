package com.kl.practice;

public class LargestAndSmallestNo {

	public static void main(String[] args) {
		int arr[]= {10,15,20,5,40,45,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int a :arr) {
			if(a<min) {
				min =a;
			}else if(a>max) {
				max=a;
			}
		}
		System.out.println("min::"+min+" max::"+max);

	}

}
