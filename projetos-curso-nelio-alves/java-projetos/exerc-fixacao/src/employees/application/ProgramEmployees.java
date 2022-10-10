package employees.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import employees.entities.Employee;

public class ProgramEmployees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registred? ");
		int N = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		
		
		for(int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Employee #"+i+": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(employees, id)) {
				System.out.println("Id already exists. Enter a different id: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
			
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		Employee emp = employees.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

		if(emp == null){
			System.out.println("This id does not exist!");
		
			
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee x: employees) {
			System.out.println(x);
		}
		
		sc.close();
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;

	}

}
