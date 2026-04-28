package application;

import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class ProgramPaymentSystem {

	public static void main(String[] args) {
		
		OnlinePaymentService ps = new PaypalService();
		System.out.println(ps.paymentFee(200.00));
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract details:");
		System.out.print("Number: ");
		Integer numberContract = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();
		
		Contract ct = new Contract(numberContract, date, value);
		
		//System.out.print("Enter the number of installments: ");
		//Integer dueDate = sc.nextInt();
		
		
		
		
		
		sc.close();*/

	}

}
