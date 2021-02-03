package com.nt.test;

import com.nt.tire.ApploTire;
import com.nt.tire.MachallineTire;
import com.nt.tire.Tire;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;
import com.nt.vehicle.RegularCar;

public class Dealer2 {

	public static void main(String[] args) {
		System.out.println("Deals with regular car");
		
		Car car = null;
		Tire tire = null;
		
		tire = new ApploTire();
		car=new RegularCar(tire);
		System.out.println(car.roadTest());

	}

}
