package application;

import java.time.LocalDate;
import java.util.Locale;

import entities.EmployeeEn;

public class ExercicioEncapsulamento04 {

	public static void main(String[] args) {
		
		//ENGINEERING,
		//MAINTENANCE,
		//QUALITY,
		//ADMINISTRATION;
		
		Locale.setDefault(Locale.US);
		
		try {
			EmployeeEn emp01 = new EmployeeEn(01, "Carlos", 2000.0, "engineering", LocalDate.of(2018, 3, 15));
			System.out.println(emp01);
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			EmployeeEn emp02 = new EmployeeEn(02, "Jose", 1800.0, "MAINTENANCE", LocalDate.of(2025, 9, 9));
			emp02.salaryIncreasePercentage(20.0);
			System.out.println(emp02);
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		//Escreva um programa em Java onde a classe "Employee" impeça que um salário seja definido abaixo do salário mínimo.
		//Escreva um programa em Java onde a classe "Employee" permita aumentos salariais, mas não reduções.
		//Escreva um programa em Java onde a classe "Funcionário" inclua um método para determinar os anos de serviço.
		//Escreva um programa em Java onde a classe "Funcionário" permita atribuir um departamento apenas com valores predefinidos.

	}

}
