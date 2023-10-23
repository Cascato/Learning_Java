package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> Orderitems = new ArrayList<>();
	
	public Order() {
	};

	public Order(Date moment, OrderStatus status, Client client) {
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

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderitems() {
		return Orderitems;
	}

	public void addItem(OrderItem item) {
		Orderitems.add(item);
		
	}
	public void removeItem(OrderItem item) {
		Orderitems.remove(item);
	}
	public double total() {
		double sum = 0;
		for(OrderItem item : Orderitems) {
			sum = item.subTotal() + item.subTotal();
		}
		return sum;
	}
	
	public String ToString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("Order moment" + sdf.format(moment));
	    sb.append("Order status "+status);
	    sb.append("Client"+ client);
	    sb.append("Ordem items");
	    for(OrderItem item : Orderitems) {
	    	System.out.println(item);
	    }
	    sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
	    
		
		return sb.toString();
	}
	
	
	
	

}
