package entities;

public class Cobaia {

	private Integer quantidade;
	private Character animal;

	public Cobaia(Integer quantidade, Character animal) {
		this.quantidade = quantidade;
		this.animal = animal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Character getAnimal() {
		return animal;
	}

	public void setAnimal(Character animal) {
		this.animal = animal;
	}
	
	public boolean isQuantidadeCoelhos() {
		return getAnimal() == 'C';
	}
	
	public boolean isQuantidadeRatos() {
		return getAnimal() == 'R';
	}
	
	public boolean isQuantidadeSapos() {
		return getAnimal() == 'S';
	}

}
