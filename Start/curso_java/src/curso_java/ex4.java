package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt();
		int valorHora = sc.nextInt();
		double recebeHora = sc.nextDouble();
		
		double soma = valorHora * recebeHora;
		
		
		System.out.println("Number = " + hr);
		System.out.printf("Salario = U$ %.2f%n", soma);
		
		
		
		
		sc.close();
	}

}
