package com.java.practice;

import java.util.Stack;

public class ReversingArrayElementUsingStack {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Stack<Integer> stack = new Stack<>();
		
		for(int i : arr) {
			stack.push(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=stack.pop();
		}
		
		for(int i :arr) {
			System.out.print(i+" ");
		}

	}

}
