package br.com.animal.main;

import br.com.animal.animal.Animal;

public class Program {

	public static void main(String[] args) {
	
		Animal animal01 = new Animal("60", "70 kgs", "Mamiferos");
		
		animal01.idade();
		animal01.peso();
		animal01.grupo();
		
		

	}

}
