package com.opentext.annotationautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.opentext.annotation.Animal;
import com.opentext.annotation.Pet;
import com.opentext.annotation.PetConfig;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
    	Pet pet=context.getBean(Pet.class);
    	
    	pet.setName("tommy");
    	System.out.println(pet.getName());
    	
    	
    	pet.doSomething();
    	
    }
}
