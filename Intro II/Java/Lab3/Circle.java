import java.lang.Math;

/**
	Circle class is a subclass of Shape. It has a radius and
	can calculate the area and perimeter of itself.
 */
public class Circle extends Shape {

	private int radius;

	/**
		Construct a Circle object.
		@param rad the radius of this Circle
 	 */
	public Circle(int rad) {
		radius = rad;
		incrementShapeCount();
	}


	/**
		Return the area of this Circle.
		@return the area of this Circle
 	 */
	public double area(){
		return Math.PI * radius * radius;
	}


	/**
		Return the perimeter of this Circle.
		@return the perimeter of this Circle
 	 */
	public double perimeter(){
		return Math.PI * radius * 2;
	}


	/**
		Return the type of Shape.
		@return the type of Shape
 	 */
	public String getShape(){
		return "circle";
	}


	/**
		Displays a Shape object's type, area, and perimeter.
 	 */
	public void display(){
		super.display();
	}


	/**
		Compares two Shape objects to one another. A Shape object's
		size is determined by its area.
		@param other the Shape object to be compared to
		@return a -1, 0, or 1 depending on which object has a larger size
 	 */
	public int compareTo(Shape other){
		return super.compareTo(other);
	}

}





