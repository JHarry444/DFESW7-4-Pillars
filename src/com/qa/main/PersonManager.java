package com.qa.main;

import java.util.ArrayList;
import java.util.List;

import com.qa.pub.Person;

public class PersonManager {

	private int i; // 0
	private Person p; // null

	private List<Person> people = new ArrayList<>();

	public void addPerson(Person p) {
		this.people.add(p);
	}

	public void printPeople() {
//		Old equivalent
//		for (int i = 0; i < this.people.size(); i++) {
//			Person p = this.people.get(i);
//			p.introduce();
//		}
		for (Person p : this.people) {
			p.introduce();
		}
	}

	public Person findByName(String name) {
		for (Person p : this.people) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

//	less good due to potentially breaking due to the person class changing
//	public void addPerson(String name, int age, String jobTitle) {
//		this.people.add(new Person(name, age, jobTitle));
//	}

}
