package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Atletas {
	
	private String nome;
	private LocalDate dataNascimento;
	private Character genero;
	private Integer modalidade;
	
	public Atletas(String nome, LocalDate dataNascimento, Character genero, Integer modalidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.modalidade = modalidade;
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

	public Integer getModalidade() {
		return modalidade;
	}

	public void setModalidade(Integer modalidade) {
		this.modalidade = modalidade;
	}
	
	public int idade() {
		return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
	}

}
