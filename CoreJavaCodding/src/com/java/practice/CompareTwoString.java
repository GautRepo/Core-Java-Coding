package com.java.practice;

public class CompareTwoString {

	public static void main(String[] args) {
		String a ="Gautam";
		String b ="Gautam";
		/*int flag=Arrays.compare(a.toCharArray(), b.toCharArray());
		
		System.out.println(flag);*/
		boolean flag = false;
		if(a.length()!=b.length()) {
			flag=false;
		}else {
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)==b.charAt(i)){
					flag=true;
				}else
					flag = false;
			}
		}
		System.out.println(flag==true? "String are equals":"String are not equals");
	}

}
