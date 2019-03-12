package edu.gcu.cst105.week4.tuesday;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Saving extends Account {
	private double ServiceFee = 25.00;
	private double annualInterestRate = 0.06;
	private double minBalance = 200.00;
	private double svngOut = 0;
	private double initialAmt = 0;
	private String accntID; 
	
	List<Transaction> tranlist = new ArrayList<Transaction>();	
	
	public double setMinBalance(double minBalance) {
		double interestRate;
		double lateFee;
	return minBalance;
	}
	public double getMinBalance() {
		
			return minBalance;
	}
	public double setServiceFee(double Servicefee) {
		
		
		return Servicefee;
	}
	public double getServiceFee() {
		
		
		return ServiceFee;
	}
	 
	public double getAnnualInterestRate() {
		
		return annualInterestRate;
		
	}
	public void Saving (double balance, String account) {
		this.initialAmt = balance;
		this.setAccntID(account);
		
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	 

    public void addTransaction(double amount, String type) {
        tranlist.add(new Transaction(super.getAccount(),amount,
                new Date(),type ));
    }

  
    public void viewAllTransaction() {
        for(Transaction t : tranlist) {
            System.out.println(t.toString());
        }
    }
	public double getSvngOut() {
		return svngOut;
	}
	public void setSvngOut(double svngOut) {
		this.svngOut = svngOut;
	}
	public String getAccntID() {
		return accntID;
	}
	public void setAccntID(String accntID) {
		this.accntID = accntID;
	}
	public double doEndMonth() {
		
		double intrAmt = 0;
		
		intrAmt = this.getBalance() * (this.getAnnualInterestRate()/12);
		System.out.println("Interest earned on savings account = $" + intrAmt + (" and has been added"));
		
		return intrAmt;
	}
}
	

