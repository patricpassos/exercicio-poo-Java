package util;

import java.util.function.Consumer;

import entities.ConsumerProdutos;

public class Atualizacao implements Consumer<ConsumerProdutos> {

	@Override
	public void accept(ConsumerProdutos p) {
		p.setPreco(p.getPreco() * 1.1);
	}
}
