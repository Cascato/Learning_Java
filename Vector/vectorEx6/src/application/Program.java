package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Quantos numeros serao digitados? ");
		int n = sc.nextInt();
		int vector[] = new int[n];
		int vector2[] = new int[n];
		int vector3[] = new int[n];
		
		System.out.println("Digite o valor do vator A");
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		
		System.out.println("Digite o valor do vator B");
		
		for(int i = 0; i < vector.length; i++) {
			vector2[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < vector.length; i++) {
			vector3[i] = vector[i] + vector2[i];
			
		}
		
		System.out.println("RESULTADO: ");
		for(int i = 0; i < vector.length; i++) {
			System.out.println(vector3[i]);
			
		}
		
		
		
		
sc.close();
	}

}
