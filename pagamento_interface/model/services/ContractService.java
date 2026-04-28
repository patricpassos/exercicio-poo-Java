package model.services;

import model.entities.Contract;

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
		double monthlyInstallment = contract.getTotalValue() / months;
		for(int i = 1; i < months; i++) {
			double interestPayment = monthlyInstallment + onlinePayment.interest(monthlyInstallment, i);
			double paymentInstallments = interestPayment + onlinePayment.paymentFee(interestPayment);
		}
	}
}
