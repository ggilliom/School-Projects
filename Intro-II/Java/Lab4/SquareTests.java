import static org.junit.jupiter.api.Assertions.*;
//import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



/**
  SquareTests tests methods within the Square class.
  Square is a subclass of the Shape class. Tests the
  area(), getLength(), and perimeter() methods.
*/
public class SquareTests {
  private Square square1;
  private Square square2;
  private Square square3;


  /**
    Runs right before a new test method is called.
    Instantiates three Square objects of different sizes.
  */
  @BeforeEach
  public void setUp(){
    square1 = new Square(0);
    square2 = new Square(5);
    square3 = new Square(3412);
  }


  /**
    Tests the area() method for each Square object.
  */
  @Test
  public void testArea() {
    assertEquals(0.0, square1.area(), 0.000000001);
    assertEquals(25.0, square2.area(), 0.000000001);
    assertEquals(11641744.0, square3.area(), 0.000000001);
  }


  /**
    Tests the getLength() method for each Square object.
  */
  @Test
  public void testLength() {
    assertEquals(0.0, square1.getLength(), 0.000000001);
    assertEquals(5.0, square2.getLength(), 0.000000001);
    assertEquals(3412.0, square3.getLength(), 0.000000001);
  }

  /**
    Tests the perimeter() method for each Square object.
  */
  @Test
  public void testPerimeter() {
    assertEquals(0.0, square1.perimeter(), 0.000000001);
    assertEquals(20.0, square2.perimeter(), 0.000000001);
    assertEquals(13648.0, square3.perimeter(), 0.000000001);
  }
}
