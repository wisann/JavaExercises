package composition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("email: ");
		String email = sc.nextLine();
		System.out.println("Birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		System.out.println("How many items to this order?: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.println("Enter #" + i + " item data: ");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: " );
			Double productprice = sc.nextDouble();
			Product product = new Product(productName, productprice);
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, productprice, product);
			order.addItem(orderItem);
	}
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
	
	
		sc.close();
	}}
