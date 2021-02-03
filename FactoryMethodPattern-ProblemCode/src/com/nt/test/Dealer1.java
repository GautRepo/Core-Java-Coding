package com.nt.test;

import com.nt.tire.MachallineTire;
import com.nt.tire.Tire;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxoryCar;

public class Dealer1 {

	public static void main(String[] args) {
		System.out.println("Deals with luxary car");
		
		Car car = null;
		Tire tire = null;
		
		tire = new MachallineTire();
		car= new LuxoryCar(tire);
		System.out.println(car.roadTest());

	}

}
