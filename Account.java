package edu.gcu.cst105.week4.tuesday;

public abstract class Account implements iTrans {
	double balance;
	private int account;
	
	public double getBalance() {
		
	return this.balance;
			
	}
	public void setBalance(double balance) {
		
		
		this.balance = balance;
	}
	public int getAccount() {
		
		
		return account;
	}
	public void setAccount(int account) {
		
		
		this.account = account;
		
	}
	public double doWithdrawal(double amount) {
		this.balance = balance - amount;	
		return this.balance;
		
		
	}
	public double doDeposit(double amount) {
		
		this.balance = balance + amount;
		return this.balance;
	}
	
}
