package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.vehicle.Car;

public class Dealer1 {

	public static void main(String[] args) {
		System.out.println("Deals with luxary car");
		
		Car car = CarFactory.getCarInstance("luxary");
		System.out.println(car.roadTest());

	}

}
