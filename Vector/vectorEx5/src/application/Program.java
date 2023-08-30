package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantos numeros vai digitar? ");
	int n = sc.nextInt();
	double maior[] = new double [n];
	
	for(int i = 0; i < maior.length; i++) {
		System.out.print("Digite um numero: ");
		maior[i] = sc.nextDouble();
	}
	
	double big = 0;
	for(int i = 0; i < maior.length; i++) {
		if(maior[i] > big) {
			big = maior[i];
		}
	}
		System.out.println("maior valor: " + big);
		
		
		int posmaior = 0;
		double position = maior[0];
		
		for(int i = 0; i < maior.length; i++) {
			if(maior[i] > position) {
				position = maior[i];
				posmaior = i;
				
			}
		}System.out.println("Posicao do maior valor: " + posmaior);
		

	sc.close();
	}

}
