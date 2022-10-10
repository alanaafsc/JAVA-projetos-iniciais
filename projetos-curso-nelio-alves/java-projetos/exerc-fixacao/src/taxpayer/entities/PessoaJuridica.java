package taxpayer.entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numberEmployees;
	
	public PessoaJuridica() {}
	
	public PessoaJuridica(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxesPaid() {
		double taxesPaid = 0.0;
		
		if(numberEmployees > 10) {
			taxesPaid = getAnualIncome()*0.14;
		}else {
			taxesPaid = getAnualIncome()*0.16;
		}
		
		return taxesPaid;
	}

}
