package entities;

public class Pares {

	private int[] vet;

	public Pares(int n) {
		this.vet = new int[n];
	}

	public void addElementos(int index, int elemento) {
		vet[index] = elemento;
	}

	public int quantidadePares() {
		int cont = 0;
		for (int c : vet) {
			if (c % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

	@Override
	public String toString() {
		// Cria sequencias de caracteres mutáveis: permitindo concatenar,
		// inserir, deletar ou inverter textos de forma eficiente sem criar
		// múltiplos objetos na memória.
		StringBuilder sb = new StringBuilder();
		for (int n : vet) {
			if (n % 2 == 0) {
				sb.append(n + " "); // usado para concatenar strings ou adicionar dados (como números, caracteres ou objetos)
			}
		}
		sb.append("\n\nQUANTIDADE DE PARES = ").append(quantidadePares());
		return sb.toString();
	}

}
