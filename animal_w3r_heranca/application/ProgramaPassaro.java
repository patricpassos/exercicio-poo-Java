package application;

import entities.Animal;
import entities.Piriquito;

public class ProgramaPassaro {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Floresta", 10);
		animal.emitirSom();
		System.out.println("Habitat: " + animal.getHabitat());
		
		Piriquito piriquito = new Piriquito();
		System.out.println("\nHabitat " + piriquito.getHabitat());
		System.out.println("Tempo de vida " + piriquito.getTempoDeVida() + " anos");
		piriquito.emitirSom();
		piriquito.canta();

	}

}
