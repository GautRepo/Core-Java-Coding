package com.kl.practice;

public enum AreaAndCircumference {
	INSTANCE;
	private static final float pi=3.14f;
	
	public Float getArea(float radius) {
		return pi*radius*radius;
	}
	
	public Float getCircumference(float radius) {
		return 2*pi*radius;
	}
	
	public static void main(String[] args) {
		AreaAndCircumference p=AreaAndCircumference.INSTANCE;
		System.out.println(p.getArea(7));
		System.out.println(p.getCircumference(7));
	}

}