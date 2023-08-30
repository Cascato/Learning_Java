package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("How many room will be rented? ");
		int n = sc.nextInt();

		Rent[] vect = new Rent[10];

		String name, email;
		int room;

		
		for (int i = 0; i < n; i++) {
			vect[i] = null;
			System.out.println("Rent# " + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		

		}
		 System.out.println("\nBusy rooms:");
	        for (int i = 0; i < vect.length; i++) {
	            if (vect[i] != null) {
	                System.out.println((i + 1) + ": " + vect[i]);
	            }
	        }

		sc.close();
	}

}
