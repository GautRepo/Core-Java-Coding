package com.kl.practice;

public class NumberOfDigits {

	public static void main(String[] args) {

		int num=45645;
		/*int count =0;
		
		while(num!=0) {
			num = num /10;
			count++;
		}
		System.out.println(count);
		*/
		
		System.out.println(digiCount(num));
		System.out.println(String.valueOf(num).length());
	}
	
	public static int digiCount(int num) {
		
		if(num==0)
			return 0;
		return 1+digiCount(num/10);
	}

}
