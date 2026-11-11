package application;

import java.util.Locale;

import entities.StudentEn;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try {
			StudentEn student01 = new StudentEn();
			student01.setName("Isaac Del Toro");
			student01.setId(1);
			student01.addGrades(5.8);
			student01.addGrades(8.7);
			student01.addGrades(6.1);
			student01.addGrades(4.8);
			System.out.println(student01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		StudentEn student02 = new StudentEn();
		student02.setName("Remco Evenepoel");
		student02.setId(2);
		
		System.out.println(student02);
		
		
		//Escreva um programa em Java onde a classe "Student" impeça a atribuição de um nome de aluno vazio.
		//Escreva um programa em Java onde a classe "Student" valide se o student_id segue um formato específico.
		//Escreva um programa em Java onde a classe "Student" restrinja as notas a um intervalo de 0 a 100.
		//Escreva um programa em Java onde a classe "Aluno" calcule a média das notas.


	}

}
