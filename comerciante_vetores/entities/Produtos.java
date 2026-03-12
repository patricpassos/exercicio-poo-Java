package entities;

public class Produtos {

	private String nome;
	private double precoCompra;
	private double precoVenda;

	public Produtos(String nome, double precoCompra, double precoVenda) {
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double lucroBruto() {
		return (precoVenda - precoCompra) / precoCompra * 100;
	}

}
