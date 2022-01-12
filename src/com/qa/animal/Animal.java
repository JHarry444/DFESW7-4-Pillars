package com.qa.animal;

public abstract class Animal extends Object {

	private String name;
	private int noOfLegs;
	private int age;
	private int height;
	private int weight;
	
	public Animal() {
		super();
	}

	public Animal(String name, int noOfLegs, int age, int height, int weight) {
		super();
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public abstract void makeNoise();
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		if (noOfLegs > 0 && noOfLegs < 1001) {
			this.noOfLegs = noOfLegs;
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
