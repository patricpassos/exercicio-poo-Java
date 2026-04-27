package model.services;

public interface OnlinePaymentService {

	public Double paymentFee(Double amount);
	public Double Inrerest(Double amount, Integer months);
}
