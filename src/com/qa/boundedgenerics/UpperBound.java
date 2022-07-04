package com.qa.boundedgenerics;

import java.util.List;

public class UpperBound<T extends Flowers> {

	private List<T> flower;

	public void add(List<T> flower) {
		this.flower = flower;
	}

	public List<T> get() {
		return flower;
	}

}
