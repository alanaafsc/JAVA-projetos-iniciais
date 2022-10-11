package exerciciofixacao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exerciciofixacao.entities.Contract;
import exerciciofixacao.entities.Installment;
import exerciciofixacao.services.ContractService;
import exerciciofixacao.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter the number of installments: ");
		int installment = sc.nextInt();

		Contract contract = new Contract(number, date, contractValue);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, installment);

		System.out.println("INSTALLMENTS: ");
		for (Installment inst : contract.getInstallments()) {
			System.out.println(inst.getDueDate().format(fmt) + " - " + String.format("%.2f", inst.getAmount()));
		}
		sc.close();
	}
}
