package currencyconverter.entities;

public class CurrencyConverter {
	
	public static double realPrice(double dollarPrice, double quantityDollars) {
		return quantityDollars*dollarPrice*1.06;
	}
}
