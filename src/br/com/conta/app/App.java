package br.com.conta.app;

import java.util.Scanner;

import br.com.conta.classes.Account;
import br.com.conta.classes.Cliente;

public class App {

	public static void main(String[] args) {
		int option;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Cliente person = new Cliente();

		System.out.print("Insert your name: ");
		person.setName(sc.nextLine());

		System.out.print("Insert your age: ");
		person.setAge(sc.nextInt());

		System.out.print("Insert your document number: ");
		person.setDocument(sc.next());
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
		
		person.addAccount(new Account(agency, accountNumber, accountType));
		
		System.out.println("Thanks " + person.getName() + "! Your account has been opened successfully!");
		
		System.out.println("==============================");
		
		
		// Next we will implement the withdraw and deposit commands :D
	}

}
