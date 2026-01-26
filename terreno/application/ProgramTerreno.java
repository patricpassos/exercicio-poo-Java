package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class ProgramTerreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculo calculo = new Calculo();
		
		System.out.print("Digite a largura do terreno: ");
		calculo.largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		calculo.comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		calculo.preco = sc.nextDouble();
		
		double areaTerreno = calculo.areaDoTerreno();
		double precoTerreno = calculo.precoTerreno();
		
		System.out.printf("Área do terreno = %.2f\n", areaTerreno);
		System.out.printf("Preço do terreno = %.2f", precoTerreno);
		
		sc.close();

	}

}
