package model.services;

public interface OnlinePaymentSource {
	double paymentFee(double amount);
	double interest(double amount,Integer months );
}
