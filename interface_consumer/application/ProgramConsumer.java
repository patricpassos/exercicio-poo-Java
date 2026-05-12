package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.ConsumerProdutos;

public class ProgramConsumer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<ConsumerProdutos> list = new ArrayList<>();
		
		list.add(new ConsumerProdutos("Tv", 900.00));
		list.add(new ConsumerProdutos("Mouse", 50.00));
		list.add(new ConsumerProdutos("Tablet", 350.50));
		list.add(new ConsumerProdutos("HD Case", 80.90));
		
		//list.forEach(new Atualizacao()); Interface funcional objeto instanciado da classe
		//list.forEach(ConsumerProdutos :: staticPrecoAtualizacao); Referência do metodo estatico
		//list.forEach(ConsumerProdutos :: nonStaticPrecoAtualizacao); Referência do metodo não estatico
		double tx = 1.1;
		//list.forEach(p -> p.setPreco(p.getPreco() * tx)); // Expressão lambda inline
		
		Consumer<ConsumerProdutos> cons = p -> {
			p.setPreco(p.getPreco() * tx);
		};
		list.forEach(cons);
		
		list.forEach(System.out::println);

	}

}
