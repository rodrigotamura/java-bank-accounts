package br.com.conta.classes;

import java.util.ArrayList;
import java.util.List;

public final class Cliente extends Pessoa {

	private List<Account> accounts;
	
	public Cliente() {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account newAccount) {
		accounts.add(newAccount);
	}
	
	public void removeAccount(int index) {
		accounts.remove(index);
	}
	
	public void listAccounts() {
		for(int i = 0; i < accounts.size(); i++) {
			System.out.println("Agency: " + accounts.get(i).getAgency());
			System.out.println("Agency: " + accounts.get(i).getAccountNumber());
			System.out.println("Agency: " + accounts.get(i).getBalance());
			System.out.println("----------------------------------------");
		}
	}
}
