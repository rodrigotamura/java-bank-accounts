package br.com.conta.app;

import java.util.Scanner;

import br.com.conta.classes.Account;
import br.com.conta.classes.Cliente;

public class App {

	public static void main(String[] args) {
		int option;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Cliente client = new Cliente();

		System.out.print("Insert your name: ");
		client.setName(sc.nextLine());

		System.out.print("Insert your age: ");
		client.setAge(sc.nextInt());

		System.out.print("Insert your document number: ");
		client.setDocument(sc.next());
		System.out.println("==============================");

		System.out.print("Type your agency code: ");
		String agency = sc.next();
		
		System.out.print("Type your account number: ");
		String accountNumber = sc.next();
		
		System.out.println("Which kind of account would you like?");
		System.out.println("- Type 1 for SIMPLE PLAN");
		System.out.println("- Type 2 for FLEX PLAN");
		System.out.println("- Type 3 for GOLD PLAN");
		System.out.print("Your choice (and press <enter> for confirmation): ");
		int accountType = sc.nextInt();
		
		client.addAccount(new Account(agency, accountNumber, accountType));
		
		System.out.println("Thanks " + client.getName() + "! Your account has been opened successfully!");
		
		
		do {
			System.out.println("==============================");
			System.out.println("Please, choose an option:");
			System.out.println("Press 1 to to see your current balance");
			System.out.println("Press 2 for withdraw");
			System.out.println("Press 3 for new deposit");
			System.out.println("Press 0 to exit");
			
			System.out.print("Your answer: ");
			
			option = sc.nextInt();
			double amount;
			char confirm;
			
			switch(option) {
				case 1: // current balance
					System.out.println(" --> Your current balance is US$ " + client.getAccount(0).getBalance());
					break;
				case 2: // withdraw
					System.out.print(" --> Please, insert the amount you want to withdraw (your current balance: " + client.getAccount(0).getBalance() + "): US$ ");
					amount = sc.nextDouble();
					System.out.print("Do you want to confirm the deposit of US$ " + amount + "? [y/n]");
					confirm = sc.next().charAt(0);
					if(confirm == 'y') {
						client.getAccount(0).withdraw(amount);
						
						System.out.println("Deposit has made successfully! Your current balance: US$ " + client.getAccount(0).getBalance());
					} else {
						System.out.println("Canceling operation...");
					}
					
					break;
				case 3: // deposit
					System.out.print(" --> Please, insert the amount you want to deposit (your current balance: " + client.getAccount(0).getBalance() + "): US$ ");
					amount = sc.nextDouble();
					System.out.print("Do you want to confirm the deposit of US$ " + amount + "? [y/n]");
					confirm = sc.next().charAt(0);
					if(confirm == 'y') {
						client.getAccount(0).deposit(amount);
						
						System.out.println("Deposit has made successfully! Your current balance: US$ " + client.getAccount(0).getBalance());
					} else {
						System.out.println("Canceling operation...");
					}
					
					break;
			}
			
		} while (option != 0);
		
		System.out.println("Bye!");
	}

}
