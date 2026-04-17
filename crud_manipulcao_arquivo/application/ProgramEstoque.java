package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Peca;

public class ProgramEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Peca> listaPeca = new ArrayList<>();

		boolean cricaoSubPasta = new File("c:\\temp\\crudCadastroPecas").mkdir();
		if (cricaoSubPasta == true) {
			System.out.println("Pasta criada com sucesso!!");
		}

		String path = "c:\\temp\\crudCadastroPecas\\crudPecas.csv";
		boolean arquivoExistente = new File(path).exists();
		

		int opcao;
		do {
			System.out.println("\n=== MENU DE CADASTRO ===");
			System.out.println("1 - Lista de peças");
			System.out.println("2 - Cadastro de peças");
			System.out.println("3 - Atualizar peças");
			System.out.println("4 - Excluir peças");
			System.out.println("0 - Sair");
			System.out.print("Escolha um opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				// Monstrar lista de peças

				break;

			case 2:
				// cadastro de peças
				char resp;
				do {
					sc.nextLine();
					System.out.print("\nMarca: ");
					String marca = sc.nextLine();
					System.out.print("Modalidade: ");
					String modalidade = sc.nextLine();
					System.out.print("Série: ");
					String serie = sc.nextLine();
					System.out.print("Quantidade: ");
					Integer quantidade = sc.nextInt();
					System.out.print("Preço: ");
					Double preco = sc.nextDouble();
					sc.nextLine();

					Peca peca = new Peca(marca, modalidade, serie, quantidade, preco);
					listaPeca.add(peca);

					System.out.print("Deseja continuar (s/n): ");
					resp = sc.next().toLowerCase().charAt(0);

				} while (resp != 'n');
				
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				if(!arquivoExistente) {
					bw.write("marca, modalidade, serie, quantidade, preco, total");
					bw.newLine();	
				}
				for(Peca lp : listaPeca) {
					bw.write(lp.getMarca() + ", " + lp.getModalidade() + ", " + lp.getSerie() + ", " + lp.getQuantidade() + ", " + lp.getPreco() + ", " + lp.total());
					bw.newLine();
				}
				
			} catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

				break;

			case 3:
				//atualizar
				break;

			case 4:
				//excluir
				break;

			case 0:
				System.out.println("Saindo do sistema...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}

		} while (opcao != 0);

		sc.close();
	}

}
