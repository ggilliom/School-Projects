/**
  The Square class is a subclass of the Square class
  and has a side length.
 */
public class Square extends Rectangle {

	private int side;


	/**
  	Construct a Square.
  	@param side initial side length of the Square
 	 */
	public Square(int side){
		super(side, side);
		this.side = side;
	}


	/**
  	Set the side length of the Square
  	@param sideLength new side length of the Square
 	 */
	public void setSide(int sideLength){
		side = sideLength;
		super.setHeight(sideLength);
		super.setLength(sideLength);
	}


	/**
  	Return the side length of the Square
  	@return side length of the Square
 	 */
	public int getSide(){
		return this.side;
	}


	/**
  	Checks if two Squares are equal
  	@param obj second Square object to be checked for equality
 	 */
	public boolean equals(Object obj){
		if(obj instanceof Square){
			Square other = (Square) obj;

			if(this.getSide() == other.getSide()){
				return true;
			}
		}
		return false;
	}


	/**
  	Return a String stating the type of shape, side length, area, and perimeter
  	@return a String stating the type of shape, side length, area, and perimeter
 	 */
  	@Override
	public String toString(){
		String string = "This is a Square. Side length: " + this.side;
		string += ", Area: " + this.getArea();
		string += ", Perimeter: " + this.getPerimeter();
		return string;
	}

}