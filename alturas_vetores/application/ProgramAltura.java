package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//import entities.Cadastro;
import services.Operacao;

public class ProgramAltura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();

		Operacao vetor = new Operacao(n);

		for (int i = 0; i < vetor.tamanhoVetor(); i++) {
			System.out.printf("Dados da %d° pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.print("Data de cadastro (DD/MM/AAAA): ");
			String dataTexto = sc.next();
			LocalDate data = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			vetor.setElemento(i, nome, idade, altura, data);
		}
		
		System.out.println(vetor);

		sc.close();

	}

}
