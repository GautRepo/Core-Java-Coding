package com.nt.singltonTest;

import com.nt.sdp.Printers;

public class CloningSingletonTest {

	public static void main(String[] args) {
		
		Printers p1 = null;
		Printers p2 = null,p3 = null;
		
		
		p1=Printers.getInstance();
		
		try {
			p2=(Printers) p1.clone();
			p3=(Printers) p2.clone();
			System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
