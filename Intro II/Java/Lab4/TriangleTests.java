import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


/**
  TriangleTests tests methods within the Triangle class.
  Triangle is a subclass of the Shape class. Tests the
  area(), getBase(), getHeight(), and perimeter() methods.
*/
public class TriangleTests {
  private Triangle triangle1;
  private Triangle triangle2;
  private Triangle triangle3;


  /**
    Runs right before a new test method is called.
    Instantiates three Triangle objects of different sizes.
  */
  @BeforeEach
  public void setUp(){
    triangle1 = new Triangle(0, 0);
    triangle2 = new Triangle(5, 12);
    triangle3 = new Triangle(3000, 4000);
  }


  /**
    Tests the area() method for each triangle object.
  */
  @Test
  public void testArea() {
    assertEquals(0.0, triangle1.area(), 0.000000001);
    assertEquals(30.0, triangle2.area(), 0.000000001);
    assertEquals(6000000.0, triangle3.area(), 0.000000001);
  }


  /**
    Tests the getBase() method for each triangle object.
  */
  @Test
  public void testBase() {
    assertEquals(0.0, triangle1.getBase(), 0.000000001);
    assertEquals(5.0, triangle2.getBase(), 0.000000001);
    assertEquals(3000.0, triangle3.getBase(), 0.000000001);
  }


  /**
    Tests the getHeight() method for each triangle object.
  */
  @Test
  public void testHeight() {
    assertEquals(0.0, triangle1.getHeight(), 0.000000001);
    assertEquals(12.0, triangle2.getHeight(), 0.000000001);
    assertEquals(4000.0, triangle3.getHeight(), 0.000000001);
  }


  /**
    Tests the perimeter() method for each triangle object.
  */
  @Test
  public void testPerimeter() {
    assertEquals(0.0, triangle1.perimeter(), 0.000000001);
    assertEquals(30.0, triangle2.perimeter(), 0.000000001);
    assertEquals(12000.0, triangle3.perimeter(), 0.000000001);
  }
}
