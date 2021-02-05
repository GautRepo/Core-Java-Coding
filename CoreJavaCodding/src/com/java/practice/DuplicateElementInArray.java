package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,15}; 
		
		Set<Integer> set= new HashSet<>();
		
		for(int a : arr) {
			set.add(a);
		}
		
		System.out.println(arr.length==set.size()?"do not have duplicate":"do have dublicate");

	}

}
