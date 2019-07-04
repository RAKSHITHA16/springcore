package com.opentext.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		return new Pet();
		
	}
	
	@Bean
	public Animal getAnimal() {
		return new Dog();
	}

}
