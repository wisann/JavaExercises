package Model;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
/**
 * this class is where the methods and operations of the account will be executed
 * @author wisan
 *
 */
public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US); // changes the location to the US
		Scanner sc = new Scanner (System.in); // user can type the information requested
		

			System.out.println("Enter account data: ");
		
			Integer number;
			/**
			 * verifies if the input is a int number, if it's not the same format, enters in a loop until the user type the correct way.
			 */
			while (true) {
	            try {
	            	System.out.print("Number: ");
	                number = sc.nextInt();
	                break;
	            } catch (java.util.InputMismatchException e) {
	                System.out.println("Please type your account number");
	                sc.nextLine(); 
	            }
			}
	        
			System.out.println("Holder: ");
			String holder = sc.next();
			
			/**
			 * verifies if the input is a double number, if it's not the same format, enters in a loop until the user type the correct way.
			 */
			Double initialBalance;
			while(true) {
				try {
					System.out.println("Initial balance: ");
					initialBalance = sc.nextDouble();
					break;
				} catch (java.util.InputMismatchException e) {
	                System.out.println("Please type your initial balance");
	                sc.nextLine(); 
			}
				}
		
			Double withdrawLimit;
			/**
			 * verifies if the input is a double number, if it's not the same format, enters in a loop until the user type the correct way.
			 */
			while(true) {
				try {
					System.out.println("withdraw limit: ");
					withdrawLimit = sc.nextDouble();
					break;
				} catch (java.util.InputMismatchException e) {
	                System.out.println("Please type your withdraw limit");
	                sc.nextLine(); 
			}}
			
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit); // associates the new variables with the variables from the Account class
		
			System.out.println("Enter amount for withdraw: "); // asks for the user to type the amount that they want  to take from the account
			Double amount = sc.nextDouble();
			try {
				account.withdraw(amount);
				System.out.println("New balance: " + account.getBalance()); // updates the balance, with the amount removed from the account
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
	
				
			}

			sc.close();


}
}