package atmV1;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public boolean hasSufficientBalance(double amount) {
		return this.balance >= amount;
	}
	
	public void debit(double amount) {
		if (!hasSufficientBalance(amount)) {
			throw new RuntimeException("Insufficient balance");
		}
		balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
