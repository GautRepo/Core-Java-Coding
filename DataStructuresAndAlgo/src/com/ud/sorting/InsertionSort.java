package com.ud.sorting;

import java.util.stream.Stream;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] arr= {12,8,-15,20,-24};
		
		//Stream.of(arr).sorted((i1,i2)-> i1.compareTo(i2)).forEach(a->System.out.print(a+" "));
		int temp;
		
		for(int i =1;i<arr.length;i++) {
			temp =arr[i];
			int j = i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
			
		}
		Stream.of(arr).forEach(a->System.out.print(a+" "));
	}

}
