package entities;

public class Smartphone {
	
	private String marca;
	private String modelo;
	private int capacidadeArmazenamento;
	
	public Smartphone(String marca, String modelo, int capacidadeArmazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		setCapacidadeArmazenamento(capacidadeArmazenamento);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		if(capacidadeArmazenamento < 0 || capacidadeArmazenamento > 100) {
			System.out.println("Capacidade de armazenamento INVÁLIDO");
		} else {
			this.capacidadeArmazenamento = capacidadeArmazenamento;
		}
	}
	
	public void aumentarArmazenamento(int armazenamentoAdicional) {
		int armazenamentoTotal = capacidadeArmazenamento + armazenamentoAdicional;
		if (armazenamentoTotal > 100) {
			System.out.println("Capacidade total é maior que a capacidade do hardware");
		} else {
			capacidadeArmazenamento += armazenamentoAdicional;
		}
	}

}
