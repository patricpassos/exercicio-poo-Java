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
	
}
