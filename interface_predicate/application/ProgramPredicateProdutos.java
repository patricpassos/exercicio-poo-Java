package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.PredicateProdutos;

public class ProgramPredicateProdutos {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		List<PredicateProdutos> list = new ArrayList<>();
		
		list.add(new PredicateProdutos("Tv", 900.00));
		list.add(new PredicateProdutos("Mouse", 50.00));
		list.add(new PredicateProdutos("Tablet", 350.50));
		list.add(new PredicateProdutos("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPreco() >= 100.0);
		//list.removeIf(new ProdutoPredicate()); //Interface funcional objeto instanciado da classe
		
		//list.removeIf(PredicateProdutos::staticProdutoPredicate); //Referência do metodo estatico
		//list.removeIf(PredicateProdutos::nonStaticProdutoPredicate); //Referência do metodo não estatico
		
		Predicate<PredicateProdutos> pred = p -> p.getPreco() >= 100.0; // Expressão lambda declarada
		list.removeIf(pred);
		
		for(PredicateProdutos p : list) {
			System.out.println(p);
		}

	}

}
