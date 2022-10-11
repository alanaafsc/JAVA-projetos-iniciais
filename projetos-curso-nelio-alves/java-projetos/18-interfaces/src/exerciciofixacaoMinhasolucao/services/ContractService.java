package exerciciofixacaoMinhasolucao.services;

import java.time.LocalDate;

import exerciciofixacaoMinhasolucao.entities.Contract;
import exerciciofixacaoMinhasolucao.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		LocalDate date = contract.getDate();
		LocalDate dateInstallment;
		for(int i = 1; i<= months; i++) {
			double amount = contract.getTotalValue()/months;
			dateInstallment = date.plusMonths(i);
			double amountInterest = onlinePaymentService.interest(amount, i) + amount;
			double amountPaymentFee = onlinePaymentService.paymentFee(amountInterest) + amountInterest;
			contract.getInstallments().add(new Installment(dateInstallment, amountPaymentFee));
		}
	}
}
