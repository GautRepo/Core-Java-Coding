package com.nt.anonymous;

public class Anonymus1 {
	
	public static void main(String[] args) {
		IAno ano = new IAno()
		{
			@Override
			public void test() {
				
				System.out.println("salty");
			}
		};
		ano.test();
		System.out.println(ano.getClass().getName());
	}

}

class IAno{
	public void test() {
		System.out.println("spicy");
	}
}


