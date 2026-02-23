package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramRegister {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<People> list = new ArrayList<>();

		System.out.print("How many people will be entered into the system? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nData for %d° people:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			Integer age = sc.nextInt();
			System.out.print("Height: ");
			Double height = sc.nextDouble();
			System.out.print("Gender: ");
			Character gender = sc.next().toUpperCase().charAt(0);
			list.add(new People(name, age, height, gender));
		}

		double averageHeight = People.averageHeight(list);
		double under16 = People.under16(list);
		People olderPerson = People.olderAge(list);
		People greatestHeight = People.greatestHeight(list);
		People lowestHeight = People.lowestHeight(list);
		double averageFemale = People.averageFemale(list);
		int numberMales = People.numberMales(list);
		
		
		System.out.print("\n========== REPORT ==========");
		System.out.printf("\nHeight average: %.2f", averageHeight);
		System.out.printf("\nAverage height of women: %.2f", averageFemale);
		System.out.print("\nNumber of men: " + numberMales);
		System.out.printf("\nGreatest height: %.2f", greatestHeight.getHeight());
		System.out.printf("\nLowest height: %.2f", lowestHeight.getHeight());
		System.out.printf("\nOlder person: " + olderPerson.getName());
		System.out.printf("\nPeople under the age of 16: %.1f%%\n", under16);
		People.nameUnder16(list);

		char resp;
		do {
			System.out.print("\nDo you want to filter by letter (y/n)? ");
			resp = sc.next().toUpperCase().charAt(0);
			if (resp == 'Y') {
				System.out.print("Type the letter: ");
				Character letter = sc.next().toUpperCase().charAt(0);
				System.out.println("People found:");
				People.returnFilter(list, letter);
			} else {
				break;
			}
		} while (resp != 'N');

		sc.close();

	}

}
