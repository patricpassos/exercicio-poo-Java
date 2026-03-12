package services;

import java.util.ArrayList;
import java.util.List;

import entities.People;

public class Analysis {
	
	private List<People> list = new ArrayList<>();
	
	public void addPerson(People p) {
		list.add(p);
	}
	
	public Double lowestHeight() {
		Double lowest = 0.0;
		for(People l : list) {
			if(l.getHeight() < lowest) {
				lowest = l.getHeight();
			}
		}
		return lowest;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		double lowest = lowestHeight();
		sb.append("\nLowest height: ").append(String.format("%.2f", lowest));
		
		return sb.toString();
	}

}
