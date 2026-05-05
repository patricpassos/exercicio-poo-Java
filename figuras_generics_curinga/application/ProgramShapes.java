package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.RectangleG;
import entities.Shape;

public class ProgramShapes {
	//"Aceito uma lista de qualquer tipo, desde que esse tipo seja Shape ou uma de suas subclasses (como Circle ou Rectangle)"
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new RectangleG(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(6.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area circles: " + totalArea(myCircles));

	}

}
