package entities;

public class BankAccount {

	private String holder;
	private String typeAccount;
	private int numberAccount;
	private double balance;

	public BankAccount(String holder, String typeAccount, int numberAccount) {
		this.holder = holder;
		this.typeAccount = typeAccount;
		this.numberAccount = numberAccount;
		initializeBalance();
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void statusAccount() {
		System.out.println("---------------------------");
		System.out.println("Name: " + this.holder);
		if (this.typeAccount.equals("SA")) {
			System.out.println("Type: Salary account");
		} else if (this.typeAccount.equals("AV")) {
			System.out.println("Type: Savings account");
		} else if (this.typeAccount.equals("SI")) {
			System.out.println("Type: Investment account");
		}
		System.out.println("Account: " + numberAccount);
		System.out.println("Balance: " + balance);
	}

	public void initializeBalance() {
		if (typeAccount.equals("SA")) {
			this.balance = 0.00;
		} else if (typeAccount.equals("AV")) {
			this.balance = 50.00;
		} else if (typeAccount.equals("AI")) {
			this.balance = 100.00;
		} else {
			this.balance = 0.00;
		}
	}

	public void deposit(double initialDeposit) {
		if (initialDeposit < 0.0) {
			balance = 0.0;
		} else {
			balance += initialDeposit;
		}
	}

	public void sacar(double saque) {
		if (typeAccount.equals("SA")) {
			balance -= saque;
		} else if (typeAccount.equals("AV") && saque > 50.0) {
			balance -= saque + 50.0;
		} else if (typeAccount.equals("AI") && saque > 100.0) {
			balance -= saque + 100.0;
		} else {
			System.out.println("Impossible");
		}
	}
}
