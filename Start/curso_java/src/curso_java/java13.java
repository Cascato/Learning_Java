package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class java13 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
           Scanner sc = new Scanner(System.in);
        	   
			System.out.print("Digite o valor para o eixo X: ");
			double x = sc.nextDouble();

			System.out.print("Digite o valor para o eixo Y: ");
			double y = sc.nextDouble();

			if (x == 0.0 && y == 0.0) {
			    System.out.println("Origem");
			} else if (x == 0.0) {
			    System.out.println("Eixo Y");
			} else if (y == 0.0) {
			    System.out.println("Eixo X");
			} else if (x > 0 && y > 0) {
			    System.out.println("1º Quadrante");
			} else if (x < 0 && y > 0) {
			    System.out.println("2º Quadrante");
			} else if (x < 0 && y < 0) {
			    System.out.println("3º Quadrante");
			} else {
			    System.out.println("4º Quadrante");
			}
			sc.close();
	
    }
};
