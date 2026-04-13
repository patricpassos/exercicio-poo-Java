package appliccation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CadastroDeFuncionarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		
		char resp;
		do {
		
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Cargo: ");
			sc.nextLine();
			String cargo = sc.nextLine();
			cadastro.add(nome + ", " + idade + ", " + cargo);
			System.out.print("\nDeseja cadastra mais um funcionario (s/n): ");
			resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
		} while(resp != 'n');
		
		String path = "c:\\temp\\cadastrofuncionario.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			bw.write("Nome, Idade, Cargo");
            bw.newLine();
            
			for(String ct : cadastro) {
				bw.write(ct);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
