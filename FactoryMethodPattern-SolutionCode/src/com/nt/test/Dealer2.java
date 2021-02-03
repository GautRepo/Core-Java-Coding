package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.vehicle.Car;

public class Dealer2 {

	public static void main(String[] args) {
		System.out.println("Deals with regular car");
		
		Car car = CarFactory.getCarInstance("regular");
		System.out.println(car.roadTest());

	}

}
