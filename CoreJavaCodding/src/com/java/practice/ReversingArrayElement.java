package com.java.practice;

public class ReversingArrayElement {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int min=0;
		int max=arr.length-1;
		/*while(min<max) {
			int dummy;
			dummy=arr[min];
			arr[min]=arr[max];
			arr[max]=dummy;
			min++;
			max--;
		}*/
		
		while(min<max) {
			arr[min]+=arr[max];
			arr[max]=arr[min]-arr[max];
			arr[min]=arr[min]-arr[max];
			min++;
			max--;
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
