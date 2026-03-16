package services;

import java.util.ArrayList;
import java.util.List;

import entities.Cobaia;

public class Analise {

	public List<Cobaia> lista = new ArrayList<>();

	public void addTeste(Cobaia c) {
		lista.add(c);
	}

	public int totalCobaias() {
		int total = 0;
		for (Cobaia tc : lista) {
			total += tc.getQuantidade();
		}
		return total;
	}
	
	public int totalCoelhos() {
		int totalCoelhos = 0;
		for(Cobaia c : lista) {
			if(c.isQuantidadeCoelhos()) {
				totalCoelhos += c.getQuantidade();
			}
		}
		return totalCoelhos;
	}
	
	public int totalRatos() {
		int totalRatos = 0;
		for(Cobaia r : lista) {
			if(r.isQuantidadeRatos()) {
				totalRatos += r.getQuantidade();
			}
		}
		return totalRatos;
	}
	
	public int totalSapos() {
		int totalSapos = 0;
		for(Cobaia s : lista) {
			if(s.isQuantidadeSapos()) {
				totalSapos += s.getQuantidade();
			}
		}
		return totalSapos;
	}
	
	public double percentualCoelhos() {
		return (double) totalCoelhos() / totalCobaias() * 100;
	}
	
	public double percentualRatos() {
		return (double) totalRatos() / totalCobaias() * 100;
	}
	
	public double percentualSapos() {
		return (double) totalSapos() / totalCobaias() * 100;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nRELATÓRIO FINAL:");
		sb.append("\nTotal: ").append(totalCobaias()).append(" cobaias");
		sb.append("\nTotal de coelhos: ").append(totalCoelhos());
		sb.append("\nTotal de ratos: ").append(totalRatos());
		sb.append("\nTotal de sapos: ").append(totalSapos());
		sb.append("\nPercentual de coelhos: ").append(String.format("%.2f", percentualCoelhos()));
		sb.append("\nPercentual de ratos: ").append(String.format("%.2f", percentualRatos()));
		sb.append("\nPercentual de sapos: ").append(String.format("%.2f", percentualSapos()));

		return sb.toString();

	}

}
