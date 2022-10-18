package set.application;

import java.util.Set;
import java.util.TreeSet;

import set.entities.Product;

public class ProgramDemo3 {
	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		for (Product p : set) {
			System.out.println(p);
		}
	}
}