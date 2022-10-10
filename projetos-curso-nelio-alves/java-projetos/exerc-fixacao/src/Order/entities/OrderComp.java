package Order.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Order.entities.enums.OrderStatusComp;

public class OrderComp {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatusComp status;
	private List<OrderItemComp> items = new ArrayList<>();
	private ClientComp client; 
	
	public OrderComp() {}

	public OrderComp(Date moment, OrderStatusComp status, ClientComp client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusComp getStatus() {
		return status;
	}

	public void setStatus(OrderStatusComp status) {
		this.status = status;
	}

	public List<OrderItemComp> getItems() {
		return items;
	}
	public void addItem(OrderItemComp item) {
		items.add(item);
	}
	public void removeItem(OrderItemComp item) {
		items.remove(item);
	}
	
	public ClientComp getClient() {
		return client;
	}

	public void setClient(ClientComp client) {
		this.client = client;
	}

	public double total() {
		double sum = 0;
		for(OrderItemComp item: items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		
		double totalPrice = 0;
		for(OrderItemComp item: items) {
			sb.append(item.getProduct().getName() + ", " + String.format("%.2f", item.getPrice()) + ", "+ "Quantity; "
			+ item.getQuantity() + ", " + "Subtotal: "
			+ "$" + String.format("%.2f", item.subTotal()) + "\n");
			totalPrice += item.subTotal();
		}
		sb.append("Total price: $" + totalPrice);
		return sb.toString();
	}
	
}
