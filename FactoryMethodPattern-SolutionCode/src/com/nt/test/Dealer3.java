package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.vehicle.Car;

public class Dealer3 {

	public static void main(String[] args) {
		System.out.println("Deals with sports car");
		
		Car car = CarFactory.getCarInstance("sports");
		System.out.println(car.roadTest());

	}

}
