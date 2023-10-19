package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			System.out.printf("Dados da "+ (i+1) + "º pessoa");
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
		}
		int name = 0;
		double maior = idade[0];
			for(int i = 0; i <n; i++) {
				if(idade[i] > maior) {
					maior = idade[i];
					name = i;
				}
			}
			
			System.out.println("Pessoa mais velha: " + nome[name]);
		
		
		
		sc.close();
	}

}
