package model.entities;

import model.exceptions.DomainException01;

public class AccountUser {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public AccountUser(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) throws DomainException01 {
		validadeWithdraw(amount);
		balance -= amount;
	}
	
	private void validadeWithdraw(Double amount) throws DomainException01 {
		if (amount > getWithdrawLimit()) {
			throw new DomainException01("Withdraw error: The amount exceeds withdraw limit");
		}
		
		if(amount > getBalance()) {
			throw new DomainException01("Withdraw error: Not enough balance");
		}
	}

}
