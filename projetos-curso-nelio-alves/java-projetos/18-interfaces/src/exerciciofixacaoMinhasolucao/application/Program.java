package exerciciofixacaoMinhasolucao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exerciciofixacaoMinhasolucao.entities.Contract;
import exerciciofixacaoMinhasolucao.entities.Installment;
import exerciciofixacaoMinhasolucao.services.ContractService;
import exerciciofixacaoMinhasolucao.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt1);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter the number of installments: ");
		int installment = sc.nextInt();
		
		Contract contract = new Contract(number, date, contractValue);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, installment);
		
		System.out.println("INSTALLMENTS: ");
		for(Installment inst : contract.getInstallments()) {
			System.out.println(inst.getDueDate().format(fmt1) + " - " + inst.getAmount());
		}
	}

}
