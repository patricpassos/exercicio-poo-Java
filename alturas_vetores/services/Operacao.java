package services;

import entities.Cadastro;

public class Operacao {
	
	private Cadastro[] vet;
	
	public Operacao (int n) {
		this.vet = new Cadastro[n];
	}
	
	public int tamanhoVetor() {
		return vet.length;
	}

	public Cadastro[] getVet() {
		return vet;
	}
	
	public void setElemento(int index, String nome, int idade, double altura) {
		vet[index] = new Cadastro(nome, idade, altura);
	}
	
	public double mediaAltura() {
		double soma = 0.0;
		for(Cadastro s : vet) {
			soma += s.getAltura();
		}
		return soma / vet.length;
	}


}
