package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int s = x + y;
		
		System.out.println("SOMA = " + s);
		
		
		
		
		
		sc.close();
	}

}
