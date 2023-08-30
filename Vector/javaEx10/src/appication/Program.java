package appication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota = new double[n];
		double[] nota2 = new double[n];
		
		
		double media = 0.0;
		for(int i = 0;i<n;i++) {
			
			System.out.printf("Digite nome, primeira e segunda nota do "+ (i+1) + "º aluno \n");
			nome[i] = sc.next();
			nota[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			
		}
		
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0;i<n;i++) {
			media = (nota[i] + nota2[i]) / 2;
			if(media >= 6) {
			
				 System.out.printf("%s\n", nome[i]);
				
			}
			
		}
		
		
		
		

		sc.close();
	}

}
