package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramReservationHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), dateFormatter);
		System.out.print("Check-out date (dd/mm/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), dateFormatter);
		
		if(!checkOut.isAfter(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), dateFormatter);
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), dateFormatter);
			Reservation reservetion = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation " + reservetion);
		}
		
		sc.close();

	}

}
