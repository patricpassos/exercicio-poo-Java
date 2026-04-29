package entities;

public class Employe implements Comparable<Employe> {

	private String name;
	private Double salary;
	
	public Employe(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/*@Override
	Compara um objeto com o outro
	public int compareTo(Employe other) {
		return name.compareTo(other.getName());
	}*/
	
	@Override
	//Compara um objeto com o outro, o sinal de negatigo ordena em ordem decrescente de salario
	public int compareTo(Employe other) {
		return -salary.compareTo(other.getSalary());
	}
	
}
