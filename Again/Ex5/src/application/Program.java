package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double maior[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			maior[i] = sc.nextDouble();
		}

		
		
		double valor = maior[0];
		 int posmaior = 0;
		for (int i = 0; i < n; i++) {
			
			if (maior[i] > valor) {
				valor = maior[i];
				 posmaior = i;
			}
		};
		System.out.printf("MAIOR VALOR = %.1f\n", valor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		sc.close();
	}
}
