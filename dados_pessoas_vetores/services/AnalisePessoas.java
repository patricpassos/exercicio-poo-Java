package services;

import entities.Pessoas;

public class AnalisePessoas {

	private Pessoas[] vet;

	public AnalisePessoas(int n) {
		this.vet = new Pessoas[n];
	}

	public void setElementos(int i, double altura, char genero) {
		vet[i] = new Pessoas(altura, genero);
	}

	public int contagemMasculino() {
		int contMasculino = 0;
		for (Pessoas c : vet) {
			if (c.getGenero() == 'M') {
				contMasculino++;
			}
		}
		return contMasculino;
	}

	public double mediaAlturaFeminino() {
		double soma = 0.0;
		int contFeminino = 0;
		for (Pessoas m : vet) {
			if (m.getGenero() == 'F') {
				soma += m.getAltura();
				contFeminino++;
			}
		}

		return soma == 0.0 ? 0.0 : (double) soma / contFeminino;
	}

	public Pessoas menorAltura() {
		Pessoas menor = vet[0];
		for (int i = 1; i < vet.length; i++) {
			if (vet[i].getAltura() < menor.getAltura()) {
				menor = vet[i];
			}
		}
		return menor;
	}

	public Pessoas maiorAltura() {
		Pessoas maior = vet[0];
		for (int i = 1; i < vet.length; i++) {
			if (vet[i].getAltura() > maior.getAltura()) {
				maior = vet[i];
			}
		}
		return maior;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Pessoas menor = menorAltura();
		Pessoas maior = maiorAltura();
		double mediaFeminino = mediaAlturaFeminino();
		int quantidadeMasculino = contagemMasculino();

		sb.append("\nMenor altura = ").append(menor.getAltura());
		sb.append("\nMaior altura = ").append(maior.getAltura());
		sb.append("\nMédia das alturas das mulheres = ").append(String.format("%.2f", mediaFeminino));
		sb.append("\nNúmero de homens = ").append(quantidadeMasculino);

		return sb.toString();

	}

}
