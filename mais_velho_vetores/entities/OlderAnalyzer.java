package entities;

public class OlderAnalyzer {

	private String name;
	private int age;

	public OlderAnalyzer(String name, int age) {
		this.name = name;
		setAge(age);
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("**ERROR**");
		} else {
			this.age = age;
		}
	}
	
	public static void olderPerson(OlderAnalyzer[] vector) {
		String person = " ";
		int personAge = 0;
		for(OlderAnalyzer p : vector) {
			if (p.getAge() > personAge) {
				person = p.getName();
				personAge = p.getAge();
			}
		}
		System.out.println("OLDEST PERSON: " + person);
	}

}
