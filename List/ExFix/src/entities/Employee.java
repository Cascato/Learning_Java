package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name;
	}
	
	
	
	

}
