package com.qa.FlowOfControl;

public class FlowOfControl {
	
	public static void methodOne() {
		System.out.println("Line 1");
	}
	public static void methodTwo() {
		System.out.println("Line 2");
	}
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		System.out.println("Line 3");
	}
}
