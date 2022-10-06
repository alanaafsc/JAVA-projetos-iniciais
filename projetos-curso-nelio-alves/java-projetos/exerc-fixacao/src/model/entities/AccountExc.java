package model.entities;

import model.exceptions.DomainException;

public class AccountExc {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public AccountExc() {
	}

	public AccountExc(Integer number, String holder, Double balance, Double withdrawLimit) {
		// if(number.getClass() != int.class){
		// throw new DomainException("Account number must have only numbers");
		// }
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit && amount <= balance) {
			throw new DomainException("The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}

}
