package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double quente,salada,bacon,simple,refri,quantidade,num,total;
		num = sc.nextDouble();
		quantidade = sc.nextDouble();
		
	    if(num == 1){
		    quente = 4.00;
		    total = quantidade * quente;
		}
		else if(num == 2) {
			salada = 4.50;
			total = quantidade * salada;
		}
		else if(num == 3) {
			bacon = 5.00;
			total = quantidade * bacon;
		}
		else if (num == 4){
			simple = 2.00;
			total = quantidade * simple;
		}
		else{
			refri = 1.50;
			total = quantidade * refri;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		sc.close();
	}

}