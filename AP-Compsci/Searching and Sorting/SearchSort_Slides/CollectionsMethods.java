//(c) A+ Computer Science
// www.apluscompsci.com

//Collections Class Methods
//Lots of stuff to manipulate lists

import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Collections;

public class CollectionsMethods
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add( 25 );
		ray.add( -88 );
	   ray.add( 36 );
	   ray.add( 9 );
	   Collections.sort( ray );

		out.println(ray);

      out.println("\nrotate 2");
      Collections.rotate(ray,2);
		out.println(ray);

		out.println("\nrotate 2 and reverse");
		Collections.rotate(ray,2);
      Collections.reverse(ray);
		out.println(ray);
	}
}