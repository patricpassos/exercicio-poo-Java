package model.services;

import java.time.LocalDate;

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

	public void processContract(Contract contract) {
		
	}
}
