public abstract class Shape {
  private String name;

  /**
  * Construct a Shape
  * @param name the name of this Shape
  */
  public Shape(String name) {
    this.name = name;
  }

  /**
  * Return the name of this Shape.
  * @return the name of this Shape
  */
  public String getName() {
    return this.name;
  }

  /**
  * Return the area of this shape.
  * @return the area of this shape.
  */
  public abstract double area();

  /**
  * Return the perimeter of this shape.
  * @return the perimeter of this shape.
  */
  public abstract double perimeter();

  /**
  * Return a String containing the name of this Shape.
  * @return a String containing the name of this Shape.
  */
  @Override
  public String toString() {
    return "Shape: " + getName();
  }
}
