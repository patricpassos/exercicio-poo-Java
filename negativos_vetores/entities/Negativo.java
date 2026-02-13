package entities;

public class Negativo {

	private int numero;

	public Negativo(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void numerosNegativos(Negativo[] vetor) {
		for (Negativo n : vetor) {
			if (n.getNumero() < 0) {
				System.out.println(n.getNumero());
			}
		}
	}

}
