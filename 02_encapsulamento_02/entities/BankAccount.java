package entities;

public class BankAccount {

	private static int countAccount = 1000;
	private String accountNumber;
	private double balance;
	
	 public BankAccount(double initialBalance) {
	     this.balance = validateBalance(initialBalance);
	     countAccount++;
	     this.accountNumber = "ACC-" + countAccount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean hasPositiveBalance() {
		return balance > 0.0;
	}
	
	public void deposit(double amount) {
		if(amount <= 0.0) {
			throw new IllegalArgumentException("Deposit amount must be greater than zero.");
		}
		balance += amount;
	}
	
	public void withdrawal(double amount) {
		switch(Double.valueOf(amount)) {
		case Double a when a <= 0.0    -> throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
		case Double a when a > balance -> throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
		default -> balance -= amount;
		}
	}
	
	//fail-fast
	public static double validateBalance(double balance) {
		if(balance < 0.0) {
			throw new IllegalArgumentException("The bank balance cannot be negative.");
		}
		return balance;
	}
	
	@Override
	public String toString() {
		return
				"Account Number .............................: " + getAccountNumber() + "\n" +
				"Balance ....................................: ($) " + getBalance() + "\n" + 
				"Sufficient balance for withdrawal ..........: " + (hasPositiveBalance() ? "Yes" : "No") + "\n";
 				
	}
}
