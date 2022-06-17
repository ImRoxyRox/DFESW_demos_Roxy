//the message that is displayed varies depending on the number of subjects that they have failed.
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
				
		System.out.println("Percentage: " + this.percentage + "%");
		
		if (physics < 90 && chemistry < 90 && biology < 90) {
			System.out.println("Sorry, you failed 3 subjects!");
			
		} else if (physics > 90 && chemistry < 90 && biology < 90) {
			System.out.println("Sorry you failed 2 subjects!");
			
		} else if (physics < 90 && chemistry < 90 && biology > 90) {
			System.out.println("Sorry you failed 2 subjects!");

		} else if (physics > 90 && chemistry > 90 && biology < 90) {
			System.out.println("Sorry you failed 1 subjects!");
			
		} else if (physics < 90 && chemistry > 90 && biology > 90) {
			System.out.println("Sorry you failed 1 subjects!");
			
		} else if (physics > 90 && chemistry < 90 && biology > 90) {
			System.out.println("Sorry you failed 1 subjects!");
			
		} else {
			System.out.println("Well done, you passed!");
		}

	}

}
