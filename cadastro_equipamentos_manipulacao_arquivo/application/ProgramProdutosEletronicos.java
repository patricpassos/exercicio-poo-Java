package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Eletronicos;

public class ProgramProdutosEletronicos {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\produtoseletronicos.txt";
		List<Eletronicos> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine(); //descarte da primeira linha (cabeçalho)
			line = br.readLine();
			while(line != null) {
				
				String[] vet = line.split(",");
				String name = vet[0];
				Double preco = Double.parseDouble(vet[1]);
				Integer quantidade = Integer.parseInt(vet[2]);
				
				Eletronicos elet = new Eletronicos(name, preco, quantidade);
				list.add(elet);
				
				line = br.readLine(); // conteudo da linha
			}
			
			System.out.println("PRODUTOS:");
			for(Eletronicos elet : list) {
				System.out.println(elet);
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
