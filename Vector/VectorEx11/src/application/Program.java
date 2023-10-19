package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas serao digitados ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a altura da " + (i + 1) + "º pessoa \n");
			altura[i] = sc.nextDouble();
			System.out.printf("Digite o genero da " + (i + 1) + "º pessoa \n");
			genero[i] = sc.next().charAt(0);
		}
		double maior = altura[0];
		double menor = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
			if (altura[i] > menor) {
				maior = altura[i];
			}
		}

		double media = 0.0;
		int woman = 0;
		int man = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'f') {
				woman++;

			} else {
				man++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'f') {
				media += altura[i] / woman;
			}
		}
		System.out.printf("Menor altura: %.2f", menor);
		System.out.printf("\nMaior altura: %.2f", maior);
		System.out.printf("\nMedia das alturas das mulheres = %.2f", media);
		System.out.printf("\nQuantidade de homens = %d\n", man);
		
		sc.close();
	}
	
}
