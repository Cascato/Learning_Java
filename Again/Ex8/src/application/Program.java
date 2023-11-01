package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int Mpar[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			Mpar[i] = sc.nextInt();
		}

		double media = 0;
		int quantidade = 0;
		int somapares = 0;
		for (int i = 0; i < n; i++) {
			if (Mpar[i] % 2 == 0) {
				somapares = somapares + Mpar[i];
				quantidade++;
			}
			if (quantidade == 0) {
				System.out.println("Nenhum numero par");
			}else {
				media = somapares / quantidade;
			}
		}
		System.out.printf("Media dos pares: %.1f\n", media);
		sc.close();
	}
}
