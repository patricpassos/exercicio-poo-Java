package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProgramVoting {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// C:\Temp\votacaoMap.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votingRecords = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer record = Integer.parseInt(fields[1]);

				if (votingRecords.containsKey(name)) {
					int accumulator = votingRecords.get(name);
					votingRecords.put(name, record + accumulator);
				} else {
					votingRecords.put(name, record);
				}

				line = br.readLine();
			}

			for (String key : votingRecords.keySet()) {
				System.out.println(key + ": " + votingRecords.get(key));
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

		sc.close();

	}

}
