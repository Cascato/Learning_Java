package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terao no vetor? ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double media=0;
		for(int i = 0; i<n;i++) {
		media += vect[i] / n ;
		} System.out.printf("Media do vetor = %.3f\n",media);
		
		System.out.println("Elementos abaixo da media: ");
		for(int i = 0; i<n;i++ ) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
