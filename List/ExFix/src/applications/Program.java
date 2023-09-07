package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		double salary =0;
		for(int i = 0; i<n;i++) {
			System.out.println("Employee #"+(i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			Employee emp = new Employee(id,name,salary);
		}
		double increase=0;
		int id2 =0;
	
		for(int i =0;i<n;i++) {
			
			System.out.println("Enter the employee id that will have a salary increase: ");
			 id2 = sc.nextInt();
			
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
	         increase = salary * percentage / 100;
	       
		}
		String money = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
		System.out.println(money);
		
		
          sc.close();
	}

}
