package com.nt.sdp;

import com.nt.singltonTest.Utility;

public class Printers extends Utility {

	private static final long serialVersionUID = 346L;
	private static Printers INSTANCE;
	private static boolean flag= false;

	private Printers() {
		System.out.println("Printer.Printer()");
		if(flag) {
			throw new IllegalAccessError("Reflection Api not allowed");
		}
		flag=true;
	}

	public static Printers getInstance() {

		if (INSTANCE == null) {
			synchronized (Printers.class) {
				if (INSTANCE == null)
					INSTANCE = new Printers();
			}
		}
		return INSTANCE;
	}

	// b.Method

	public void priterData(String data) {
		System.out.println(data);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("clone not supported");
	}

	/*@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return INSTANCE;
	}*/

	/*public Object readResolve() {
		System.out.println("Printers.readResolve()");
		return INSTANCE;
	}
	*/

	public Object readResolve() {
		System.out.println("Printers.readResolve()");
		return new IllegalArgumentException("clone not supported exception");
	}
}
