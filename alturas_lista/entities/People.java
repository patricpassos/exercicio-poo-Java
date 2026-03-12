package entities;

public class People {
	
	private String name;
	private Integer age;
	private Character sex;
	private Double height;
	
	public People(String name, Integer age, Character sex, Double height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

}
