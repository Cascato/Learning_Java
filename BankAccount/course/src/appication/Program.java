package appication;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Bank bank;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.printf("Enter account holder: ");
		String name = sc.next();
		System.out.printf("Is there an initial deposit (y/n)? ");
		String yesNo = sc.next();
		if(yesNo.equals("y")) {
		System.out.printf("Enter a initial deposit value: ");
		double initialMoney = sc.nextDouble();
		    bank = new Bank(accountNumber, name, initialMoney);
		}else {
			bank = new Bank(accountNumber, name);
		}
		System.out.println();
		System.out.println("Acconut data: ");
		System.out.println("Acconut: " + bank);
		System.out.println();
		double money;
		System.out.printf("Enter a deposit value: ");
		money = sc.nextDouble();
		bank.deposit(money);
		System.out.println("Updated account data: ");
		System.out.println("Acconut: " + bank);
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		money = sc.nextDouble();
		bank.withdraw(money);
		System.out.println("Updated account data: ");
		System.out.println("Acconut: " + bank);
		

		sc.close();
	}

}
