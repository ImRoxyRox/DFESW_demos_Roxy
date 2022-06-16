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
	

		if (this.percentage < 60) {
			System.out.println("Sorry you failed");

		} else {
			System.out.println("Well done, you passed!");
		}
	}

}
