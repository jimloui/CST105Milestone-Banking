package edu.gcu.cst105.week4.tuesday;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Checking extends Account {

	double interestRate;
	double lateFee;
	
	List<Transaction> tranlist = new ArrayList<Transaction>();
	
	private double overDraft;
	
	public double setOverdraft(double misbalance) {
		
		this.overDraft = misbalance;
		
		return this.overDraft; 
	}
	public double getOverdraft() {
		
		return this.overDraft;
	}
	public double doWithdraw(double amount) {
		super.balance = super.balance - amount;
//		System.out.println("From chkng class " + super.getBalance());
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

    public void addTransaction(double amount, String type) {
        tranlist.add(new Transaction(super.getAccount(),amount,
                new Date(),type ));
    }

    public void viewAllTransaction() {
        for(Transaction t : tranlist) {
            System.out.println(t.toString());
        }
    }
	public void addTransaction(String transdate, String cstid, double amount, String string) {
		// TODO Auto-generated method stub
		
	}
}
