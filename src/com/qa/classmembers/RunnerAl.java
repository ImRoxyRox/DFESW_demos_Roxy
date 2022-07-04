package com.qa.classmembers;

public class RunnerAl {

		public static void main(String[] args) {
			System.out.println("Number of cars: " + CarAl.numOfCarsCreated);
			
			CarAl myCar = new CarAl("Skoda", "Octavia", 5, false);
			CarAl bmwM4 = new CarAl("BMW", "M4", 3, true);
			CarAl merc = new CarAl("Mercedes", "A5", 5, false);
			CarAl nissan = new CarAl("nissan", "skyline", 3, true);

			myCar.drive();
			bmwM4.drive();
			merc.drive();
			nissan.drive();
			
			System.out.println("Number of cars: " + CarAl.numOfCarsCreated);
			
		}
	}