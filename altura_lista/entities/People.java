package entities;

import java.util.List;
import java.util.stream.Collectors;

public class People {
	
	private String name;
	private Integer age;
	private Double height;
	
	public People(String name, Integer age, Double height) {
		this.name = name;
		setAge(age);
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
		if(age < 0) {
			System.out.println("**--ERROR AGE--**");
		}
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public boolean isAgeUnder16() {
		return age < 16;
	}
	
	public boolean isFilter(char letter) {
		return name.toUpperCase().charAt(0) == Character.toUpperCase(letter);
	}
	
	public static void retorno(List<People> list, char letter) {
		List<People> resultFilter = list.stream().filter(x -> x.isFilter(letter)).collect(Collectors.toList());
		
		if(resultFilter.isEmpty()) {
			System.out.println("***No one found with that letter***");
		} else {
			for(People f : resultFilter) {
				System.out.println(f.getName());
			}
		}
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
