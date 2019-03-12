package edu.gcu.cst105.week4.tuesday;

import java.util.Scanner;

public class Bank {
	private String name;
	private double input;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	static Scanner scanIn = new Scanner(System.in);
	
	static Customer cstmr = new Customer();
	
	
	public static void main(String[] args) {
// Create objects of each class to call methods within
		
		Bank bank = new Bank();
		bank.setName("GCU Credit Union");
		
		Loan loan = new Loan();
		
		// Set beginning balances

		
//		
//		cstmr.saving.setBalance(500.00);
//		cstmr.saving.setServiceFee(25.00);
//		cstmr.saving.setAnnualInterestRate(0.06);
//		cstmr.saving.setMinBalance(200.00);
//		
		// loan.setInterestRate initialized in loan class
		
		bank.disPlayMenu();
	}

		
	private void disPlayMenu() {
		 
		int option = 0;
		do {
			System.out.println("===================================");
			System.out.println("             MAIN MENU");
			System.out.println("          "+ this.name.toUpperCase());
			System.out.println("===================================");
			System.out.println("Pick an Option: ");
			System.out.println("---------------------");
			System.out.println(" 1:  : Create a customer");
			System.out.println(" 2:  : Pick a customer");
			System.out.println("---------------------");
			System.out.println(" 9:  : Exit Bank");
			
			System.out.println("Please choose an Option: ");
			option = scanIn.nextInt();
			 
			switch (option) {
			case 1: 
				// Create a customer
				cstmr.createACustomer();
	            break;
			case 2:
				// Select a customer; initial accounts
				cstmr.getACustomer();
				break;
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
				// End of loop; exit
				System.out.println();
				System.out.println("Exiting menu(s), have a nice day!");
				System.out.println();
				System.exit(0);
				break;
			default:
				// If all else fails; bounce
				System.out.println();
				System.out.println("Invalid entry, restart transaction. ");
				option = 9;
				System.out.println();
				System.exit(0);
				break;
				
			}
		}while (option !=9 );
	}
// Old code; saving just in case
//}

//		}if (option == 1) {
//				cstmr.createACustomer();
//				disPlayMenu();
//			}
//			
//			if(option >= 2 && option < 9 ) {
//				disPlayMenu();
//			}else if (option == 9) {
//				System.out.println();
//				System.out.println("Exiting menu(s), have a nice day!");
//				System.out.println();
//				System.exit(0);
//			}
//			}while (option !=9 );
// 
//			cstmr.getACustomer();
//			}
//			//			option = scanIn.nextInt();
////			this.actionMenu(option, checking, saving);
//			
			
//}
////		do {
////		System.out.println("===================================");
////		System.out.println("             MAIN MENU");
////		System.out.println("          "+ this.name.toUpperCase());
////		System.out.println("===================================");
////		System.out.println("Pick an Option: ");
////		System.out.println("---------------------");
////		System.out.println(" 1:  : Deposit to Checking");
////		System.out.println(" 2:  : Deposit to Savings");
////		System.out.println(" 3:  : Write a Check");
////		System.out.println(" 4:  : Withdraw from Savings");
////		System.out.println(" 5:  : Get balance");
////		System.out.println(" 6:  : Close Month (Calculate service fee and interest earned )");
////		System.out.println("---------------------");
////		System.out.println(" 9:  : Exit");
////		
////		if(option != 9) {
////			System.out.println("Please enter a menu number.");
////			option = scanIn.nextInt();
////			this.actionMenu(option, checking, saving);
////		}
////		//option = scanIn.nextInt();
////		//this.actionMenu(option, checking, saving);
////		
////		}while (option !=9 );
//	}
//	
//	private void actionMenu(int option, Checking checking, Saving saving) {
//		
//		//Bank bank = new Bank(name);
//		
//		// Based on option; execute appropriate case
//		switch (option) {
//		case 1: 
//			//bank.displayDepositChecking(checking);
//			cstmr.createACustomer();
//            break;
//		case 2:
//			//bank.displayDepositSaving(saving);
//			cstmr.getACustomer();
//			break;
//		case 3:
//			//bank.displayWithdrawChecking(checking);
//			System.out.println();
//			System.out.println("Invalid option, please enter a valid option. ");
//			System.out.println();
//			break;
//		case 4:
//			//bank.displayWithdrawSavings(saving);
//			System.out.println();
//			System.out.println("Invalid option, please enter a valid option. ");
//			System.out.println();
//			break;
//		case 5:
//			//bank.displayBalanceScreen(checking, saving);
//			System.out.println();
//			System.out.println("Invalid option, please enter a valid option. ");
//			System.out.println();
//			break;
//		case 6:
////			saving.balance = saving.balance + bank.doEndMonth(checking, saving);
////			if (saving.balance < saving.getMinBalance())
////				saving.balance = saving.balance - saving.getServiceFee();
////				System.out.println("*** Minimum saving balance fee applied *** " );
//			break;
//		case 7:
//			System.out.println();
//			System.out.println("Invalid option, please enter a valid option. ");
//			System.out.println();
//			break;
//		case 8:
//			System.out.println();
//			System.out.println("Invalid option, please enter a valid option. ");
//			System.out.println();
//			break;
//		case 9:
//			System.out.println();
//			System.out.println("Exiting menu(s), have a nice day!");
//			System.out.println();
//			break;
//		default:
//			System.out.println();
//			System.out.println("Invalid entry, restart transaction. ");
//			option = 9;
//			System.out.println();
//			break;
//			
//		}
//	}
//	public double doEndMonth(Checking checking, Saving saving) {
//		
//		double intrAmt = 0;
//		
//		intrAmt = saving.getBalance() * (saving.getAnnualInterestRate()/12);
//		System.out.println("Interest earned on savings account = $" + intrAmt + (" and has been added"));
//		
//		return intrAmt;
		
	}
	
