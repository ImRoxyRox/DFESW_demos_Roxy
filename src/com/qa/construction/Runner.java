package com.qa.construction;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person nico = new Person("Nico", "married", 43, "dark");
		
		Person javier = new Person("Javier", "married", "dark");
				
		System.out.println(nico.name);
		System.out.println(nico.status);
		System.out.println(nico.age);
		System.out.println(nico.hairColour);
		System.out.println();
		System.out.println(javier.name);
		System.out.println(javier.status);
		System.out.println(javier.hairColour);
	}

}
