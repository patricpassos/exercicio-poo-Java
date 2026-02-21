package entities;

import java.util.List;

public class Adicao {

	private Double numero;

	public Adicao(Double numero) {
		this.numero = numero;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}
	
	public static double soma(List<Adicao> list) {
		double somaLista = 0.0;
		for(Adicao s : list) {
			somaLista += s.getNumero();
		}
		
		return somaLista;
	}
	
	public static double media(List<Adicao> list) {
		return soma(list) / list.size();
	}
	
	public static void itensLista(List<Adicao> list) {
		for(Adicao l : list) {
			System.out.print(l.getNumero() + " ");
		}
	}
}
