package application;

import java.util.Scanner;

import entities.Ordenation;

public class ProgramOrdenacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int[] vet = new int[3];
			
			for(int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}
			
			Ordenation order = new Ordenation(vet);
			order.ascendingOrder();
			
			for(int num : order.getNumbers()) {
				System.out.println(num);
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
