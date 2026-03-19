package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Cadastro;

public class Operacao {

	private Cadastro[] vet;

	public Operacao(int n) {
		this.vet = new Cadastro[n];
	}

	public int tamanhoVetor() {
		return vet.length;
	}

	public Cadastro[] getVet() {
		return vet;
	}

	public void setElemento(int index, String nome, int idade, double altura, LocalDate data) {
		vet[index] = new Cadastro(nome, idade, altura, data);
	}

	public double mediaAltura() {
		double soma = 0.0;
		for (Cadastro s : vet) {
			soma += s.getAltura();
		}
		return soma == 0.0 ? 0.0 : soma / vet.length;
	}

	public double menores16() {
		int contMenores = 0;
		for (Cadastro menores : vet) {
			if (menores.getIdade() < 16) {
				contMenores++;
			}
		}
		return (double) contMenores / vet.length * 100.0;
	}

	public int contagemMenores16() {
		int cont = 0;
		for (Cadastro c : vet) {
			if (c.getIdade() < 16) {
				cont++;
			}
		}
		return cont;
	}

	public String[] nomesMenor16() {
		int tamanhoVetor = contagemMenores16();
		String[] nome = new String[tamanhoVetor];

		int pos = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				nome[pos] = vet[i].getNome();
				pos++;
			}
		}
		return nome;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		double mediaDeAltura = mediaAltura();
		double porcentagemMenores16 = menores16();
		String[] nomesMenores16 = nomesMenor16();
		
		sb.append("\nAltura média: ").append(String.format("%.2f\n", mediaDeAltura));
		
		for(Cadastro d : vet) {
			sb.append("\nData de cadastro: ").append(d.getData().format(formatacaoData));
		}
	
		if(nomesMenores16.length > 0) {
			sb.append("\nPessoas com menos de 16 anos: ").append(String.format("%.1f%%\n", porcentagemMenores16));
			for(String nome : nomesMenores16) {
				sb.append(nome + "\n");
			}
		} else {
			sb.append("\nNão há menores de 16 anos cadastrado\n");
		}
		
		return sb.toString();
	
	}

}
