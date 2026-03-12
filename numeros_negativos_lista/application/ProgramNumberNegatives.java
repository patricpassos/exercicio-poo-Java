package application;

import java.util.Scanner;

import entities.Negative;

public class ProgramNumberNegatives {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Negative list = new Negative();
		
		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			Integer element = sc.nextInt();
			list.addElement(element);
		}
		
		System.out.println(list);
		
		sc.close();

	}

}
