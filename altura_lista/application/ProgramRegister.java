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
			System.out.printf("Data for %d° people:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			Integer age = sc.nextInt();
			System.out.print("Height: ");
			Double height = sc.nextDouble();
			list.add(new People(name, age, height));
		}

		double averageHeight = People.averageHeight(list);
		double under16 = People.under16(list);

		System.out.println("\n*** REPORT ***");
		System.out.printf("Height average: %.2f\n", averageHeight);
		System.out.printf("People under the age of 16: %.1f%%\n", under16);
		People.nameUnder16(list);

		char resp;
		do {
			System.out.print("\nDo you want to filter by letter (y/n)? ");
			resp = sc.next().toUpperCase().charAt(0);
			if (resp == 'Y') {
				System.out.print("Type the letter: ");
				Character letter = sc.next().toUpperCase().charAt(0);
				System.out.println("People found:");
				People.retorno(list, letter);
			} else {
				break;
			}
		} while (resp != 'N');

		sc.close();

	}

}
