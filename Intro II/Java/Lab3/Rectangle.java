
/**
	Rectangle class is a subclass of Shape. It has a length and
	width and can calculate the area and perimeter of itself.
 */
public class Rectangle extends Shape {

	private int length;
	private int width;


	/**
		Construct a Rectangle object.
		@param len the length of the Rectangle
		@param wid the width of the Rectangle
 	 */
	public Rectangle(int len, int wid){
		length = len;
		width = wid;
		incrementShapeCount();
	}


	/**
		Return the area of this Rectangle.
		@return the area of this Rectangle
 	 */
	public double area(){
		return length * width;
	}


	/**
		Return the perimeter of this Rectangle.
		@return the perimeter of this Rectangle
 	 */
	public double perimeter(){
		return (length * 2) + (width * 2);
	}


	/**
		Return the type of Shape.
		@return the type of Shape
 	 */
	public String getShape(){
		return "rectangle";
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







