//(c) A+ Computer Science
// www.apluscompsci.com

//pass by value example 1

import static java.lang.System.*;
import java.util.ArrayList;

public class PassByValueOne
{
	public static void go( int x  )
	{
	   x = 9;
	   out.println( x );	   	   
	}
	
	public static void go( Integer x  )
	{
	   x = 99;
	   out.println( x );	   	   
	}	
	
	public static void swap( int x, int y )
	{
	   int t = x;
	   x = y;
	   y = t;
		out.println(x + "  " + y);	   	   
	}

	public static void swap( Integer x, Integer y )
	{
	   Integer t = x;
	   x = y;
	   y = t;
		out.println(x + "  " + y);	   
	}

	public static void main(String args[])
	{
		int one = 5;
		int two = 7;
		Integer a = 8;
		Integer b = 9;
		
		out.println("calling go to show pass by value \n");
		go( one );
		System.out.println( one );
		

		out.println("calling go to show pass by value \n");
		go( a );
		System.out.println( a );
		

		out.println("\n\ncalling swap for ints\n");
		out.println(one + "  " + two);
		swap(one, two);
		out.println(one + "  " + two);


		out.println("\n\n\ncalling swap for Integers\n");
		out.println(a + "  " + b);
		swap(a, b);
		out.println(a + "  " + b);
	}
}
