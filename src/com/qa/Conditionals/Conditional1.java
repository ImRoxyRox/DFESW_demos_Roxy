package com.qa.Conditionals;

public class Conditional1 {
	// Add
	public void exercisePlus(int numOne, int numTwo) {
		System.out.println(numOne + numTwo);
	}

	// Multiply
	public void exerciseTimes(int numOne, int numTwo) {
		System.out.println(numOne * numTwo);
	}

	// Subtract
	public void exerciseMinus(int numOne, int numTwo) {
		System.out.println(numOne - numTwo);
	}

	// Divide always use double instead of int for deci
	public void exercisesDivide(double numOne, double numTwo) {

		if (numOne < numTwo) {
			System.out.println(numOne / numTwo);

		} else {
			System.out.println("Division cannot be performed");
		}

	}
}