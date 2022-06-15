package com.qa.construction;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person roxy = new Person("Roxy", "single", 49, "dark");
		
		Person lory = new Person("Lory", "widow", "blond");
				
		System.out.println(roxy.name);
		System.out.println(roxy.status);
		System.out.println(roxy.age);
		System.out.println(roxy.hairColour);
		System.out.println();
		System.out.println(lory.name);
		System.out.println(lory.status);
		System.out.println(lory.hairColour);
	}

}
