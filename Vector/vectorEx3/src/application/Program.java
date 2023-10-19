package application;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantas pessoas serao digitadas? ");
	int n = sc.nextInt();
	
	String[]nomes = new String[n];
	int[]idade = new int[n];
	double[]altura = new double[n];


	for(int i = 0; i< n;i++) {
		System.out.print("Dados da "+ (i+1) + "º pessoa");
		System.out.print("\nNome: ");
		sc.nextLine();
		nomes[i] = sc.nextLine();
		System.out.print("Idade: ");
		idade[i] = sc.nextInt();
		System.out.print("Altura: ");
		altura[i] = sc.nextDouble();
	}
	double sum = 0.0;
	for (int i = 0; i <n; i++) {
		sum += altura[i];
	}
	double avg = sum / n;
	
	int cont = 0;
	for (int i = 0; i <n; i++) {
		if(idade[i] < 16) {
			cont += 1;
		}
	}
	double por = cont * 100.0 / n;
	
	
	System.out.printf("Altura média = %.2f%n", avg);
	System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", por);
	
	for(int i = 0; i <n; i++) {
		if(idade[i] < 16) {
			System.out.println(nomes[i]);
		}
	}
	
	sc.close();
	}	
}



