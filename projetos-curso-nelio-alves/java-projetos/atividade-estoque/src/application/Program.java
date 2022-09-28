package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//product info
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		//System.out.print("Quantity in Stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		product.setName("Computer");
		product.setPrice(1200.00);

		//print info of the products
		System.out.println(); // para pular linha
		System.out.println("Product data: " + product);
		
		//add quantity product
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		//print new info of the products
		System.out.println(); // para pular linha
		System.out.println("Updated data: " + product);
		
		//exc quantity product
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
				
		
		//print new info of the products
		System.out.println(); // para pular linha
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}

}
