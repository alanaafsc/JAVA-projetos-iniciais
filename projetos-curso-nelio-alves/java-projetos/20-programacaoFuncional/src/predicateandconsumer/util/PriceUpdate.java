package predicateandconsumer.util;

import java.util.function.Consumer;

import predicateandconsumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
