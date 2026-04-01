package entities;

public class Piriquito extends Animal{
	
	public Piriquito() {
		super("Domestico", 10);
	}

	@Override
	public void emitirSom() {
		System.out.println("O passaro canta");
	} 
	
	public void voa() {
		System.out.println("O passaro voa");
	}
	
	public void canta() {
		System.out.println("Piriquito palrar");
	}
	
}
