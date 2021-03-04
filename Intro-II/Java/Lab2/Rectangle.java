/**
  The Rectangle class is a superclass of the Square class.
  A Rectangle has a length, height, an ID, and a counter for 
  each Rectangle created.
 */
public class Rectangle {

	private int length;
	private int height;
	static int counter = 0;
	private int rectangleID;


	/**
  	Construct a Rectangle.
  	@param len initial length of the Rectangle
  	@param hei initial height of the Rectangle
 	 */
	public Rectangle(int len, int hei){
		length = len;
		height = hei;
		counter++;
		rectangleID = counter;
	}


	/**
  	Set the length of the Rectangle
  	@param len length of the Rectangle
 	 */
	public void setLength(int len){
		length = len;
	}


	/**
  	Return the length of the Rectangle
  	@return the length of the Rectangle
 	 */
	public int getLength(){
		return length;
	}


	/**
  	Set the height of the Rectangle
  	@param hei height of the Rectangle
 	 */
	public void setHeight(int hei){
		height = hei;
	}


	/**
  	Return the height of the Rectangle
  	@return the height of the Rectangle
 	 */
	public int getHeight(){
		return height;
	}
	

	/**
  	Return the area of the Rectangle
  	@return the area of the Rectangle
 	 */
	public int getArea(){
		return length * height;
	}


	/**
  	Return the perimeter of the Rectangle
  	@return the perimeter of the Rectangle
 	 */
	public int getPerimeter(){
		return (length * 2) + (height * 2);
	}


	/**
  	Return the ID of the Rectangle
  	@return the ID of the Rectangle
 	 */
	public int getID(){
		return rectangleID;
	}


	/**
  	Return the total count of Rectangles created
  	@return the total count of Rectangles created
 	 */
	public static int getCount(){
		return counter;
	}

}