package com.opentext.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
	private String name;
	
	@Autowired
	private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void doSomething() {
		animal.eat();
		animal.makesound();
		
	}
}
