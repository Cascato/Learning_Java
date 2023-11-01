package curso_java;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		num = sc.nextDouble();
		
		if (num >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		};
		
		sc.close();
		

	}

}
