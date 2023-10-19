package vectorEx2;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum, med;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			 sum += vect[i];
		}
	
		System.out.print("VALORES = ");

		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }

		med = sum / vect.length;

		System.out.printf("\nSoma: %.2f%n", sum);
		System.out.printf("Media: %.2f%n", med);

		sc.close();
	}

}
