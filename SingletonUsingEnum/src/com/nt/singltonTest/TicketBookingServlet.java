package com.nt.singltonTest;

import com.nt.sdp.Printers;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		
			Printers p = null;
			p = Printers.INSTANCE;
		
		System.out.println(p.hashCode() + " " + Thread.currentThread().getName());

	}

}
