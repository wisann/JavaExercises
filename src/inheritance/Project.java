package inheritance; 

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProject;

public class Project {

	public static void main(String[] args) throws ParseException { {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList<>();
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Product data #" + i + ":");
			System.out.print("Common, used, imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
		if(type == 'c') {
			list.add(new Product(name, price));
		}
		else if (type == 'u') {
			System.out.print("Fabrication date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			list.add(new UsedProject(name, price, date));
		}
		else if (type == 'i') {
			System.out.println("Customs fee: ");
			Double customs = sc.nextDouble();
			list.add(new ImportedProduct(name, price, customs));
		}
		
		}
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}
}}
