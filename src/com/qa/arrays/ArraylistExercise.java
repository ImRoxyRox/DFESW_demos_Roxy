package com.qa.arrays;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class ArraylistExercise {

	public static void main(String[] args) {
	ArrayList<String> animals= new ArrayList<String>();
	
	animals.add("Dog");
	animals.add("Cat");
	animals.add("Bird");
	animals.add("Lion");
	animals.add("Tiger");

//	System.out.println(animals.get(4));	
//		
//	animals.set(2, "Leopard");
//	
//	animals.remove(0);
//	
//	System.out.println(animals);
//	
//	System.out.println(animals.size());
//	
//	for (int i = 0; i < animals.size(); i++) 
//		System.out.println(animals.get(i));
		
// 		alphabetical order
		Collections.sort(animals);

		for (String i : animals) {
			System.out.println(i);
		}
	}
}
