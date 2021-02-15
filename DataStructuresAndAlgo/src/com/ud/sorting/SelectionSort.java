package com.ud.sorting;

import java.util.stream.Stream;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] arr= {12,8,-15,20,4};
		int min, temp;
		for(int i=0;i<arr.length;i++) {
			min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		Stream<Integer> stm = Stream.of(arr);
		stm.forEach(s->System.out.print(s+" "));
	}

}
