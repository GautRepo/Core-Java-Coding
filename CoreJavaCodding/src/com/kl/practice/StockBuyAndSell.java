package com.kl.practice;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[] stockPrice= {10,20,50,40};
		int min = Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		
		for(int i : stockPrice) {
			if(i<min)
				min=i;
			if(i-min>max)
				max=i-min;
		}
		System.out.println("Max profit "+ max);

	}

}
