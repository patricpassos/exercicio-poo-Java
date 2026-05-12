package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.PredicateProdutos;

public class ProgramPredicateProdutos {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		List<PredicateProdutos> list = new ArrayList<>();
		
		list.add(new PredicateProdutos("Tv", 900.00));
		list.add(new PredicateProdutos("Mouse", 50.00));
		list.add(new PredicateProdutos("Tablet", 350.50));
		list.add(new PredicateProdutos("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPreco() >= min); Expressão lambda inline
		//list.removeIf(new ProdutoPredicate()); //Interface funcional objeto instanciado da classe
		//list.removeIf(PredicateProdutos::staticProdutoPredicate); //Referência do metodo estatico
		//list.removeIf(PredicateProdutos::nonStaticProdutoPredicate); //Referência do metodo não estatico
		
		Predicate<PredicateProdutos> isCheap = p -> p.getPreco() < 100.0;
		Predicate<PredicateProdutos> startsWithT = p -> p.getNome().startsWith("T");
		List<PredicateProdutos> onlyT = list.stream().filter(startsWithT).collect(Collectors.toList());
		
		System.out.println("Produtos que começam com 'T':");
        onlyT.forEach(System.out::println);
        
        boolean existsCheap = list.stream().anyMatch(isCheap); 
        System.out.println("\nExiste algum produto barato (< 100)? " + existsCheap);
        
        System.out.println("\nProdutos baratos E que começam com 'T':");
        list.stream().filter(isCheap.and(startsWithT)).forEach(System.out::println);
        
        System.out.println();
        double min = 100.0;
		Predicate<PredicateProdutos> pred = p -> p.getPreco() >= min; // Expressão lambda declarada pode-se usar variaveis de entrada
		list.removeIf(pred);
		list.forEach(System.out::println);

	}

}
