package com.java.practice;

public class AnagramUsingStringBuffer {

	public static void main(String[] args) {
		
		String str="Java";
		String test="avja";
		
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer(test);
		boolean flag = false;
		
		for(char c : ch) {
			int index=sb.indexOf(String.valueOf(c));
			
			if(index>=0)
				flag = true;
			else
				flag = false;
			
		}
		if(str.length()!=test.length())
			flag =false;
		
		System.out.println(flag==true?"Is an anagram":"Not an Anagram");
		

	}

}
