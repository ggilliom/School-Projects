//(c) A+ Computer Science
// www.apluscompsci.com

//insertion sort tester 

import static java.lang.System.*;
import java.util.Arrays;

public class InsertionSortTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before insertion sort");
		out.println(Arrays.toString(array));

		InsertionSort.insertionSort(array);

		out.println("\n\nafter insertion sort");
		out.println(Arrays.toString(array));
		
		Integer[] array2 = {9,36,11,3,38,-3,20,5,57,15};
		
		out.println("before insertion sort");
		out.println(Arrays.toString(array2));

		InsertionSort.insertionSortC(array2);

		out.println("\n\nafter insertion sort");
		out.println(Arrays.toString(array2));		
	}
}