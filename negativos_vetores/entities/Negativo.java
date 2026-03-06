package entities;

public class Negativo {

	private int numero;
	private int[] vet;

	public Negativo(int numero) {
		this.numero = numero;
		this.vet = new int[numero];
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void addElementos(int index, int elemento) {
		vet[index] = elemento;
	}

	public int contagemNegativos() {
		int contNegativo = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				contNegativo++;
			}
		}
		return contNegativo;
	}

	public int[] numerosNegativos() {
		int tamanhoVetor = contagemNegativos();
		int[] numNegativo = new int[tamanhoVetor];

		int posicaoVetor = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				numNegativo[posicaoVetor] = vet[i];
				posicaoVetor++;
			}
		}
		return numNegativo;
	}

}
