import java.util.Scanner;

/**
  SquareTester tests the functionality of the Rectangle and 
  Square classes. 
 */
public class SquareTester{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		Square square1 = new Square(5);
		System.out.println(square1);

		Square square2 = new Square(5);

		Square square3 = new Square(10);

		System.out.println(square1.equals(square2));
		System.out.println(square3.equals(square1));



	}
}