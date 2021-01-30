package com.nt.sdp;

import com.nt.singltonTest.ForCloning;

public class Printers extends ForCloning {

	private static Printers INSTANCE;

	private Printers() {
		System.out.println("Printer.Printer()");
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

}
