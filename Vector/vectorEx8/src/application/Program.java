package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter no vetor? ");
		int n = sc.nextInt();
		double vector[] = new double[n];

		System.out.println("Digite um numero: ");
		for (int i = 0; i < vector.length; i++) {

			vector[i] = sc.nextInt();
		}

		int numpar = 0;
		double soma = 0;
		double media = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				soma += vector[i];
				numpar++;
			}
		}
		if (numpar == 0) {
			System.out.println("Não há numeros pares");
		} else{
			media = soma / numpar;
			System.out.println("media: " + media);
		}
		

		sc.close();
	}

}
