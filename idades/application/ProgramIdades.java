package application;

import java.util.Locale;
import java.util.Scanner;

import util.Media;

public class ProgramIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nome01 = sc.nextLine();
		System.out.print("Idade: ");
		double idade01 = sc.nextInt();
		sc.nextLine();

		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		String nome02 = sc.nextLine();
		System.out.print("Idade: ");
		double idade02 = sc.nextInt();

		double media = Media.mediaIdade(idade01, idade02);

		System.out.printf("A idade média de %s e %s é de %.1f anos", nome01, nome02, media);

		sc.close();

	}

}
