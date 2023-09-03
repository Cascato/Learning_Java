package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many employees will be registered");
		int n = sc.nextInt();
		
		
		for(int i = 0; i<n;i++) {
			System.out.println("Employee #"+(i+1));
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			Employee emp = new Employee(id,name,salary);
			System.out.println(emp);
		}
		
		
		
		
          sc.close();
	}

}
