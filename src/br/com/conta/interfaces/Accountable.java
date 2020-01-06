package br.com.conta.interfaces;

public interface Accountable {
	void Withdraw(double value, int accountIndex);
	void Deposit(double value, int accountIndex);
}
