package br.com.animal.animal;

public class Animal {
	
	//Atributos
	
	private String idade;
	private String peso;
	private String grupo;
	
	//CONSTRUTOR
	
	
	public Animal(String idade, String peso, String grupo) {
		this.idade = idade;
		this.peso = peso;
		this.grupo = grupo;
	}
	
	//AÇÕES
	
	public void idade() {
		System.out.println("Tenho " + idade);
	}
	public void peso() {
		System.out.println("Estou pesando " + peso );
	}
	public void grupo() {
		System.out.println("Faço parte do grupo " + grupo );
	}

}
