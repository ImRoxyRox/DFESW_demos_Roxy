package com.qa.datatypes;

public class DataType {

  public static void main(String[] args) {
	System.out.println(firstMethod());
	System.out.println(secondMethod());
	System.out.println(thirdMethod());
	System.out.println(fourthMethod());
	System.out.println(fifthMethod());
	System.out.println(sixtMethod());
	seventhMethod(); //	this is void, it won't print
  }

  public static int firstMethod() {
    return 0;
  }
  public static boolean secondMethod() {
    return true;
  }
  public static char thirdMethod() {
    return 'P';
  }
  public static long fourthMethod() {
    return 52L;
  }
  public static float fifthMethod() {
    return 0.6f;
  }
  public static String sixtMethod() {
    return "Hi there";
  }
  public static void seventhMethod() {
    System.out.println("Void");	
  }
}
