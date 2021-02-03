package com.nt.vehicle;

import com.nt.tire.Tire;

public class RegularCar implements Car {
	
	private Tire tire;

	public RegularCar(Tire tire) {
		
		this.tire = tire;
	}



	@Override
	public String roadTest() {
		
		return "Driving Regular car "+ tire.info();
	}

}
