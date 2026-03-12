package entities;

import java.util.ArrayList;
import java.util.List;

public class Operation {

	private List<Double> number = new ArrayList<>();
	
	public Operation() {
		
	}
	
	public void addElement(Double element) {
		number.add(element);
	}
	
	public Double sumValues() {
		Double sum = 0.0;
		for(Double s : number) {
			if(s > 0) {
				sum += s;
			}
		}
		return sum;
	}
	
	public Double averageValues() {
		Double sum = sumValues();
		Integer cont = 0;
		for(Double av : number) {
			if(av > 0) {
				cont++;
			}
		}
		return cont == 0 ? 0.0 : (double) sum / cont;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		double sum = sumValues();
		double average = averageValues();
		
		sb.append("\nVALUES = ");
		for(Double n : number) {
			sb.append(n).append(" ");
		}
		sb.append("\nSUM = ").append(String.format("%.2f", sum));
		sb.append("\nAVERAGE = ").append(String.format("%.2f", average));
		
		return sb.toString();
		
	}
	
}
