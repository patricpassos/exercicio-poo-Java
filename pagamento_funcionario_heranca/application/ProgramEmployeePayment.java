package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeH;
import entities.OutsourcedEmployee;

public class ProgramEmployeePayment {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeH> listEmployee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int quantityEmployee = sc.nextInt();

		for (int i = 0; i < quantityEmployee; i++) {
			System.out.printf("Employee #%d data:\n", i + 1);
			System.out.print("Outsourced (y/n): ");
			char outsourced = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional Charge: ");
				double additinalCharge = sc.nextDouble();
				EmployeeH emp = new OutsourcedEmployee(name, hour, valuePerHour, additinalCharge);
				listEmployee.add(emp);
			} else {
				EmployeeH emp = new EmployeeH(name, hour, valuePerHour);
				listEmployee.add(emp);
			}
		}

		StringBuilder pay = new StringBuilder();
		pay.append("\nPAYMENTS\n");

		for (EmployeeH emp : listEmployee) {
			pay.append(emp).append("\n");
		}
		System.out.println(pay.toString());

		sc.close();

	}

}
