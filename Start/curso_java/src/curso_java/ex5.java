package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int pecas = sc.nextInt();
		double preco = sc.nextDouble();
		double soma = pecas * preco;
		
		
		int pecas2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		double soma2 = pecas2 * preco2;
		
		
		double total = soma + soma2;
		
		
		
		
	
		System.out.printf("Valor total a pagar: U$ %.2f%n ", total);
		
		
		sc.close();
	}

}
