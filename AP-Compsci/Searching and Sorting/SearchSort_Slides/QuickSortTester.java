//(c) A+ Computer Science
// www.apluscompsci.com

//Quick sort tester 

import static java.lang.System.*;
import java.util.Arrays;

public class QuickSortTester
{
   public static void main( String args[] )
   {
		Integer[] array2 = {999,36,11,3,38,-3,20,5,-57,15};
		
		out.println("before Quick sort");
		out.println(Arrays.toString(array2));

		QuickSort.quickSort(array2,0,array2.length-1);

		out.println("\n\nafter Quick sort");
		out.println(Arrays.toString(array2));		
	}
}