package application;

import java.util.Scanner;

import services.OperationsOlder;

public class ProgramOlder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();

		OperationsOlder vector = new OperationsOlder(n);

		for (int i = 0; i < n; i++) {
			System.out.printf("Data %d° person:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vector.setElement(i, name, age);
		}

		System.out.println(vector);

		sc.close();

	}

}
