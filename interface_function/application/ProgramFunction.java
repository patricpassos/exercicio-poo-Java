package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.FunctionProdutos;

public class ProgramFunction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<FunctionProdutos> list = new ArrayList<>();
		
		list.add(new FunctionProdutos("Tv", 900.00));
		list.add(new FunctionProdutos("Mouse", 50.00));
		list.add(new FunctionProdutos("Tablet", 350.50));
		list.add(new FunctionProdutos("HD Case", 80.90));
		
		//List<String> nomes = list.stream().map(new Maiusculo()).collect(Collectors.toList());  Interface funcional objeto instanciado da classe
		//List<String> nomes = list.stream().map(FunctionProdutos::staticMaiusculo).collect(Collectors.toList()); Referência do metodo estatico
		//List<String> nomes = list.stream().map(FunctionProdutos::nonStaticMaiusculo).collect(Collectors.toList()); Referência do metodo não estatico
		
		//List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList()); //Expressão lambda inline
		
		// Expressão lambda declarada pode-se usar variaveis de entrada
		Function<FunctionProdutos, String> func = p -> p.getNome().toUpperCase(); 
		List<String> nomes = list.stream().map(func).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);

	}

}
