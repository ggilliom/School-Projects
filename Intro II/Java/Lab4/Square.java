/**
* Basic Square class that can calculate its area and perimeter
*/
public class Square extends Shape {
  private double length;

  /**
  * Construct a Square with a given length
  * @param length the length of the sides of this Square
  */
  public Square(double length) {
    super("Square");
    this.length = length;
  }

  /**
  * Return the length of the sides of this Square
  * @return the length of the sides of this Square
  */
  public double getLength() {
    return this.length;
  }

  /**
  * Return the area of this square
  * @return the area of this square
  */
  @Override
  public double area() {
    //return getLength() * getLength();
    return getLength() * getLength();
  }

  /**
  * Return the perimeter of this square
  * @return the perimeter of this square
  */
  @Override
  public double perimeter() {
    return 4 * getLength();
  }

  /**
  * Return a String containing the length, area, and perimeter of this
  * Square.
  * @return a String containing the length, area, and perimeter of this
  * Square.
  */
  @Override
  public String toString() {
    String str = super.toString() + "\n";
    str += String.format("Length: %f\n", getLength());
    str += String.format("Area: %f\n", area());
    str += String.format("Perimeter: %f\n", perimeter());
    return str;
  }
}
