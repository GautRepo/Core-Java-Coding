package com.nt.vehicle;

import com.nt.tire.Tire;

public class SportsCar implements Car {
	
	private Tire tire;

	public SportsCar(Tire tire) {
		
		this.tire = tire;
	}



	@Override
	public String roadTest() {
		
		return "Driving Sports car "+ tire.info();
	}

}
