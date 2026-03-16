package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaPares {

	private List<Integer> lista = new ArrayList<>();

	public void addLista(Integer elemento) {
		lista.add(elemento);
	}

	public int quantidadePares() {
		return (int) lista.stream().filter(x -> x % 2 == 0).count();
	}
	
	public double mediaPares() {
		return lista.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).average().orElse(0.0);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nNÚMEROS DE PARES:\n");
		for (Integer p : lista) {
			if (p % 2 == 0) {
				sb.append(p).append(" ");
			}
		}

		sb.append("\n\nQUANTIDADE DE PARES = ").append(quantidadePares());
		sb.append(mediaPares() == 0.0 ? "\nNENHUM NÚMERO PAR" : "\nMÉDIA DE PARES: %.2f" + String.format("%.1f", mediaPares())); 

		return sb.toString();
	}

}
