package com.nt.test;

import com.nt.tire.MRFTire;
import com.nt.tire.Tire;
import com.nt.vehicle.Car;
import com.nt.vehicle.SportsCar;

public class Dealer3 {

	public static void main(String[] args) {
		System.out.println("Deals with sports car");
		
		Car car = null;
		Tire tire = null;
		
		tire = new MRFTire();
		car=new SportsCar(tire);
		System.out.println(car.roadTest());

	}

}
