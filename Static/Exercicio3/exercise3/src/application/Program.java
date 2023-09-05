package application;

import java.util.Locale;
import java.util.Scanner;

import entities.nota;

public class Program {

	public static void main(String[] args) {	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	 nota nota = new nota();
	 
	 System.out.print("Qual o seu nome: ");
	 nota.name = sc.nextLine();
	 
	 nota.nota = sc.nextDouble();
	 nota.nota2 = sc.nextDouble();
	 nota.nota3 = sc.nextDouble();
	 
	 System.out.printf("FINAL GRADE: %.2f%n", nota.soma());
	 
	 if(nota.soma() < 60) {
		 System.out.println("FAILED");
		 System.out.printf("MISSING %.2f POINTS%n", nota.sub());
	 }else {
		 System.out.println("PASS");
	 }
		
sc.close();
	}

}
