package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Empregados;

public class ProgramAnaliseEmpregados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregados> list = new ArrayList<>();
		
		//c:\\temp\\empregados_stream.csv
		System.out.println("Entre com o caminho do arquivo: ");
		String caminho = "c:\\temp\\empregados_stream.csv";
		System.out.print("Digite o salário: ");
		Double salario = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String line = br.readLine();
			while(line != null) {
				String[] campos = line.split(",");
				String campoNome = campos[0];
				String campoEmail = campos[1];
				Double campoSalario = Double.parseDouble(campos[2]);
				Empregados emp = new Empregados(campoNome, campoEmail, campoSalario);
				list.add(emp);
				line = br.readLine();
			}
			
			double salarioM = list.stream()
					.filter(n -> n.getNome().charAt(0) == 'M')
					.mapToDouble(n -> n.getSalario())
					.sum();
			
			List<String> email = list.stream()
					.filter(e -> e.getSalario() > salario)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("\nEmail das pessoas com salário maior ou igual a " + String.format("%.2f", salario) + ":");
			email.forEach(System.out::println);
			
			System.out.println("\nSoma dos salarios com a letra M: " + salarioM);
			
			list.stream()
			.max(Comparator.comparing(Empregados::getSalario))
			.ifPresent(p -> System.out.println("Empregado com maior salario: " + p.getNome() + " - " + String.format("%.2f", p.getSalario())));
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
				
		sc.close();
	}

}
