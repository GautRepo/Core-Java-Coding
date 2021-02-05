package com.java.practice;

import java.util.Stack;

public class CheckingString {

	public static void main(String[] args) {
		String str ="[{()}]";
		Stack<Character> st = new Stack<>();
		boolean flag =false;
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(st.isEmpty())
				st.add(ch);
			else if(ch=='[' || ch== '{' || ch== '(')
				st.add(ch);
			else if(ch==']' || ch== '}' || ch== ')') {
				if(st.peek()=='(' && ch==')' ) {
					flag =true;
					System.out.println(st.pop()+" "+ch);
				}
				if(st.peek()=='{' && ch=='}' ) {
					flag =true;
					System.out.println(st.pop()+" "+ch);
				}
				if(st.peek()=='[' && ch==']' ) {
					flag =true;
					System.out.println(st.pop()+" "+ch);
				}
				
			}
		}
		if(st.isEmpty()) {
			if(flag) {
			System.out.println("Well formed");
			}
		}
		else
			System.out.println("not well formed");
	

	}

}
