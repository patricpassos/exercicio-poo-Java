package entities;

import java.util.List;
import java.util.stream.Collectors;

public class People {
	
	private String name;
	private Integer age;
	private Double height;
	private Character gender;
	
	public People(String name, Integer age, Double height, Character gender) {
		this.name = name;
		setAge(age);
		this.height = height;
		this.gender = gender;
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
		if(age < 0) {
			System.out.println("**--ERROR: AGE CANNOT BE NEGATIVE--**");
		} else {
			this.age = age;
		}
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Character getGender() {
		return gender;
	}
	
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public boolean isFemale() {
		return gender == 'F';
	}
	
	public boolean isMale() {
		return gender == 'M';
	}
	
	public boolean isAgeUnder16() {
		return age < 16;
	}
	
	public boolean isFilter(char letter) {
		return name.toUpperCase().charAt(0) == Character.toUpperCase(letter);
	}
	
	public static void returnFilter(List<People> list, char letter) {
		List<People> resultFilter = list.stream().filter(x -> x.isFilter(letter)).collect(Collectors.toList());
		if(resultFilter.isEmpty()) {
			System.out.println("***No one found with that letter***");
		} else {
			for(People f : resultFilter) {
				System.out.println(f.getName());
			}
		}
	}
	
	public static People lowestHeight(List<People> list) {
		if(list.isEmpty()) {
			return null;
		}
		
		People smaller = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).getHeight() < smaller.getHeight()) {
				smaller = list.get(i);
			}
		}
		return smaller;
	}
	
	public static People greatestHeight(List<People> list) {
		if(list.isEmpty()) {
			return null;
		}
		
		People bigger = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).getHeight() > bigger.getHeight()) {
				bigger = list.get(i);
			}
		}
		return bigger;
	}
	
	public static People olderAge(List<People> list) {
		People older = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).getAge() > older.getAge()) {
				older = list.get(i);
			}
		}
		return older;
	}
	
	public static int numberMales(List<People> list) {
		int cont = 0;
		for(People m : list) {
			if(m.isMale()) {
				cont++;
			}
		}
		return cont;
	}
	
	public static double averageFemale(List<People> list) {
		double sum = 0.0;
		int cont = 0;
		for(People f : list) {
			if(f.isFemale()) {
				sum += f.getHeight();
				cont++;
			}
		}
		return sum == 0.0 ? 0.0 : (double) sum / cont;
	}
	
	public static double averageHeight(List<People> list) {
		double sum = 0.0;
		for(People h : list) {
			sum += h.getHeight();
		}
		return sum == 0.0 ? 0.0 : sum / list.size();
	}
	
	public static double under16(List<People> list) {
		double cont = 0.0;
		for(People u : list) {
			if(u.isAgeUnder16()) {
				cont++;
			}
		}
		return cont == 0.0 ? 0.0 : cont / list.size() * 100;
	}
	
	public static void nameUnder16(List<People> list) {
		for(People n : list) {
			if(n.isAgeUnder16()) {
				System.out.println(n.getName());
			}
		}
	}	

}
