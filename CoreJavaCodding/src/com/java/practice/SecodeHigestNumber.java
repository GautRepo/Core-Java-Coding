package com.java.practice;

import java.util.Arrays;

public class SecodeHigestNumber {

	public static void main(String[] args) {
		int[] arr = {10,25,65,1,25,63,41};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
	}

}
