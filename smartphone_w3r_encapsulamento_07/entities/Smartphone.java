package entities;

public class Smartphone {

	private String marca;
	private String modelo;
	private int capacidadeArmazenamento;
	private int nivelBateria;

	public Smartphone(String marca, String modelo, int capacidadeArmazenamento, int nivelBateria) {
		this.marca = marca;
		this.modelo = modelo;
		setCapacidadeArmazenamento(capacidadeArmazenamento);
		setNivelBateria(nivelBateria);
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
		if (capacidadeArmazenamento < 0 || capacidadeArmazenamento > 100) {
			System.out.println("Capacidade de armazenamento INVÁLIDO");
		} else {
			this.capacidadeArmazenamento = capacidadeArmazenamento;
		}
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		if(nivelBateria < 0) {
			this.nivelBateria = 0;
		} else if(nivelBateria > 100) {
			this.nivelBateria = 100;
		} else {
			this.nivelBateria = nivelBateria;
		}
	}
	
	public void usoBateria(int consumo) {
		int consumoBateria = nivelBateria - consumo;
		setNivelBateria(consumoBateria);
	}
	
	public void cargaBateria(int carga) {
		int carragementoBateria = nivelBateria + carga;
		setNivelBateria(carragementoBateria);
	}

	public void aumentarArmazenamento(int armazenamentoAdicional) {
		int armazenamentoTotal = capacidadeArmazenamento + armazenamentoAdicional;
		if (armazenamentoTotal > 100) {
			System.out.println("Capacidade total é maior que a capacidade do hardware");
		} else {
			capacidadeArmazenamento += armazenamentoAdicional;
		}
	}
	
	public String toString() {
		return
				"\nMarca: " + marca
				+ "\nModelo: " + modelo
				+ "\nCapacidade de Armazenamento: " + capacidadeArmazenamento
				+ "\nNível da Bateria: " + getNivelBateria();
	}

}
