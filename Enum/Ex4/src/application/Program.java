package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("BirthDate: ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order status");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		System.out.print("how many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + "item data: ");
			System.out.print("Product name: ");
			String Productname = sc.next();
			System.out.print("Product price: ");
			Double Productprice = sc.nextDouble();
			Product product = new Product(Productname, Productprice);
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderitem = new OrderItem(quantity, Productprice, product);
			order.addItem(orderitem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		sc.close();

	}

}
