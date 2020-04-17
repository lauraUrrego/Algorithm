package com.ejemplos;

public class Gato extends Animal {

	public static void testClassMethod() {
		System.out.println("the static method in Gato");
	}
	
	public void testInstanceMethod() {
		System.out.println("the instance method in Gato");
	}
	
	public static void main(String[] args) {
		Gato miGato = new Gato();
		Animal miAnimal = miGato;
		
		Animal.testClassMethod();
		miAnimal.testInstanceMethod();
		Gato.testClassMethod();
	}

	
}
