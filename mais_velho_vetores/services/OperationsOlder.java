package services;

import entities.OlderAnalyzer;

public class OperationsOlder {

	private OlderAnalyzer[] vet;

	public OperationsOlder(int n) {
		this.vet = new OlderAnalyzer[n];
	}

	public void setElement(int i, String name, int age) {
		vet[i] = new OlderAnalyzer(name, age);
	}

	public String olderPerson() {
		String person = " ";
		int personAge = 0;
		for (OlderAnalyzer p : vet) {
			if (p.getAge() > personAge) {
				person = p.getName();
				personAge = p.getAge();
			}
		}
		return person;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OLDER PEOPLE: ").append(olderPerson());
		return sb.toString();
	}

}
