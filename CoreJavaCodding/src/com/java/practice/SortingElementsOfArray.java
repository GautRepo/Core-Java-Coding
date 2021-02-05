package com.java.practice;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsOfArray {

	public static void main(String[] args) {
		String[] str = {"One","Two","Three","Four","Five"};
		
		System.out.println("Before sorting");
		
		for(String s : str) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Arrays.sort(str);
		System.out.println("Asc order sorting ");
		for(String s : str) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println("Desc order sorting ");
		for(String s : str) {
			System.out.print(s+" ");
		}
		
	}

}
