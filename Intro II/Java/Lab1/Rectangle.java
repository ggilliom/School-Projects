public class Rectangle {

	private int length;
	private int height;
	static int counter = 0;
	private int rectangleID;


	
	public Rectangle(int len, int hei){
		length = len;
		height = hei;
		counter++;
		rectangleID = counter;
	}

	public void setLength(int len){
		length = len;
	}

	public int getLength(){
		return length;
	}


	public void setHeight(int hei){
		height = hei;
	}

	public int getHeight(){
		return height;
	}


	public int getArea(){
		return length * height;
	}


	public int getPerimeter(){
		return (length * 2) + (height * 2);
	}


	public int getID(){
		return rectangleID;
	}

	public static int getCount(){
		return counter;
	}


	public String toString(){
		return "This is a rectangle. Height: " + height + ", Length: " + length;
	}


	/*public boolean equals(Object obj){
		if(obj instanceof Rectangle){
			Rectangle other = (Rectangle) obj;
			System.out.println("Hello");
			if(this.getArea() == other.getArea() && this.getPerimeter() == other.getPerimeter()){
				return true;
			}
		}
		return false;
	}*/

}



