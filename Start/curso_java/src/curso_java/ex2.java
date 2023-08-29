package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		System.out.println("Escreva o valor do raio: ");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextFloat();
		double area = Math.PI * raio * raio;
		
		System.out.printf("O valor da area é %.4f%n", area);
		
       sc.close();
	}

}
