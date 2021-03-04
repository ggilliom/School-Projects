 /**
 * A Triangle is a basic right triangle that can calculate its area and
 * perimeter.
*/
public class Triangle extends Shape {
  private double base;
  private double height;

  /**
  * Construct a Triangle with the given base and height
  * @param base the length of the base of this Triangle
  * @param height the height of this Triangle
  */
  public Triangle(double base, double height) {
    super("Triangle");
    this.base = base;
    this.height = height;
  }

  /**
  * Return the height of this Triangle
  * @return the height of this Triangle
  */
  public double getHeight() {
    return this.height;
  }

  /**
  * Return the length of the base of this Triangle
  * @return the length of the base of this Triangle
  */
  public double getBase() {
    return this.base;
  }

  /**
  * Return the area of this triangle.
  * @return the area of this triangle
  */
  @Override
  public double area() {
    return 0.5*getBase() * getHeight();
  }

  /**
  * Return the perimeter of this triangle.
  * @return the perimeter of this triangle
  */
  @Override
  public double perimeter() {
    return getBase() + getHeight() + Math.sqrt(getBase()*getBase() + getHeight()*getHeight());
  }

  /**
  * Return a String containing the base, height, area, and perimeter of this
  * Triangle.
  * @return a String containing the base, height, area, and perimeter of this
  * Triangle.
  */
  @Override
  public String toString() {
    String str = super.toString() + "\n";
    str += String.format("Base: %f\n", getBase());
    str += String.format("Height: %f\n", getHeight());
    str += String.format("Area: %f\n", area());
    str += String.format("Perimeter: %f\n", perimeter());
    return str;
  }
}
