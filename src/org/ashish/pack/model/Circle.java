package org.ashish.pack.model;

import org.ashish.pack.aspect.Loggable;

public class Circle {
	
	private String name;
	@Loggable
	public String getName() {
		System.out.println("Inside getter of circle");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
