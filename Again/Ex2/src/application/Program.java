package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantos numeros voce vai digitar? ");
			int n = sc.nextInt();
			double[] vect = new double[n];
			
			
			double soma = 0;
			double media = 0;
			for(int i = 0;i<n;i++) {
				System.out.println("Digite um numero: ");
				vect[i] = sc.nextDouble();
				soma += vect[i];
				media += vect[i] / n;
				
			}
			
			System.out.print("VALORES = ");
			 for (int i=0; i<n; i++) {
					System.out.printf("%.1f  ", vect[i]);
			    }
			
			
			 System.out.printf("\nSOMA = %.2f\n", soma);
			    System.out.printf("MEDIA = %.2f\n", media);
		
			
			
			sc.close();

	}

}
