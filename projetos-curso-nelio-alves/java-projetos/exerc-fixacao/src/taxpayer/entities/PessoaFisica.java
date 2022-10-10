package taxpayer.entities;

public class PessoaFisica extends Pessoa{
	
	private Double healthExpenses;

	public PessoaFisica() {}

	public PessoaFisica(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxesPaid() {
		double taxesPaid = 0.0;
		if(getAnualIncome() < 20000.00) {
			taxesPaid = getAnualIncome()*0.15;
			
		}else if(getAnualIncome() >= 20000.00) {
			taxesPaid = getAnualIncome()*0.25;
		}
		if(healthExpenses != 0) {
			taxesPaid -= healthExpenses*0.5;
		}
		return taxesPaid;
	}

}
