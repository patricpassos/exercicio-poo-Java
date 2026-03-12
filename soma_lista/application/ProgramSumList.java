package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operation;

public class ProgramSumList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Operation list = new Operation();
		
		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			Double element = sc.nextDouble();
			list.addElement(element);
		}
		
		System.out.println(list);
		

		sc.close();

	}

}
