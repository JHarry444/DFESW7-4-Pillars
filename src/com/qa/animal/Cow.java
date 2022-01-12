package com.qa.animal;

public class Cow extends Mammal {

	public Cow(String name, int noOfLegs, int age, int height, int weight, boolean hasFur) {
		super(name, noOfLegs, age, height, weight, hasFur);
	}

	@Override
	public void makeNoise() {
		System.out.println("Mooo");
	}

}
