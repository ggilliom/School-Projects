//(c) A+ Computer Science
// www.apluscompsci.com

//interface example for Ship

import static java.lang.System.*;

public class ShipRunner
{
	public static void main ( String[] args )
	{
		Ship it = new Ship();
		System.out.println( it );
		
		it = new Ship( 5, 8 );
		System.out.println( it );		
  }
}