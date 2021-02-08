package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class PrintingDuplicateElement {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,1,23,4,2};
		Set<Integer> set = new HashSet<>();
		for(int a : arr) {
			if(set.contains(a)) {
				System.out.println(a);
			}else
				set.add(a);
		}

	}

}
