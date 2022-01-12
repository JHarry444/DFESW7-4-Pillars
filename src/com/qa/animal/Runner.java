package com.qa.animal;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mammal m = new Mammal();
//		Mammal m2 = new Mammal(null, 0, 0, 0, 0);
//		Mammal m3 = new Mammal(null, 0, 0, 0, 0, false);
//		m.setNoOfLegs(12);
//		m.getNoOfLegs();
//		m.makeNoise();

		Cow bessie = new Cow("Bessie", 4, 60, 12, 140, true);

		Dog doggo = new Dog("Basil", 4, 3, 10, 10, true);

		doggo.fetch();

		List<Animal> animals = new ArrayList<>();

		animals.add(bessie);
		animals.add(doggo);
		animals.add(new Dog("Rex", 4, 24, 34, 65, true));

		for (Animal a : animals) {
			a.makeNoise();
			if (a instanceof Dog) {
				((Dog) a).fetch();
				Dog casted = (Dog) a;
				casted.fetch();
			}
		}

		Animal a = new Dog();

		Dog d = (Dog) a;
	}

}
