package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pagamento;

public class ProgramPagamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pagamento pagamento = new Pagamento();

		System.out.print("Nome: ");
		pagamento.nome = sc.nextLine();
		System.out.print("Valor por horas: ");
		pagamento.precoHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		pagamento.horasTrabalhadas = sc.nextInt();

		System.out.println(pagamento);

		sc.close();

	}

}
