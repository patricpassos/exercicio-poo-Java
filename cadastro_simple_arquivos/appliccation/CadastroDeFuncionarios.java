package appliccation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CadastroDeFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();

		String path = "c:\\temp\\cadastrofuncionario.txt";
		File file = new File(path);
		boolean fileExists = file.exists();

		char resp;
		try{
			do {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				System.out.print("Cargo: ");
				sc.nextLine();
				String cargo = sc.nextLine();
				cadastro.add(nome + ", " + idade + ", " + cargo);

				System.out.print("Deseja cadastra mais um funcionario (s/n): ");
				resp = sc.next().toLowerCase().charAt(0);
				while(resp != 's' && resp != 'n') {
					System.out.print("Deseja cadastra mais um funcionario (s/n): ");
					resp = sc.next().toLowerCase().charAt(0);
				}
				System.out.println();
				sc.nextLine();

			} while (resp != 'n');
			
		} catch (InputMismatchException e){
			System.out.println("Erro: Tente novamente");
			System.exit(1);
		} 

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			if (!fileExists) {
				bw.write("Nome, Idade, Cargo");
				bw.newLine();
			}
			for (String ct : cadastro) {
				bw.write(ct);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
