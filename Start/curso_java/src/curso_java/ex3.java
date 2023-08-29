package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int dif = (A * B) - C * D;
		
		System.out.printf("Diferença = " + dif);
		
       sc.close();
	}

}
