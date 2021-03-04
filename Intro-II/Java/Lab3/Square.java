
/**
	Square class is a subclass of Rectangle. It has a side length
	and can calculate the area and perimeter of itself.
 */
public class Square extends Rectangle {

	private int side;


	/**
		Construct a Square object.
		@param side the length of the Rectangle
 	 */
	public Square(int side){
		super(side, side);
		this.side = side;
	}


	/**
		Return the area of this Square.
		@return the area of this Square
 	 */
	public double area(){
		return side * side;
	}


	/**
		Return the perimeter of this Square.
		@return the perimeter of this Square
 	 */
	public double perimeter(){
		return side * 4;
	}


	/**
		Return the type of Shape.
		@return the type of Shape
 	 */
	public String getShape(){
		return "square";
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





