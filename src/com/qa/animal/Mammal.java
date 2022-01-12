package com.qa.animal;

public abstract class Mammal extends Animal {
	
	private boolean hasFur;

	public Mammal() {
		 super();
	}

	public Mammal(String name, int noOfLegs, int age, int height, int weight) {
		super(name, noOfLegs, age, height, weight);
	}
	
	public Mammal(String name, int noOfLegs, int age, int height, int weight, boolean hasFur) {
		super(name, noOfLegs, age, height, weight);
		this.setHasFur(hasFur);
	}

	public boolean isHasFur() {
		return this.hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	

}
