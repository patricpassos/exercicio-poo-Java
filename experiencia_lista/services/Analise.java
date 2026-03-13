package services;

import java.util.ArrayList;
import java.util.List;

import entities.Cobaia;

public class Analise {
	
	public List<Cobaia> lista = new ArrayList<>();
	
	public void addTeste(Cobaia c) {
		lista.add(c);
	}

}
