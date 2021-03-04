//(c) A+ Computer Science
// www.apluscompsci.com

//built in sort examples

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Sorts
{
	public static void main(String args[])
	{
		int[] stuff = {13,6,17,18,2,-5};
		Arrays.sort( stuff );   
		
		System.out.println( "Arrays.sort()" );
		for(int i = 0; i < stuff.length; i++)
		{
		     System.out.println( stuff[i] );
		}

		
		System.out.println( "\n\nCollecctions.sort()" );
		ArrayList<Integer> ray; 
		ray=new ArrayList<Integer>();
		ray.add(21);
		ray.add(2);
		ray.add(13);
		ray.add(-1);
		ray.add(3);
		Collections.sort(ray);
		
		for(int  num  :  ray )
		   System.out.println(num);

	}
}
