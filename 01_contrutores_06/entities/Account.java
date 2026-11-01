package entities;

public class Account {

	private String accountNumber;
	private double balance;
	private int countDeposit;
	private int countWithdrawal;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = validateAccountNumber(accountNumber);
		this.balance = validateBalance(balance);
	}

	public void accountDeposit(double deposit) {
		if(deposit <= 0.0) throw new IllegalArgumentException("Error: The deposit amount must be greater than zero!");
		this.balance += deposit;
		countDeposit++;
	}
	
	public void accountWithdrawal(double withdrawal) {
		if(withdrawal <= 0.0) throw new IllegalArgumentException("Error: The withdrawal amount must be greater than zero!");
		if(withdrawal > balance) throw new IllegalArgumentException("Error: Insufficient balance to perform the withdrawal!");
		balance -= withdrawal;
		countWithdrawal++;
	}
	
	/*public double personalLoan(double loan) {
		return 
	}*/

	//fail-fast
	public static String validateAccountNumber(String accountNumber) {
		if(accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Error: Account number cannot be null or empty!");
		}
		return accountNumber;
	}
	
	//fail-fast
	public static double validateBalance(double balance) {
		if(balance < 0.0) {
			throw new IllegalArgumentException("Error: Balance cannot be negative!");
		}
		return balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\n" +
				String.format("Balance ($) ..............: %.2f%n", balance) +
				String.format("Number of deposits .......: %d%n", countDeposit) +
				String.format("Number of withdrawal .....: %d", countWithdrawal);
				
				//"Retirada teste: " + balance
				//String.format("Deposito teste +%.2f", accountDeposit());
	}
	
}
