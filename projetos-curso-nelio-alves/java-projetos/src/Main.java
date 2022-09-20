import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Testando atribuicoes e sysout
		/* String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0; 
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("Computer, which price is $ %.2f%n", price1);
		System.out.printf("Office desk, which price is $ %.2f%n", price2);
		System.out.printf("%n");
		System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
		System.out.printf("%n");
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (3 decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure); */
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//string
		//String x;
		//x = sc.next();
		
		//int
		//int y;
		//y = sc.nextInt();
		
		
		//double
		//double x;
		//x = sc.nextDouble();
		
		//char 
		char x;
		x = sc.next().charAt(0);
		
		
		System.out.println("Voce digitou: " + x);
		sc.close();
	
	}

}
