package com.qa.animal;

public class Dog extends Mammal {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int noOfLegs, int age, int height, int weight) {
		super(name, noOfLegs, age, height, weight);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int noOfLegs, int age, int height, int weight, boolean hasFur) {
		super(name, noOfLegs, age, height, weight, hasFur);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void makeNoise() {
		System.out.println("bark");
	}
	
	public void fetch() {
		System.out.println("Good boi");
	}

}
