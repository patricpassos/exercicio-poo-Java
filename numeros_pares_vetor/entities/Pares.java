package entities;

public class Pares {
	
	private int numero;

	public Pares(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void numerosPares(Pares[] vetor) {
		for(Pares p : vetor) {
			if (p.getNumero() % 2 == 0) {
				System.out.print(p.getNumero() + "  ");
			}
		}
	}
	
	public static int quantidadePares(Pares[] vetor) {
		int cont = 0;
		for(Pares c : vetor) {
			if(c.getNumero() % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

}
