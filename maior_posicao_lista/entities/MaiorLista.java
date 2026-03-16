package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaiorLista {

	private List<Double> lista = new ArrayList<>();
	
	public void addElementos (Double elemento) {
		lista.add(elemento);
	}
	
	public Double maiorElemento() {
		return lista.stream().mapToDouble(x -> x).max().orElse(0.0);
	}
	
	public Double menorElemento() {
		return lista.stream().mapToDouble(x -> x).min().orElse(0.0);
	}
	
	public int posicaoMaiorElemento() {
		return lista.indexOf(maiorElemento());
	}
	
	public Double somaElementos() {
		return lista.stream().mapToDouble(x -> x).sum();
	}
	
	public Double mediaElementos() {
		return lista.stream().mapToDouble(x -> x).average().orElse(0.0);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		double media = mediaElementos();
		
		sb.append("\nMAIOR ELEMENTO DA LISTA: ").append(maiorElemento());
		sb.append("\nMENOR ELEMENTO DA LISTA: ").append(menorElemento());
		sb.append("\nPOSIÇÃO DO MAIOR ELEMENTO: ").append(posicaoMaiorElemento());
		sb.append("\nSOMA DOS ELEMENTOS DA LISTA: ").append(somaElementos());
		sb.append("\nMÉDIA DOS ELEMENTOS DA LISTA: ").append(mediaElementos());
		sb.append("\nELEMENTOS ABAIXO DA MÉDIA:\n");
		List<Double> abaixoMedia = lista.stream().filter(x -> x < media).collect(Collectors.toList());
		sb.append(abaixoMedia);
		
		return sb.toString();
	}
}
