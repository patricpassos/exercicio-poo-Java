package services;

import java.util.ArrayList;
import java.util.List;

import entities.Atletas;

public class OperacaoAtletas {

	public List<Atletas> listaAtletas = new ArrayList<>();
	
	public void addLista(Atletas a) {
		listaAtletas.add(a);
	}
	
}
