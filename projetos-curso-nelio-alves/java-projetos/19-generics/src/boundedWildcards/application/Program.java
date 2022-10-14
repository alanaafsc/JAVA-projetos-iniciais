package boundedWildcards.application;

import java.util.ArrayList;
import java.util.List;

import boundedWildcards.entities.Circle;
import boundedWildcards.entities.Rectangle;
import boundedWildcards.entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(circles));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();

		}
		return sum;
	}

}
