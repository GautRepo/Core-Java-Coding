package com.nt.vehicle;

import com.nt.tire.Tire;

public class LuxoryCar implements Car {
	
	private Tire tire;

	public LuxoryCar(Tire tire) {
		
		this.tire = tire;
	}



	@Override
	public String roadTest() {
		
		return "Driving Luxary car "+ tire.info();
	}

}
