package entities;

public class rectangle {
	
	public double width; //largura
	public double height; //altura
	
	 public double area() {
		 return  width * height;
				 
	 }
	 public double perimeter() {
		 return 2 * (width + height);
	 }
	 public double diagonal() {
		 return Math.sqrt(width * width + height * height); 
	 }
}
