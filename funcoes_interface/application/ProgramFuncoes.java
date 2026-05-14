package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Funcoes;
import model.services.ProdutosServicos;

public class ProgramFuncoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Funcoes> list = new ArrayList<>();
		
		list.add(new Funcoes("Tv", 900.00));
		list.add(new Funcoes("Mouse", 50.00));
		list.add(new Funcoes("Tablet", 350.50));
		list.add(new Funcoes("HD Case", 80.90));
		
		ProdutosServicos ps = new ProdutosServicos();
		
		double soma = ps.filtroSoma(list, p -> p.getNome().startsWith("T"));
		double precoMenor100 = ps.filtroSoma(list, p -> p.getPreco() < 100.0);
		
		double somaValores = ps.filtroSomaValores(list, p -> p.getNome().startsWith("T"), p -> p.setPreco(p.getPreco() + 15.45));
		
		System.out.println("Soma = " + String.format("%.2f", soma));
		System.out.println("Soma = " + String.format("%.2f", precoMenor100));
		System.out.println("Soma = " + String.format("%.2f", somaValores));

	}
}
