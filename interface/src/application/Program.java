package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.println("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Data e hora da retirada(dd/MM/yyyy HH:MM): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno(dd/MM/yyyy HH:MM) : ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Entre com o preço por hora: ");
		double priceHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double priceDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(priceDay, priceDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico : " + String.format("%.2f", cr.getInvoice().getBasicPayment())) ;
		System.out.println("Imposto " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		sc.close();


}
}