package util;

public class CurrencyConverter {
	
	
	public static double calcIof(double quantidade, double precoDollar) {
		double valorEmReais = quantidade * precoDollar;
		double iof = valorEmReais * 0.06;
		return valorEmReais + iof;
	}
	
}
