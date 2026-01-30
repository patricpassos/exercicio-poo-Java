package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //encapsulamento do metodo-deposit, passando o deposito inicial
	}
	
	public int getNumber() {
		return number; //o numero da não pode ser alterado
	}
	
	public String getHolder(String holder) {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance; //O saldo só pode ser alterado via deposito ou saque
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return
				"\nAccount "
				+ number
				+ ", holder: "
				+ holder
				+ ", balance: $ "
				+ String.format("%.2f", balance);
	}
}
