package util;

public class CurrencyConverter {
	
	public static final double IMPOSTO_IOF = 0.06;
	
	public static double totalGeral (double precoAtualDolar, double quantidadeDolar) {
		double taxaImposto = precoAtualDolar * quantidadeDolar * IMPOSTO_IOF;
		return precoAtualDolar * quantidadeDolar + taxaImposto;
	}

}
