package entities;

public class Account {
	
	private static final double MINIMUM_BALANCE = 50.00;
	private static final double MONTHLY_INTEREST_RATE = 0.065;

	private String accountNumber;
	private double balance;
	private int countDeposit;
	private int countWithdrawal;
	private boolean minimumBalanceActivated;
	private double monthlyInstallment;
	
	public Account(String accountNumber, double initialBalance) {
		this.accountNumber = validateAccountNumber(accountNumber);
		this.balance = validateBalance(initialBalance);
		updateMinimumBalanceStatus();
	}
	
	public void updateMinimumBalanceStatus() {
		if(!minimumBalanceActivated && balance >= MINIMUM_BALANCE) {
			minimumBalanceActivated = true;
		}
	}

	public void deposit(double amount) {
		if(amount <= 0.0) throw new IllegalArgumentException("Error: The deposit amount must be greater than zero!");
		this.balance += amount;
		countDeposit++;
		updateMinimumBalanceStatus();
	}
	
	public void withdrawal(double amount) {
		switch(Double.valueOf(amount)) {
		case Double a when a <= 0.0 -> throw new IllegalArgumentException("Error: The withdrawal amount must be greater than zero!");
		case Double a when (minimumBalanceActivated && (balance - a) < MINIMUM_BALANCE) -> 
			throw new IllegalArgumentException("Withdrawal declined! This account has already triggered the minimum balance rule of $ " + MINIMUM_BALANCE);
		case Double a when a > balance -> throw new IllegalArgumentException("Error: Insufficient balance to perform the withdrawal!");
		default -> { balance -= amount;
		            countWithdrawal++;
			}
		};
	}
	
	public void calculateMonthlyInstanllment(double loanAmount) {
		if (loanAmount <= 0.0) {
			throw new IllegalArgumentException("Error: Loan amount must be greater than zero!");
		}
		this.monthlyInstallment = loanAmount * (MONTHLY_INTEREST_RATE * Math.pow((1 + MONTHLY_INTEREST_RATE), 12)) / (Math.pow((1 + MONTHLY_INTEREST_RATE), 12) - 1);
	}
	
	//fail-fast
	public static String validateAccountNumber(String accountNumber) {
		if(accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Error: Account number cannot be null or empty!");
		}
		return accountNumber;
	}
	
	//fail-fast
	public static double validateBalance(double balance) {
		if(balance < 0.0) {throw new IllegalArgumentException("Error: Balance cannot be negative!");}
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\n" +
				String.format("Balance ($) ...........................................: %.2f%n", balance) +
				String.format("Number of deposits ....................................: %d%n", countDeposit) +
				String.format("Number of withdrawal ..................................: %d%n", countWithdrawal) + 
				String.format("Minimum balance .......................................: %s%n", (minimumBalanceActivated) ? "Active ($ " + MINIMUM_BALANCE + ")" : "Disabled") +
				String.format("Monthly loan installments .............................: %.2f\n", monthlyInstallment) + 
				String.format("total amount to be paid on the loan (12x) .............: %.2f", monthlyInstallment * 12);
	}
	
}
