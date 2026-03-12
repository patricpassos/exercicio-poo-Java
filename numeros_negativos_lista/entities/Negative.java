package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Negative {

	private List<Integer> listNumber = new ArrayList<>();

	public Negative() {

	}

	public void addElement(int element) {
		listNumber.add(element);
	}

	public List<Integer> getNumberNegatives() {
		return listNumber.stream().filter(number -> number < 0).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		List<Integer> negative = getNumberNegatives();

		if (negative.isEmpty()) {
			sb.append("There are no negative numbers");
		} else {
			sb.append("NEGATIVE NUMBERS\n");
			for (Integer neg : negative) {
				sb.append(neg).append("\n");
			}
		}

		return sb.toString();

	}

}
