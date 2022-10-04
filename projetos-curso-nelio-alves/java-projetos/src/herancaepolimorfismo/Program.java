package herancaepolimorfismo;

public class Program {
	
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex Green", 0.0);
		BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//upcasting
		Account acc1 = bAcc;
		Account acc2 = new BusinessAccount(1003, "Joao", 0.0, 600.0);
		Account acc3 = new SavingsAccount(1004, "Tiago", 0.0, 0.01);
		
		//downcasting
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(400.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Override
		Account conta = new Account(1100, "Katia", 1000.0);
		conta.withdraw(200.0);
		System.out.println(conta.getBalance());
		
		Account conta2 = new SavingsAccount(1007, "Maria", 1000.0, 0.01);
		conta2.withdraw(200.0);
		System.out.println(conta2.getBalance());
		
		Account conta3 = new BusinessAccount(1010, "Sonia", 1000.0, 500.0);
		conta3.withdraw(200.0);
		System.out.println(conta3.getBalance());
	}
}
