package model.services;

public class PaypalService implements OnlinePaymentService{

	//public Double paymentFee(Double amount) {
		//taxa de pagamento
		//return null;
	//}
	
	public Double interest(Double amount, Integer months) {
		//juros
		int parcelas = (int) (amount / months);
		Double juros = 0.0;
		int n = 1;
		while(parcelas < n) {
			juros = parcelas * 0.01 * n;
			n++;
		}
		return parcelas + juros;
	}


}
