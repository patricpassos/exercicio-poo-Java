package entities;

import java.util.List;

public class Numero {
	
	private Integer numero;

	public Numero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public boolean isNegativo() {
		return numero < 0;
	}

	public static void negativos(List<Numero> list) {
		for(Numero n : list) {
			if(n.isNegativo()) {
				System.out.println(n.getNumero());
			}
		}
	}
}
