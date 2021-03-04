import java.lang.Math;

/**
	Triangle class is a subclass of Shape. It has 3 sides and
	can calculate the area and perimeter of itself.
 */
public class Triangle extends Shape {

	private int side1;
	private int side2;
	private int side3;

	/**
		Construct a Triangle object.
		@param s1 the first side of the Triangle
		@param s2 the second side of the Triangle
		@param s3 the third side of the Triangle
 	 */
	public Triangle(int s1, int s2, int s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
		incrementShapeCount();
	}


	/**
		Return the area of this Triangle.
		@return the area of this Triangle
 	 */
	public double area(){
		double p = perimeter() / 2;
		double almost = p * (p - side1) * (p - side2) * (p - side3);
		double area = Math.sqrt(almost);
		return area;
	}


	/**
		Return the perimeter of this Triangle.
		@return the perimeter of this Triangle
 	 */
	public double perimeter(){
		return side1 + side2 + side3;
	}


	/**
		Return the type of Shape.
		@return the type of Shape
 	 */
	public String getShape(){
		return "triangle";
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







