package com.java.practice;

public class PrintingArrAtEvenPosition {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
