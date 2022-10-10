package banco.application;

import java.util.Locale;
import java.util.Scanner;

import banco.entities.ContaBancaria;

public class ProgramBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ContaBancaria conta;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		String accountNumber = sc.nextLine();
		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.println("Is there a initial deposit? (y/n) ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.println("Enter the inicial deposit value: ");
			double inicialDeposit = sc.nextDouble();
			conta = new ContaBancaria(accountNumber, accountHolder, inicialDeposit);

		}else {
			conta = new ContaBancaria(accountNumber, accountHolder);
		} 
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		System.out.println();


		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		System.out.println();


		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saques(saque);
		System.out.println();

		System.out.println("Updated account data: ");
		System.out.println(conta);
		

		
		sc.close();
	}

}
