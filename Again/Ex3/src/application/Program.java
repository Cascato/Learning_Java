package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
		}
		double media = 0.0;
		double menor = 0;
		double menores=0;
		
		for (int i = 0; i < n; i++) {
		media += alturas[i] / n;
		if(idades[i] < 16) {
			
			menores++;
			menor = (menores * 100) / n;
		} 
		}System.out.printf("Altura média: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", menor);
		
		for (int i = 0; i < n; i++) {
			if(idades[i]<16) {
				
			System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
