//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 9/23/18

public class Circle2
{
 public static double area( double radius ) // area is the name of the method, the
                                            // parameters in the CircleRunner2 file
                                            //are cast into "radius"
  {
    return Math.PI * Math.pow( radius , 2); // "return" means it gives the value it
                                             // finds in THIS file BACK to where it
                                             // was called from.
                                          // "Return" literally returns the answer
                                             // back
  }
 
 public static double perimeter( double radius )
 {
  return 2 * Math.PI * radius ;
 }
}