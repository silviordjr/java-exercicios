package entities;

public class Accounts {
	private String accountId;
	private String name;
	private double amount;
	
	public Accounts (String accountId, String name, double initialDeposit) {
		this.accountId = accountId;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Accounts (String accountId, String name) {
		this.accountId = accountId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void withdraw (double value) {
		this.amount = this.amount - (value + 5);
	}
	
	public void deposit (double value) {
		this.amount = this.amount + value;
	}
	
	public String getAccountId () {
		return this.accountId;
	}
}
