package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private double pricePerDday;
	private double pricePerHour;

	TaxServices taxService = new BrazilTaxService();

	public RentalService(double pricePerDday, double pricePerHour, TaxServices taxService) {
		this.pricePerDday = pricePerDday;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
			//*essa função math.ceil transforma em fração os minutos(que sao as horas)
		} else {
			basicPayment = pricePerDday * Math.ceil(hours / 24);
		}
		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
