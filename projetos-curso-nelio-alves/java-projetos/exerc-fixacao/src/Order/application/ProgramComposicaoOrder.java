package Order.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Order.entities.ClientComp;
import Order.entities.OrderComp;
import Order.entities.OrderItemComp;
import Order.entities.ProductComp;
import Order.entities.enums.OrderStatusComp;

public class ProgramComposicaoOrder {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date dateClient = sdf.parse(sc.nextLine());
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatusComp status = OrderStatusComp.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		ClientComp client = new ClientComp(clientName, clientEmail, dateClient);
		Date moment = new Date();
		OrderComp order = new OrderComp(moment, status, client);
		
		for(int i = 1; i<=n; i++) {
			sc.nextLine();

			System.out.println("Enter #"+i+ " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			OrderItemComp item = new OrderItemComp(productQuantity, productPrice, new ProductComp(productName,productPrice));
		
			order.addItem(item);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		

	}

}
