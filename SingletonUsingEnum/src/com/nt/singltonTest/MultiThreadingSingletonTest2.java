package com.nt.singltonTest;

public class MultiThreadingSingletonTest2 {

	public static void main(String[] args) {
		
		TicketBookingServlet servlet = null;
		Thread t1 = null;
		Thread t2= null;
		
		servlet = new TicketBookingServlet();
		t1=new Thread(servlet);
		t2= new Thread(servlet);
		
		t1.start();
		t2.start();
		
		
		

	}

}
