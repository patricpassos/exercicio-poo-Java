package services;

import java.util.ArrayList;
import java.util.List;

import entities.Atletas;

public class OperacaoAtletas {

	public List<Atletas> listaAtletas = new ArrayList<>();
	
	public void addLista(Atletas a) {
		listaAtletas.add(a);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Atletas atl : listaAtletas) {
			sb.append("Nome: ").append(atl.getNome()).append("\n");
			sb.append("Idade: ").append(atl.idade()).append("\n");
			sb.append("Preço da Inscrição: ").append(atl.totalPagamento()).append("\n");
		}
		
		return sb.toString();
		
	}
	
}
