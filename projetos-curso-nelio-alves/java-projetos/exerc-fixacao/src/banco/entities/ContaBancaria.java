package banco.entities;

public class ContaBancaria {
	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(String numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public ContaBancaria(String numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	public void saques(double saque) {
		this.saldo -= saque + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", saldo);
	}
	

	
	
}
