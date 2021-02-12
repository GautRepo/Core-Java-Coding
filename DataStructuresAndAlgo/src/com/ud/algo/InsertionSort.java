package com.ud.algo;

import java.util.stream.Stream;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] arr= {12,8,-15,20,-24};
		
		for(int i=1;i<arr.length;i++ ) {
			
			int dummy =arr[i];
			int j =0;
			
			for(j=i; j>0 && arr[j-1]>dummy; j--) {
					arr[j]=arr[j-1];
			}
			arr[j]=dummy;
		}
		Stream<Integer> streams = Stream.of(arr);
		streams.forEach(System.out::println);

	}

}
