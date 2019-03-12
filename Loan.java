package edu.gcu.cst105.week4.tuesday;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loan extends Account {
	private double interestRate = 0.0;
	private double lateFee = 45.00;
	private int lnPayMade = 0;

	List<Transaction> tranlist = new ArrayList<Transaction>();	
	
public double doEndofMonthInterest() {
		
		double intrAmt = 0;
		
		intrAmt = this.getBalance() * (this.getInterestRate()/12);
		System.out.println("Interest earned on savings account = $" + intrAmt + (" and has been added"));
		
		return intrAmt;
}

public double checkLateFee() {
	return 0; 
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
	
}

public double getLateFee() {
	return lateFee;
}

public void setLateFee(double lateFee) {
	this.lateFee = lateFee;
}


public void addTransaction(double amount, String type) {
    tranlist.add(new Transaction(super.getAccount(),amount,
            new Date(),type ));
}


public void viewAllTransaction() {
    for(Transaction t : tranlist) {
        System.out.println(t);
    }
}

public double getLnPayMade() {
	this.lnPayMade = lnPayMade;
	return lnPayMade;
}

public void setLnPayMade(int lnPayMade) {
	this.lnPayMade = lnPayMade;
}

	
}