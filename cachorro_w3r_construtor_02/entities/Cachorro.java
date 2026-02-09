package entities;

public class Cachorro {

	private String nome;
	private String cor;
	private double peso;
	private int latido;

	public Cachorro(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
		this.latido = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public int getLatido() {
		return latido;
	}

	public void latir() {
		latido++;
	}

	public String porte() {
		if (peso > 25.0) {
			return "Grande";
		} else if (peso > 10.0) {
			return "Médio";
		} else {
			return "Pequeno";
		}
	}

	public void comparacaoCores(Cachorro other) {
		if (other.cor == this.cor) {
			System.out.println("Os cachorros tem a mesma cor");
		} else {
			System.out.println("Tem cores diferentes");
		}
	}

}
