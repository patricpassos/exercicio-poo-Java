package model.services;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Funcoes;

public class ProdutosServicos {
	
	public double filtroSoma(List<Funcoes> list, Predicate<Funcoes> criterio) {
		double soma = 0.0;
		for(Funcoes p : list) {
			if(criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}

	public double filtroSomaValores(List<Funcoes> list, Predicate<Funcoes> criterio, Consumer<Funcoes> atualizacaoPreco) {
		double soma = 0.0;
		for(Funcoes p : list) {
			if(criterio.test(p)) {
				atualizacaoPreco.accept(p);
				soma += p.getPreco();
			}
		}
		return soma;
	}
}
