package com.java.practice;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a +" ");
		}
		
	}

}
