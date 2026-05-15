package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.ProdutosStream;

public class ProgramStream {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path = "c:\\temp\\stream.txt";
				
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<ProdutosStream> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new ProdutosStream(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double media = list.stream().mapToDouble(p -> p.getPreco()).average().getAsDouble();
			System.out.printf("Média de preços: %.2f\n", media);
			
			double soma = list.stream().mapToDouble(p -> p.getPreco()).sum();
			System.out.printf("Soma: %.2f\n", soma);
			
			System.out.print("Maior preço e produto: ");
			list.stream()
			.max(Comparator.comparing(ProdutosStream::getPreco))
			.ifPresent(p -> System.out.println(p.getNome() + " - " + p.getPreco()));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> nome = list.stream()
					.filter(p -> p.getPreco() < media)
					.map(p -> p.getNome())
					.sorted(comp.reversed()) // outra opção .sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
			
			nome.forEach(System.out::println);
		
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
