package services;

import entities.Produtos;

public class Lucro {

	private Produtos[] vet;

	public Lucro(int n) {
		this.vet = new Produtos[n];
	}

	public void setProdutos(int index, String nome, double precoCompra, double precoVenda) {
		vet[index] = new Produtos(nome, precoCompra, precoVenda);
	}

	public double totalCompra() {
		double totalC = 0.0;
		for (Produtos lt : vet) {
			totalC += lt.getPrecoCompra();
		}
		return totalC;
	}

	public double totalVenda() {
		double totalV = 0.0;
		for (Produtos vt : vet) {
			totalV += vt.getPrecoVenda();
		}
		return totalV;
	}

	public double TotalLucro() {
		return totalVenda() - totalCompra();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].lucroBruto() < 10) {
				lucroMenor10++;
			} else if (vet[i].lucroBruto() <= 20) {
				lucroEntre10e20++;
			} else {
				lucroMaior20++;
			}
		}

		double totalCompra = totalCompra();
		double totalVenda = totalVenda();

		sb.append("RELATÓRIO");
		sb.append("\nLucro abaixo de 10%: ").append(lucroMenor10);
		sb.append("\nLucro entre 10% e 20%: ").append(lucroEntre10e20);
		sb.append("\nLucro acima de 20%: ").append(lucroMaior20);
		sb.append("\nValor total de compra: ").append(String.format("%.2f", totalCompra));
		sb.append("\nValor total de compra: ").append(String.format("%.2f", totalVenda));
		sb.append("\nLucro Total: ").append(String.format("%.2f", TotalLucro()));

		return sb.toString();

	}

}
