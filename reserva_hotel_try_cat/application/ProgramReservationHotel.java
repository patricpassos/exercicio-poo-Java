package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramReservationHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), dateFormatter);
			System.out.print("Check-out date (dd/mm/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), dateFormatter);
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), dateFormatter);
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), dateFormatter);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation " + reservation);
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();

	}

}
