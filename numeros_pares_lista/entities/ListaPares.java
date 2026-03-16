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

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nNÚMEROS DE PARES:\n");
		for (Integer p : lista) {
			if (p % 2 == 0) {
				sb.append(p).append(" ");
			}
		}

		sb.append("\n\nQUANTIDADE DE PARES = ").append(quantidadePares());

		return sb.toString();
	}

}
