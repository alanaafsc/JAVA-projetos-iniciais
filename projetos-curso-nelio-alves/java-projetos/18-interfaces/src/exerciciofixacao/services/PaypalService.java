package exerciciofixacao.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double interest(double amount, int months) {
		return months * 0.01 * amount;
	}

	@Override
	public double paymentFee(double amount) {
		return 0.02 * amount;
	}
}
