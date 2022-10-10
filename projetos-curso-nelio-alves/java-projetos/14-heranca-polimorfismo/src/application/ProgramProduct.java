package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List<Product> products = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i +" data:");
			sc.nextLine();
			System.out.print("Common, used or imported (c/u/i)? ");
			char statusProduct = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Price: ");
			double priceProduct = sc.nextDouble();
			if(statusProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				UsedProduct product = new UsedProduct(nameProduct, priceProduct, date);
				products.add(product);
			}else if(statusProduct == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				ImportedProduct product = new ImportedProduct(nameProduct, priceProduct, customFee);
				products.add(product);
			}else {
				Product product = new Product(nameProduct, priceProduct);
				products.add(product);
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product x: products) {
			System.out.println(x.priceTag());
		}

		
		
		sc.close();
	}

}
