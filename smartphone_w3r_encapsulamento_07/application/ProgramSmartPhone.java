package application;

import java.util.Scanner;

import entities.Smartphone;

public class ProgramSmartPhone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String marca, modelo;
		char resp;
		int armazenamento, armazenamentoAdicinal, nivelBateria, consumo, carregamento;

		System.out.print("Marca: ");
		marca = sc.nextLine();
		System.out.print("Modelo: ");
		modelo = sc.next();
		System.out.print("Capacidade de armazenamento: ");
		armazenamento = sc.nextInt();
		System.out.print("Nível bateria: ");
		nivelBateria = sc.nextInt();
		
		Smartphone phone = new Smartphone(marca, modelo, armazenamento, nivelBateria);
		
		System.out.print("Deseja Aumentar a capacidade de armazenamento? (s/n): ");
		resp = sc.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			System.out.println("Qual a capacidade? ");
			armazenamentoAdicinal = sc.nextInt();
			phone.aumentarArmazenamento(armazenamentoAdicinal);
		}
		
		System.out.print("Consumo bateria: ");
		consumo = sc.nextInt();
		phone.usoBateria(consumo);
		
		System.out.print("Carregamento bateria: ");
		carregamento = sc.nextInt();
		phone.cargaBateria(carregamento);
		
		System.out.println(phone);
		
		/*System.out.println("\nMarca: " + phone.getMarca());
		System.out.println("Modelo: " + phone.getModelo());
		System.out.println("Armazenamento de memória: " + phone.getCapacidadeArmazenamento());
		System.out.println("Nível da bateria: " + phone.getNivelBateria());*/
		
		
		sc.close();
		
	}

}
