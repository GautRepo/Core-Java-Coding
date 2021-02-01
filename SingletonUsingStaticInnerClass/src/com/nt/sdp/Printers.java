package com.nt.sdp;

import com.nt.singltonTest.Utility;

public class Printers extends Utility{
	
	private static boolean flag = false;
	
	private Printers() {
		if(flag) {
			throw new IllegalArgumentException("Reflection api not supported");
		}
		flag =true;
		System.out.println("Printers.Printers()");
	}
	
	public static Printers getInstance() {
		return PrinterHolder.INSTANCE;
	}
	
	//static inner class
	private static class PrinterHolder{
		private static Printers INSTANCE= new Printers();
	}
	
	//b method
	public void priterData(String data) {
		System.out.println(data);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Clonning not allowed");
	}
	
	public Object readResolve() {
		throw new IllegalArgumentException("Deserialization not allowed");
	}

}
