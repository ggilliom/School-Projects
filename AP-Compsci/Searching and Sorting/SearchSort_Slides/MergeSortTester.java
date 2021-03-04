//(c) A+ Computer Science
// www.apluscompsci.com

//Merge sort tester 

import static java.lang.System.*;
import java.util.Arrays;

public class MergeSortTester
{
   public static void main( String args[] )
   {
		Integer[] array2 = {999,36,11,3,38,-3,20,5,-57,15};
		
		out.println("before Merge sort");
		out.println(Arrays.toString(array2));

		MergeSort.mergeSort(array2,0,array2.length);

		out.println("\n\nafter Merge sort");
		out.println(Arrays.toString(array2));		
	}
}