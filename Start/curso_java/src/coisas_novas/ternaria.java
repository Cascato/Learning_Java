package coisas_novas;

import java.util.Locale;
import java.util.Scanner;

public class ternaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 double x = sc.nextDouble();
		 
		 double desconto = (x < 20.0) ? x * 0.1 : x * 0.05; 
		 
		 System.out.println(desconto);
		
		sc.close();
	}

}
