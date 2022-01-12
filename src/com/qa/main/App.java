package com.qa.main;

import com.qa.pub.Person;

public class App {

	public static void main(String[] args) {
//		Person jh = new Person();
//		jh.age = 27;
//		jh.name = "Jordan";
//		jh.jobTitle = "Trainer";
		Person jh = new Person("Jordan", 27, "Trainer");
		jh.setAge(Integer.MIN_VALUE);
//		jh.introduce();

		Person cg = new Person("Cammy", 26, "Trainer");

//		cg.introduce();

		PersonManager manager = new PersonManager();
		manager.addPerson(jh);
		manager.addPerson(cg);
		manager.addPerson(new Person("Morgan", 22, "Trainer"));

		manager.printPeople();
		System.out.println();
		Person found = manager.findByName("Jordan");
		found.introduce();
		manager.findByName("Morgan").introduce();

		Person blank = new Person();
		blank.introduce();
//		int i;
//		System.out.println(i);
		System.out.println();

		System.out.println(jh);

		System.out.println(cg);
		System.out.println();
		System.out.println("Hello".toString());
		System.out.println(new Integer(12).toString());
		
		Object o = new Person("Morgan", 12, "Trainer");
		
		Integer i = 12; // java converts literal to Integer object - "autoboxing"
		
		Object[] objects = {new Person("Jordan B", 25, "Trainer"), 12};
		
		System.out.println(objects[1].getClass().getSimpleName());
		
		System.out.println(1 + 1 == 2);
		
		System.out.println(new Person("Jordan", 27, "Trainer") == new Person("Jordan", 27, "Trainer"));
		System.out.println(jh == jh);
		System.out.println(new Person("Jordan", 27, "Trainer").equals(new Person("Jordan", 27, "Trainer")));
		
		System.out.println("jh" == "jh");
		System.out.println(new String("jh") == new String("jh"));
		
	}

}
