package edu.gcu.cst105.week4.tuesday;


public class Saving extends Account {
	private double ServiceFee = 25.00;
	private double annualInterestRate = 0.06;
	private double minBalance = 200.00;
	
	public double setMinBalance(double minBalance) {
		
		
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
		
		System.out.println("In getAnnualInterestRate");
		return annualInterestRate;
		
	}
	public Saving (double balance, String account) {
		
		
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	 
	
	}
	

