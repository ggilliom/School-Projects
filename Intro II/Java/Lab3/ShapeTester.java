import java.util.ArrayList;
import java.util.Collections;

public class ShapeTester {


	/**
		Displays an ArrayList of Shape objects.
		@param shapes an ArrayList of Shape objects
 	 */
	public void displayArray(ArrayList<Shape> shapes){

		int count = 0;

		for(Shape item : shapes){
			System.out.println(item.getShape());
		}

		System.out.println();

		for(Shape item : shapes){
			if(item instanceof Circle){
				System.out.println(item.getShape());
				System.out.println(count);
				count++;
			}
		}

		System.out.println();

		System.out.println(shapes.get(0).getShapeCount());

		Collections.sort(shapes);
		System.out.println();

		for(Shape item : shapes){
			item.display();
		}

	}

	public static void main(String[] args) {

		Circle circle1 = new Circle(5);
		Triangle tri1 = new Triangle(3,4,5);
		Rectangle rect1 = new Rectangle(4,8);
		Square squ1 = new Square(10);


		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(circle1);
		shapes.add(tri1);
		shapes.add(rect1);
		shapes.add(squ1);

		ShapeTester test = new ShapeTester();

		test.displayArray(shapes);

	}
}


