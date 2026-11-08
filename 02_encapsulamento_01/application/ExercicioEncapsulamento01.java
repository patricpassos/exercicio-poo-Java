package application;

import entities.Person;

public class ExercicioEncapsulamento01 {

	public static void main(String[] args) {
		
		try {
			Person person01 = new Person();
			
			person01.setName("Jonas Vingegaard");
			person01.setAge(29);
			person01.setCountry("Denmark");
			
			System.out.println(person01);
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Person person02 = new Person();
			person02.setName("Mario Cesar");
			person02.setAge(15);
			person02.setCountry("Colombia");
			System.out.println(person02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Person person02 = new Person();
			System.out.println(person02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		try {
			Person person03 = new Person();
			person03.setName("");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Person person04 = new Person();
			person04.setName(null);
			person04.setAge(17);
			person04.setCountry("Brazil");
			person04.addNationality("Spain");
			person04.addNationality("Italy");
			System.out.println(person04);
		} catch (IllegalArgumentException e) {
			System.err.println();
		}

	}

	// Escreva um programa em Java onde a classe "Pessoa" inclua um método para validar se a idade é superior a 18 anos.
	// Escreva um programa em Java onde a classe "Pessoa" adicione um método para exibir o nome completo em letras maiúsculas.
	// Escreva um programa em Java onde a classe "Pessoa" restrinja a atribuição de um nome vazio.
	// Escreva um programa em Java onde a classe "Pessoa" registre mudanças de nacionalidade em uma lista de histórico.
}
