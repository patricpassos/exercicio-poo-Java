package entities;

public class Personv {

	private String nome;
	private int age;

	public Personv(String nome, int age) {
		this.nome = validateName(nome);
		this.age = validateAge(age);
	}

	//fail-fast
	private static String validateName(String name) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("Incorrect name.");
		}
		return name;
	}
	
	private static int validateAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("Incorrect age.");
		}
		return age;
	}
}
