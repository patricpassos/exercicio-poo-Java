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
		for(Numero l : list) {
			System.out.print(l.getElemento() + " ");
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
	
	public static double mediaPositivosPares(List<Numero> list) {
		int somaPositivoPares = 0;
		int contPositivoPares = 0;
		for(Numero cpp : list) {
			if(cpp.getElemento() > 0 && cpp.isPar()) {
				somaPositivoPares += cpp.getElemento();
				contPositivoPares++;
			}
		}
		return (contPositivoPares == 0 ? 0 : (double) somaPositivoPares / contPositivoPares);
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
	
	public static Numero maiorValor(List<Numero> list) { //Técnica dos ponteiros
		if (list.isEmpty()) {
			return null;
		}
		
		Numero maior = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).getElemento() > maior.getElemento()) {
				maior = list.get(i);
			}
		}
		return maior;
	}
	
	public static int posicaoMaiorValor(List<Numero> list) {
		int posicao = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getElemento() > list.get(posicao).getElemento()) {
				posicao = i;
			}
		}
		return posicao == 0 ? 0 : posicao;
	}
	
}
