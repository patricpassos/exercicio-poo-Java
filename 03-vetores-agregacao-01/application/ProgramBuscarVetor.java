package application;

import java.util.Scanner;

import entities.NumberArray;

public class ProgramBuscarVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			
			int[] vet = new int[10];
			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			int target = sc.nextInt();
			NumberArray numberArray = new NumberArray(vet);
			int count = numberArray.countOccurrences(target);
			
			if(count == 0) {
				System.out.println("Mia x");
			} else {
				System.out.println(count);
				
				int[] indices = numberArray.findIndices(target);
				for (int i = 0; i < indices.length; i++) {
			        System.out.print(indices[i] + " ");
			    }
			}
				
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();
	}

}
