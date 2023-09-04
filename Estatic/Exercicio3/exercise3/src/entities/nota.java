package entities;

public class nota {
	
	public String name;
	public double nota;
	public double nota2;
	public double nota3;
	
	
	
	public double soma(){
		return nota + nota2 + nota3;
	}
	
	public double sub() {
		return 60 - soma();
	}
	
}
