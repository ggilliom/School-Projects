//(c) A+ Computer Science
// www.apluscompsci.com

//binary search example using recursion

import static java.lang.System.*;

public class BinarySearch
{
	public static int binarySearch (int [] stuff, int v, int b, int t )
	{
	   if(b<=t)
	   {
	      int m = (b + t) / 2;
	      if (stuff[m] == v)
	          return m;
	      if (stuff[m] > v)
	            return binarySearch(stuff, v, b, m-1);
	      return binarySearch(stuff, v, m+1, t);
	   }
	   return -1;
	}
}