package com.kl.practice;

public class StockBuyAndShell {

	public static void main(String[] args) {
		int arr[]= {10,20,70,40,60};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]-min>max) {
				max=arr[i]-min;
				
			}
		}
		System.out.println(max);
		
	}

}
