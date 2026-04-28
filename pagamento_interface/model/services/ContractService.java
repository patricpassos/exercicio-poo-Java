package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePayment;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	public OnlinePaymentService getOnlinePayment() {
		return onlinePayment;
	}

	public void setOnlinePayment(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public void processContract(Contract contract, int months) {
		double monthlyInstallment = contract.getTotalValue() / months;   //parcela por mês
		for(int i = 1; i <= months; i++) {
			double interestPayment = monthlyInstallment + onlinePayment.interest(monthlyInstallment, i);   //Pagamento dos juros
			double monthlyPaymentFee = interestPayment + onlinePayment.paymentFee(interestPayment);        //Pagamento da taxa + juros
			LocalDate dueDate = contract.getDate().plusMonths(i);                                          //Data das parcelas conforme os meses
			contract.getInstallments().add(new Installment(dueDate, monthlyPaymentFee));                   //Instanciação e adição dos itens na lista  
		}
	}
}
