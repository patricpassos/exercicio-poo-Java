package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entites.Department;
import entites.HourContract;
import entites.Worker;
import entities.enums.WorkerLevel;

public class ProgramWorkerContract {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(
				workerName,
				WorkerLevel.valueOf(workerLevel), // instanciado do tipo enumerado no valor equivalente conforme declarado
				baseSalary,
				new Department(departmentName) // instanciação e associação com a classe departameto com a Worker
				);
		
		System.out.print("\nHow many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data:\n", i + 1);
			System.out.print("Date (DD/MM/YYYY): " );
			LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); // instanciação do contrato
			worker.addContract(contract); // Associação do contract ao worker e adição de dados na lista
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
