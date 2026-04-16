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

		List<String> list = new ArrayList<>();
		String path = "c:\\temp\\cadastroBicicletas\\bicicletas.csv";
		String excluirItem = "optmo";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			if (line != null) {
				list.add(line);
			}

			line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				if (!fields[1].trim().equals(excluirItem)) {
					list.add(line);
				}
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write("marca, modelo, quantidade");
			bw.newLine();
			for (String s : list) {
				bw.write(s);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
