import java.util.Scanner;

public class RectangleRunner
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Rectangle garrett = new Rectangle();
    System.out.println("Enter a length :: ");
    double length = keyboard.nextInt();
    System.out.println("Enter a width :: ");
    double width = keyboard.nextInt();
    System.out.println("The area of rectangle garrett is :: " + garrett.area(length, width));
    System.out.println("The perimeter of rectangle garrett is :: " + garrett.perimeter(length, width));

    
    
  }
 
}