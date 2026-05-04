package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductGe;
import services.CalculationService;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProductGe> list = new ArrayList<>();
		
		String path = "C:\\temp\\itens.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new ProductGe(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			ProductGe x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