//	private void displayExitScreen() {
//		
//		
//	}
//	private void displayBalanceScreen(Checking checking, Saving saving) {
//		 
//		System.out.println("");
//		if (checking.getBalance() >= 0)  {
//			System.out.printf("Current checking balance = $" + "%.2f", checking.getBalance());
//			System.out.println();
//		}else {
//			System.out.printf("Current checking balance = ($" + "%.2f", -1*checking.getBalance());
//			System.out.println(")");
//		}
//		if (saving.getBalance() >= 0)  {
//			System.out.printf("Current saving balance = $" + "%.2f", saving.getBalance());
//			System.out.println();
//		}else {
//			System.out.printf("Current saving balance = ($" + "%.2f", -1*saving.getBalance());
//			System.out.println(")");
//		}
//	}	
//	private void displayWithdrawSavings(Saving saving) {
//		
//		System.out.println("");
//		System.out.println("You will have a $" + saving.getServiceFee() + " service fee if balance is below $" + saving.getMinBalance() + " at the end of the month. ");
//		System.out.println("Enter amount to withdraw from saving :");
//		input = scanIn.nextDouble();
//		saving.balance -= input;
//		
//		if (saving.getBalance() >= 0)  {
//			System.out.println("Current saving balance = $" + saving.getBalance()); 
//			System.out.println();
//		}else {
//			System.out.printf("Current saving balance = ($" + "%.2f", -1*saving.getBalance());
//			System.out.println(")");
//		if (saving.getBalance() < saving.getMinBalance())
//			saving.balance -= saving.getServiceFee();
//		}
//	
//	}
//	private void displayWithdrawChecking(Checking checking) {
//		
//		System.out.println("Withdraw from checking (54321)");
//		System.out.print("Your current checking balance = $");
//		System.out.printf("%.2f", checking.getBalance());
//		System.out.println();
//		System.out.print("You will have a $");
//		System.out.printf("%.2f", checking.getOverdraft());
//		System.out.println(" overdraft fee if check amount withdrawal is greater than balance.");
//		System.out.println();
//		System.out.println("Enter amount to withdraw from checking :");
//		input = scanIn.nextDouble();
//		checking.balance -= input;
//		System.out.println();
//		if (checking.balance < 0) {
//			checking.balance = checking.balance - checking.getOverdraft();
//			System.out.println();
//			System.out.print("***OVERDRAFT NOTICE***:  $");
//			System.out.printf("%.2f", checking.getOverdraft());
//			System.out.println(" fee assessed!");
//			System.out.println();
//		}else if (checking.getBalance() >= 0)  {
//				System.out.printf("Current checking balance = $" + "%.2f", checking.getBalance());
//				System.out.println();
//			}else {
//				System.out.printf("Current checking balance = ($" + "%.2f", -1*checking.getBalance());
//				System.out.println(")");
//			}
//		}
//	
//	private void displayDepositSaving(Saving saving) {
//		System.out.println("Deposit into saving (1234)");
//		System.out.print("Your current saving balance = $");
//		System.out.printf("%.2f", saving.getBalance());
//		System.out.println();
//		System.out.println("Enter amount to deposit into saving :");
//		input = scanIn.nextDouble();
//		saving.balance += input;
//		System.out.println();
//		if (saving.getBalance() >= 0)  {
//			System.out.printf("Current saving balance = $" + "%.2f", saving.getBalance());
//			System.out.println();
//		}else {
//			System.out.printf("Current saving balance = ($" + "%.2f", -1*saving.getBalance());
//			System.out.println(")");
//		}
//		
//	}
//	private void displayDepositChecking(Checking checking) {
//		
//		System.out.println("Deposit into checking (54321)");
//		System.out.print("Your current checking balance = $");
//		System.out.printf("%.2f", checking.getBalance());
//		System.out.println();
//		System.out.println("Enter amount to deposit into checking :");
//		input = scanIn.nextDouble();
//		checking.balance += input;
//		System.out.print("Amount deposited, your current checking balance = $");
//		System.out.printf("%.2f", checking.getBalance());
//		System.out.println();
//		
//		
//	}
//	
//	
//		
//	}
//
//
//
//

