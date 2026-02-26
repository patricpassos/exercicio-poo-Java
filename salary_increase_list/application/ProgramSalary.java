package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		 
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:", i + 1);
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			
			while(Employee.hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.print("\nEnter the employee ID that will have salary increase: ");
		int idEmployee = sc.nextInt();
		Integer idPosition = Employee.idPosition(list, idEmployee);
		
		if(idPosition == null) {
			System.out.print("This ID does not exist!");	
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(idPosition).increaseSalary(percent);
		}
		
		System.out.println("\nList of employees:");
		for (Employee listEmployee : list) {
			System.out.println(listEmployee);
		}
		
		sc.close();

	}

}
