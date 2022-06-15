package com.qa.Scope;

public class Scope {
	public static String message = "Hello";
	
	public static void methodOne() {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		methodOne();
		System.out.println(message);
	}

}