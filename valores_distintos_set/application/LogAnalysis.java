package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class LogAnalysis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// C:\Temp\acessos.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<LogEntry> set = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String userName = fields[0];
				Instant moment = Instant.parse(fields[1]);
				set.add(new LogEntry(userName, moment));
				line = br.readLine();
			}
			System.out.println("\nTotal user: " + set.size());
			System.out.println("Usernames: ");
			for (LogEntry name : set) {
				System.out.println(name.getName());
			}

		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}

		sc.close();

	}

}
