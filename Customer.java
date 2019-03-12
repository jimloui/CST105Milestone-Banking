package edu.gcu.cst105.week4.tuesday;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {
	private String firstName;
	private String lastName;
	private String dateOpened;
	private String cstid;
	public String transdate;
	
	public String getCstid() {
		return cstid;
	}
	public void setCstid(String cstid) {
		this.cstid = cstid;
	}

	Scanner sc = new Scanner(System.in);
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOpened() {
		
		return dateOpened;
	}
	public void setDateOpened(String dateOpened) {
		this.dateOpened = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		this.dateOpened = dateOpened;
	}
	
	private double savingsAccount() {
		return savingsAccount();
	}
	private double checkingAccount() {
		return checkingAccount();
	}
	private double loanAccount() {
		return loanAccount();
	}
	
	Bank b = new Bank();
	
	public Saving svng = new Saving();
	
	public Checking chckng = new Checking(2500.00, "54321");
	
	public Loan ln = new Loan();
	
	public void createACustomer() {
		this.firstName = "Bob";
		this.lastName = "Banker";
		this.dateOpened = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		this.ln.setBalance(-5000.00);
		this.setCstid("123456");
		System.out.println("Customer Bob Created " + this.getDateOpened());
		System.out.println("Initial loan balance set at = " + ln.getBalance());
				
	}
	public void getACustomer() {
		int option = 0;
				
		do {
		System.out.println("===================================");
		System.out.println("        MAIN MENU - Customer(s)");
		System.out.println("===================================");
		System.out.println("Pick a customer: ");
		System.out.println("---------------------");
		System.out.println(" 1:  : " + this.firstName + " " + this.lastName);
		System.out.println(" 2:  : blank");
		System.out.println(" 3:  : blank");
		System.out.println("---------------------");
		System.out.println(" 9:  : Back to Main Men");
		
		System.out.println("Please enter a customer selection.");
		option = sc.nextInt();
		
		switch (option) {
		case 1: 
			this.chckng.setBalance(2500.00);
			this.chckng.setOverdraft(45.00);
			this.svng.setServiceFee(25.00);
			this.svng.setAnnualInterestRate(0.06);
			this.svng.setMinBalance(200.00);
			this.ln.setBalance(-5000.00);
			this.setCstid("1001");
			System.out.println("Customer: " + this.getFirstName() + " " + this.getLastName() + " ID: " + getCstid() + " chosen.");
			this.serveACustomer();
			break;
		case 2:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
		case 3:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 4:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 5:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 6:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 7:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 8:
			// For future use
			System.out.println();
			System.out.println("Invalid option, please enter a valid option. ");
			System.out.println();
			break;
		case 9:
			// End of loop; exit program
			System.out.println();
			System.out.println("Exiting menu(s), have a nice day!");
			System.out.println();
			System.exit(0);
			break;
		default:
			// If all else fails; bounce
			System.out.println();
			System.out.println("Invalid entry, restart transaction. ");
			System.out.println();
			System.exit(0);
			break;
			
		}
		} while (option !=9 );

		
	}
	public void serveACustomer() {
	int option = 0;
	double amount = 0;
	svng.setBalance(500.00);
	svng.setAccntID("s123");
	
	do {
	System.out.println("===================================");
	System.out.println("             MAIN MENU");
	System.out.println("             " + this.getFirstName().toUpperCase() + " " + this.getLastName().toUpperCase());
	System.out.println("===================================");
	System.out.println("Pick an Option: ");
	System.out.println("---------------------");
	System.out.println(" 1:  : Deposit to Checking");
	System.out.println(" 2:  : Deposit to Savings");
	System.out.println(" 3:  : Write a Check");
	System.out.println(" 4:  : Withdraw from Savings");
	System.out.println(" 5:  : Make a Loan Payment");
	System.out.println(" 6:  : Get balances");
	System.out.println(" 7:  : Close Month (Calculate service fee and interest earned )");
	System.out.println("---------------------");
	System.out.println(" 9:  : Exit");
	
	System.out.println("Please enter a menu number.");
	option = sc.nextInt();
	
	switch (option) {
	case 1: 
		// Checking deposit
		System.out.println("Chk Balance: " + chckng.getBalance());
		System.out.println("Enter a deposit for checking: ");
		amount = sc.nextInt();
		chckng.doDeposit(amount);
		System.out.println("Chk Balance: " + chckng.getBalance());
		transdate = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		chckng.addTransaction(amount, "chkng deposit");
		//chckng.viewAllTransaction();
		System.out.println(chckng.tranlist);
        break;
	case 2:
		// Savings deposit
		System.out.println("Sav Balance: " + svng.getBalance());
		System.out.println("Enter a deposit for saving: ");
		amount = sc.nextInt();
		svng.doDeposit(amount);
		System.out.println("Saving Balance: " + svng.getBalance());
		svng.addTransaction(amount, "svng deposit");
		svng.viewAllTransaction();
		break;
	case 3:
		// Checking withdrawal i.e. write a check
		System.out.println("Chk Balance: " + chckng.getBalance());
		System.out.println("Enter an amount to withdraw from checking: ");
		amount = sc.nextInt();
		chckng.doWithdraw(amount);
		System.out.println("Chk Balance: " + chckng.getBalance());
		chckng.addTransaction((-1*amount), "chkng withdraw");
		chckng.viewAllTransaction();
		break;
	case 4:
		// Savings withdrawal
		System.out.println("Svng balance = " + svng.getBalance());
		System.out.println("Enter an amount to withdraw from savings: ");
		amount = sc.nextInt();
		svng.doWithdrawal(amount);
		System.out.println("Svng balance: " + svng.getBalance());
		svng.addTransaction((-1*amount), "svng withdraw");
		svng.setSvngOut(1);
		svng.viewAllTransaction();
		break;
	case 5:
		// Make a loan payment
		System.out.println("Loan balance = " + ln.getBalance());
		System.out.println("Enter a loan payment amount: ");
		amount = sc.nextInt();
		ln.doDeposit(amount);
		System.out.println("Loan balance: " + ln.getBalance());
		ln.addTransaction((amount), "Loan payment made");
		if (amount != 0) {
			ln.setLnPayMade(1);
		}else {
			ln.setLnPayMade(0);
			ln.addTransaction((amount), "No Loan payment made");
		}
		
		break;
	case 6:
		// Display balances
		this.displayBalanceScreen(chckng, svng, ln);
		break;
	case 7:
		// Do end of month assessments
		svng.balance = svng.balance + svng.doEndMonth();
		if (svng.balance < svng.getMinBalance()){
			svng.balance = svng.balance - svng.getServiceFee();
			System.out.println("*** Minimum savings low balance fee applied *** " );
			svng.addTransaction((amount), "Svng balance fee applied");
		} else {
			System.out.println("No saving balance fee applied");
			svng.addTransaction((amount), "No Svng fee applied");
		}
		if (ln.getLnPayMade() !=0 ) {
			System.out.println("Loan missed payment fee not assessed");
			ln.addTransaction((amount), "Loan payment made this month no fee applied");
			ln.setLnPayMade(0);
		} else {
			ln.setBalance(ln.balance - ln.getLateFee());
			ln.addTransaction((amount), "No Loan payment made this month; " + ln.getLateFee() +  " fee applied");			
		}
		svng.viewAllTransaction();
		ln.viewAllTransaction();
		break;
	case 8:
		System.out.println();
		System.out.println("Invalid option, please enter a valid option. ");
		System.out.println();
		break;
	case 9:
		System.out.println();
		System.out.println("Exiting menu(s), have a nice day!");
		System.out.println();
		System.exit(0);
		break;
	case 10:
		System.out.println();
		System.out.println("Exiting menu(s), have a nice day!");
		System.out.println();
		System.exit(0);
		break;
	default:
		System.out.println();
		System.out.println("Invalid entry, restart transaction. ");
		option = 9;
		System.out.println();
		break;		
	}
	}while (option != 9);
	}	

//private void actionMenu(/*int option, Checking checking, Saving saving, Loan loan*/) {
	
//	Bank bank = new Bank();
//	System.exit(0);
//	
//	// Based on option; execute appropriate case
//	switch (option) {
//	case 1: 
//		//bank.displayDepositChecking(checking);
//		cstmr.createACustomer();
//        break;
//	case 2:
//		//bank.displayDepositSaving(saving);
//		cstmr.getACustomer();
//		break;
//	case 3:
//		//bank.displayWithdrawChecking(checking);
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 4:
//		//bank.displayWithdrawSavings(saving);
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 5:
//		//bank.displayBalanceScreen(checking, saving);
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 6:
////		saving.balance = saving.balance + bank.doEndMonth(checking, saving);
////		if (saving.balance < saving.getMinBalance())
////			saving.balance = saving.balance - saving.getServiceFee();
////			System.out.println("*** Minimum saving balance fee applied *** " );
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 7:
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 8:
//		System.out.println();
//		System.out.println("Invalid option, please enter a valid option. ");
//		System.out.println();
//		break;
//	case 9:
//		System.out.println();
//		System.out.println("Exiting menu(s), have a nice day!");
//		System.out.println();
//		break;
//	default:
//		System.out.println();
//		System.out.println("Invalid entry, restart transaction. ");
//		option = 9;
//		System.out.println();
//		break;
//		
//	}
//}
//private double doEndMonth(Checking checking, Saving saving) {
//	
//	double intrAmt = 0;
//	
//	intrAmt = saving.getBalance() * (saving.getAnnualInterestRate()/12);
//	System.out.println("Interest earned on savings account = $" + intrAmt + (" and has been added"));
//	
//	return intrAmt;
//	
//}
//private void displayExitScreen() {
//	
//	
//}
private void displayBalanceScreen(Checking chckng, Saving svng, Loan ln) {
	 
	System.out.println("");
	if (chckng.getBalance() >= 0)  {
		System.out.printf("Current checking balance = $" + "%.2f", chckng.getBalance());
		System.out.println();
	}else {
		System.out.printf("Current checking balance = ($" + "%.2f", -1*chckng.getBalance());
		System.out.println(")");
	}
	if (svng.getBalance() >= 0)  {
		System.out.printf("Current saving balance = $" + "%.2f", svng.getBalance());
		System.out.println();
	}else {
		System.out.printf("Current saving balance = ($" + "%.2f", -1*svng.getBalance());
		System.out.println(")");
		System.out.println();
	}
	if (ln.getBalance() >= 0)  {
		System.out.printf("Current loan balance = $" + "%.2f", ln.getBalance());
		System.out.println();
	}else {
		System.out.printf("Current loan balance = ($" + "%.2f", -1*ln.getBalance());
		System.out.println(")");
	}
}	
//private void displayWithdrawSavings(Saving saving) {
//	
//	System.out.println("");
//	System.out.println("You will have a $" + saving.getServiceFee() + " service fee if balance is below $" + saving.getMinBalance() + " at the end of the month. ");
//	System.out.println("Enter amount to withdraw from saving :");
//	input = scanIn.nextDouble();
//	saving.balance -= input;
//	
//	if (saving.getBalance() >= 0)  {
//		System.out.println("Current saving balance = $" + saving.getBalance()); 
//		System.out.println();
//	}else {
//		System.out.printf("Current saving balance = ($" + "%.2f", -1*saving.getBalance());
//		System.out.println(")");
//	if (saving.getBalance() < saving.getMinBalance())
//		saving.balance -= saving.getServiceFee();
//	}
//
//}
//private void displayWithdrawChecking(Checking checking) {
//	
//	System.out.println("Withdraw from checking (54321)");
//	System.out.print("Your current checking balance = $");
//	System.out.printf("%.2f", checking.getBalance());
//	System.out.println();
//	System.out.print("You will have a $");
//	System.out.printf("%.2f", checking.getOverdraft());
//	System.out.println(" overdraft fee if check amount withdrawal is greater than balance.");
//	System.out.println();
//	System.out.println("Enter amount to withdraw from checking :");
//	input = scanIn.nextDouble();
//	checking.balance -= input;
//	System.out.println();
//	if (checking.balance < 0) {
//		checking.balance = checking.balance - checking.getOverdraft();
//		System.out.println();
//		System.out.print("***OVERDRAFT NOTICE***:  $");
//		System.out.printf("%.2f", checking.getOverdraft());
//		System.out.println(" fee assessed!");
//		System.out.println();
//	}else if (checking.getBalance() >= 0)  {
//			System.out.printf("Current checking balance = $" + "%.2f", checking.getBalance());
//			System.out.println();
//		}else {
//			System.out.printf("Current checking balance = ($" + "%.2f", -1*checking.getBalance());
//			System.out.println(")");
//		}
//	}
//
//private void displayDepositSaving(Saving saving) {
//	System.out.println("Deposit into saving (1234)");
//	System.out.print("Your current saving balance = $");
//	System.out.printf("%.2f", saving.getBalance());
//	System.out.println();
//	System.out.println("Enter amount to deposit into saving :");
//	input = scanIn.nextDouble();
//	saving.balance += input;
//	System.out.println();
//	if (saving.getBalance() >= 0)  {
//		System.out.printf("Current saving balance = $" + "%.2f", saving.getBalance());
//		System.out.println();
//	}else {
//		System.out.printf("Current saving balance = ($" + "%.2f", -1*saving.getBalance());
//		System.out.println(")");
//	}
//	
//}
//private void displayDepositChecking(Checking checking) {
//	
//	System.out.println("Deposit into checking (54321)");
//	System.out.print("Your current checking balance = $");
//	System.out.printf("%.2f", checking.getBalance());
//	System.out.println();
//	System.out.println("Enter amount to deposit into checking :");
//	input = scanIn.nextDouble();
//	checking.balance += input;
//	System.out.print("Amount deposited, your current checking balance = $");
//	System.out.printf("%.2f", checking.getBalance());
//	System.out.println();
//	
//	
//}
//
//
//	
//}
//
//
//
//

	}



