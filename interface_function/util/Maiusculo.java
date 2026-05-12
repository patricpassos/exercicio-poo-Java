package util;

import java.util.function.Function;

import entities.FunctionProdutos;

public class Maiusculo implements Function<FunctionProdutos, String> {

	@Override
	public String apply(FunctionProdutos p) {
		return p.getNome().toUpperCase();
	}
}
