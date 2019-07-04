package com.opentext.annotation;

public class Dog implements Animal {

	@Override
	public void eat() {
System.out.println("dog eats pedigree");		
	}

	@Override
	public void makesound() {
System.out.println("dogs usually bark");		
	}

}
