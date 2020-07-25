//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 9/23/18

public class CircleRunner2
{
 public static void main( String[] args )
   {
    Circle2 garrett = new Circle2();
    System.out.printf( "Circle area is :: %.2f\n" , garrett.area( 101 ) );
    // Circle.2 is the other file name (class), and area is the method name.
    // Tells the other class to expect ONE parameter, which requires a variable 
       // TYPE and NAME in the other class (so like "double" and "radius")
    // "%.2f" tells the next number (which is separated by a COMMA, not a PLUS)
       // to round to 2 decimal places
    System.out.printf( "Circle perimeter is :: %.2f\n" , garrett.perimeter( 101 ) );
    System.out.printf( "Circle area is :: %.2f\n" , garrett.area( 99.952 ) );
    System.out.printf( "Circle perimeter is :: %.2f\n" , garrett.perimeter( 99.952 ) );
    
 }
}