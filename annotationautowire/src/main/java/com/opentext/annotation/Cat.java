package com.opentext.annotation;

public class Cat implements Animal{

	@Override
	public void eat() {
System.out.println("cat eats fish food");		
	}

	@Override
	public void makesound() {
System.out.println("cat usually meows");		
	}

}
