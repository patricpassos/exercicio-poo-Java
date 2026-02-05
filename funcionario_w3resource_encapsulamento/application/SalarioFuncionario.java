package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Id: ");
		int id = sc.nextInt();
		System.out.print("Nome Funcionário: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(id, nome, salario);
		
		System.out.println("\nDetalhes do Funcionário");
		System.out.println("ID: " + funcionario.getId());
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario: " + funcionario.getSalario());
		
		System.out.print("Aumento salárial: ");
		int aumentoPercentual = sc.nextInt();
		funcionario.aumentoSalarial(aumentoPercentual);
		System.out.println("Novo Salário: " + funcionario.getSalario());
		
		sc.close();
		
	}

}
