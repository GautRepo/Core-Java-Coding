package com.nt.singltonTest;

import com.nt.sdp.Printers;

public class Test1 {

	public static void main(String[] args) {
		
		Printers p1 = Printers.INSTANCE;
		Printers p2 = Printers.INSTANCE;
		System.out.println(p1==p2);
		
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		
		p1.priterData("Hello");
		p2.priterData("hi");
	}

	

}
