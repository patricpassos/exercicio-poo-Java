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

import entities.Estoque;

public class ProgramProdutosEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Estoque> list = new ArrayList<>();

		String path = "c:\\temp\\produtoseletronicos.txt";

		boolean subPasta = new File("c:\\temp\\out").mkdir(); // criação da subpasta
		if (subPasta == true) {
			System.out.println("Subpasta " + subPasta + " criada com sucesso");
		}

		String arquivoSummary = "c:\\temp\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] filds = line.split(",");
				String nome = filds[0];
				double preco = Double.parseDouble(filds[1]);
				int quantidade = Integer.parseInt(filds[2]);

				Estoque prod = new Estoque(nome, preco, quantidade);
				list.add(prod);

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSummary))) {
				bw.write("nome, valor total");
				bw.newLine();
				for (Estoque item : list) {
					bw.write(item.getNome() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println("Arquivo criado com sucesso!");
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoSummary))) {
			String line = br.readLine();
			if (line != null) {
				String[] header = line.split(",");
				System.out.printf("\n%-20s| %-15s\n", header[0].trim(), header[1].trim());
			}
			
			line = br.readLine();
			while(line != null) {
				String[] campos = line.split(",");
				System.out.printf("%-20s| %-15s\n", campos[0].trim(), campos[1].trim());
				line = br.readLine();
			}
		

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
