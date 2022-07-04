package com.qa.boundedgenerics;

import java.util.List;

public class LowerBound {

	private List<? super Elephant> list;

	public void add(List<? super Elephant> list) {
		this.list = list;
	}

	public List<? super Elephant> get() {
		return list;
	}
}
