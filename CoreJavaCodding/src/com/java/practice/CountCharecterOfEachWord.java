package com.java.practice;

public class CountCharecterOfEachWord {

	public static void main(String[] args) {
		String sent= "Hi I am Gautam";
		String[] arr= sent.split(" ");
		
		for(String s : arr) {
			System.out.println(s+"----> "+s.length());
		}

	}

}
