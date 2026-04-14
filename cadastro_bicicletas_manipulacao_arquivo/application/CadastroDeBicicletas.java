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

		File file = new File(path);
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
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
