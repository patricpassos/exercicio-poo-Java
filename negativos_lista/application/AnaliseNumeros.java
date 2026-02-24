package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Numero;

public class AnaliseNumeros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Numero> list = new ArrayList<>();
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			Integer elemento = sc.nextInt();
			list.add(new Numero(elemento)); //Instanciação dos dados
		}
		
		int somaNumerosPositivo = Numero.somaPositivo(list);
		double mediaNumeroPositivo = Numero.mediaPositivos(list);
		int contagemNumeroPar = Numero.contagemPares(list);
		Numero maiorValor = Numero.maiorValor(list);
		int posicaoMaiorValor = Numero.posicaoMaiorValor(list);
		double mediaPositivoPares = Numero.mediaPositivosPares(list);
		
		
		System.out.println("\nLISTA GERAL DOS NUMEROS");
		Numero.listaNumero(list);
		
		System.out.println("\nNÚMEROS NEGATIVOS");
		Numero.listaNegativos(list);
		System.out.println("\nNÚMEROS PARES");
		Numero.listaPares(list);
		System.out.println("\n------------------------------------------");
		
		System.out.print("\nRESULTADOS");
		System.out.print("\nSOMA NÚMEROS POSITIVOS: " + somaNumerosPositivo);
		System.out.printf("\nMÉDIA NÚMEROS POSITIVOS: %.2f", mediaNumeroPositivo);
		System.out.printf(mediaPositivoPares == 0 ? "NENHUM NÚMERO PAR" : "\nMÉDIA NÚMEROS PARES POSITIVOS: %.2f", mediaPositivoPares);
		System.out.printf("\nCONTAGEM DE PARES: %d", contagemNumeroPar);
		System.out.print("\nMAIOR VALOR: " + maiorValor.getElemento());
		System.out.print("\nPOSIÇÃO DO MAIOR VALOR: " + posicaoMaiorValor);
		
		sc.close();

	}

}
