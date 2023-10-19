package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		
		int par[] = new int[n]; 
		
		for(int i=0; i<par.length;i++) {
			System.out.print("Digite um numero: ");
			par[i] = sc.nextInt();
		}
		
		int numpar = 0;
		
		for (int i = 0; i <par.length; i++) {
			int num = par[i];
			if(num % 2 == 0) {
				System.out.println("NUMEROS PARES: " + num);
				numpar++;
			}
		}
		
		
		
		
		System.out.println("Quantidade de pares = " + numpar);
		sc.close();
	}

}


// 0 2 4 6 8 10