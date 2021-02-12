package com.ud.algo;

import java.util.stream.Stream;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] arr= {12,8,-15,20,4};
		
		for(int i= arr.length-1; i>0;i--) {
			for(int j=0;j<i;j++) {
				sort(arr,i,j);
			}
			
		}
		Stream<Integer> stream = Stream.of(arr);
		//stream.sorted((i1,i2)-> i2.compareTo(i1)).forEach(System.out::println);
		stream.forEach(System.out::println);
		
	}
	
	public static void sort(Integer[] arr,int i, int j) {
		if(i==j) {
			return;
		}
		
		if(arr[i]<arr[j]) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

}
