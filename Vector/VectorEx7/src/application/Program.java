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
	
	for(int i = 0; i < vector.length; i++) {
		System.out.print("Digite um numero: ");
		vector[i] = sc.nextDouble();
	}
	double soma = 0;
	for(int i = 0; i < vector.length; i++) {
		soma += vector[i];
		
	};
	
	double soma2 = soma / n;
	
	for(int i = 0; i < vector.length; i++) {
		if(soma2 > vector[i]) {
		}
	};
	System.out.println("Media dos vetor = " + soma2);
	
	System.out.println("valores abaixo da média ");
	for(int i = 0; i <n; i++) {
		if(vector[i] < soma2) {
			System.out.printf("%.1f\n", vector[i]);
		}
	}
	
	
	
	
	
	
	
sc.close();
	}

}
