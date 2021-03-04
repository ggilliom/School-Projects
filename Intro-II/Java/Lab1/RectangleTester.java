import java.util.Scanner;

public class RectangleTester {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		Rectangle rect1 = new Rectangle(5, 10);
		Rectangle rect2 = new Rectangle(5, 10);
		Square square1 = new Square(5);
		Square square2 = new Square(5);

		System.out.println(rect1.equals(rect2));
		System.out.println(square1.equals(square2));


	}
}