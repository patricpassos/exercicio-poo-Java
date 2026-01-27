package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Troco;

public class ProgramTroco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Troco troco = new Troco();

		System.out.print("Preço unitário do produto: ");
		troco.precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		troco.quantidadeComprada = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		troco.dinheiroRecebido = sc.nextDouble();

		System.out.println(troco);

		sc.close();
	}

}
