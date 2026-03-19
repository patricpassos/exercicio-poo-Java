package services;

import java.time.LocalDate;

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
	
	public int yearBirth() {
		LocalDate dateNow = LocalDate.now();
		OlderAnalyzer yearBirthOldestPerson = vet[0];
		for(OlderAnalyzer yb : vet) {
			if(yb.getAge() > yearBirthOldestPerson.getAge()) {
				yearBirthOldestPerson = yb;
			}
		}
		return dateNow.getYear() - yearBirthOldestPerson.getAge();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nOLDER PEOPLE: \n");
		sb.append("Name: ").append(olderPerson()).append("\n");
		sb.append("Year of birth: ").append(yearBirth()).append("\n");
		
		return sb.toString();
	}

}
