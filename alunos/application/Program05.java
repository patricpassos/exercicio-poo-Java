package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.nome = sc.nextLine();
		student.notaPrimeiroTrimestre = sc.nextDouble();
		student.notaSegundoTrimestre = sc.nextDouble();
		student.notaTerceiroTrimestre = sc.nextDouble();

		double notaFinal = student.notaFinal();
		double notaFaltante = student.notaFaltante();

		System.out.printf("NOTA FINAL = %.2f\n", notaFinal);
		if (notaFinal >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("FALTARAM = %.2f PONTOS", notaFaltante);
		}

		sc.close();

	}

}
