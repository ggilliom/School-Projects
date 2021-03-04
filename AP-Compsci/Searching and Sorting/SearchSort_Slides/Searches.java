//(c) A+ Computer Science
// www.apluscompsci.com

//built in search examples

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Searches
{
	public static void main(String args[])
	{
		
		System.out.println( "String search methods" );
		String s  = "apluscompsci.com";
		System.out.println( s.indexOf(".com") );   
		System.out.println( s.contains("comp") );   
		System.out.println( s.indexOf("p") );   
		System.out.println( s.indexOf("x") ); 
		System.out.println( s.equals("x") ); 

		
		System.out.println( "\n\narray search methods" );
		int[] stuff = {3,4,5,6,11,18,91};
		System.out.println(Arrays.binarySearch( stuff,5) );    
		System.out.println(Arrays.binarySearch( stuff,15) ); 
			
		int[] one = {3,4,5,6,11,18,91};
		int[] two = {3,4,5,6,10,18,91};			
		System.out.println( Arrays.equals( one, two) ); 
		System.out.println( Arrays.equals( one, stuff) ); 
		
		
		System.out.println( "\n\nlist search methods" );
		ArrayList<Integer> ray; 
		ray=new ArrayList<Integer>();
		ray.add(21);
		ray.add(14);
		ray.add(0,13);
		ray.add(25);
		System.out.println( ray.indexOf( 21 ) );
		System.out.println( ray.indexOf( 17 ) );
		System.out.println( ray.contains(25 ) );
		System.out.println( ray.contains( 63 ) );
		System.out.println( ray );

		Collections.sort( ray );
		System.out.println( ray );

		System.out.println( Collections.binarySearch( ray, 66));
		System.out.println( Collections.binarySearch( ray, 23));
		System.out.println( Collections.binarySearch( ray, 15));

  
		
	}
}
