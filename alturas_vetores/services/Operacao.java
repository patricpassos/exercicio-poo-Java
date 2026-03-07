package services;

import entities.Cadastro;

public class Operacao {

	private Cadastro[] vet;

	public Operacao(int n) {
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
		for (Cadastro s : vet) {
			soma += s.getAltura();
		}
		return soma == 0.0 ? 0.0 : soma / vet.length;
	}

	public double menores16() {
		int contMenores = 0;
		for (Cadastro menores : vet) {
			if (menores.getIdade() < 16) {
				contMenores++;
			}
		}
		return (double) contMenores / vet.length * 100.0;
	}

	public int contagemMenores16() {
		int cont = 0;
		for (Cadastro c : vet) {
			if (c.getIdade() < 16) {
				cont++;
			}
		}
		return cont;
	}

	public String[] nomesMenor16() {
		int tamanhoVetor = contagemMenores16();
		String[] nome = new String[tamanhoVetor];

		int pos = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				nome[pos] = vet[i].getNome();
				pos++;
			}
		}
		return nome;
	}

}
