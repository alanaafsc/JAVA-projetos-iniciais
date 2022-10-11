package exerciciofixacao.services;

import java.time.LocalDate;

import exerciciofixacao.entities.Contract;
import exerciciofixacao.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double amountMonth = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dateInstallment = contract.getDate().plusMonths(i);
			double amountInterest = onlinePaymentService.interest(amountMonth, i) + amountMonth;
			double amountPaymentFee = onlinePaymentService.paymentFee(amountInterest) + amountInterest;
			contract.getInstallments().add(new Installment(dateInstallment, amountPaymentFee));
		}
	}
}
