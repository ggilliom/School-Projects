/**
	Abstract Shape class is the top of the Shape hierarchy. It
	implements Displayable and Comparable. Subclasses Circle, Triangle,and
	Rectangle extend it. Keeps a record of how many Shape
	subclass objects are created.
 */
public abstract class Shape implements Displayable, Comparable<Shape> {

	static int shapeCount;


	/**
		Return the area of the Shape.
		@return the area of the Shape.
 	 */
	public abstract double area();


	/**
		Return the perimeter of the Shape.
		@return the perimeter of the Shape.
 	 */
	public abstract double perimeter();


	/**
		Return the type of Shape.
		@return the type of Shape
 	 */
	public abstract String getShape();


	/**
		Increments the shapeCount variable by 1. Called whenever
		a shape subclass object is created.
 	 */
	public void incrementShapeCount(){
		shapeCount++;
	}


	/**
		Returns the amount of Shape subclass objects created.
		@return the amount of Shape subclass objects created
 	 */
	public int getShapeCount(){
		return shapeCount;
	}

	/**
		Displays a Shape object's type, area, and perimeter.
 	 */
	public void display(){
		System.out.println("Type: " + getShape() + " Area: " + area() + " Perimeter: " + perimeter());
	}


	/**
		Compares two Shape objects to one another. A Shape object's
		size is determined by its area.
		@param other the Shape object to be compared to
		@return a -1, 0, or 1 depending on which object has a larger size
 	 */
	public int compareTo(Shape other){
		double difference = this.area() - other.area();

		if(difference > 0){
			return 1;
		}
		else if(difference < 0){
			return -1;
		}
		else{
			return 0;
		}
	}

}



