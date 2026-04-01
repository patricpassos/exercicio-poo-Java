package entities;

public class Animal {
	
	private String habitat;
	private Integer tempoDeVida;
	
	public Animal() {
	}

	public Animal(String habitat, Integer tempoDeVida) {
		this.habitat = habitat;
		this.tempoDeVida = tempoDeVida;	
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Integer getTempoDeVida() {
		return tempoDeVida;
	}

	public void setTempoDeVida(Integer tempoDeVida) {
		this.tempoDeVida = tempoDeVida;
	}

	public void emitirSom() {
		System.out.println("Animal faz som caracteristoco");
	}
		
}
