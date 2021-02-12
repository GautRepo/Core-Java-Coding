package com.ud.algo;

import java.util.stream.Stream;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] arr= {12,8,-15,20,4};
		
		for(int i= arr.length-1;i>0;i--) {
			int largest =0;
			for(int j=0;j<=i;j++) {
				if(arr[largest]<arr[j]) {
					largest=j;
				}
			}
			swap(arr,largest,i);
		}
		
		Stream<Integer> stream = Stream.of(arr);
		stream.forEach(System.out::println);

	}

	public static void swap(Integer[] arr, int largest, int i) {
		if(largest==i) {
			return;
		}
		if(arr[largest]>arr[i]) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
		}
		
	}

}
