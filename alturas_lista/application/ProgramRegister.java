package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;
import services.Analysis;

public class ProgramRegister {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Analysis list = new Analysis();
		
		System.out.print("How many people are you going to register? ");
		int register = sc.nextInt();
		
		for(int i = 0; i < register; i++) {
			System.out.printf("\nData %d° person:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			Integer age = sc.nextInt();
			System.out.print("Sex (M/F): ");
			Character sex = sc.next().toUpperCase().charAt(0);
			System.out.print("height: ");
			Double height = sc.nextDouble();
			
			People p = new People(name, age, sex, height);
			list.addPerson(p);	
		}
		
		System.out.println(list);
		
		sc.close();

	}

}
