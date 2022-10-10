package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i +" data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'n') {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
				}
			else {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				OutsourcedEmployee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employee x: employees) {
			System.out.println(x.getName() + " - $ " + String.format("%.2f", x.payment()));
			
		}
		sc.close();
	}

}
