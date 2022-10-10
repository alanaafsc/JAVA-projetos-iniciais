package currencyconverter.application;

import java.util.Locale;
import java.util.Scanner;

import currencyconverter.entities.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantityDollars = sc.nextDouble();
		double realPrice = CurrencyConverter.realPrice(dollarPrice, quantityDollars);
		System.out.printf("Amount to be paid in reais = %.2f", realPrice);
	}

}
