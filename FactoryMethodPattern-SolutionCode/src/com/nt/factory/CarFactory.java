package com.nt.factory;

import com.nt.tire.ApploTire;
import com.nt.tire.MRFTire;
import com.nt.tire.MachallineTire;
import com.nt.tire.Tire;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.RegularCar;
import com.nt.vehicle.SportsCar;

public class CarFactory {
	
	public static Car getCarInstance(String type) {
		Tire tire =  null;
		Car car = null;
		
		if(type.equalsIgnoreCase(CarType.CAR_REGULAR)) {
			tire = new ApploTire();
			car = new RegularCar(tire);
			return car;
		}
		else if(type.equalsIgnoreCase(CarType.CAR_SUPORTS)) {
			tire = new MRFTire();
			car = new SportsCar(tire);
			return car ;
						
		}
		else if(type.equalsIgnoreCase(CarType.CAR_LUXARY)) {
			tire = new MachallineTire();
			car = new LuxoryCar(tire);
			return car;
		}else 
			 throw new  IllegalArgumentException("Invalid key");
		
		
	}

	
}
