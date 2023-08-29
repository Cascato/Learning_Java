package entities;

public class Bank {
	private int accountNumber;
	private String name;
	private double money;
	
	public Bank(int accountNumber, String name, double initialMoney) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialMoney);
	}
	public Bank(int accountNumber, String name ) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void deposit(double money) {
		this.money += money;
	}
	public void withdraw(double money) {
	    this.money -= money + 5;
	}

	public String toString() {
	      return  accountNumber
				+ ","
				+ " Holder: "
			    + name
			    + ","
				+ " Balance: $ "
				+ String.format("%.2f", money);
		
	}
}


