package taxpayer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import taxpayer.entities.Pessoa;
import taxpayer.entities.PessoaFisica;
import taxpayer.entities.PessoaJuridica;

public class ProgramTaxPayer {

	public static void main(String[] args) {
		//Secao 14: Heranca e polimorfismo
			//exercicio para classes e metodos abstratos
			//classes: pessoa fisica, pessoa juridica e pessoa
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i +" data: ");
			sc.nextLine();
			System.out.print("Individual or company (i/c)? ");
			char response = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(response == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, anualIncome, health));
			}else if(response == 'c'){
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, anualIncome, employees));
			}

		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Pessoa p: pessoas) {
			System.out.println(p);
		}
		double totalTaxes = 0.0;
		for(Pessoa p: pessoas) {
			totalTaxes += p.taxesPaid();
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
