package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcluindoLinhas {

	public static void main(String[] args) {

		List<String> listFinal = new ArrayList<>();
		String path = "c:\\temp\\cadastroBicicletas\\bicicletas.csv";
		String excluirItem = "impact carbon";
		String atualizarItemErrado = "arenita";
		String atualizarItemCorreto = "velox";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String header = br.readLine();
			if (header != null) {
				listFinal.add(header);
			}
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String modeloAtual = fields[1].trim();

				if (modeloAtual.equals(excluirItem)) {

				} else if (modeloAtual.equals(atualizarItemErrado)) {
					listFinal.add(fields[0] + ", " + atualizarItemCorreto + ", " + fields[2]);
				} else {
					listFinal.add(line);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String s : listFinal) {
				bw.write(s);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			if (line != null) {
				String[] header = line.split(",");
				System.out.printf("\n%-15s %-15s %-15s%n", header[0].trim(), header[1].trim(), header[2].trim());
				System.out.println("-----------------------------------------------");
			}

			line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				System.out.printf("%-15s %-15s %5s%n", fields[0].trim(), fields[1].trim(), Integer.parseInt(fields[2].trim()));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
