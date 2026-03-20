package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Atletas {
	
	public static final double PRECO_INSCRICAO_CORRIDA = 75.00;
	public static final double PRECO_INSCRICAO_CICLISMO = 60.00;
	public static final double PRECO_INSCRICAO_TRIATLO = 150.00;
	
	private String nome;
	private LocalDate dataNascimento;
	private Character genero;
	private List<Integer> modalidades = new ArrayList<>();
	
	public Atletas(String nome, LocalDate dataNascimento, Character genero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}
	
	public void addModalidades(Integer md) {
		modalidades.add(md);
	}
	
	public int idade() {
		return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
	}
	
	public double totalPagamento() {
		double total = 0.0;
		for(Integer m : modalidades) {
			if(m == 1) {
				total += PRECO_INSCRICAO_CORRIDA;
			} else if (m == 2) {
				total += PRECO_INSCRICAO_CICLISMO;
			} else if(m ==3) {
				total += total += PRECO_INSCRICAO_TRIATLO;
			}
		}
		return total;
	}

}
