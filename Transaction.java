package edu.gcu.cst105.week4.tuesday;

import java.util.Date;

public class Transaction {
	private Date transaction;
	private int accountName;
	private double amount;
	private String type;
	
	
	//public Transaction(Date date, int account, double amount2, String type2) {
	public Transaction(int account, double amount2, Date date, String type2) {
		// TODO Auto-generated constructor stub
		this.accountName = account;
		this.amount = amount2;
		this.transaction = date;
		this.type = type2;
	}

		public Date getTransaction() {
		return transaction;
	}

	public void setTransaction(Date transaction) {
		this.transaction = transaction;
	}

	public int getAccountName() {
		return accountName;
	}

	public void setAccountName(int accountName) {
		this.accountName = accountName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		//return date + accountName + amount + type + date
		//syso.(checking.translist.toString()).
		return  this.getType();
	}
}
