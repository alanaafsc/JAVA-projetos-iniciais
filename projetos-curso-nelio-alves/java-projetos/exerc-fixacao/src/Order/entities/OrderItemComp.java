package Order.entities;

public class OrderItemComp {
	private Integer quantity;
	private double price;
	private ProductComp product;
	
	public OrderItemComp() {}

	public OrderItemComp(Integer quantity, double price, ProductComp product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductComp getProduct() {
		return product;
	}

	public void setProduct(ProductComp product) {
		this.product = product;
	}
	public double subTotal() {
		return quantity*price;
	}

}
