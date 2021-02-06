package com.java.practice;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int num = 16;
		int i = 1;
		boolean flag= false;
		while(i<num) {
			if(i*i==num) {
				flag = true;
				break;
			}
			
			i++;
		}
		System.out.println(flag==true?"Perfect square":"not perfect square");

	}

}
