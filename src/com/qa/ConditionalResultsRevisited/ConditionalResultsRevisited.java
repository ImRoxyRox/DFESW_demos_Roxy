//so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
package com.qa.ConditionalResultsRevisited;

public class ConditionalResultsRevisited {

	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;

	public ConditionalResultsRevisited(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
	}

	public void methodOne() {
		System.out.println("Physics:   " + this.physics);
		System.out.println("Chemistry: " + this.chemistry);
		System.out.println("Biology:   " + this.biology);
		System.out.println("Total:     " + this.total);
		System.out.println();
	}

	public void methodTwo() {
		this.percentage = (total * 100) / 450;
		int physicst =  (this.physics * 100) / 150;
		int chemistryt =  (this.chemistry * 100) / 150;
		int biologyt =  (this.biology * 100) / 150;
				
		System.out.println("Percentage: " + this.percentage + "%");
		
		if (physicst >= 60 && chemistryt >= 60 && biologyt >= 60) {
			System.out.println("WEll done, you passed!");
			
		} else {
			System.out.println("Sorry you failed!");
		}

	}

}
