package application;

import entities.Student;

public class Exercicio04 {

	public static void main(String[] args) {

		Student student01 = new Student();
		System.out.println(student01);

		Student student02 = new Student(101, "Jose", 12, 5.5, 7.8, 6.0, 7.5);
		
		student02.addClassFrequency('v');
		student02.addClassFrequency('v');
		student02.addClassFrequency('v');
		student02.addClassFrequency('f');
		student02.addClassFrequency('f');
		
		student02.updateStatus();
		student02.Gpa();

		System.out.println("\nStudent02");
		System.out.println(student02);

		Student student03 = new Student(105, "Draconia", 15, 8.5, 7.8, 9.5, 8.2);

		student03.addClassFrequency('v');
		student03.addClassFrequency('v');
		student03.addClassFrequency('v');
		student03.addClassFrequency('v');
		student03.addClassFrequency('v');
		
		student03.updateStatus();
		student03.Gpa();

		System.out.println("\nStudent03");
		System.out.println(student03);
		
		
		System.out.println("\nCompare GPA: " + ((student02.hasSameGpa(student03) ? "YES" : "NO")));

		// Escreva um programa em Java onde a classe "Aluno" registre a frequência e calcule a porcentagem de frequência.
		// Escreva um programa em Java onde a classe "Aluno" possua um método para determinar se o aluno foi aprovado com base em suas notas.
		// Escreva um programa em Java onde a classe "Aluno" inclua um método para comparar as médias ponderadas acumuladas (GPA) de dois alunos.
		// Escreva um programa em Java onde a classe "Aluno" implemente um método para atribuir alunos a diferentes níveis de escolaridade.

	}

}
