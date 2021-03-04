//(c) A+ Computer Science
// www.apluscompsci.com

//binary search tester 

import static java.lang.System.*;
import java.util.Arrays;

public class BinarySearchTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before calling binarySearch");
		InsertionSort.insertionSort(array);
		out.println(Arrays.toString(array));

		out.println("looking for 8 :: "+	BinarySearch.binarySearch(array,8,0,array.length-1));
		out.println("looking for 39 :: "+	BinarySearch.binarySearch(array,39,0,array.length-1));
		out.println("looking for 15 :: "+	BinarySearch.binarySearch(array,15,0,array.length-1));
		out.println("looking for 5 :: "+	BinarySearch.binarySearch(array,5,0,array.length-1));				
	}
}


/*output
 
before calling binarySearch
[3, 5, 6, 11, 15, 18, 20, 23, 39, 57]
looking for 8 :: -1
looking for 39 :: 8
looking for 15 :: 4
looking for 5 :: 1

*/