package bankingApp;

import java.util.Scanner;

public class BankingApplication {

	
	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount("XYZ", "CA00");
		obj.showMenu();
		
       }
	}
	class BankAccount {
		
		String customerName;
		String customerId;
		int currentBalance;
		int lastTransaction;
		
		BankAccount(String cname , String cid) {
			customerName = cname;
			customerId   = cid; 
		}
		
     void deposit(int amount) {
		if(amount != 0) {
		currentBalance = currentBalance + amount;
		System.out.println("Current balance : " +currentBalance);
		lastTransaction = amount;
		System.out.println("last Transaction : " + amount);
		}
	}
     void withdraw(int amount) {
		if(amount != 0) {
		currentBalance = currentBalance - amount;
		System.out.println("Current Balance: " +currentBalance);
		lastTransaction  = -amount;
		System.out.println("last Transaction : " + amount);
		}
	}
	 void lastTransaction() {
		if(lastTransaction > 0) {
			System.out.println("Deopsited :  " + lastTransaction);
		}else if(lastTransaction < 0) {
			System.out.println("Withdrawn :  " + Math.abs(currentBalance));
		}else {
			System.out.println("No transaction performed!!");
		}
		
	}
	 void showMenu() {
		 
		char option = '\0';
		Scanner in = new Scanner(System.in);
		
		System.out.println("******************************* ");
		System.out.println("Welcome to our Bank!!" +customerName +"("+customerId+")");
		System.out.println("Select the action you want to perform");
		System.out.println("A. deposit ");
		System.out.println("B. withdraw ");
		System.out.println("C. check Last Transaction  ");
		System.out.println("D. See the Balance ");
		System.out.println("E. Exit ");
		System.out.println("================================");
		
		do {
			
			System.out.print("\nEnter an option: ");
			
             option = in.next().charAt(0);
			
		switch(option) {
			
			    case 'A':
			    	
			    	System.out.print("\nAmount you want to add:");
			    	int amount1 = in.nextInt();
			    	deposit(amount1);
			    	System.out.println("\n--------------------------------");
			        break;
			    case 'B':
			    	
			    	System.out.print("\nAmount you want to withdraw : ");
			    	int amount2 = in.nextInt();
			    	withdraw(amount2);
			    	System.out.println("\n--------------------------------");
                    break;
			    	
			    case 'C':
			    	
			    	System.out.print("\nyour last Transaction : ");
			    	lastTransaction();
			    	System.out.println("\n--------------------------------");
			    	break;
			    	
			    case 'D':
			    	
			    	System.out.print("\nBalance : " +currentBalance);
			    	System.out.println("\n--------------------------------");
			    	
			    	break;
			    	
			    case 'E':
			    	
			    	System.out.println("\n###############");
			    	System.out.println("# Thank You!  #");
			    	System.out.println("###############");
			    	break;
			    default:
			    		System.out.println("\nInvalid Input");
			            break;
			}
		}while(option != 'E');
	}
	
  }



