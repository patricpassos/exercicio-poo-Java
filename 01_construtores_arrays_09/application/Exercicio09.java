package application;

import entities.Classroom;

public class Exercicio09 {
	
	public static void searchStudent(Classroom classRoom, String name) {
		boolean search = classRoom.hasStudents(name);
		if(search) {
			System.out.println("Student " + name + " found\n");
		} else {
			System.out.println("Student " + name + " not found\n");
		}
	}

	public static void main(String[] args) {
		
		try {
			String[] studentArray = {"Paulo", "Ruslan", "Martin", "Andrine"};
			Classroom classroom01 = new Classroom("Science 101", studentArray);
			
			System.out.println(classroom01);
			searchStudent(classroom01, "Martin");
			
			String[] studentArray02 = {"Fernando", "Maria", "Caio", "Alberto"};
			Classroom classroom02 = new Classroom("Mathematics 105", studentArray02);
   
			classroom02.addStudent("Mario");
			System.out.println(classroom02);
			searchStudent(classroom02, "Mario");
			
			String[] studentArrays03 = {"Jonas Vingegaard"};
			Classroom classroom03 = new Classroom("Bike mechanics 1105", studentArrays03);
			
			classroom03.addStudent("Tadej Pogačar");
			classroom03.addStudent("Wout van Aert");
			classroom03.addStudent("Remco Evenepoel");
			classroom03.removeStudent("Remco Evenepoel");
			classroom03.addStudent("Filippo Ganna");
			System.out.println(classroom03);
			
			String[] studentArrays04 = {"Jose", "Nascimento"};
			Classroom classroom04 = new Classroom("History", studentArrays04);
			System.out.println();
			classroom04.addStudent("Abner");
			classroom04.removeStudent("Jose");
			
			System.out.println(classroom04);
			searchStudent(classroom04, "Nascimento");
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		//Escreva um programa em Java onde a classe "Classroom" suporte a adição e remoção dinâmica de alunos.
		//Escreva um programa em Java onde a classe "Classroom" registre o número total de alunos matriculados.
		//Escreva um programa em Java onde a classe "Classroom" implemente um método para encontrar um aluno pelo nome.
		//Escreva um programa em Java onde a classe "Classroom" suporte a ordenação alfabética dos alunos.


	}

}
