package edu.gcu.cst105.week4.tuesday;

public class Checking extends Account {

	private double overDraft;
	
	public double setOverdraft(double misbalance) {
		
		this.overDraft = misbalance;
		
		return this.overDraft; 
	}
	public double getOverdraft() {
		
		return this.overDraft;
	}
	public double doWithdraw(double amount) {
		
		return amount;
	}
	public Checking(double balance, String account) {
		
		 
	}
	public double getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
}
