package entities;

import java.util.List;

public class Numero {
	
	private Integer elemento;
	
	public Numero(Integer elemento) {
		super();
		this.elemento = elemento;
	}
	
	public Integer getElemento() {
		return elemento;
	}

	public void setElemento(Integer elemento) {
		this.elemento = elemento;
	}

	public boolean isNegativo() {
		return elemento < 0;
	}
	
	public boolean isPositivo() {
		return elemento > 0;
	}
	
	public boolean isPar() {
		return elemento % 2 == 0;
	}
	
	public static void listaNumero(List<Numero> list) {
		for(Numero lista : list) {
			System.out.print(lista.getElemento() + " ");
		}
	}

	public static void listaNegativos(List<Numero> list) {
		for(Numero n : list) {
			if(n.isNegativo()) {
				System.out.print(n.getElemento() + " ");
			}
		}
	}
	
	public static void listaPares(List<Numero> list) {
		for(Numero p : list) {
			if(p.isPar()) {
				System.out.print(p.getElemento() + " ");
			}
		}
	}
	
	public static int somaPositivo(List<Numero> list) {
		int soma = 0;
		for(Numero s : list) {
			if(s.isPositivo()) {
				soma += s.getElemento(); 
			}
		}
		return soma;
	}
	
	public static double mediaPositivos(List<Numero> list) {
		int contPositivo = 0;
		for(Numero c : list) {
			if(c.isPositivo()) {
				contPositivo++;
			}
		}
		return (contPositivo == 0 ? 0.0 : (double) somaPositivo(list) / contPositivo);
	}
	
	public static int contagemPares(List<Numero> list) {
		int contPares = 0;
		for(Numero cp : list) {
			if(cp.isPar()) {
				contPares++;
			}
		}
		return contPares;
	}
}
