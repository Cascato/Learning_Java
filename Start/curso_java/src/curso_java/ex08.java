package curso_java;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par;
		
		par = sc.nextInt();
	    
		if (par % 2==0){
			System.out.println("PAR");
			}
		else {
			System.out.println("IMPAR");
			
			
		};
		
		sc.close();
	}

}
