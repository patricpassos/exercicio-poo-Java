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

public class CadastroDeBicicletas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> cadastro = new ArrayList<>();

		String path = "c:\\temp";
		boolean cricaoSubPasta = new File(path + "\\cadastroBicicletas").mkdir();
		if(cricaoSubPasta == true) {
			System.out.println("Pasta criada com sucesso!!");
		}

		String caminhoArquivo = "c:\\temp\\cadastroBicicletas\\bicicletas.csv";
		boolean arquivoExistente = new File(caminhoArquivo).exists();

		char resp;
		do {
			System.out.print("Marca: ");
			String marca = sc.nextLine();
			System.out.print("Modelo: ");
			String modelo = sc.nextLine();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			cadastro.add(marca + ", " + modelo + ", " + quantidade);

			System.out.print("Deseja cadastrar outra (s/n): ");
			resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
		} while (resp != 'n');

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
			if (!arquivoExistente) {
				bw.write("marca, modelo, quantidade");
				bw.newLine();
			}
			for (String cd : cadastro) {
				bw.write(cd);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
			String line = br.readLine();
			
			if(line != null) {
				String[] header = line.split(",");
				System.out.printf("\n%-15s %-15s %-15s%n", header[0].trim(), header[1].trim(), header[2].trim());
				System.out.println("-----------------------------------------------");
			}
			
			line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				System.out.printf("%-15s %-15s %5s%n", fields[0].trim(), fields[1].trim(), fields[2].trim());
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
