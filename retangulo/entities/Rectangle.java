package entities;

//1 passo: criar classe
public class Rectangle {
	//2 passo: criar os atributos
	public double width;
	public double height;
	
	//3 passo: criar os metodos
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		double d = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(d);
	}

}
