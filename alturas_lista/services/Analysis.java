package services;

import java.util.ArrayList;
import java.util.List;

import entities.People;

public class Analysis {

	private List<People> list = new ArrayList<>();

	public void addPerson(People p) {
		list.add(p);
	}

	public People lowestHeight() {
		People lowest = list.get(0);
		for (People l : list) {
			if (l.getHeight() < lowest.getHeight()) {
				lowest = l;
			}
		}
		return lowest;
	}

	public People greatestHeight() {
		People bigger = list.get(0);
		for (People b : list) {
			if (b.getHeight() > bigger.getHeight()) {
				bigger = b;
			}
		}
		return bigger;
	}

	public double averageHeight() {
		double sum = 0.0;
		for (People av : list) {
			sum += av.getHeight();
		}
		return sum == 0.0 ? 0.0 : (double) sum / list.size();
	}

	public int numberMen() {
		int contMen = 0;
		for (People cm : list) {
			if (cm.getSex() == 'M') {
				contMen++;
			}
		}
		return contMen;
	}

	public int numberWomen() {
		int contWomen = 0;
		for (People cw : list) {
			if (cw.getSex() == 'F') {
				contWomen++;
			}
		}
		return contWomen;
	}

	public People olderPerson() {
		People older = list.get(0);
		for (People op : list) {
			if (op.getAge() > older.getAge()) {
				older = op;
			}
		}
		return older;
	}

	public double percentageUnder16() {
		int contUnder = 0;
		for(People u : list) {
			if(u.getAge() < 16) {
				contUnder++;
			}
		}
		return contUnder == 0 ? 0.0 : (double) contUnder / list.size() * 100.0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		People lowest = lowestHeight();
		People bigger = greatestHeight();
		People older = olderPerson();
		double average = averageHeight();
		int numberMen = numberMen();
		int numberWomen = numberWomen();
		double under16 = percentageUnder16();

		sb.append("\nLowest height: ").append(String.format("%.2f", lowest.getHeight()));
		sb.append("\nGreatest height: ").append(String.format("%.2f", bigger.getHeight()));
		sb.append("\nAverage height: ").append(String.format("%.2f", average));
		sb.append("\nNumber of men: ").append(numberMen);
		sb.append("\nNumber of women: ").append(numberWomen);
		sb.append("\nOlder person: ").append(older.getName());
		if(under16 > 0) {
			sb.append("\nPercentage of minors under 16 years old: ").append(String.format("%.1f", under16)).append("%");
		}else {
			sb.append("\nNo one under 16 years old.");
		}

		return sb.toString();
	}

}
