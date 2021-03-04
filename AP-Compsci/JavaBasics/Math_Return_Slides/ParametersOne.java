//(c) A+ Computer Science
// www.apluscompsci.com

//parameter example 1

import static java.lang.System.*;

public class ParametersOne
{
	public static int times(int num1, int num2)
	{
	   return num1*num2;
	}

   public static void main(String args[])
   {
		System.out.println( ParametersOne.times(6,7) );
		System.out.println( ParametersOne.times(3,11) );
		System.out.println( ParametersOne.times(4,2) );
		System.out.println( ParametersOne.times(41,21) );
   }
}
