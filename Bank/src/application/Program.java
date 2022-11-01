package application;

import java.util.Scanner;

import entities.Accounts;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Accounts account;
		
		System.out.println("Contas Bancárias");
		
		System.out.print("Nome:");
		String name = sc.next();
		
		System.out.print("Conta:");
		String accountId = sc.next();
		
		System.out.print("Realizar depósito inicial? ");
		String initialDeposit = sc.next();
		
		if (initialDeposit.equalsIgnoreCase("y")) {
			System.out.print("Depósito:");
			double amount = sc.nextDouble();
			
			account = new Accounts(accountId, name, amount);
		} else {
			account = new Accounts (accountId, name);
		}
		
		System.out.printf("Situação inicial da conta:%n	Numero da conta: %s%n	Nome do Titular: %s%n	Valor em conta: %.2f%n", account.getAccountId(), account.getName(), account.getAmount());
		
		System.out.print("Realize um depósito: ");
		double value = sc.nextDouble();
		
		account.deposit(value);
		
		System.out.println("Depósito no valor de R$" + value);
		System.out.printf("Situação atual da conta:%n	Numero da conta: %s%n	Nome do Titular: %s%n	Valor em conta: %.2f%n", account.getAccountId(), account.getName(), account.getAmount());
		
		System.out.print("Realize um saque: ");
		value = sc.nextDouble();
		
		account.withdraw(value);
		
		System.out.println("Saque no valor de R$" + value);
		System.out.printf("Situação atual da conta:%n	Numero da conta: %s%n	Nome do Titular: %s%n	Valor em conta: %.2f%n", account.getAccountId(), account.getName(), account.getAmount());
		sc.close();
	}

}
