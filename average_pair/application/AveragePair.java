package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PairAnalyzer;

public class AveragePair {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		
		PairAnalyzer[] vector = new PairAnalyzer[n];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			vector[i] = new PairAnalyzer(number);
		}
		
		PairAnalyzer.averagePair(vector);
		
		sc.close();

	}

}
