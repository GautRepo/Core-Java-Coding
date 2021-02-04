package com.kl.practice;

public class FirstSameOccurenceInArray {

	public static void main(String[] args) {
	
		int a[]= {11,20,5,1,6,8,2,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					return;
				}
			}
		}

	}

}
