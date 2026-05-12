package util;

import java.util.function.Predicate;

import entities.PredicateProdutos;

public class ProdutoPredicate implements Predicate<PredicateProdutos> {

	@Override
	public boolean test(PredicateProdutos p) {
		return p.getPreco() >= 100.0;
	}
}
