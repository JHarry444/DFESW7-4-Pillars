package com.qa.pub;

public class Person extends Object {

	// attributes
	private String name;

	private int age;

	private String jobTitle;

	public Person() {

	}

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	// behaviours
	public void introduce() {
		System.out.println("Hello, my name is " + name + " I am " + age + " years old and I am a " + jobTitle);
	}

	public String introduce(String intro) {
		System.out.println(intro);
		return intro;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age < 125) {
			this.age = age;
		} else {
			System.out.println("Error: Invalid age - " + age);
		}
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Hello, my name is " + name + " I am " + age + " years old and I am a " + jobTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.jobTitle == null) ? 0 : this.jobTitle.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.age != other.age)
			return false;
		if (this.jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!this.jobTitle.equals(other.jobTitle))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;
	}
	
	

}
