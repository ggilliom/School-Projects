//(c) A+ Computer Science
// www.apluscompsci.com

//insertion sort example 

import static java.lang.System.*;

public class QuickSort
{
	public static void quickSort(Comparable[] stuff, int low, int high)
	{
	  if (low < high)
	  {
	    int spot = partition(stuff, low, high);
	    quickSort(stuff, low, spot);
	    quickSort(stuff, spot+1, high);
	  }
	}
		
		
	public static int partition(Comparable[] stuff, int bot, int top) 
	{
		//median pivot
	  Comparable pivot = stuff[(bot + top)/2]; 
	  while(bot<top) 
	  {	
	    while (stuff[top].compareTo(pivot) > 0 && bot < top ){
	    	top = top - 1;
	    } 
	    while (stuff[bot].compareTo(pivot) < 0 && bot < top ){
	    	bot = bot + 1;
	    }	
	      
	    Comparable temp = stuff[bot];
	    stuff[bot] = stuff[top];
	    stuff[top] = temp;
	  }
	  return top;	  
	}
		
}