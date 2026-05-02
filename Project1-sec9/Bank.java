package project;
import java.util.Scanner;
public class Bank {

	
	Account a1=new Account();
	
	public void displayMainMenu() {
		
		System.out.println("Please Select an Operation (1-8):");
		System.out.println("1- Add Account");
		System.out.println("2- View All Accounts");
		System.out.println("3- Add Amount");
		System.out.println("4- Withdraw Amount");
		System.out.println("5- View Account Details");
		System.out.println("6- Modify Account");
		System.out.println("7- Close an Account");
		System.out.println("8- Exit");
		System.out.println();
		
		Scanner in=new Scanner(System.in);
		int op=in.nextInt();
		
		while (op!=8) {
			
			switch (op) {
		
			case 1 :  addAccount();
			
				break;
				
			case 2: displayAccounts();
			
				break;
		
			case 3: System.out.println("\nEnter the amount you want added:");
					double amt=in.nextDouble();
					addAmount(amt,a1);
			
				break;
			
			case 4:	System.out.println("\nEnter the amount you want to withdraw:");
					amt=in.nextDouble();
					withdraw(amt,a1);
			
				break;
			
			case 5:	viewAccountDetails();
				
				break;
			
			case 6: modifyAccountDetails();
			
				break;
			
			case 7: closeAccount();
			
				break;
		
			case 8: 
			
				break;
			
			default : 
			
				System.out.println("invalid choise,try again");
				break;
			}
			
			System.out.println("Please Select an Operation (1-8):");
			System.out.println("1- Add Account");
			System.out.println("2- View All Accounts");
			System.out.println("3- Add Amount");
			System.out.println("4- Withdraw Amount");
			System.out.println("5- View Account Details");
			System.out.println("6- Modify Account");
			System.out.println("7- Close an Account");
			System.out.println("8- Exit");
			System.out.println();
			 op=in.nextInt();
		
		}
		
		System.out.println("\n\t\"uptdate file successfully\"");
		System.out.println("");
		System.out.println("\t      *****************");
		System.out.println("\t\t*************");
		System.out.println("\t\t   ********");

	}
	
	public void addAmount(double amt,Account a) {
		double b=a.getBalance();
		a.setBalance(b+amt);
		System.out.println("\nadded successfully\n");
		System.out.println("the Balance after deposite :  "+"\""+a.getBalance()+"\"");
		System.out.println("\n\t**************\n");
		
	}
	
	public void withdraw(double amt,Account a) {
		
		if (a.getBalance()<amt) {
			
			System.out.println("not accept");
		}else {
			
			a.setBalance(a.getBalance()-amt);
			System.out.println("\nWithdrawn successfully\n");
			System.out.println("the Balance after Withdraw :  "+"\""+a.getBalance()+"\"");
			System.out.println("\n\t**************\n");

		}
		
	}
	
	public void displayAccounts() {
		
		System.out.println("\nthis operation to displays all the Accounts details\n");
		System.out.println("\t*****************");
		System.out.print("\n");
	}
	
	public void addAccount() {
		
		System.out.println("\n\nthis operation to adds information for a new account\n");
		System.out.println("\t*****************");
		System.out.print("\n");
	}
	
	public void closeAccount() {
		
		System.out.println("\n\nthis operation to removes information of old account\n");
		System.out.println("\t*****************");
		System.out.print("\n");

	}
	
	public void viewAccountDetails() {
		
		System.out.println("\n\nthis operation to searches for a certain account details\n ");
		System.out.println("\t*****************");
		System.out.print("\n");
	}
	
	public void modifyAccountDetails() {
		
		System.out.println("\n\nthis operation to modifies a certain account details\n");
		System.out.println("\t*****************");
		System.out.print("\n");
	}
	
	public void uploadDataFile() {
		
		System.out.println("\n\nthis operation to uploads account data from file\n");
		System.out.println("\t*****************");
		System.out.print("\n");
	}
	
	public void updateDataFile() {
		
		System.out.println("\n\nthis operation to saves account data updates to file\n");
		System.out.println("\t*****************");
		System.out.print("\n");
	}

}
